//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.09.18 at 02:35:45 PM BST
//

package net.sf.mpxj.primavera.schema;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for ProjectPortfolioType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProjectPortfolioType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUser" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IncludeClosedProjects" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeWhatIfProjects" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastUpdateUser" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Manual"/>
 *               &lt;enumeration value="Auto-Maintained"/>
 *               &lt;enumeration value="Filtered"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UserName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="MemberProject" type="{http://xmlns.oracle.com/Primavera/P6/V17.7/API/BusinessObjects}PortfolioTeamMemberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ProjectPortfolioType", propOrder =
{
   "createDate",
   "createUser",
   "description",
   "includeClosedProjects",
   "includeWhatIfProjects",
   "lastUpdateDate",
   "lastUpdateUser",
   "name",
   "objectId",
   "type",
   "userName",
   "userObjectId",
   "memberProject"
}) public class ProjectPortfolioType
{

   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "Description") protected String description;
   @XmlElement(name = "IncludeClosedProjects") protected Boolean includeClosedProjects;
   @XmlElement(name = "IncludeWhatIfProjects") protected Boolean includeWhatIfProjects;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "Name") protected String name;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "Type") protected String type;
   @XmlElement(name = "UserName") protected String userName;
   @XmlElement(name = "UserObjectId", nillable = true) protected Integer userObjectId;
   @XmlElement(name = "MemberProject") protected List<PortfolioTeamMemberType> memberProject;

   /**
    * Gets the value of the createDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getCreateDate()
   {
      return createDate;
   }

   /**
    * Sets the value of the createDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCreateDate(Date value)
   {
      this.createDate = value;
   }

   /**
    * Gets the value of the createUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCreateUser()
   {
      return createUser;
   }

   /**
    * Sets the value of the createUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCreateUser(String value)
   {
      this.createUser = value;
   }

   /**
    * Gets the value of the description property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDescription()
   {
      return description;
   }

   /**
    * Sets the value of the description property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDescription(String value)
   {
      this.description = value;
   }

   /**
    * Gets the value of the includeClosedProjects property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isIncludeClosedProjects()
   {
      return includeClosedProjects;
   }

   /**
    * Sets the value of the includeClosedProjects property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setIncludeClosedProjects(Boolean value)
   {
      this.includeClosedProjects = value;
   }

   /**
    * Gets the value of the includeWhatIfProjects property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isIncludeWhatIfProjects()
   {
      return includeWhatIfProjects;
   }

   /**
    * Sets the value of the includeWhatIfProjects property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setIncludeWhatIfProjects(Boolean value)
   {
      this.includeWhatIfProjects = value;
   }

   /**
    * Gets the value of the lastUpdateDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getLastUpdateDate()
   {
      return lastUpdateDate;
   }

   /**
    * Sets the value of the lastUpdateDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLastUpdateDate(Date value)
   {
      this.lastUpdateDate = value;
   }

   /**
    * Gets the value of the lastUpdateUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getLastUpdateUser()
   {
      return lastUpdateUser;
   }

   /**
    * Sets the value of the lastUpdateUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLastUpdateUser(String value)
   {
      this.lastUpdateUser = value;
   }

   /**
    * Gets the value of the name property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getName()
   {
      return name;
   }

   /**
    * Sets the value of the name property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setName(String value)
   {
      this.name = value;
   }

   /**
    * Gets the value of the objectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getObjectId()
   {
      return objectId;
   }

   /**
    * Sets the value of the objectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setObjectId(Integer value)
   {
      this.objectId = value;
   }

   /**
    * Gets the value of the type property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getType()
   {
      return type;
   }

   /**
    * Sets the value of the type property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setType(String value)
   {
      this.type = value;
   }

   /**
    * Gets the value of the userName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getUserName()
   {
      return userName;
   }

   /**
    * Sets the value of the userName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setUserName(String value)
   {
      this.userName = value;
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

   /**
    * Gets the value of the memberProject property.
    *
    * <p>
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a <CODE>set</CODE> method for the memberProject property.
    *
    * <p>
    * For example, to add a new item, do as follows:
    * <pre>
    *    getMemberProject().add(newItem);
    * </pre>
    *
    *
    * <p>
    * Objects of the following type(s) are allowed in the list
    * {@link PortfolioTeamMemberType }
    *
    *
    */
   public List<PortfolioTeamMemberType> getMemberProject()
   {
      if (memberProject == null)
      {
         memberProject = new ArrayList<PortfolioTeamMemberType>();
      }
      return this.memberProject;
   }

}
