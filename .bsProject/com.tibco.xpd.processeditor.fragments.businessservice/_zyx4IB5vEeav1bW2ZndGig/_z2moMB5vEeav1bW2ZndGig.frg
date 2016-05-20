<?xml version="1.0" encoding="UTF-8"?>
<xpdl2:Package xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:database="http://www.tibco.com/XPD/database1.0.0" xmlns:eaijava="http://www.tibco.com/XPD/EAIJava1.0.0" xmlns:email="http://www.tibco.com/XPD/email1.0.0" xmlns:iProcessExt="http://www.tibco.com/XPD/iProcessExt1.0.0" xmlns:orchestrator="http://www.tibco.com/XPD/orchestrator1.0.0" xmlns:order="http://www.tibco.com/XPD/order1.0.0" xmlns:simulation="http://www.tibco.com/xpd/Simulation1.0.1" xmlns:xpdExt="http://www.tibco.com/XPD/xpdExtension1.0.0" xmlns:xpdl2="http://www.wfmc.org/2008/XPDL2.1" xsi:schemaLocation="http://www.wfmc.org/2008/XPDL2.1 http://www.wfmc.org/standards/bpmnxpdl_31.xsd" Id="_update_case_data_bizservice_fragment_id" xpdExt:DisplayName="fragment" Name="fragment">
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
    <xpdl2:Pool Id="_Y2mboBiFEeSZl-ER2FAHig" xpdExt:DisplayName="Pool" Name="Pool" BoundaryVisible="true" Process="_Y2YZMBiFEeSZl-ER2FAHig">
      <xpdl2:Lanes>
        <xpdl2:Lane Id="_Y2mboRiFEeSZl-ER2FAHig" xpdExt:DisplayName="Lane" Name="Lane">
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo Height="350.0"/>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Lane>
      </xpdl2:Lanes>
    </xpdl2:Pool>
  </xpdl2:Pools>
  <xpdl2:WorkflowProcesses>
    <xpdl2:WorkflowProcess Id="_Y2YZMBiFEeSZl-ER2FAHig" xpdExt:XpdModelType="PageFlow" xpdExt:PublishAsBusinessService="true" xpdExt:DisplayName="fragment-Process" Name="fragmentProcess">
      <xpdl2:ProcessHeader/>
      <xpdl2:DataFields>
        <xpdl2:DataField Id="_Y2nCyRiFEeSZl-ER2FAHig" xpdExt:DisplayName="Error Code" Name="ErrorCode">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="STRING">
              <xpdl2:Length>50</xpdl2:Length>
            </xpdl2:BasicType>
          </xpdl2:DataType>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_Y2nCyhiFEeSZl-ER2FAHig" xpdExt:DisplayName="Error Detail" Name="ErrorDetail">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="STRING">
              <xpdl2:Length>250</xpdl2:Length>
            </xpdl2:BasicType>
          </xpdl2:DataType>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_Y2nCyxiFEeSZl-ER2FAHig" xpdExt:DisplayName="CaseOutOfSynchError" Name="CaseOutOfSynchError" ReadOnly="true">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="STRING">
              <xpdl2:Length>150</xpdl2:Length>
            </xpdl2:BasicType>
          </xpdl2:DataType>
          <xpdExt:InitialValues>
            <xpdExt:Value>Your local copy of the case object is out of synch. The case object has been changed by something else since your copy was fetched.</xpdExt:Value>
          </xpdExt:InitialValues>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_xumC8CLYEeScrZjNRbJvqg" xpdExt:DisplayName="caseBomType" Name="caseBomType">
          <xpdl2:DataType>
            <xpdl2:ExternalReference location=""/>
          </xpdl2:DataType>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_zJbCMCLYEeScrZjNRbJvqg" xpdExt:DisplayName="caseRefType" Name="caseRefType">
          <xpdl2:DataType>
            <xpdl2:RecordType>
              <xpdl2:Member>
                <xpdl2:ExternalReference location=""/>
              </xpdl2:Member>
            </xpdl2:RecordType>
          </xpdl2:DataType>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_4bVvECOZEeSmYMc0iyDQFg" xpdExt:DisplayName="caseId1" Name="caseId1">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="INTEGER">
              <xpdl2:Precision>9</xpdl2:Precision>
            </xpdl2:BasicType>
          </xpdl2:DataType>
          <xpdl2:ExtendedAttributes>
            <xpdl2:ExtendedAttribute Name="PostProcess" Value="AutoCaseId"/>
          </xpdl2:ExtendedAttributes>
        </xpdl2:DataField>
      </xpdl2:DataFields>
      <xpdl2:Activities>
        <xpdl2:Activity Id="_Y2mbohiFEeSZl-ER2FAHig" Name="Start" xpdExt:Visibility="Private" xpdExt:DisplayName="Start">
          <xpdl2:Event>
            <xpdl2:StartEvent Trigger="None"/>
          </xpdl2:Event>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="27.0" LaneId="_Y2mboRiFEeSZl-ER2FAHig" Width="27.0">
              <xpdl2:Coordinates XCoordinate="33.0" YCoordinate="76.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_Y2mboxiFEeSZl-ER2FAHig" Name="End" xpdExt:Visibility="Private" xpdExt:DisplayName="End">
          <xpdl2:Event>
            <xpdl2:EndEvent Result="None"/>
          </xpdl2:Event>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="52.0" LaneId="_Y2mboRiFEeSZl-ER2FAHig" Width="31.0">
              <xpdl2:Coordinates XCoordinate="916.0" YCoordinate="76.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_Y2mbpBiFEeSZl-ER2FAHig" Name="IdentifyCase" xpdExt:Visibility="Private" xpdExt:DisplayName="Identify Case">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskUser Implementation="Unspecified">
                <xpdl2:Performers>
                  <xpdl2:Performer>-defined-in-Activity-Performer-</xpdl2:Performer>
                </xpdl2:Performers>
                <xpdl2:MessageIn Id="_Y2nCsBiFEeSZl-ER2FAHig"/>
                <xpdl2:MessageOut Id="_Y2nCsRiFEeSZl-ER2FAHig"/>
              </xpdl2:TaskUser>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:TransitionRestrictions>
            <xpdl2:TransitionRestriction>
              <xpdl2:Join Type="Exclusive" ExclusiveType="Data"/>
            </xpdl2:TransitionRestriction>
          </xpdl2:TransitionRestrictions>
          <xpdl2:ExtendedAttributes>
            <xpdl2:ExtendedAttribute Name="PostProcess" Value="IdentifierTask"/>
          </xpdl2:ExtendedAttributes>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="64.0" LaneId="_Y2mboRiFEeSZl-ER2FAHig" Width="96.0">
              <xpdl2:Coordinates XCoordinate="147.0" YCoordinate="76.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Offer="OfferAll" xpdExt:Strategy="SYSTEM_DETERMINED" xpdExt:ReOfferOnClose="true" xpdExt:ReOfferOnCancel="true"/>
            <xpdExt:WorkItemPriority InitialPriority="50"/>
          </xpdExt:ActivityResourcePatterns>
          <xpdExt:AssociatedParameters DisableImplicitAssociation="false">
            <xpdExt:AssociatedParameter FormalParam="caseId1" Mode="INOUT" Mandatory="true">
              <xpdl2:Description></xpdl2:Description>
            </xpdExt:AssociatedParameter>
          </xpdExt:AssociatedParameters>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_Y2nCshiFEeSZl-ER2FAHig" Name="LookupCase" xpdExt:Visibility="Private" xpdExt:DisplayName="Lookup Case">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskScript>
                <xpdl2:Script ScriptGrammar="JavaScript">//This script must be modified to match the cac factory name,&#xD;
