<?xml version="1.0" encoding="UTF-8"?>
<xpdl2:Package xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:database="http://www.tibco.com/XPD/database1.0.0" xmlns:eaijava="http://www.tibco.com/XPD/EAIJava1.0.0" xmlns:email="http://www.tibco.com/XPD/email1.0.0" xmlns:iProcessExt="http://www.tibco.com/XPD/iProcessExt1.0.0" xmlns:orchestrator="http://www.tibco.com/XPD/orchestrator1.0.0" xmlns:order="http://www.tibco.com/XPD/order1.0.0" xmlns:simulation="http://www.tibco.com/xpd/Simulation1.0.1" xmlns:xpdExt="http://www.tibco.com/XPD/xpdExtension1.0.0" xmlns:xpdl2="http://www.wfmc.org/2008/XPDL2.1" xsi:schemaLocation="http://www.wfmc.org/2008/XPDL2.1 http://www.wfmc.org/standards/bpmnxpdl_31.xsd" Id="_pNAK8OTsEeS0wbbQQHJX2g" xpdExt:DisplayName="fragment" Name="fragment">
  <xpdl2:PackageHeader xpdExt:Language="en_GB">
    <xpdl2:XPDLVersion>2.1</xpdl2:XPDLVersion>
    <xpdl2:Vendor>TIBCO</xpdl2:Vendor>
    <xpdl2:Created>2015-04-17</xpdl2:Created>
    <xpdl2:Description></xpdl2:Description>
    <xpdl2:Documentation></xpdl2:Documentation>
    <xpdl2:CostUnit>GBP</xpdl2:CostUnit>
  </xpdl2:PackageHeader>
  <xpdl2:RedefinableHeader PublicationStatus="UNDER_REVISION">
    <xpdl2:Author>bharge</xpdl2:Author>
    <xpdl2:Version>1.0.0.qualifier</xpdl2:Version>
  </xpdl2:RedefinableHeader>
  <xpdl2:Pools>
    <xpdl2:Pool Id="_sx7DMOTsEeS0wbbQQHJX2g" xpdExt:DisplayName="Pool" Name="Pool" BoundaryVisible="true" Process="_sx6cIOTsEeS0wbbQQHJX2g">
      <xpdl2:Lanes>
        <xpdl2:Lane Id="_sx7DMeTsEeS0wbbQQHJX2g" xpdExt:DisplayName="Lane" Name="Lane">
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo Height="300.0"/>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Lane>
      </xpdl2:Lanes>
    </xpdl2:Pool>
  </xpdl2:Pools>
  <xpdl2:WorkflowProcesses>
    <xpdl2:WorkflowProcess Id="_sx6cIOTsEeS0wbbQQHJX2g" xpdExt:XpdModelType="ServiceProcess" xpdExt:DisplayName="fragment-Process" Name="fragmentProcess">
      <xpdl2:ProcessHeader/>
      <xpdl2:Activities>
        <xpdl2:Activity Id="_syC_AOTsEeS0wbbQQHJX2g" Name="Start" xpdExt:Visibility="Private" xpdExt:DisplayName="Start">
          <xpdl2:Event>
            <xpdl2:StartEvent Trigger="None"/>
          </xpdl2:Event>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="168,186,200" Height="27.0" LaneId="_sx7DMeTsEeS0wbbQQHJX2g" Width="27.0">
              <xpdl2:Coordinates XCoordinate="53.0" YCoordinate="132.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_syC_AeTsEeS0wbbQQHJX2g" Name="End" xpdExt:Visibility="Private" xpdExt:DisplayName="End">
          <xpdl2:Event>
            <xpdl2:EndEvent Result="None"/>
          </xpdl2:Event>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="168,186,200" Height="30.0" LaneId="_sx7DMeTsEeS0wbbQQHJX2g" Width="30.0">
              <xpdl2:Coordinates XCoordinate="515.0" YCoordinate="132.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
      </xpdl2:Activities>
      <xpdl2:Transitions>
        <xpdl2:Transition Id="_syC_BOTsEeS0wbbQQHJX2g" xpdExt:DisplayName="" Name="" From="_syC_AOTsEeS0wbbQQHJX2g" To="_syC_AeTsEeS0wbbQQHJX2g">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
      </xpdl2:Transitions>
      <xpdl2:Extensions/>
      <xpdExt:ServiceProcessConfiguration xpdExt:DeployToProcessRuntime="true" xpdExt:DeployToPageflowRuntime="false"/>
    </xpdl2:WorkflowProcess>
  </xpdl2:WorkflowProcesses>
  <xpdl2:ExtendedAttributes>
    <xpdl2:ExtendedAttribute Name="CreatedBy" Value="TIBCO Business Studio"/>
    <xpdl2:ExtendedAttribute Name="FormatVersion" Value="18"/>
    <xpdl2:ExtendedAttribute Name="OriginalFormatVersion" Value="18"/>
  </xpdl2:ExtendedAttributes>
</xpdl2:Package>