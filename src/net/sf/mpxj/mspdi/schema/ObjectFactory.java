//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.3-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.01.22 at 12:20:33 GMT 
//


package net.sf.mpxj.mspdi.schema;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.sf.mpxj.mspdi.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends net.sf.mpxj.mspdi.schema.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(57, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static net.sf.mpxj.mspdi.schema.impl.runtime.GrammarInfo grammarInfo = new net.sf.mpxj.mspdi.schema.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (net.sf.mpxj.mspdi.schema.ObjectFactory.class));
    public final static java.lang.Class version = (net.sf.mpxj.mspdi.schema.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.WBSMasksType.WBSMaskType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.WBSMasksTypeImpl.WBSMaskTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl.WeekDaysTypeImpl.WeekDayTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.AssignmentsType.AssignmentType.ExtendedAttributeType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.AssignmentsTypeImpl.AssignmentTypeImpl.ExtendedAttributeTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType.ResourceType.BaselineType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.BaselineTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType.ResourceType.RatesType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.RatesTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.WorkingTimesType.WorkingTimeType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl.WeekDaysTypeImpl.WeekDayTypeImpl.WorkingTimesTypeImpl.WorkingTimeTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType.ResourceType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.TasksType.TaskType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl.TaskTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.ExtendedAttributesType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ExtendedAttributesTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType.ResourceType.OutlineCodeType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.OutlineCodeTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.MasksType.MaskType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl.MasksTypeImpl.MaskTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl.ValuesTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.TimephasedDataType.class), "net.sf.mpxj.mspdi.schema.impl.TimephasedDataTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.TasksType.TaskType.BaselineType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl.TaskTypeImpl.BaselineTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.TasksType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.CalendarsType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType.ResourceType.AvailabilityPeriodsType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.AvailabilityPeriodsTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType.ResourceType.ExtendedAttributeType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.ExtendedAttributeTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.TimePeriodType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl.WeekDaysTypeImpl.WeekDayTypeImpl.TimePeriodTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.TasksType.TaskType.ExtendedAttributeType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl.TaskTypeImpl.ExtendedAttributeTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.AssignmentsType.AssignmentType.BaselineType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.AssignmentsTypeImpl.AssignmentTypeImpl.BaselineTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.OutlineCodesType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.WorkingTimesType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl.WeekDaysTypeImpl.WeekDayTypeImpl.WorkingTimesTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.MasksType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl.MasksTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.AssignmentsType.AssignmentType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.AssignmentsTypeImpl.AssignmentTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.AssignmentsType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.AssignmentsTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType.ValueListType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ExtendedAttributesTypeImpl.ExtendedAttributeTypeImpl.ValueListTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType.ResourceType.AvailabilityPeriodsType.AvailabilityPeriodType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.AvailabilityPeriodsTypeImpl.AvailabilityPeriodTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType.ResourceType.RatesType.RateType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.RatesTypeImpl.RateTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.CalendarsType.CalendarType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.Project.class), "net.sf.mpxj.mspdi.schema.impl.ProjectImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType.ValueListType.ValueType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ExtendedAttributesTypeImpl.ExtendedAttributeTypeImpl.ValueListTypeImpl.ValueTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.WBSMasksType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.WBSMasksTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.TasksType.TaskType.OutlineCodeType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl.TaskTypeImpl.OutlineCodeTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ExtendedAttributesTypeImpl.ExtendedAttributeTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.TasksType.TaskType.PredecessorLinkType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl.TaskTypeImpl.PredecessorLinkTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType.ValueType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl.ValuesTypeImpl.ValueTypeImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType.Value.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl.ValuesTypeImpl.ValueImpl");
        defaultImplementations.put((net.sf.mpxj.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.class), "net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl.WeekDaysTypeImpl");
        rootTagMap.put(new javax.xml.namespace.QName("http://schemas.microsoft.com/project", "Project"), (net.sf.mpxj.mspdi.schema.Project.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.sf.mpxj.mspdi.schema
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param value
     *     the value of the property to be set
     * @param name
     *     the name of the property to retrieve
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of ProjectTypeWBSMasksTypeWBSMaskType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.WBSMasksType.WBSMaskType createProjectTypeWBSMasksTypeWBSMaskType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.WBSMasksTypeImpl.WBSMaskTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeOutlineCodesTypeOutlineCodeType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType createProjectTypeOutlineCodesTypeOutlineCodeType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeCalendarsTypeCalendarTypeWeekDaysTypeWeekDayType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType createProjectTypeCalendarsTypeCalendarTypeWeekDaysTypeWeekDayType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl.WeekDaysTypeImpl.WeekDayTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeAssignmentsTypeAssignmentTypeExtendedAttributeType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.AssignmentsType.AssignmentType.ExtendedAttributeType createProjectTypeAssignmentsTypeAssignmentTypeExtendedAttributeType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.AssignmentsTypeImpl.AssignmentTypeImpl.ExtendedAttributeTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeResourcesTypeResourceTypeBaselineType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType.ResourceType.BaselineType createProjectTypeResourcesTypeResourceTypeBaselineType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.BaselineTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeResourcesTypeResourceTypeRatesType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType.ResourceType.RatesType createProjectTypeResourcesTypeResourceTypeRatesType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.RatesTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeCalendarsTypeCalendarTypeWeekDaysTypeWeekDayTypeWorkingTimesTypeWorkingTimeType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.WorkingTimesType.WorkingTimeType createProjectTypeCalendarsTypeCalendarTypeWeekDaysTypeWeekDayTypeWorkingTimesTypeWorkingTimeType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl.WeekDaysTypeImpl.WeekDayTypeImpl.WorkingTimesTypeImpl.WorkingTimeTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeResourcesTypeResourceType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType.ResourceType createProjectTypeResourcesTypeResourceType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeTasksTypeTaskType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.TasksType.TaskType createProjectTypeTasksTypeTaskType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl.TaskTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeExtendedAttributesType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.ExtendedAttributesType createProjectTypeExtendedAttributesType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ExtendedAttributesTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeResourcesTypeResourceTypeOutlineCodeType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType.ResourceType.OutlineCodeType createProjectTypeResourcesTypeResourceTypeOutlineCodeType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.OutlineCodeTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeOutlineCodesTypeOutlineCodeTypeMasksTypeMaskType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.MasksType.MaskType createProjectTypeOutlineCodesTypeOutlineCodeTypeMasksTypeMaskType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl.MasksTypeImpl.MaskTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeOutlineCodesTypeOutlineCodeTypeValuesType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType createProjectTypeOutlineCodesTypeOutlineCodeTypeValuesType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl.ValuesTypeImpl();
    }

    /**
     * Create an instance of TimephasedDataType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.TimephasedDataType createTimephasedDataType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.TimephasedDataTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeTasksTypeTaskTypeBaselineType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.TasksType.TaskType.BaselineType createProjectTypeTasksTypeTaskTypeBaselineType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl.TaskTypeImpl.BaselineTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeTasksType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.TasksType createProjectTypeTasksType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeCalendarsType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.CalendarsType createProjectTypeCalendarsType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl();
    }

    /**
     * Create an instance of ProjectType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType createProjectType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeResourcesTypeResourceTypeAvailabilityPeriodsType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType.ResourceType.AvailabilityPeriodsType createProjectTypeResourcesTypeResourceTypeAvailabilityPeriodsType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.AvailabilityPeriodsTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeResourcesTypeResourceTypeExtendedAttributeType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType.ResourceType.ExtendedAttributeType createProjectTypeResourcesTypeResourceTypeExtendedAttributeType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.ExtendedAttributeTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeCalendarsTypeCalendarTypeWeekDaysTypeWeekDayTypeTimePeriodType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.TimePeriodType createProjectTypeCalendarsTypeCalendarTypeWeekDaysTypeWeekDayTypeTimePeriodType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl.WeekDaysTypeImpl.WeekDayTypeImpl.TimePeriodTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeTasksTypeTaskTypeExtendedAttributeType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.TasksType.TaskType.ExtendedAttributeType createProjectTypeTasksTypeTaskTypeExtendedAttributeType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl.TaskTypeImpl.ExtendedAttributeTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeResourcesType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType createProjectTypeResourcesType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeAssignmentsTypeAssignmentTypeBaselineType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.AssignmentsType.AssignmentType.BaselineType createProjectTypeAssignmentsTypeAssignmentTypeBaselineType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.AssignmentsTypeImpl.AssignmentTypeImpl.BaselineTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeOutlineCodesType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.OutlineCodesType createProjectTypeOutlineCodesType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeCalendarsTypeCalendarTypeWeekDaysTypeWeekDayTypeWorkingTimesType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.WorkingTimesType createProjectTypeCalendarsTypeCalendarTypeWeekDaysTypeWeekDayTypeWorkingTimesType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl.WeekDaysTypeImpl.WeekDayTypeImpl.WorkingTimesTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeOutlineCodesTypeOutlineCodeTypeMasksType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.MasksType createProjectTypeOutlineCodesTypeOutlineCodeTypeMasksType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl.MasksTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeAssignmentsTypeAssignmentType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.AssignmentsType.AssignmentType createProjectTypeAssignmentsTypeAssignmentType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.AssignmentsTypeImpl.AssignmentTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeAssignmentsType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.AssignmentsType createProjectTypeAssignmentsType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.AssignmentsTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeExtendedAttributesTypeExtendedAttributeTypeValueListType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType.ValueListType createProjectTypeExtendedAttributesTypeExtendedAttributeTypeValueListType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ExtendedAttributesTypeImpl.ExtendedAttributeTypeImpl.ValueListTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeResourcesTypeResourceTypeAvailabilityPeriodsTypeAvailabilityPeriodType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType.ResourceType.AvailabilityPeriodsType.AvailabilityPeriodType createProjectTypeResourcesTypeResourceTypeAvailabilityPeriodsTypeAvailabilityPeriodType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.AvailabilityPeriodsTypeImpl.AvailabilityPeriodTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeResourcesTypeResourceTypeRatesTypeRateType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.ResourcesType.ResourceType.RatesType.RateType createProjectTypeResourcesTypeResourceTypeRatesTypeRateType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.RatesTypeImpl.RateTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeCalendarsTypeCalendarType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.CalendarsType.CalendarType createProjectTypeCalendarsTypeCalendarType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl();
    }

    /**
     * Create an instance of Project
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.Project createProject()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectImpl();
    }

    /**
     * Create an instance of ProjectTypeExtendedAttributesTypeExtendedAttributeTypeValueListTypeValueType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType.ValueListType.ValueType createProjectTypeExtendedAttributesTypeExtendedAttributeTypeValueListTypeValueType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ExtendedAttributesTypeImpl.ExtendedAttributeTypeImpl.ValueListTypeImpl.ValueTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeWBSMasksType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.WBSMasksType createProjectTypeWBSMasksType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.WBSMasksTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeTasksTypeTaskTypeOutlineCodeType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.TasksType.TaskType.OutlineCodeType createProjectTypeTasksTypeTaskTypeOutlineCodeType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl.TaskTypeImpl.OutlineCodeTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeExtendedAttributesTypeExtendedAttributeType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType createProjectTypeExtendedAttributesTypeExtendedAttributeType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.ExtendedAttributesTypeImpl.ExtendedAttributeTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeTasksTypeTaskTypePredecessorLinkType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.TasksType.TaskType.PredecessorLinkType createProjectTypeTasksTypeTaskTypePredecessorLinkType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl.TaskTypeImpl.PredecessorLinkTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeOutlineCodesTypeOutlineCodeTypeValuesTypeValueType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType.ValueType createProjectTypeOutlineCodesTypeOutlineCodeTypeValuesTypeValueType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl.ValuesTypeImpl.ValueTypeImpl();
    }

    /**
     * Create an instance of ProjectTypeOutlineCodesTypeOutlineCodeTypeValuesTypeValue
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType.Value createProjectTypeOutlineCodesTypeOutlineCodeTypeValuesTypeValue()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl.ValuesTypeImpl.ValueImpl();
    }

    /**
     * Create an instance of ProjectTypeCalendarsTypeCalendarTypeWeekDaysType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType createProjectTypeCalendarsTypeCalendarTypeWeekDaysType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl.WeekDaysTypeImpl();
    }

}