//case identifiers, findBy method name and read method name&#xD;
//with correct arguments and types&#xD;
caseRefType = cac_XXX.findByXXX(caseId1);&#xD;
if (caseRefType != null) {&#xD;
	caseBomType = caseRefType.readXXX();&#xD;
}</xpdl2:Script>
              </xpdl2:TaskScript>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="72.0" LaneId="_Y2mboRiFEeSZl-ER2FAHig" Width="122.0">
              <xpdl2:Coordinates XCoordinate="313.0" YCoordinate="76.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Strategy="SYSTEM_DETERMINED"/>
          </xpdExt:ActivityResourcePatterns>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_Y2nCsxiFEeSZl-ER2FAHig" xpdExt:DisplayName="">
          <xpdl2:Route GatewayType="Exclusive" MarkerVisible="true" ExclusiveType="Data"/>
          <xpdl2:TransitionRestrictions>
            <xpdl2:TransitionRestriction>
              <xpdl2:Split Type="Exclusive" ExclusiveType="Data">
                <xpdl2:TransitionRefs>
                  <xpdl2:TransitionRef Id="_Y2nCxBiFEeSZl-ER2FAHig"/>
                  <xpdl2:TransitionRef Id="_Y2nCxRiFEeSZl-ER2FAHig"/>
                </xpdl2:TransitionRefs>
              </xpdl2:Split>
            </xpdl2:TransitionRestriction>
          </xpdl2:TransitionRestrictions>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="43.0" LaneId="_Y2mboRiFEeSZl-ER2FAHig" Width="41.0">
              <xpdl2:Coordinates XCoordinate="440.0" YCoordinate="76.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_Y2nCtBiFEeSZl-ER2FAHig" Name="ModifyData" xpdExt:Visibility="Private" xpdExt:DisplayName="Modify Data">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskUser Implementation="Unspecified">
                <xpdl2:Performers>
                  <xpdl2:Performer>-defined-in-Activity-Performer-</xpdl2:Performer>
                </xpdl2:Performers>
                <xpdl2:MessageIn Id="_Y2nCtRiFEeSZl-ER2FAHig"/>
                <xpdl2:MessageOut Id="_Y2nCthiFEeSZl-ER2FAHig"/>
              </xpdl2:TaskUser>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="68.0" LaneId="_Y2mboRiFEeSZl-ER2FAHig" Width="125.0">
              <xpdl2:Coordinates XCoordinate="581.0" YCoordinate="76.0"/>
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
        <xpdl2:Activity Id="_Y2nCtxiFEeSZl-ER2FAHig" Name="UpdateCase" xpdExt:Visibility="Private" xpdExt:DisplayName="Update Case">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskService xpdExt:ImplementationType="GlobalData" Implementation="Other">
                <xpdl2:MessageIn Id="_Y2nCuBiFEeSZl-ER2FAHig"/>
                <xpdl2:MessageOut Id="_Y2nCuRiFEeSZl-ER2FAHig"/>
                <xpdExt:GlobalDataOperation>
                  <xpdExt:CaseReferenceOperations>
                    <xpdExt:Update/>
                  </xpdExt:CaseReferenceOperations>
                </xpdExt:GlobalDataOperation>
              </xpdl2:TaskService>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="68.0" LaneId="_Y2mboRiFEeSZl-ER2FAHig" Width="130.0">
              <xpdl2:Coordinates XCoordinate="778.0" YCoordinate="76.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Strategy="SYSTEM_DETERMINED"/>
          </xpdExt:ActivityResourcePatterns>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_Y2nCuhiFEeSZl-ER2FAHig" Name="CaseOutOfSynchError" xpdExt:Visibility="Private" xpdExt:DisplayName="CaseOutOfSynch Error">
          <xpdl2:Event>
            <xpdl2:IntermediateEvent Target="_Y2nCtxiFEeSZl-ER2FAHig" Trigger="Error">
              <xpdl2:ResultError ErrorCode="CaseOutOfSyncError">
                <xpdExt:CatchErrorMappings>
                  <xpdExt:Message Id="_Y2nCvBiFEeSZl-ER2FAHig">
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
                <xpdExt:ErrorThrowerInfo ThrowerId="_Y2nCtxiFEeSZl-ER2FAHig" ThrowerContainerId="_Y2YZMBiFEeSZl-ER2FAHig" ThrowerType="ProcessActivity"/>
              </xpdl2:ResultError>
            </xpdl2:IntermediateEvent>
          </xpdl2:Event>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="27.0" LaneId="_Y2mboRiFEeSZl-ER2FAHig" Width="27.0">
              <xpdl2:Coordinates XCoordinate="0.0" YCoordinate="0.0"/>
            </xpdl2:NodeGraphicsInfo>
            <xpdl2:NodeGraphicsInfo ToolId="XPD.BorderEventPosition">
              <xpdl2:Coordinates XCoordinate="21.21212121212121" YCoordinate="0.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ScriptInformation Id="_Y2nCuxiFEeSZl-ER2FAHig" Direction="OUT">
            <xpdExt:Expression ScriptGrammar="JavaScript"/>
          </xpdExt:ScriptInformation>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_Y2nCvRiFEeSZl-ER2FAHig" Name="UpdateFailed" IsATransaction="false" xpdExt:Visibility="Private" xpdExt:RequireNewTransaction="false" xpdExt:DisplayName="Update Failed">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskUser Implementation="Unspecified">
                <xpdl2:Performers>
                  <xpdl2:Performer>-defined-in-Activity-Performer-</xpdl2:Performer>
                </xpdl2:Performers>
                <xpdl2:MessageIn Id="_Y2nCvhiFEeSZl-ER2FAHig"/>
                <xpdl2:MessageOut Id="_Y2nCvxiFEeSZl-ER2FAHig"/>
              </xpdl2:TaskUser>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="70.0" LaneId="_Y2mboRiFEeSZl-ER2FAHig" Width="112.0">
              <xpdl2:Coordinates XCoordinate="828.0" YCoordinate="211.0"/>
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
      </xpdl2:Activities>
      <xpdl2:Transitions>
        <xpdl2:Transition Id="_Y2nCwBiFEeSZl-ER2FAHig" xpdExt:DisplayName="" Name="" From="_Y2nCtxiFEeSZl-ER2FAHig" To="_Y2mboxiFEeSZl-ER2FAHig">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.StartAnchorPosition"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_Y2nCwRiFEeSZl-ER2FAHig" xpdExt:DisplayName="" Name="" From="_Y2mbohiFEeSZl-ER2FAHig" To="_Y2mbpBiFEeSZl-ER2FAHig">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_Y2nCwhiFEeSZl-ER2FAHig" xpdExt:DisplayName="" Name="" From="_Y2mbpBiFEeSZl-ER2FAHig" To="_Y2nCshiFEeSZl-ER2FAHig">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_Y2nCwxiFEeSZl-ER2FAHig" xpdExt:DisplayName="" Name="" From="_Y2nCshiFEeSZl-ER2FAHig" To="_Y2nCsxiFEeSZl-ER2FAHig">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_Y2nCxBiFEeSZl-ER2FAHig" xpdExt:DisplayName="" Name="" From="_Y2nCsxiFEeSZl-ER2FAHig" To="_Y2nCtBiFEeSZl-ER2FAHig">
          <xpdl2:Condition Type="OTHERWISE"/>
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_Y2nCxRiFEeSZl-ER2FAHig" xpdExt:DisplayName="" Name="" From="_Y2nCsxiFEeSZl-ER2FAHig" To="_Y2mbpBiFEeSZl-ER2FAHig">
          <xpdl2:Condition Type="CONDITION">
