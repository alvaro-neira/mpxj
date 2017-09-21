//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.09.18 at 02:35:45 PM BST
//

package net.sf.mpxj.primavera.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for GlobalReplaceType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GlobalReplaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllProjects" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GlobalReplaceData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalReplaceName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GreplaceObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProjectIdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReplaceFieldNameOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubjectAreaType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "GlobalReplaceType", propOrder =
{
   "allProjects",
   "globalReplaceData",
   "globalReplaceName",
   "greplaceObjectId",
   "projectIdName",
   "projectIds",
   "replaceFieldNameOne",
   "searchCriteria",
   "subjectAreaType",
   "userObjectId"
}) public class GlobalReplaceType
{

   @XmlElement(name = "AllProjects", nillable = true) protected Boolean allProjects;
   @XmlElement(name = "GlobalReplaceData") protected String globalReplaceData;
   @XmlElement(name = "GlobalReplaceName") protected String globalReplaceName;
   @XmlElement(name = "GreplaceObjectId") protected Integer greplaceObjectId;
   @XmlElement(name = "ProjectIdName") protected String projectIdName;
   @XmlElement(name = "ProjectIds") protected String projectIds;
   @XmlElement(name = "ReplaceFieldNameOne") protected String replaceFieldNameOne;
   @XmlElement(name = "SearchCriteria") protected String searchCriteria;
   @XmlElement(name = "SubjectAreaType") protected String subjectAreaType;
   @XmlElement(name = "UserObjectId", nillable = true) protected Integer userObjectId;

   /**
    * Gets the value of the allProjects property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isAllProjects()
   {
      return allProjects;
   }

   /**
    * Sets the value of the allProjects property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setAllProjects(Boolean value)
   {
      this.allProjects = value;
   }

   /**
    * Gets the value of the globalReplaceData property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getGlobalReplaceData()
   {
      return globalReplaceData;
   }

   /**
    * Sets the value of the globalReplaceData property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setGlobalReplaceData(String value)
   {
      this.globalReplaceData = value;
   }

   /**
    * Gets the value of the globalReplaceName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getGlobalReplaceName()
   {
      return globalReplaceName;
   }

   /**
    * Sets the value of the globalReplaceName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setGlobalReplaceName(String value)
   {
      this.globalReplaceName = value;
   }

   /**
    * Gets the value of the greplaceObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getGreplaceObjectId()
   {
      return greplaceObjectId;
   }

   /**
    * Sets the value of the greplaceObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setGreplaceObjectId(Integer value)
   {
      this.greplaceObjectId = value;
   }

   /**
    * Gets the value of the projectIdName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getProjectIdName()
   {
      return projectIdName;
   }

   /**
    * Sets the value of the projectIdName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setProjectIdName(String value)
   {
      this.projectIdName = value;
   }

   /**
    * Gets the value of the projectIds property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getProjectIds()
   {
      return projectIds;
   }

   /**
    * Sets the value of the projectIds property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setProjectIds(String value)
   {
      this.projectIds = value;
   }

   /**
    * Gets the value of the replaceFieldNameOne property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getReplaceFieldNameOne()
   {
      return replaceFieldNameOne;
   }

   /**
    * Sets the value of the replaceFieldNameOne property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setReplaceFieldNameOne(String value)
   {
      this.replaceFieldNameOne = value;
   }

   /**
    * Gets the value of the searchCriteria property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getSearchCriteria()
   {
      return searchCriteria;
   }

   /**
    * Sets the value of the searchCriteria property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setSearchCriteria(String value)
   {
      this.searchCriteria = value;
   }

   /**
    * Gets the value of the subjectAreaType property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getSubjectAreaType()
   {
      return subjectAreaType;
   }

   /**
    * Sets the value of the subjectAreaType property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setSubjectAreaType(String value)
   {
      this.subjectAreaType = value;
   }

   /**
    * Gets the value of the userObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getUserObjectId()
   {
      return userObjectId;
   }

   /**
    * Sets the value of the userObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setUserObjectId(Integer value)
   {
      this.userObjectId = value;
   }

}
