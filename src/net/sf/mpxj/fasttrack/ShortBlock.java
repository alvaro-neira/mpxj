
package net.sf.mpxj.fasttrack;

import java.io.PrintWriter;

public class ShortBlock extends AbstractBlock
{

   @Override protected int readData(byte[] buffer, int startIndex, int offset)
   {
      // Skip bytes
      offset += 18;

      FixedSizeItemsBlock data = new FixedSizeItemsBlock().read(buffer, startIndex, offset);
      offset = data.getOffset();

      byte[][] rawData = data.getData();
      m_data = new int[rawData.length];
      for (int index = 0; index < rawData.length; index++)
      {
         m_data[index] = FastTrackUtility.getShort(rawData[index], 0);
      }

      return offset;
   }

   @Override protected void dumpData(PrintWriter pw)
   {
      pw.println("  [Data");
      for (int item : m_data)
      {
         pw.println("    " + item);
      }
      pw.println("  ]");
   }

   private int[] m_data;
}