<xpdl2:Expression ScriptGrammar="JavaScript">caseRefType == null;</xpdl2:Expression>
</xpdl2:Condition>
          <xpdl2:ExtendedAttributes>
            <xpdl2:ExtendedAttribute Name="PostProcess" Value="LookupFailConditionalTransition"/>
          </xpdl2:ExtendedAttributes>
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo">
              <xpdl2:Coordinates XCoordinate="-20.0" YCoordinate="130.0"/>
              <xpdl2:Coordinates XCoordinate="273.0" YCoordinate="130.0"/>
              <xpdl2:Coordinates XCoordinate="-240.0" YCoordinate="130.0"/>
              <xpdl2:Coordinates XCoordinate="53.0" YCoordinate="130.0"/>
            </xpdl2:ConnectorGraphicsInfo>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.StartAnchorPosition"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.EndAnchorPosition"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_Y2nCxhiFEeSZl-ER2FAHig" xpdExt:DisplayName="" Name="" From="_Y2nCtBiFEeSZl-ER2FAHig" To="_Y2nCtxiFEeSZl-ER2FAHig">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_Y2nCxxiFEeSZl-ER2FAHig" xpdExt:DisplayName="" Name="" From="_Y2nCuhiFEeSZl-ER2FAHig" To="_Y2nCvRiFEeSZl-ER2FAHig">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_Y2nCyBiFEeSZl-ER2FAHig" xpdExt:DisplayName="" Name="" From="_Y2nCvRiFEeSZl-ER2FAHig" To="_Y2mbpBiFEeSZl-ER2FAHig">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo">
              <xpdl2:Coordinates XCoordinate="-16.0" YCoordinate="54.0"/>
              <xpdl2:Coordinates XCoordinate="665.0" YCoordinate="185.0"/>
              <xpdl2:Coordinates XCoordinate="-641.0" YCoordinate="54.0"/>
              <xpdl2:Coordinates XCoordinate="40.0" YCoordinate="185.0"/>
            </xpdl2:ConnectorGraphicsInfo>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.EndAnchorPosition"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
      </xpdl2:Transitions>
      <xpdl2:ExtendedAttributes>
        <xpdl2:ExtendedAttribute Name="PostProcess" Value="AutoCaseId"/>
      </xpdl2:ExtendedAttributes>
    </xpdl2:WorkflowProcess>
  </xpdl2:WorkflowProcesses>
  <xpdl2:ExtendedAttributes>
    <xpdl2:ExtendedAttribute Name="CreatedBy" Value="TIBCO Business Studio"/>
    <xpdl2:ExtendedAttribute Name="FormatVersion" Value="18"/>
    <xpdl2:ExtendedAttribute Name="OriginalFormatVersion" Value="16"/>
  </xpdl2:ExtendedAttributes>
</xpdl2:Package>