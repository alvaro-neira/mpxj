//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.12.04 at 05:57:42 PM GMT
//

package net.sf.mpxj.mspdi.schema;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import net.sf.mpxj.ResourceType;

@SuppressWarnings("all") public class Adapter11 extends XmlAdapter<String, ResourceType>
{

   public ResourceType unmarshal(String value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.parseResourceType(value));
   }

   public String marshal(ResourceType value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.printResourceType(value));
   }

}
