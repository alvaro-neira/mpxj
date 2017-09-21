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
 * <p>Java class for ProjectPrivilegesType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProjectPrivilegesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddEditDeleteRisks" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddEPSActivityCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddEditActivitiesExceptRelationships" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddEditProjectLevelLayouts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddEditDeleteTemplateDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddProjectActivityCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AdministerProjectExternalApplications" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ApplyActuals" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ApproveTimesheetsAsProjectManager" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AssignProjectBaselines" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CheckInAndCheckOutProjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddProjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddEditWorkgroups" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DeleteEPSActivityCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DeleteActivities" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DeleteProjectActivityCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DeleteProjectDataWithTimesheetActuals" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DeleteProjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DeleteWorkgroups" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EditActivityId" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EditCommittedFlagForResourcePlanning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EditEPSActivityCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddEditDeleteEPSExceptCostsAndFinancials" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EditEPSCostsAndFinancials" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EditFuturePeriods" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EditPeriodPerformance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EditProjectActivityCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddEditDeleteActivityRelationships" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddEditDeleteProjectCalendars" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EditContractManagementProjectLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EditProjectDetailsExceptCostsAndFinancials" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddEditDeleteExpenses" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EditProjectReports" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddEditDeleteIssuesAndIssueThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddEditDeleteWBSExceptCostsAndFinancials" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EditWBSCostsAndFinancials" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddEditDeleteWorkProductsAndDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddEditDeleteResourceAssignmentsForResourcePlanning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddEditDeleteRoleAssignmentsForResourcePlanning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ImportAndViewContractManagerData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LevelResources" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddEditDeleteProjectBaselines" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EditWorkspaceAndWorkgroupPreferences" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MonitorProjectThresholds" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddEditActivityResourceRequests" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PublishProjectWebsite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RunBaselineUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RunGlobalChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ScheduleProjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StorePeriodPerformance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SummarizeProjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ViewProjectCostsAndFinancials" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddEditDeleteIssuesandIssueThresholds" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllowIntegrationwithERPSystem" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EditPublicationPriority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ProjectPrivilegesType", propOrder =
{
   "addEditDeleteRisks",
   "addEPSActivityCodes",
   "addEditActivitiesExceptRelationships",
   "addEditProjectLevelLayouts",
   "addEditDeleteTemplateDocuments",
   "addProjectActivityCodes",
   "administerProjectExternalApplications",
   "applyActuals",
   "approveTimesheetsAsProjectManager",
   "assignProjectBaselines",
   "checkInAndCheckOutProjects",
   "addProjects",
   "addEditWorkgroups",
   "deleteEPSActivityCodes",
   "deleteActivities",
   "deleteProjectActivityCodes",
   "deleteProjectDataWithTimesheetActuals",
   "deleteProjects",
   "deleteWorkgroups",
   "editActivityId",
   "editCommittedFlagForResourcePlanning",
   "editEPSActivityCodes",
   "addEditDeleteEPSExceptCostsAndFinancials",
   "editEPSCostsAndFinancials",
   "editFuturePeriods",
   "editPeriodPerformance",
   "editProjectActivityCodes",
   "addEditDeleteActivityRelationships",
   "addEditDeleteProjectCalendars",
   "editContractManagementProjectLink",
   "editProjectDetailsExceptCostsAndFinancials",
   "addEditDeleteExpenses",
   "editProjectReports",
   "addEditDeleteIssuesAndIssueThreshold",
   "addEditDeleteWBSExceptCostsAndFinancials",
   "editWBSCostsAndFinancials",
   "addEditDeleteWorkProductsAndDocuments",
   "addEditDeleteResourceAssignmentsForResourcePlanning",
   "addEditDeleteRoleAssignmentsForResourcePlanning",
   "importAndViewContractManagerData",
   "levelResources",
   "addEditDeleteProjectBaselines",
   "editWorkspaceAndWorkgroupPreferences",
   "monitorProjectThresholds",
   "addEditActivityResourceRequests",
   "publishProjectWebsite",
   "runBaselineUpdate",
   "runGlobalChange",
   "scheduleProjects",
   "storePeriodPerformance",
   "summarizeProjects",
   "viewProjectCostsAndFinancials",
   "addEditDeleteIssuesandIssueThresholds",
   "allowIntegrationwithERPSystem",
   "editPublicationPriority"
}) public class ProjectPrivilegesType
{

   @XmlElement(name = "AddEditDeleteRisks") protected boolean addEditDeleteRisks;
   @XmlElement(name = "AddEPSActivityCodes") protected boolean addEPSActivityCodes;
   @XmlElement(name = "AddEditActivitiesExceptRelationships") protected boolean addEditActivitiesExceptRelationships;
   @XmlElement(name = "AddEditProjectLevelLayouts") protected boolean addEditProjectLevelLayouts;
   @XmlElement(name = "AddEditDeleteTemplateDocuments") protected boolean addEditDeleteTemplateDocuments;
   @XmlElement(name = "AddProjectActivityCodes") protected boolean addProjectActivityCodes;
   @XmlElement(name = "AdministerProjectExternalApplications") protected boolean administerProjectExternalApplications;
   @XmlElement(name = "ApplyActuals") protected boolean applyActuals;
   @XmlElement(name = "ApproveTimesheetsAsProjectManager") protected boolean approveTimesheetsAsProjectManager;
   @XmlElement(name = "AssignProjectBaselines") protected boolean assignProjectBaselines;
   @XmlElement(name = "CheckInAndCheckOutProjects") protected boolean checkInAndCheckOutProjects;
   @XmlElement(name = "AddProjects") protected boolean addProjects;
   @XmlElement(name = "AddEditWorkgroups") protected boolean addEditWorkgroups;
   @XmlElement(name = "DeleteEPSActivityCodes") protected boolean deleteEPSActivityCodes;
   @XmlElement(name = "DeleteActivities") protected boolean deleteActivities;
   @XmlElement(name = "DeleteProjectActivityCodes") protected boolean deleteProjectActivityCodes;
   @XmlElement(name = "DeleteProjectDataWithTimesheetActuals") protected boolean deleteProjectDataWithTimesheetActuals;
   @XmlElement(name = "DeleteProjects") protected boolean deleteProjects;
   @XmlElement(name = "DeleteWorkgroups") protected boolean deleteWorkgroups;
   @XmlElement(name = "EditActivityId") protected boolean editActivityId;
   @XmlElement(name = "EditCommittedFlagForResourcePlanning") protected boolean editCommittedFlagForResourcePlanning;
   @XmlElement(name = "EditEPSActivityCodes") protected boolean editEPSActivityCodes;
   @XmlElement(name = "AddEditDeleteEPSExceptCostsAndFinancials") protected boolean addEditDeleteEPSExceptCostsAndFinancials;
   @XmlElement(name = "EditEPSCostsAndFinancials") protected boolean editEPSCostsAndFinancials;
   @XmlElement(name = "EditFuturePeriods") protected boolean editFuturePeriods;
   @XmlElement(name = "EditPeriodPerformance") protected boolean editPeriodPerformance;
   @XmlElement(name = "EditProjectActivityCodes") protected boolean editProjectActivityCodes;
   @XmlElement(name = "AddEditDeleteActivityRelationships") protected boolean addEditDeleteActivityRelationships;
   @XmlElement(name = "AddEditDeleteProjectCalendars") protected boolean addEditDeleteProjectCalendars;
   @XmlElement(name = "EditContractManagementProjectLink") protected boolean editContractManagementProjectLink;
   @XmlElement(name = "EditProjectDetailsExceptCostsAndFinancials") protected boolean editProjectDetailsExceptCostsAndFinancials;
   @XmlElement(name = "AddEditDeleteExpenses") protected boolean addEditDeleteExpenses;
   @XmlElement(name = "EditProjectReports") protected boolean editProjectReports;
   @XmlElement(name = "AddEditDeleteIssuesAndIssueThreshold") protected boolean addEditDeleteIssuesAndIssueThreshold;
   @XmlElement(name = "AddEditDeleteWBSExceptCostsAndFinancials") protected boolean addEditDeleteWBSExceptCostsAndFinancials;
   @XmlElement(name = "EditWBSCostsAndFinancials") protected boolean editWBSCostsAndFinancials;
   @XmlElement(name = "AddEditDeleteWorkProductsAndDocuments") protected boolean addEditDeleteWorkProductsAndDocuments;
   @XmlElement(name = "AddEditDeleteResourceAssignmentsForResourcePlanning") protected boolean addEditDeleteResourceAssignmentsForResourcePlanning;
   @XmlElement(name = "AddEditDeleteRoleAssignmentsForResourcePlanning") protected boolean addEditDeleteRoleAssignmentsForResourcePlanning;
   @XmlElement(name = "ImportAndViewContractManagerData") protected boolean importAndViewContractManagerData;
   @XmlElement(name = "LevelResources") protected boolean levelResources;
   @XmlElement(name = "AddEditDeleteProjectBaselines") protected boolean addEditDeleteProjectBaselines;
   @XmlElement(name = "EditWorkspaceAndWorkgroupPreferences") protected boolean editWorkspaceAndWorkgroupPreferences;
   @XmlElement(name = "MonitorProjectThresholds") protected boolean monitorProjectThresholds;
   @XmlElement(name = "AddEditActivityResourceRequests") protected boolean addEditActivityResourceRequests;
   @XmlElement(name = "PublishProjectWebsite") protected boolean publishProjectWebsite;
   @XmlElement(name = "RunBaselineUpdate") protected boolean runBaselineUpdate;
   @XmlElement(name = "RunGlobalChange") protected boolean runGlobalChange;
   @XmlElement(name = "ScheduleProjects") protected boolean scheduleProjects;
   @XmlElement(name = "StorePeriodPerformance") protected boolean storePeriodPerformance;
   @XmlElement(name = "SummarizeProjects") protected boolean summarizeProjects;
   @XmlElement(name = "ViewProjectCostsAndFinancials") protected boolean viewProjectCostsAndFinancials;
   @XmlElement(name = "AddEditDeleteIssuesandIssueThresholds") protected boolean addEditDeleteIssuesandIssueThresholds;
   @XmlElement(name = "AllowIntegrationwithERPSystem") protected boolean allowIntegrationwithERPSystem;
   @XmlElement(name = "EditPublicationPriority") protected boolean editPublicationPriority;

   /**
    * Gets the value of the addEditDeleteRisks property.
    * 
    */
   public boolean isAddEditDeleteRisks()
   {
      return addEditDeleteRisks;
   }

   /**
    * Sets the value of the addEditDeleteRisks property.
    * 
    */
   public void setAddEditDeleteRisks(boolean value)
   {
      this.addEditDeleteRisks = value;
   }

   /**
    * Gets the value of the addEPSActivityCodes property.
    * 
    */
   public boolean isAddEPSActivityCodes()
   {
      return addEPSActivityCodes;
   }

   /**
    * Sets the value of the addEPSActivityCodes property.
    * 
    */
   public void setAddEPSActivityCodes(boolean value)
   {
      this.addEPSActivityCodes = value;
   }

   /**
    * Gets the value of the addEditActivitiesExceptRelationships property.
    * 
    */
   public boolean isAddEditActivitiesExceptRelationships()
   {
      return addEditActivitiesExceptRelationships;
   }

   /**
    * Sets the value of the addEditActivitiesExceptRelationships property.
    * 
    */
   public void setAddEditActivitiesExceptRelationships(boolean value)
   {
      this.addEditActivitiesExceptRelationships = value;
   }

   /**
    * Gets the value of the addEditProjectLevelLayouts property.
    * 
    */
   public boolean isAddEditProjectLevelLayouts()
   {
      return addEditProjectLevelLayouts;
   }

   /**
    * Sets the value of the addEditProjectLevelLayouts property.
    * 
    */
   public void setAddEditProjectLevelLayouts(boolean value)
   {
      this.addEditProjectLevelLayouts = value;
   }

   /**
    * Gets the value of the addEditDeleteTemplateDocuments property.
    * 
    */
   public boolean isAddEditDeleteTemplateDocuments()
   {
      return addEditDeleteTemplateDocuments;
   }

   /**
    * Sets the value of the addEditDeleteTemplateDocuments property.
    * 
    */
   public void setAddEditDeleteTemplateDocuments(boolean value)
   {
      this.addEditDeleteTemplateDocuments = value;
   }

   /**
    * Gets the value of the addProjectActivityCodes property.
    * 
    */
   public boolean isAddProjectActivityCodes()
   {
      return addProjectActivityCodes;
   }

   /**
    * Sets the value of the addProjectActivityCodes property.
    * 
    */
   public void setAddProjectActivityCodes(boolean value)
   {
      this.addProjectActivityCodes = value;
   }

   /**
    * Gets the value of the administerProjectExternalApplications property.
    * 
    */
   public boolean isAdministerProjectExternalApplications()
   {
      return administerProjectExternalApplications;
   }

   /**
    * Sets the value of the administerProjectExternalApplications property.
    * 
    */
   public void setAdministerProjectExternalApplications(boolean value)
   {
      this.administerProjectExternalApplications = value;
   }

   /**
    * Gets the value of the applyActuals property.
    * 
    */
   public boolean isApplyActuals()
   {
      return applyActuals;
   }

   /**
    * Sets the value of the applyActuals property.
    * 
    */
   public void setApplyActuals(boolean value)
   {
      this.applyActuals = value;
   }

   /**
    * Gets the value of the approveTimesheetsAsProjectManager property.
    * 
    */
   public boolean isApproveTimesheetsAsProjectManager()
   {
      return approveTimesheetsAsProjectManager;
   }

   /**
    * Sets the value of the approveTimesheetsAsProjectManager property.
    * 
    */
   public void setApproveTimesheetsAsProjectManager(boolean value)
   {
      this.approveTimesheetsAsProjectManager = value;
   }

   /**
    * Gets the value of the assignProjectBaselines property.
    * 
    */
   public boolean isAssignProjectBaselines()
   {
      return assignProjectBaselines;
   }

   /**
    * Sets the value of the assignProjectBaselines property.
    * 
    */
   public void setAssignProjectBaselines(boolean value)
   {
      this.assignProjectBaselines = value;
   }

   /**
    * Gets the value of the checkInAndCheckOutProjects property.
    * 
    */
   public boolean isCheckInAndCheckOutProjects()
   {
      return checkInAndCheckOutProjects;
   }

   /**
    * Sets the value of the checkInAndCheckOutProjects property.
    * 
    */
   public void setCheckInAndCheckOutProjects(boolean value)
   {
      this.checkInAndCheckOutProjects = value;
   }

   /**
    * Gets the value of the addProjects property.
    * 
    */
   public boolean isAddProjects()
   {
      return addProjects;
   }

   /**
    * Sets the value of the addProjects property.
    * 
    */
   public void setAddProjects(boolean value)
   {
      this.addProjects = value;
   }

   /**
    * Gets the value of the addEditWorkgroups property.
    * 
    */
   public boolean isAddEditWorkgroups()
   {
      return addEditWorkgroups;
   }

   /**
    * Sets the value of the addEditWorkgroups property.
    * 
    */
   public void setAddEditWorkgroups(boolean value)
   {
      this.addEditWorkgroups = value;
   }

   /**
    * Gets the value of the deleteEPSActivityCodes property.
    * 
    */
   public boolean isDeleteEPSActivityCodes()
   {
      return deleteEPSActivityCodes;
   }

   /**
    * Sets the value of the deleteEPSActivityCodes property.
    * 
    */
   public void setDeleteEPSActivityCodes(boolean value)
   {
      this.deleteEPSActivityCodes = value;
   }

   /**
    * Gets the value of the deleteActivities property.
    * 
    */
   public boolean isDeleteActivities()
   {
      return deleteActivities;
   }

   /**
    * Sets the value of the deleteActivities property.
    * 
    */
   public void setDeleteActivities(boolean value)
   {
      this.deleteActivities = value;
   }

   /**
    * Gets the value of the deleteProjectActivityCodes property.
    * 
    */
   public boolean isDeleteProjectActivityCodes()
   {
      return deleteProjectActivityCodes;
   }

   /**
    * Sets the value of the deleteProjectActivityCodes property.
    * 
    */
   public void setDeleteProjectActivityCodes(boolean value)
   {
      this.deleteProjectActivityCodes = value;
   }

   /**
    * Gets the value of the deleteProjectDataWithTimesheetActuals property.
    * 
    */
   public boolean isDeleteProjectDataWithTimesheetActuals()
   {
      return deleteProjectDataWithTimesheetActuals;
   }

   /**
    * Sets the value of the deleteProjectDataWithTimesheetActuals property.
    * 
    */
   public void setDeleteProjectDataWithTimesheetActuals(boolean value)
   {
      this.deleteProjectDataWithTimesheetActuals = value;
   }

   /**
    * Gets the value of the deleteProjects property.
    * 
    */
   public boolean isDeleteProjects()
   {
      return deleteProjects;
   }

   /**
    * Sets the value of the deleteProjects property.
    * 
    */
   public void setDeleteProjects(boolean value)
   {
      this.deleteProjects = value;
   }

   /**
    * Gets the value of the deleteWorkgroups property.
    * 
    */
   public boolean isDeleteWorkgroups()
   {
      return deleteWorkgroups;
   }

   /**
    * Sets the value of the deleteWorkgroups property.
    * 
    */
   public void setDeleteWorkgroups(boolean value)
   {
      this.deleteWorkgroups = value;
   }

   /**
    * Gets the value of the editActivityId property.
    * 
    */
   public boolean isEditActivityId()
   {
      return editActivityId;
   }

   /**
    * Sets the value of the editActivityId property.
    * 
    */
   public void setEditActivityId(boolean value)
   {
      this.editActivityId = value;
   }

   /**
    * Gets the value of the editCommittedFlagForResourcePlanning property.
    * 
    */
   public boolean isEditCommittedFlagForResourcePlanning()
   {
      return editCommittedFlagForResourcePlanning;
   }

   /**
    * Sets the value of the editCommittedFlagForResourcePlanning property.
    * 
    */
   public void setEditCommittedFlagForResourcePlanning(boolean value)
   {
      this.editCommittedFlagForResourcePlanning = value;
   }

   /**
    * Gets the value of the editEPSActivityCodes property.
    * 
    */
   public boolean isEditEPSActivityCodes()
   {
      return editEPSActivityCodes;
   }

   /**
    * Sets the value of the editEPSActivityCodes property.
    * 
    */
   public void setEditEPSActivityCodes(boolean value)
   {
      this.editEPSActivityCodes = value;
   }

   /**
    * Gets the value of the addEditDeleteEPSExceptCostsAndFinancials property.
    * 
    */
   public boolean isAddEditDeleteEPSExceptCostsAndFinancials()
   {
      return addEditDeleteEPSExceptCostsAndFinancials;
   }

   /**
    * Sets the value of the addEditDeleteEPSExceptCostsAndFinancials property.
    * 
    */
   public void setAddEditDeleteEPSExceptCostsAndFinancials(boolean value)
   {
      this.addEditDeleteEPSExceptCostsAndFinancials = value;
   }

   /**
    * Gets the value of the editEPSCostsAndFinancials property.
    * 
    */
   public boolean isEditEPSCostsAndFinancials()
   {
      return editEPSCostsAndFinancials;
   }

   /**
    * Sets the value of the editEPSCostsAndFinancials property.
    * 
    */
   public void setEditEPSCostsAndFinancials(boolean value)
   {
      this.editEPSCostsAndFinancials = value;
   }

   /**
    * Gets the value of the editFuturePeriods property.
    * 
    */
   public boolean isEditFuturePeriods()
   {
      return editFuturePeriods;
   }

   /**
    * Sets the value of the editFuturePeriods property.
    * 
    */
   public void setEditFuturePeriods(boolean value)
   {
      this.editFuturePeriods = value;
   }

   /**
    * Gets the value of the editPeriodPerformance property.
    * 
    */
   public boolean isEditPeriodPerformance()
   {
      return editPeriodPerformance;
   }

   /**
    * Sets the value of the editPeriodPerformance property.
    * 
    */
   public void setEditPeriodPerformance(boolean value)
   {
      this.editPeriodPerformance = value;
   }

   /**
    * Gets the value of the editProjectActivityCodes property.
    * 
    */
   public boolean isEditProjectActivityCodes()
   {
      return editProjectActivityCodes;
   }

   /**
    * Sets the value of the editProjectActivityCodes property.
    * 
    */
   public void setEditProjectActivityCodes(boolean value)
   {
      this.editProjectActivityCodes = value;
   }

   /**
    * Gets the value of the addEditDeleteActivityRelationships property.
    * 
    */
   public boolean isAddEditDeleteActivityRelationships()
   {
      return addEditDeleteActivityRelationships;
   }

   /**
    * Sets the value of the addEditDeleteActivityRelationships property.
    * 
    */
   public void setAddEditDeleteActivityRelationships(boolean value)
   {
      this.addEditDeleteActivityRelationships = value;
   }

   /**
    * Gets the value of the addEditDeleteProjectCalendars property.
    * 
    */
   public boolean isAddEditDeleteProjectCalendars()
   {
      return addEditDeleteProjectCalendars;
   }

   /**
    * Sets the value of the addEditDeleteProjectCalendars property.
    * 
    */
   public void setAddEditDeleteProjectCalendars(boolean value)
   {
      this.addEditDeleteProjectCalendars = value;
   }

   /**
    * Gets the value of the editContractManagementProjectLink property.
    * 
    */
   public boolean isEditContractManagementProjectLink()
   {
      return editContractManagementProjectLink;
   }

   /**
    * Sets the value of the editContractManagementProjectLink property.
    * 
    */
   public void setEditContractManagementProjectLink(boolean value)
   {
      this.editContractManagementProjectLink = value;
   }

   /**
    * Gets the value of the editProjectDetailsExceptCostsAndFinancials property.
    * 
    */
   public boolean isEditProjectDetailsExceptCostsAndFinancials()
   {
      return editProjectDetailsExceptCostsAndFinancials;
   }

   /**
    * Sets the value of the editProjectDetailsExceptCostsAndFinancials property.
    * 
    */
   public void setEditProjectDetailsExceptCostsAndFinancials(boolean value)
   {
      this.editProjectDetailsExceptCostsAndFinancials = value;
   }

   /**
    * Gets the value of the addEditDeleteExpenses property.
    * 
    */
   public boolean isAddEditDeleteExpenses()
   {
      return addEditDeleteExpenses;
   }

   /**
    * Sets the value of the addEditDeleteExpenses property.
    * 
    */
   public void setAddEditDeleteExpenses(boolean value)
   {
      this.addEditDeleteExpenses = value;
   }

   /**
    * Gets the value of the editProjectReports property.
    * 
    */
   public boolean isEditProjectReports()
   {
      return editProjectReports;
   }

   /**
    * Sets the value of the editProjectReports property.
    * 
    */
   public void setEditProjectReports(boolean value)
   {
      this.editProjectReports = value;
   }

   /**
    * Gets the value of the addEditDeleteIssuesAndIssueThreshold property.
    * 
    */
   public boolean isAddEditDeleteIssuesAndIssueThreshold()
   {
      return addEditDeleteIssuesAndIssueThreshold;
   }

   /**
    * Sets the value of the addEditDeleteIssuesAndIssueThreshold property.
    * 
    */
   public void setAddEditDeleteIssuesAndIssueThreshold(boolean value)
   {
      this.addEditDeleteIssuesAndIssueThreshold = value;
   }

   /**
    * Gets the value of the addEditDeleteWBSExceptCostsAndFinancials property.
    * 
    */
   public boolean isAddEditDeleteWBSExceptCostsAndFinancials()
   {
      return addEditDeleteWBSExceptCostsAndFinancials;
   }

   /**
    * Sets the value of the addEditDeleteWBSExceptCostsAndFinancials property.
    * 
    */
   public void setAddEditDeleteWBSExceptCostsAndFinancials(boolean value)
   {
      this.addEditDeleteWBSExceptCostsAndFinancials = value;
   }

   /**
    * Gets the value of the editWBSCostsAndFinancials property.
    * 
    */
   public boolean isEditWBSCostsAndFinancials()
   {
      return editWBSCostsAndFinancials;
   }

   /**
    * Sets the value of the editWBSCostsAndFinancials property.
    * 
    */
   public void setEditWBSCostsAndFinancials(boolean value)
   {
      this.editWBSCostsAndFinancials = value;
   }

   /**
    * Gets the value of the addEditDeleteWorkProductsAndDocuments property.
    * 
    */
   public boolean isAddEditDeleteWorkProductsAndDocuments()
   {
      return addEditDeleteWorkProductsAndDocuments;
   }

   /**
    * Sets the value of the addEditDeleteWorkProductsAndDocuments property.
    * 
    */
   public void setAddEditDeleteWorkProductsAndDocuments(boolean value)
   {
      this.addEditDeleteWorkProductsAndDocuments = value;
   }

   /**
    * Gets the value of the addEditDeleteResourceAssignmentsForResourcePlanning property.
    * 
    */
   public boolean isAddEditDeleteResourceAssignmentsForResourcePlanning()
   {
      return addEditDeleteResourceAssignmentsForResourcePlanning;
   }

   /**
    * Sets the value of the addEditDeleteResourceAssignmentsForResourcePlanning property.
    * 
    */
   public void setAddEditDeleteResourceAssignmentsForResourcePlanning(boolean value)
   {
      this.addEditDeleteResourceAssignmentsForResourcePlanning = value;
   }

   /**
    * Gets the value of the addEditDeleteRoleAssignmentsForResourcePlanning property.
    * 
    */
   public boolean isAddEditDeleteRoleAssignmentsForResourcePlanning()
   {
      return addEditDeleteRoleAssignmentsForResourcePlanning;
   }

   /**
    * Sets the value of the addEditDeleteRoleAssignmentsForResourcePlanning property.
    * 
    */
   public void setAddEditDeleteRoleAssignmentsForResourcePlanning(boolean value)
   {
      this.addEditDeleteRoleAssignmentsForResourcePlanning = value;
   }

   /**
    * Gets the value of the importAndViewContractManagerData property.
    * 
    */
   public boolean isImportAndViewContractManagerData()
   {
      return importAndViewContractManagerData;
   }

   /**
    * Sets the value of the importAndViewContractManagerData property.
    * 
    */
   public void setImportAndViewContractManagerData(boolean value)
   {
      this.importAndViewContractManagerData = value;
   }

   /**
    * Gets the value of the levelResources property.
    * 
    */
   public boolean isLevelResources()
   {
      return levelResources;
   }

   /**
    * Sets the value of the levelResources property.
    * 
    */
   public void setLevelResources(boolean value)
   {
      this.levelResources = value;
   }

   /**
    * Gets the value of the addEditDeleteProjectBaselines property.
    * 
    */
   public boolean isAddEditDeleteProjectBaselines()
   {
      return addEditDeleteProjectBaselines;
   }

   /**
    * Sets the value of the addEditDeleteProjectBaselines property.
    * 
    */
   public void setAddEditDeleteProjectBaselines(boolean value)
   {
      this.addEditDeleteProjectBaselines = value;
   }

   /**
    * Gets the value of the editWorkspaceAndWorkgroupPreferences property.
    * 
    */
   public boolean isEditWorkspaceAndWorkgroupPreferences()
   {
      return editWorkspaceAndWorkgroupPreferences;
   }

   /**
    * Sets the value of the editWorkspaceAndWorkgroupPreferences property.
    * 
    */
   public void setEditWorkspaceAndWorkgroupPreferences(boolean value)
   {
      this.editWorkspaceAndWorkgroupPreferences = value;
   }

   /**
    * Gets the value of the monitorProjectThresholds property.
    * 
    */
   public boolean isMonitorProjectThresholds()
   {
      return monitorProjectThresholds;
   }

   /**
    * Sets the value of the monitorProjectThresholds property.
    * 
    */
   public void setMonitorProjectThresholds(boolean value)
   {
      this.monitorProjectThresholds = value;
   }

   /**
    * Gets the value of the addEditActivityResourceRequests property.
    * 
    */
   public boolean isAddEditActivityResourceRequests()
   {
      return addEditActivityResourceRequests;
   }

   /**
    * Sets the value of the addEditActivityResourceRequests property.
    * 
    */
   public void setAddEditActivityResourceRequests(boolean value)
   {
      this.addEditActivityResourceRequests = value;
   }

   /**
    * Gets the value of the publishProjectWebsite property.
    * 
    */
   public boolean isPublishProjectWebsite()
   {
      return publishProjectWebsite;
   }

   /**
    * Sets the value of the publishProjectWebsite property.
    * 
    */
   public void setPublishProjectWebsite(boolean value)
   {
      this.publishProjectWebsite = value;
   }

   /**
    * Gets the value of the runBaselineUpdate property.
    * 
    */
   public boolean isRunBaselineUpdate()
   {
      return runBaselineUpdate;
   }

   /**
    * Sets the value of the runBaselineUpdate property.
    * 
    */
   public void setRunBaselineUpdate(boolean value)
   {
      this.runBaselineUpdate = value;
   }

   /**
    * Gets the value of the runGlobalChange property.
    * 
    */
   public boolean isRunGlobalChange()
   {
      return runGlobalChange;
   }

   /**
    * Sets the value of the runGlobalChange property.
    * 
    */
   public void setRunGlobalChange(boolean value)
   {
      this.runGlobalChange = value;
   }

   /**
    * Gets the value of the scheduleProjects property.
    * 
    */
   public boolean isScheduleProjects()
   {
      return scheduleProjects;
   }

   /**
    * Sets the value of the scheduleProjects property.
    * 
    */
   public void setScheduleProjects(boolean value)
   {
      this.scheduleProjects = value;
   }

   /**
    * Gets the value of the storePeriodPerformance property.
    * 
    */
   public boolean isStorePeriodPerformance()
   {
      return storePeriodPerformance;
   }

   /**
    * Sets the value of the storePeriodPerformance property.
    * 
    */
   public void setStorePeriodPerformance(boolean value)
   {
      this.storePeriodPerformance = value;
   }

   /**
    * Gets the value of the summarizeProjects property.
    * 
    */
   public boolean isSummarizeProjects()
   {
      return summarizeProjects;
   }

   /**
    * Sets the value of the summarizeProjects property.
    * 
    */
   public void setSummarizeProjects(boolean value)
   {
      this.summarizeProjects = value;
   }

   /**
    * Gets the value of the viewProjectCostsAndFinancials property.
    * 
    */
   public boolean isViewProjectCostsAndFinancials()
   {
      return viewProjectCostsAndFinancials;
   }

   /**
    * Sets the value of the viewProjectCostsAndFinancials property.
    * 
    */
   public void setViewProjectCostsAndFinancials(boolean value)
   {
      this.viewProjectCostsAndFinancials = value;
   }

   /**
    * Gets the value of the addEditDeleteIssuesandIssueThresholds property.
    * 
    */
   public boolean isAddEditDeleteIssuesandIssueThresholds()
   {
      return addEditDeleteIssuesandIssueThresholds;
   }

   /**
    * Sets the value of the addEditDeleteIssuesandIssueThresholds property.
    * 
    */
   public void setAddEditDeleteIssuesandIssueThresholds(boolean value)
   {
      this.addEditDeleteIssuesandIssueThresholds = value;
   }

   /**
    * Gets the value of the allowIntegrationwithERPSystem property.
    * 
    */
   public boolean isAllowIntegrationwithERPSystem()
   {
      return allowIntegrationwithERPSystem;
   }

   /**
    * Sets the value of the allowIntegrationwithERPSystem property.
    * 
    */
   public void setAllowIntegrationwithERPSystem(boolean value)
   {
      this.allowIntegrationwithERPSystem = value;
   }

   /**
    * Gets the value of the editPublicationPriority property.
    * 
    */
   public boolean isEditPublicationPriority()
   {
      return editPublicationPriority;
   }

   /**
    * Sets the value of the editPublicationPriority property.
    * 
    */
   public void setEditPublicationPriority(boolean value)
   {
      this.editPublicationPriority = value;
   }

}
