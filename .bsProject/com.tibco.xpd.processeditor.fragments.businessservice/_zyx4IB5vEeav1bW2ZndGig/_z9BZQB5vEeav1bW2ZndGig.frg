<?xml version="1.0" encoding="UTF-8"?>
<xpdl2:Package xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:database="http://www.tibco.com/XPD/database1.0.0" xmlns:eaijava="http://www.tibco.com/XPD/EAIJava1.0.0" xmlns:email="http://www.tibco.com/XPD/email1.0.0" xmlns:iProcessExt="http://www.tibco.com/XPD/iProcessExt1.0.0" xmlns:orchestrator="http://www.tibco.com/XPD/orchestrator1.0.0" xmlns:order="http://www.tibco.com/XPD/order1.0.0" xmlns:simulation="http://www.tibco.com/xpd/Simulation1.0.1" xmlns:xpdExt="http://www.tibco.com/XPD/xpdExtension1.0.0" xmlns:xpdl2="http://www.wfmc.org/2008/XPDL2.1" xsi:schemaLocation="http://www.wfmc.org/2008/XPDL2.1 http://www.wfmc.org/standards/bpmnxpdl_31.xsd" Id="_invoke_business_process_start_type_none_fragment_id" xpdExt:DisplayName="fragment" Name="fragment">
  <xpdl2:PackageHeader xpdExt:Language="en_GB">
    <xpdl2:XPDLVersion>2.1</xpdl2:XPDLVersion>
    <xpdl2:Vendor>TIBCO</xpdl2:Vendor>
    <xpdl2:Created>2010-03-30</xpdl2:Created>
    <xpdl2:Description></xpdl2:Description>
    <xpdl2:Documentation></xpdl2:Documentation>
    <xpdl2:CostUnit>GBP</xpdl2:CostUnit>
  </xpdl2:PackageHeader>
  <xpdl2:RedefinableHeader PublicationStatus="UNDER_REVISION">
    <xpdl2:Author>bharge</xpdl2:Author>
    <xpdl2:Version>1.0.0.qualifier</xpdl2:Version>
  </xpdl2:RedefinableHeader>
  <xpdl2:Pools>
    <xpdl2:Pool Id="_Fragment_Dummy_Pool__iirEqjvxEd-1Sd5fVL7qGQ" xpdExt:DisplayName="Pool" Name="Pool" BoundaryVisible="true" Process="_hPOfwDvxEd-1Sd5fVL7qGQ">
      <xpdl2:Lanes>
        <xpdl2:Lane Id="_Fragment_Dummy_Lane__iirEqzvxEd-1Sd5fVL7qGQ" xpdExt:DisplayName="Lane" Name="Lane">
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo Height="300.0"/>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Lane>
      </xpdl2:Lanes>
    </xpdl2:Pool>
  </xpdl2:Pools>
  <xpdl2:WorkflowProcesses>
    <xpdl2:WorkflowProcess Id="_hPOfwDvxEd-1Sd5fVL7qGQ" xpdExt:FlowRoutingStyle="UncenteredOnTasks" xpdExt:XpdModelType="PageFlow" xpdExt:DisplayName="fragment-Process" xpdExt:PublishAsBusinessService="true" Name="fragmentProcess">
      <xpdl2:ProcessHeader/>
      <xpdl2:Activities>
        <xpdl2:Activity Id="_iirErDvxEd-1Sd5fVL7qGQ" Name="Start" xpdExt:Visibility="Private" xpdExt:DisplayName="Start">
          <xpdl2:Event>
            <xpdl2:StartEvent Trigger="None"/>
          </xpdl2:Event>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="27.0" LaneId="_Fragment_Dummy_Lane__iirEqzvxEd-1Sd5fVL7qGQ" Width="27.0">
              <xpdl2:Coordinates XCoordinate="33.0" YCoordinate="72.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_iirErTvxEd-1Sd5fVL7qGQ" Name="UserTask" xpdExt:Visibility="Private" xpdExt:DisplayName="User Task">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskUser Implementation="Unspecified">
                <xpdl2:Performers>
                  <xpdl2:Performer>-defined-in-Activity-Performer-</xpdl2:Performer>
                </xpdl2:Performers>
                <xpdl2:MessageIn Id="_iirErjvxEd-1Sd5fVL7qGQ"/>
                <xpdl2:MessageOut Id="_iirErzvxEd-1Sd5fVL7qGQ"/>
              </xpdl2:TaskUser>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="64.0" LaneId="_Fragment_Dummy_Lane__iirEqzvxEd-1Sd5fVL7qGQ" Width="96.0">
              <xpdl2:Coordinates XCoordinate="240.0" YCoordinate="72.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Offer="OfferAll" xpdExt:Strategy="SYSTEM_DETERMINED" xpdExt:ReOfferOnClose="false" xpdExt:ReOfferOnCancel="true"/>
          </xpdExt:ActivityResourcePatterns>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_HCLAIJZaEeSdK7xdJALwdw" Name="CallSubProcess" xpdExt:Visibility="Private" xpdExt:DisplayName="Call Sub-Process">
          <xpdl2:Implementation>
            <xpdl2:SubFlow Id="-unknown-" xpdExt:StartStrategy="StartImmediately" xpdExt:SuspendResumeWithParent="true"/>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="80.0" LaneId="_Fragment_Dummy_Lane__iirEqzvxEd-1Sd5fVL7qGQ" Width="128.0">
              <xpdl2:Coordinates XCoordinate="466.0" YCoordinate="72.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
      </xpdl2:Activities>
      <xpdl2:Transitions>
        <xpdl2:Transition Id="_iirEsjvxEd-1Sd5fVL7qGQ" xpdExt:DisplayName="" Name="" From="_iirErDvxEd-1Sd5fVL7qGQ" To="_iirErTvxEd-1Sd5fVL7qGQ">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_HnYmAJZaEeSdK7xdJALwdw" xpdExt:DisplayName="" Name="" From="_iirErTvxEd-1Sd5fVL7qGQ" To="_HCLAIJZaEeSdK7xdJALwdw">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.LabelAnchorPosition">
              <xpdl2:Coordinates XCoordinate="50.0" YCoordinate="0.0"/>
              <xpdl2:Coordinates XCoordinate="0.0" YCoordinate="0.0"/>
            </xpdl2:ConnectorGraphicsInfo>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
      </xpdl2:Transitions>
    </xpdl2:WorkflowProcess>
  </xpdl2:WorkflowProcesses>
  <xpdl2:ExtendedAttributes>
    <xpdl2:ExtendedAttribute Name="CreatedBy" Value="TIBCO Business Studio"/>
    <xpdl2:ExtendedAttribute Name="FormatVersion" Value="18"/>
    <xpdl2:ExtendedAttribute Name="OriginalFormatVersion" Value="13"/>
  </xpdl2:ExtendedAttributes>
</xpdl2:Package>