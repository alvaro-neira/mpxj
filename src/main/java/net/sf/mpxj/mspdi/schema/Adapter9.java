//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.01.18 at 11:10:40 AM GMT
//

package net.sf.mpxj.mspdi.schema;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import net.sf.mpxj.AccrueType;

@SuppressWarnings("all") public class Adapter9 extends XmlAdapter<String, AccrueType>
{

   public AccrueType unmarshal(String value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.parseAccrueType(value));
   }

   public String marshal(AccrueType value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.printAccrueType(value));
   }

}
