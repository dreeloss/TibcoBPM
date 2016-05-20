<?xml version="1.0" encoding="UTF-8"?>
<xpdl2:Package xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:database="http://www.tibco.com/XPD/database1.0.0" xmlns:eaijava="http://www.tibco.com/XPD/EAIJava1.0.0" xmlns:email="http://www.tibco.com/XPD/email1.0.0" xmlns:iProcessExt="http://www.tibco.com/XPD/iProcessExt1.0.0" xmlns:orchestrator="http://www.tibco.com/XPD/orchestrator1.0.0" xmlns:order="http://www.tibco.com/XPD/order1.0.0" xmlns:simulation="http://www.tibco.com/xpd/Simulation1.0.1" xmlns:xpdExt="http://www.tibco.com/XPD/xpdExtension1.0.0" xmlns:xpdl2="http://www.wfmc.org/2008/XPDL2.1" xsi:schemaLocation="http://www.wfmc.org/2008/XPDL2.1 http://www.wfmc.org/standards/bpmnxpdl_31.xsd" Id="_update_case_data_caseservice_fragment_id" xpdExt:DisplayName="fragment" Name="fragment">
  <xpdl2:PackageHeader xpdExt:Language="en_GB">
    <xpdl2:XPDLVersion>2.1</xpdl2:XPDLVersion>
    <xpdl2:Vendor>TIBCO</xpdl2:Vendor>
    <xpdl2:Created>2014-07-31</xpdl2:Created>
    <xpdl2:Description></xpdl2:Description>
    <xpdl2:Documentation></xpdl2:Documentation>
    <xpdl2:CostUnit>GBP</xpdl2:CostUnit>
  </xpdl2:PackageHeader>
  <xpdl2:RedefinableHeader PublicationStatus="UNDER_REVISION">
    <xpdl2:Author>bharge</xpdl2:Author>
    <xpdl2:Version>1.0.0.qualifier</xpdl2:Version>
  </xpdl2:RedefinableHeader>
  <xpdl2:Pools>
    <xpdl2:Pool Id="_xmzl4BiFEeSZl-ER2FAHig" xpdExt:DisplayName="Pool" Name="Pool" BoundaryVisible="true" Process="_xmmKgBiFEeSZl-ER2FAHig">
      <xpdl2:Lanes>
        <xpdl2:Lane Id="_xmzl4RiFEeSZl-ER2FAHig" xpdExt:DisplayName="Lane" Name="Lane">
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo Height="532.0"/>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Lane>
      </xpdl2:Lanes>
    </xpdl2:Pool>
  </xpdl2:Pools>
  <xpdl2:WorkflowProcesses>
    <xpdl2:WorkflowProcess Id="_xmmKgBiFEeSZl-ER2FAHig" xpdExt:XpdModelType="PageFlow" xpdExt:PublishAsBusinessService="true" xpdExt:IsCaseService="true" xpdExt:DisplayName="fragment-Process" Name="fragmentProcess">
      <xpdl2:ProcessHeader/>
      <xpdl2:FormalParameters>
        <xpdl2:FormalParameter Id="_Woiy8CLpEeSL--enCkWcxA" Name="caseRefType" Mode="IN" Required="true" xpdExt:DisplayName="caseRefType">
          <xpdl2:DataType>
            <xpdl2:RecordType>
              <xpdl2:Member>
                <xpdl2:ExternalReference location=""/>
              </xpdl2:Member>
            </xpdl2:RecordType>
          </xpdl2:DataType>
        </xpdl2:FormalParameter>
      </xpdl2:FormalParameters>
      <xpdl2:DataFields>
        <xpdl2:DataField Id="_xm0M-RiFEeSZl-ER2FAHig" xpdExt:DisplayName="Error Code" Name="ErrorCode">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="STRING">
              <xpdl2:Length>50</xpdl2:Length>
            </xpdl2:BasicType>
          </xpdl2:DataType>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_xm0M-hiFEeSZl-ER2FAHig" xpdExt:DisplayName="Error Detail" Name="ErrorDetail">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="STRING">
              <xpdl2:Length>250</xpdl2:Length>
            </xpdl2:BasicType>
          </xpdl2:DataType>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_xm0M-xiFEeSZl-ER2FAHig" xpdExt:DisplayName="CaseOutOfSynchError" Name="CaseOutOfSynchError" ReadOnly="true">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="STRING">
              <xpdl2:Length>150</xpdl2:Length>
            </xpdl2:BasicType>
          </xpdl2:DataType>
          <xpdExt:InitialValues>
            <xpdExt:Value>Your local copy of the case object is out of synch. The case object has been changed by something else since your copy was fetched.</xpdExt:Value>
          </xpdExt:InitialValues>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_-HGaQCLkEeS1IbKQhlOO3Q" xpdExt:DisplayName="caseBomType" Name="caseBomType">
          <xpdl2:DataType>
            <xpdl2:ExternalReference location=""/>
          </xpdl2:DataType>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_aYP8kCRiEeS7nfcnWLEGQg" xpdExt:DisplayName="CaseNotFound" Name="CaseNotFound" ReadOnly="true">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="STRING">
              <xpdl2:Length>100</xpdl2:Length>
            </xpdl2:BasicType>
          </xpdl2:DataType>
          <xpdExt:InitialValues>
            <xpdExt:Value>Case not found for the given case reference</xpdExt:Value>
          </xpdExt:InitialValues>
        </xpdl2:DataField>
      </xpdl2:DataFields>
      <xpdl2:Activities>
        <xpdl2:Activity Id="_xmzl4hiFEeSZl-ER2FAHig" Name="Start" xpdExt:Visibility="Private" xpdExt:DisplayName="Start">
          <xpdl2:Event>
            <xpdl2:StartEvent Trigger="None"/>
          </xpdl2:Event>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="166,208,152" Height="47.0" LaneId="_xmzl4RiFEeSZl-ER2FAHig" Width="31.0">
              <xpdl2:Coordinates XCoordinate="40.0" YCoordinate="164.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_xmzl5hiFEeSZl-ER2FAHig" Name="LookupCase" xpdExt:Visibility="Private" xpdExt:DisplayName="Lookup Case">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskScript>
                <xpdl2:Script ScriptGrammar="JavaScript">//This script must be modified to match the read method name&#xD;
