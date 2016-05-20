<?xml version="1.0" encoding="UTF-8"?>
<xpdl2:Package xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:database="http://www.tibco.com/XPD/database1.0.0" xmlns:eaijava="http://www.tibco.com/XPD/EAIJava1.0.0" xmlns:email="http://www.tibco.com/XPD/email1.0.0" xmlns:iProcessExt="http://www.tibco.com/XPD/iProcessExt1.0.0" xmlns:simulation="http://www.tibco.com/xpd/Simulation1.0.1" xmlns:xpdExt="http://www.tibco.com/XPD/xpdExtension1.0.0" xmlns:xpdl2="http://www.wfmc.org/2008/XPDL2.1" xsi:schemaLocation="http://www.wfmc.org/2008/XPDL2.1 http://www.wfmc.org/standards/bpmnxpdl_31.xsd" Id="_IIJMcIDhEd28P6TQ-F95eg" xpdExt:DisplayName="ProcessPackage" Name="ProcessPackage">
  <xpdl2:PackageHeader xpdExt:Language="en_GB">
    <xpdl2:XPDLVersion>2.1</xpdl2:XPDLVersion>
    <xpdl2:Vendor>TIBCO</xpdl2:Vendor>
    <xpdl2:Created>2008-09-12T17:40:29BST</xpdl2:Created>
    <xpdl2:Description></xpdl2:Description>
    <xpdl2:Documentation></xpdl2:Documentation>
    <xpdl2:CostUnit>GBP</xpdl2:CostUnit>
  </xpdl2:PackageHeader>
  <xpdl2:RedefinableHeader PublicationStatus="UNDER_REVISION">
    <xpdl2:Author>rsomayaj</xpdl2:Author>
    <xpdl2:Version>1.0</xpdl2:Version>
  </xpdl2:RedefinableHeader>
  <xpdl2:Pools>
    <xpdl2:Pool Id="_Fragment_Dummy_Pool__JCtXQIDhEd28P6TQ-F95eg" xpdExt:DisplayName="Pool" Name="Pool" BoundaryVisible="true" Process="_IIJMcYDhEd28P6TQ-F95eg">
      <xpdl2:Lanes>
        <xpdl2:Lane Id="_Fragment_Dummy_Lane__JCtXQYDhEd28P6TQ-F95eg" xpdExt:DisplayName="Lane" Name="Lane">
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo Height="300.0"/>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Lane>
      </xpdl2:Lanes>
    </xpdl2:Pool>
  </xpdl2:Pools>
  <xpdl2:WorkflowProcesses>
    <xpdl2:WorkflowProcess Id="_IIJMcYDhEd28P6TQ-F95eg" xpdExt:FlowRoutingStyle="UncenteredOnTasks" xpdExt:DisplayName="ProcessPackage-Process" Name="ProcessPackageProcess">
      <xpdl2:ProcessHeader>
        <xpdl2:Description></xpdl2:Description>
      </xpdl2:ProcessHeader>
      <xpdl2:Activities>
        <xpdl2:Activity Id="_JCtXRoDhEd28P6TQ-F95eg">
          <xpdl2:Route GatewayType="Exclusive" MarkerVisible="true" ExclusiveType="Data"/>
          <xpdl2:ExtendedAttributes>
            <xpdl2:ExtendedAttribute Name="SplitSimulationData">
<simulation:SplitSimulationData>
                <simulation:ParameterDeterminedSplit>true</simulation:ParameterDeterminedSplit>
                <simulation:SplitParameter ParameterId=""/>
              </simulation:SplitSimulationData>
</xpdl2:ExtendedAttribute>
          </xpdl2:ExtendedAttributes>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="255,219,74" Height="45.0" LaneId="_Fragment_Dummy_Lane__JCtXQYDhEd28P6TQ-F95eg" Width="43.0">
              <xpdl2:Coordinates XCoordinate="191.0" YCoordinate="134.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_JCtXR4DhEd28P6TQ-F95eg">
          <xpdl2:Route GatewayType="Exclusive" MarkerVisible="true" ExclusiveType="Data"/>
          <xpdl2:ExtendedAttributes>
            <xpdl2:ExtendedAttribute Name="SplitSimulationData">
<simulation:SplitSimulationData>
                <simulation:ParameterDeterminedSplit>true</simulation:ParameterDeterminedSplit>
                <simulation:SplitParameter ParameterId=""/>
              </simulation:SplitSimulationData>
</xpdl2:ExtendedAttribute>
          </xpdl2:ExtendedAttributes>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="255,219,74" Height="45.0" LaneId="_Fragment_Dummy_Lane__JCtXQYDhEd28P6TQ-F95eg" Width="43.0">
              <xpdl2:Coordinates XCoordinate="447.0" YCoordinate="134.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
      </xpdl2:Activities>
      <xpdl2:Transitions>
        <xpdl2:Transition Id="_JCtXSIDhEd28P6TQ-F95eg" xpdExt:DisplayName="Condition True Flow" Name="ConditionTrueFlow" From="_JCtXRoDhEd28P6TQ-F95eg" To="_JCtXR4DhEd28P6TQ-F95eg">
          <xpdl2:Condition Type="CONDITION">
<xpdl2:Expression ScriptGrammar="javascript"/>
</xpdl2:Condition>
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo">
              <xpdl2:Coordinates XCoordinate="63.0" YCoordinate="-65.0"/>
              <xpdl2:Coordinates XCoordinate="-193.0" YCoordinate="-65.0"/>
              <xpdl2:Coordinates XCoordinate="203.0" YCoordinate="-65.0"/>
              <xpdl2:Coordinates XCoordinate="-53.0" YCoordinate="-65.0"/>
            </xpdl2:ConnectorGraphicsInfo>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_JCtXSYDhEd28P6TQ-F95eg" xpdExt:DisplayName="Condition False Flow" Name="ConditionFalseFlow" From="_JCtXRoDhEd28P6TQ-F95eg" To="_JCtXR4DhEd28P6TQ-F95eg">
          <xpdl2:Condition Type="OTHERWISE"/>
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo">
              <xpdl2:Coordinates XCoordinate="20.0" YCoordinate="64.0"/>
              <xpdl2:Coordinates XCoordinate="-236.0" YCoordinate="64.0"/>
              <xpdl2:Coordinates XCoordinate="236.0" YCoordinate="65.0"/>
              <xpdl2:Coordinates XCoordinate="-20.0" YCoordinate="65.0"/>
            </xpdl2:ConnectorGraphicsInfo>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
      </xpdl2:Transitions>
      <xpdl2:ExtendedAttributes>
        <xpdl2:ExtendedAttribute Name="FragmentFeedbackRect_1" Value="0,0,43,45"/>
        <xpdl2:ExtendedAttribute Name="FragmentFeedbackRect_2" Value="256,0,43,45"/>
      </xpdl2:ExtendedAttributes>
    </xpdl2:WorkflowProcess>
  </xpdl2:WorkflowProcesses>
  <xpdl2:ExtendedAttributes>
    <xpdl2:ExtendedAttribute Name="CreatedBy" Value="TIBCO Business Studio"/>
    <xpdl2:ExtendedAttribute Name="FormatVersion" Value="18"/>
    <xpdl2:ExtendedAttribute Name="OriginalFormatVersion" Value="13"/>
  </xpdl2:ExtendedAttributes>
</xpdl2:Package>