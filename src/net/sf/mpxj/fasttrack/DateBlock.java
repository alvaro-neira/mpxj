
package net.sf.mpxj.fasttrack;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateBlock extends AbstractBlock
{

   @Override protected int readData(byte[] buffer, int startIndex, int offset)
   {
      // Skip bytes
      offset += 48;

      FixedSizeItemsBlock data = new FixedSizeItemsBlock().read(buffer, startIndex, offset);
      offset = data.getOffset();

      Calendar cal = Calendar.getInstance();
      byte[][] rawData = data.getData();
      m_data = new Date[rawData.length];
      for (int index = 0; index < rawData.length; index++)
      {
         int value = FastTrackUtility.getInt(rawData[index], 0);
         cal.setTimeInMillis(DATE_EPOCH);
         cal.add(Calendar.DAY_OF_YEAR, value);
         m_data[index] = cal.getTime();
      }

      return offset;
   }

   @Override protected void dumpData(PrintWriter pw)
   {
      DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
      pw.println("  [Data");
      for (Date item : m_data)
      {
         pw.println("    " + df.format(item));
      }
      pw.println("  ]");
   }

   private Date[] m_data;

   /**
    * 31/12/1979 00:00.
    */
   private static final long DATE_EPOCH = 315446400000L;
}