if (caseRefType != null) {&#xD;
	caseBomType = caseRefType.readXXX();&#xD;
}&#xD;
</xpdl2:Script>
              </xpdl2:TaskScript>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="166,208,152" Height="54.0" LaneId="_xmzl4RiFEeSZl-ER2FAHig" Width="90.0">
              <xpdl2:Coordinates XCoordinate="160.0" YCoordinate="164.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Strategy="SYSTEM_DETERMINED"/>
          </xpdExt:ActivityResourcePatterns>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_xmzl5xiFEeSZl-ER2FAHig" xpdExt:DisplayName="">
          <xpdl2:Route GatewayType="Exclusive" MarkerVisible="true" ExclusiveType="Data"/>
          <xpdl2:TransitionRestrictions>
            <xpdl2:TransitionRestriction>
              <xpdl2:Split Type="Exclusive" ExclusiveType="Data">
                <xpdl2:TransitionRefs>
                  <xpdl2:TransitionRef Id="_xm0M9BiFEeSZl-ER2FAHig"/>
                  <xpdl2:TransitionRef Id="_TE5qwCRiEeS7nfcnWLEGQg"/>
                </xpdl2:TransitionRefs>
              </xpdl2:Split>
            </xpdl2:TransitionRestriction>
          </xpdl2:TransitionRestrictions>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="166,208,152" Height="45.0" LaneId="_xmzl4RiFEeSZl-ER2FAHig" Width="43.0">
              <xpdl2:Coordinates XCoordinate="286.0" YCoordinate="164.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_xmzl6BiFEeSZl-ER2FAHig" Name="ModifyData" xpdExt:Visibility="Private" xpdExt:DisplayName="Modify Data">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskUser Implementation="Unspecified">
                <xpdl2:Performers>
                  <xpdl2:Performer>-defined-in-Activity-Performer-</xpdl2:Performer>
                </xpdl2:Performers>
                <xpdl2:MessageIn Id="_xmzl6RiFEeSZl-ER2FAHig"/>
                <xpdl2:MessageOut Id="_xmzl6hiFEeSZl-ER2FAHig"/>
              </xpdl2:TaskUser>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="166,208,152" Height="54.0" LaneId="_xmzl4RiFEeSZl-ER2FAHig" Width="90.0">
              <xpdl2:Coordinates XCoordinate="408.0" YCoordinate="164.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Offer="OfferAll" xpdExt:Strategy="SYSTEM_DETERMINED" xpdExt:ReOfferOnClose="true" xpdExt:ReOfferOnCancel="true"/>
            <xpdExt:WorkItemPriority InitialPriority="50"/>
          </xpdExt:ActivityResourcePatterns>
          <xpdExt:AssociatedParameters DisableImplicitAssociation="false">
            <xpdExt:AssociatedParameter FormalParam="caseBomType" Mode="INOUT" Mandatory="true">
              <xpdl2:Description></xpdl2:Description>
            </xpdExt:AssociatedParameter>
          </xpdExt:AssociatedParameters>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_xmzl6xiFEeSZl-ER2FAHig" Name="UpdateCase" xpdExt:Visibility="Private" xpdExt:DisplayName="Update Case">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskService xpdExt:ImplementationType="GlobalData" Implementation="Other">
                <xpdl2:MessageIn Id="_xmzl7BiFEeSZl-ER2FAHig"/>
                <xpdl2:MessageOut Id="_xmzl7RiFEeSZl-ER2FAHig"/>
                <xpdExt:GlobalDataOperation>
                  <xpdExt:CaseReferenceOperations>
                    <xpdExt:Update/>
                  </xpdExt:CaseReferenceOperations>
                </xpdExt:GlobalDataOperation>
              </xpdl2:TaskService>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="166,208,152" Height="54.0" LaneId="_xmzl4RiFEeSZl-ER2FAHig" Width="90.0">
              <xpdl2:Coordinates XCoordinate="559.0" YCoordinate="164.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Strategy="SYSTEM_DETERMINED"/>
          </xpdExt:ActivityResourcePatterns>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_xmzl7hiFEeSZl-ER2FAHig" Name="UpdateFailed" xpdExt:Visibility="Private" xpdExt:DisplayName="Update Failed">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskUser Implementation="Unspecified">
                <xpdl2:Performers>
                  <xpdl2:Performer>-defined-in-Activity-Performer-</xpdl2:Performer>
                </xpdl2:Performers>
                <xpdl2:MessageIn Id="_xmzl7xiFEeSZl-ER2FAHig"/>
                <xpdl2:MessageOut Id="_xmzl8BiFEeSZl-ER2FAHig"/>
              </xpdl2:TaskUser>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="166,208,152" Height="54.0" LaneId="_xmzl4RiFEeSZl-ER2FAHig" Width="90.0">
              <xpdl2:Coordinates XCoordinate="580.0" YCoordinate="286.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Offer="OfferAll" xpdExt:Strategy="SYSTEM_DETERMINED" xpdExt:ReOfferOnClose="true" xpdExt:ReOfferOnCancel="true"/>
            <xpdExt:WorkItemPriority InitialPriority="50"/>
          </xpdExt:ActivityResourcePatterns>
          <xpdExt:AssociatedParameters>
            <xpdExt:AssociatedParameter FormalParam="ErrorCode" Mode="INOUT" Mandatory="true">
              <xpdl2:Description></xpdl2:Description>
            </xpdExt:AssociatedParameter>
            <xpdExt:AssociatedParameter FormalParam="ErrorDetail" Mode="INOUT" Mandatory="true">
              <xpdl2:Description></xpdl2:Description>
            </xpdExt:AssociatedParameter>
            <xpdExt:AssociatedParameter FormalParam="CaseOutOfSynchError" Mode="IN" Mandatory="true">
              <xpdl2:Description></xpdl2:Description>
            </xpdExt:AssociatedParameter>
          </xpdExt:AssociatedParameters>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_xmzl8RiFEeSZl-ER2FAHig" Name="CaseOutOfSynchError" xpdExt:Visibility="Private" xpdExt:DisplayName="CaseOutOfSynch Error">
          <xpdl2:Event>
            <xpdl2:IntermediateEvent Target="_xmzl6xiFEeSZl-ER2FAHig" Trigger="Error">
              <xpdl2:ResultError ErrorCode="">
                <xpdExt:CatchErrorMappings>
                  <xpdExt:Message Id="_xmzl8hiFEeSZl-ER2FAHig">
                    <xpdl2:DataMappings>
                      <xpdl2:DataMapping Direction="OUT" Formal="$ERRORCODE">
                        <xpdl2:Actual ScriptGrammar="JavaScript">ErrorCode</xpdl2:Actual>
                      </xpdl2:DataMapping>
                      <xpdl2:DataMapping Direction="OUT" Formal="$ERRORDETAIL">
                        <xpdl2:Actual ScriptGrammar="JavaScript">ErrorDetail</xpdl2:Actual>
                      </xpdl2:DataMapping>
                    </xpdl2:DataMappings>
                  </xpdExt:Message>
                </xpdExt:CatchErrorMappings>
              </xpdl2:ResultError>
            </xpdl2:IntermediateEvent>
          </xpdl2:Event>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="166,208,152" Height="62.0" LaneId="_xmzl4RiFEeSZl-ER2FAHig" Width="92.0">
              <xpdl2:Coordinates XCoordinate="0.0" YCoordinate="0.0"/>
            </xpdl2:NodeGraphicsInfo>
            <xpdl2:NodeGraphicsInfo ToolId="XPD.BorderEventPosition">
              <xpdl2:Coordinates XCoordinate="27.187499999999996" YCoordinate="0.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_xmzl8xiFEeSZl-ER2FAHig" Name="End" xpdExt:Visibility="Private" xpdExt:DisplayName="End">
          <xpdl2:Event>
            <xpdl2:EndEvent Result="None"/>
          </xpdl2:Event>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="166,208,152" Height="47.0" LaneId="_xmzl4RiFEeSZl-ER2FAHig" Width="31.0">
              <xpdl2:Coordinates XCoordinate="679.0" YCoordinate="164.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_DfMhMCRiEeS7nfcnWLEGQg" Name="LookupFailed" xpdExt:Visibility="Private" xpdExt:DisplayName="Lookup Failed">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskUser Implementation="Unspecified">
                <xpdl2:Performers>
                  <xpdl2:Performer>-defined-in-Activity-Performer-</xpdl2:Performer>
                </xpdl2:Performers>
                <xpdl2:MessageIn Id="_DfMhMSRiEeS7nfcnWLEGQg"/>
                <xpdl2:MessageOut Id="_DfMhMiRiEeS7nfcnWLEGQg"/>
              </xpdl2:TaskUser>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="166,208,152" Height="54.0" LaneId="_xmzl4RiFEeSZl-ER2FAHig" Width="90.0">
              <xpdl2:Coordinates XCoordinate="286.0" YCoordinate="262.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Offer="OfferAll" xpdExt:Strategy="SYSTEM_DETERMINED" xpdExt:ReOfferOnClose="true" xpdExt:ReOfferOnCancel="true"/>
            <xpdExt:WorkItemPriority InitialPriority="50"/>
          </xpdExt:ActivityResourcePatterns>
          <xpdExt:AssociatedParameters DisableImplicitAssociation="false">
            <xpdExt:AssociatedParameter FormalParam="CaseNotFound" Mode="IN" Mandatory="false">
              <xpdl2:Description></xpdl2:Description>
            </xpdExt:AssociatedParameter>
          </xpdExt:AssociatedParameters>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_Usf6sCRiEeS7nfcnWLEGQg" Name="EndEvent" xpdExt:Visibility="Private" xpdExt:DisplayName="End Event">
          <xpdl2:Event>
            <xpdl2:EndEvent Result="None"/>
          </xpdl2:Event>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="166,208,152" Height="47.0" LaneId="_xmzl4RiFEeSZl-ER2FAHig" Width="54.0">
              <xpdl2:Coordinates XCoordinate="408.0" YCoordinate="262.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
      </xpdl2:Activities>
      <xpdl2:Transitions>
        <xpdl2:Transition Id="_xm0M8BiFEeSZl-ER2FAHig" xpdExt:DisplayName="" Name="" From="_xmzl6xiFEeSZl-ER2FAHig" To="_xmzl8xiFEeSZl-ER2FAHig">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_xm0M8xiFEeSZl-ER2FAHig" xpdExt:DisplayName="" Name="" From="_xmzl5hiFEeSZl-ER2FAHig" To="_xmzl5xiFEeSZl-ER2FAHig">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.LabelAnchorPosition">
              <xpdl2:Coordinates XCoordinate="50.0" YCoordinate="0.0"/>
              <xpdl2:Coordinates XCoordinate="0.0" YCoordinate="0.0"/>
            </xpdl2:ConnectorGraphicsInfo>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_xm0M9BiFEeSZl-ER2FAHig" xpdExt:DisplayName="" Name="" From="_xmzl5xiFEeSZl-ER2FAHig" To="_xmzl6BiFEeSZl-ER2FAHig">
          <xpdl2:Condition Type="OTHERWISE"/>
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.LabelAnchorPosition">
              <xpdl2:Coordinates XCoordinate="50.0" YCoordinate="0.0"/>
              <xpdl2:Coordinates XCoordinate="0.0" YCoordinate="0.0"/>
            </xpdl2:ConnectorGraphicsInfo>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_xm0M9RiFEeSZl-ER2FAHig" xpdExt:DisplayName="" Name="" From="_xmzl6BiFEeSZl-ER2FAHig" To="_xmzl6xiFEeSZl-ER2FAHig">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.LabelAnchorPosition">
              <xpdl2:Coordinates XCoordinate="50.0" YCoordinate="0.0"/>
              <xpdl2:Coordinates XCoordinate="0.0" YCoordinate="0.0"/>
            </xpdl2:ConnectorGraphicsInfo>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_xm0M-BiFEeSZl-ER2FAHig" xpdExt:DisplayName="" Name="" From="_xmzl8RiFEeSZl-ER2FAHig" To="_xmzl7hiFEeSZl-ER2FAHig">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.LabelAnchorPosition">
              <xpdl2:Coordinates XCoordinate="50.0" YCoordinate="0.0"/>
              <xpdl2:Coordinates XCoordinate="0.0" YCoordinate="0.0"/>
            </xpdl2:ConnectorGraphicsInfo>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="__g6twCRhEeS7nfcnWLEGQg" xpdExt:DisplayName="" Name="" From="_xmzl4hiFEeSZl-ER2FAHig" To="_xmzl5hiFEeSZl-ER2FAHig">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.LabelAnchorPosition">
              <xpdl2:Coordinates XCoordinate="50.0" YCoordinate="0.0"/>
              <xpdl2:Coordinates XCoordinate="0.0" YCoordinate="0.0"/>
            </xpdl2:ConnectorGraphicsInfo>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_TE5qwCRiEeS7nfcnWLEGQg" xpdExt:DisplayName="" Name="" From="_xmzl5xiFEeSZl-ER2FAHig" To="_DfMhMCRiEeS7nfcnWLEGQg">
          <xpdl2:Condition Type="CONDITION">
<xpdl2:Expression ScriptGrammar="JavaScript">caseBomType == null;</xpdl2:Expression>
</xpdl2:Condition>
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.LabelAnchorPosition">
              <xpdl2:Coordinates XCoordinate="50.0" YCoordinate="0.0"/>
              <xpdl2:Coordinates XCoordinate="0.0" YCoordinate="0.0"/>
            </xpdl2:ConnectorGraphicsInfo>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_VPmnwCRiEeS7nfcnWLEGQg" xpdExt:DisplayName="" Name="" From="_DfMhMCRiEeS7nfcnWLEGQg" To="_Usf6sCRiEeS7nfcnWLEGQg">
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
    <xpdl2:ExtendedAttribute Name="OriginalFormatVersion" Value="16"/>
  </xpdl2:ExtendedAttributes>
</xpdl2:Package>