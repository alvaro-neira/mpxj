
package net.sf.mpxj.fasttrack;

public class FixedSizeItemsBlock
{

   public FixedSizeItemsBlock read(byte[] buffer, int startIndex, int offset)
   {
      // Offset to data
      offset += 2;

      int numberOfItems = FastTrackUtility.getInt(buffer, startIndex + offset);
      offset += 4;

      if (numberOfItems < 0 || numberOfItems > 1000000)
      {
         throw new UnexpectedStructureException();
      }

      int itemLength = FastTrackUtility.getShort(buffer, startIndex + offset);
      offset += 2;

      // Offset to end
      offset += 4;

      m_data = new byte[numberOfItems][];
      for (int index = 0; index < m_data.length; index++)
      {
         byte[] item = new byte[itemLength];
         m_data[index] = item;
         System.arraycopy(buffer, startIndex + offset, item, 0, itemLength);
         offset += itemLength;
      }

      // Skip extra row
      offset += itemLength;

      m_offset = offset;

      return this;
   }

   public byte[][] getData()
   {
      return m_data;
   }

   public int getOffset()
   {
      return m_offset;
   }

   private byte[][] m_data;
   private int m_offset;
}