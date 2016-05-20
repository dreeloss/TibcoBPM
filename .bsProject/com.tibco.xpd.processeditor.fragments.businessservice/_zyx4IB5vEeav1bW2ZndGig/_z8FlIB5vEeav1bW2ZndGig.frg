<?xml version="1.0" encoding="UTF-8"?>
<xpdl2:Package xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:database="http://www.tibco.com/XPD/database1.0.0" xmlns:eaijava="http://www.tibco.com/XPD/EAIJava1.0.0" xmlns:email="http://www.tibco.com/XPD/email1.0.0" xmlns:iProcessExt="http://www.tibco.com/XPD/iProcessExt1.0.0" xmlns:orchestrator="http://www.tibco.com/XPD/orchestrator1.0.0" xmlns:order="http://www.tibco.com/XPD/order1.0.0" xmlns:simulation="http://www.tibco.com/xpd/Simulation1.0.1" xmlns:xpdExt="http://www.tibco.com/XPD/xpdExtension1.0.0" xmlns:xpdl2="http://www.wfmc.org/2008/XPDL2.1" xsi:schemaLocation="http://www.wfmc.org/2008/XPDL2.1 http://www.wfmc.org/standards/bpmnxpdl_31.xsd" Id="_delete_case_data_bizservice_fragment_id" xpdExt:DisplayName="fragment" Name="fragment">
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
    <xpdl2:Pool Id="_-FWcIRiDEeSq3oG5XMpPRg" xpdExt:DisplayName="Pool" Name="Pool" BoundaryVisible="true" Process="_-FWcIBiDEeSq3oG5XMpPRg">
      <xpdl2:Lanes>
        <xpdl2:Lane Id="_-FWcIhiDEeSq3oG5XMpPRg" xpdExt:DisplayName="Lane" Name="Lane">
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo Height="334.0"/>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Lane>
      </xpdl2:Lanes>
    </xpdl2:Pool>
  </xpdl2:Pools>
  <xpdl2:WorkflowProcesses>
    <xpdl2:WorkflowProcess Id="_-FWcIBiDEeSq3oG5XMpPRg" xpdExt:XpdModelType="PageFlow" xpdExt:DisplayName="fragment-Process" xpdExt:PublishAsBusinessService="true" xpdExt:BusinessServiceCategory="ttt/fragment" Name="fragmentProcess">
      <xpdl2:ProcessHeader/>
      <xpdl2:DataFields>
        <xpdl2:DataField Id="_-F_8fRiDEeSq3oG5XMpPRg" xpdExt:DisplayName="Confirm Case Object Delete" Name="ConfirmCaseObjectDelete">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="BOOLEAN"/>
          </xpdl2:DataType>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_-F_8fhiDEeSq3oG5XMpPRg" xpdExt:DisplayName="Error Code" Name="ErrorCode">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="STRING">
              <xpdl2:Length>50</xpdl2:Length>
            </xpdl2:BasicType>
          </xpdl2:DataType>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_-F_8fxiDEeSq3oG5XMpPRg" xpdExt:DisplayName="Error Detail" Name="ErrorDetail">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="STRING">
              <xpdl2:Length>250</xpdl2:Length>
            </xpdl2:BasicType>
          </xpdl2:DataType>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_-F_8gBiDEeSq3oG5XMpPRg" xpdExt:DisplayName="DeleteCaseFailed" Name="DeleteCaseFailed">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="STRING">
              <xpdl2:Length>50</xpdl2:Length>
            </xpdl2:BasicType>
          </xpdl2:DataType>
          <xpdExt:InitialValues>
            <xpdExt:Value>Error(s) encountered deleting this case data</xpdExt:Value>
          </xpdExt:InitialValues>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_JIim4CLDEeSvl5zpDoD2sw" xpdExt:DisplayName="caseBomType" Name="caseBomType">
          <xpdl2:DataType>
            <xpdl2:ExternalReference location=""/>
          </xpdl2:DataType>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_Ld_bUCLDEeSvl5zpDoD2sw" xpdExt:DisplayName="caseRefType" Name="caseRefType">
          <xpdl2:DataType>
            <xpdl2:RecordType>
              <xpdl2:Member>
                <xpdl2:ExternalReference location=""/>
              </xpdl2:Member>
            </xpdl2:RecordType>
          </xpdl2:DataType>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_OgXh8COZEeSmYMc0iyDQFg" xpdExt:DisplayName="caseId1" Name="caseId1">
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
        <xpdl2:Activity Id="_-F_VUBiDEeSq3oG5XMpPRg" Name="Start" xpdExt:Visibility="Private" xpdExt:DisplayName="Start">
          <xpdl2:Event>
            <xpdl2:StartEvent Trigger="None"/>
          </xpdl2:Event>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="27.0" LaneId="_-FWcIhiDEeSq3oG5XMpPRg" Width="27.0">
              <xpdl2:Coordinates XCoordinate="33.0" YCoordinate="79.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_-F_8YBiDEeSq3oG5XMpPRg" Name="End" xpdExt:Visibility="Private" xpdExt:DisplayName="End">
          <xpdl2:Event>
            <xpdl2:EndEvent Result="None"/>
          </xpdl2:Event>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="52.0" LaneId="_-FWcIhiDEeSq3oG5XMpPRg" Width="31.0">
              <xpdl2:Coordinates XCoordinate="1013.0" YCoordinate="79.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_-F_8YRiDEeSq3oG5XMpPRg" Name="IdentifyCase" xpdExt:Visibility="Private" xpdExt:DisplayName="Identify Case">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskUser Implementation="Unspecified">
                <xpdl2:Performers>
                  <xpdl2:Performer>-defined-in-Activity-Performer-</xpdl2:Performer>
                </xpdl2:Performers>
                <xpdl2:MessageIn Id="_-F_8YhiDEeSq3oG5XMpPRg"/>
                <xpdl2:MessageOut Id="_-F_8YxiDEeSq3oG5XMpPRg"/>
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
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="64.0" LaneId="_-FWcIhiDEeSq3oG5XMpPRg" Width="96.0">
              <xpdl2:Coordinates XCoordinate="147.0" YCoordinate="79.0"/>
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
        <xpdl2:Activity Id="_-F_8ZBiDEeSq3oG5XMpPRg" Name="LookupCase" xpdExt:Visibility="Private" xpdExt:DisplayName="Lookup Case">
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
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="72.0" LaneId="_-FWcIhiDEeSq3oG5XMpPRg" Width="122.0">
              <xpdl2:Coordinates XCoordinate="313.0" YCoordinate="79.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Strategy="SYSTEM_DETERMINED"/>
          </xpdExt:ActivityResourcePatterns>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_-F_8ZRiDEeSq3oG5XMpPRg" xpdExt:DisplayName="">
          <xpdl2:Route GatewayType="Exclusive" MarkerVisible="true" ExclusiveType="Data"/>
          <xpdl2:TransitionRestrictions>
            <xpdl2:TransitionRestriction>
              <xpdl2:Split Type="Exclusive" ExclusiveType="Data">
                <xpdl2:TransitionRefs>
                  <xpdl2:TransitionRef Id="_-F_8dhiDEeSq3oG5XMpPRg"/>
                  <xpdl2:TransitionRef Id="_-F_8dxiDEeSq3oG5XMpPRg"/>
                </xpdl2:TransitionRefs>
              </xpdl2:Split>
            </xpdl2:TransitionRestriction>
          </xpdl2:TransitionRestrictions>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="43.0" LaneId="_-FWcIhiDEeSq3oG5XMpPRg" Width="41.0">
              <xpdl2:Coordinates XCoordinate="440.0" YCoordinate="79.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_-F_8ZhiDEeSq3oG5XMpPRg" Name="DisplayDataToBeDeleted" xpdExt:Visibility="Private" xpdExt:DisplayName="Display Data To Be Deleted">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskUser Implementation="Unspecified">
                <xpdl2:Performers>
                  <xpdl2:Performer>-defined-in-Activity-Performer-</xpdl2:Performer>
                </xpdl2:Performers>
                <xpdl2:MessageIn Id="_-F_8ZxiDEeSq3oG5XMpPRg"/>
                <xpdl2:MessageOut Id="_-F_8aBiDEeSq3oG5XMpPRg"/>
              </xpdl2:TaskUser>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="78.0" LaneId="_-FWcIhiDEeSq3oG5XMpPRg" Width="135.0">
              <xpdl2:Coordinates XCoordinate="603.0" YCoordinate="79.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Offer="OfferAll" xpdExt:Strategy="SYSTEM_DETERMINED" xpdExt:ReOfferOnClose="true" xpdExt:ReOfferOnCancel="true"/>
            <xpdExt:WorkItemPriority InitialPriority="50"/>
          </xpdExt:ActivityResourcePatterns>
          <xpdExt:AssociatedParameters DisableImplicitAssociation="false">
            <xpdExt:AssociatedParameter FormalParam="ConfirmCaseObjectDelete" Mode="OUT" Mandatory="false">
              <xpdl2:Description></xpdl2:Description>
            </xpdExt:AssociatedParameter>
            <xpdExt:AssociatedParameter FormalParam="caseBomType" Mode="IN" Mandatory="true">
              <xpdl2:Description></xpdl2:Description>
            </xpdExt:AssociatedParameter>
          </xpdExt:AssociatedParameters>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_-F_8aRiDEeSq3oG5XMpPRg" Name="DeleteCase" xpdExt:Visibility="Private" xpdExt:DisplayName="Delete Case">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskService xpdExt:ImplementationType="GlobalData" Implementation="Other">
                <xpdl2:MessageIn Id="_-F_8ahiDEeSq3oG5XMpPRg"/>
                <xpdl2:MessageOut Id="_-F_8axiDEeSq3oG5XMpPRg"/>
                <xpdExt:GlobalDataOperation>
                  <xpdExt:CaseReferenceOperations>
                    <xpdExt:Delete/>
                  </xpdExt:CaseReferenceOperations>
                </xpdExt:GlobalDataOperation>
              </xpdl2:TaskService>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="68.0" LaneId="_-FWcIhiDEeSq3oG5XMpPRg" Width="130.0">
              <xpdl2:Coordinates XCoordinate="889.0" YCoordinate="79.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Strategy="SYSTEM_DETERMINED"/>
          </xpdExt:ActivityResourcePatterns>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_-F_8bBiDEeSq3oG5XMpPRg" xpdExt:DisplayName="">
          <xpdl2:Route GatewayType="Exclusive" MarkerVisible="true" ExclusiveType="Data"/>
          <xpdl2:TransitionRestrictions>
            <xpdl2:TransitionRestriction>
              <xpdl2:Split Type="Exclusive" ExclusiveType="Data">
                <xpdl2:TransitionRefs>
                  <xpdl2:TransitionRef Id="_-F_8eBiDEeSq3oG5XMpPRg"/>
                  <xpdl2:TransitionRef Id="_-F_8ehiDEeSq3oG5XMpPRg"/>
                </xpdl2:TransitionRefs>
              </xpdl2:Split>
            </xpdl2:TransitionRestriction>
          </xpdl2:TransitionRestrictions>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="43.0" LaneId="_-FWcIhiDEeSq3oG5XMpPRg" Width="41.0">
              <xpdl2:Coordinates XCoordinate="728.0" YCoordinate="79.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_-F_8bRiDEeSq3oG5XMpPRg" Name="ErrorEvent" xpdExt:Visibility="Private" xpdExt:DisplayName="Error Event">
          <xpdl2:Event>
            <xpdl2:IntermediateEvent Target="_-F_8aRiDEeSq3oG5XMpPRg" Trigger="Error">
              <xpdl2:ResultError ErrorCode="">
                <xpdExt:CatchErrorMappings>
                  <xpdExt:Message Id="_-F_8bhiDEeSq3oG5XMpPRg">
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
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="27.0" LaneId="_-FWcIhiDEeSq3oG5XMpPRg" Width="27.0">
              <xpdl2:Coordinates XCoordinate="0.0" YCoordinate="0.0"/>
            </xpdl2:NodeGraphicsInfo>
            <xpdl2:NodeGraphicsInfo ToolId="XPD.BorderEventPosition">
              <xpdl2:Coordinates XCoordinate="22.22222222222222" YCoordinate="0.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_-F_8bxiDEeSq3oG5XMpPRg" Name="DeleteError" IsATransaction="false" xpdExt:Visibility="Private" xpdExt:RequireNewTransaction="false" xpdExt:DisplayName="Delete Error">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskUser Implementation="Unspecified">
                <xpdl2:Performers>
                  <xpdl2:Performer>-defined-in-Activity-Performer-</xpdl2:Performer>
                </xpdl2:Performers>
                <xpdl2:MessageIn Id="_-F_8cBiDEeSq3oG5XMpPRg"/>
                <xpdl2:MessageOut Id="_-F_8cRiDEeSq3oG5XMpPRg"/>
              </xpdl2:TaskUser>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="64.0" LaneId="_-FWcIhiDEeSq3oG5XMpPRg" Width="96.0">
              <xpdl2:Coordinates XCoordinate="934.0" YCoordinate="204.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Offer="OfferAll" xpdExt:Strategy="SYSTEM_DETERMINED" xpdExt:ReOfferOnClose="true" xpdExt:ReOfferOnCancel="true"/>
            <xpdExt:WorkItemPriority InitialPriority="50"/>
          </xpdExt:ActivityResourcePatterns>
          <xpdExt:AssociatedParameters>
            <xpdExt:AssociatedParameter FormalParam="ErrorCode" Mode="IN" Mandatory="true">
              <xpdl2:Description></xpdl2:Description>
            </xpdExt:AssociatedParameter>
            <xpdExt:AssociatedParameter FormalParam="ErrorDetail" Mode="IN" Mandatory="true">
              <xpdl2:Description></xpdl2:Description>
            </xpdExt:AssociatedParameter>
            <xpdExt:AssociatedParameter FormalParam="DeleteCaseFailed" Mode="IN" Mandatory="true">
              <xpdl2:Description></xpdl2:Description>
            </xpdExt:AssociatedParameter>
          </xpdExt:AssociatedParameters>
        </xpdl2:Activity>
      </xpdl2:Activities>
      <xpdl2:Transitions>
        <xpdl2:Transition Id="_-F_8chiDEeSq3oG5XMpPRg" xpdExt:DisplayName="" Name="" From="_-F_8aRiDEeSq3oG5XMpPRg" To="_-F_8YBiDEeSq3oG5XMpPRg">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.StartAnchorPosition"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_-F_8cxiDEeSq3oG5XMpPRg" xpdExt:DisplayName="" Name="" From="_-F_VUBiDEeSq3oG5XMpPRg" To="_-F_8YRiDEeSq3oG5XMpPRg">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_-F_8dBiDEeSq3oG5XMpPRg" xpdExt:DisplayName="" Name="" From="_-F_8YRiDEeSq3oG5XMpPRg" To="_-F_8ZBiDEeSq3oG5XMpPRg">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_-F_8dRiDEeSq3oG5XMpPRg" xpdExt:DisplayName="" Name="" From="_-F_8ZBiDEeSq3oG5XMpPRg" To="_-F_8ZRiDEeSq3oG5XMpPRg">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_-F_8dhiDEeSq3oG5XMpPRg" xpdExt:DisplayName="" Name="" From="_-F_8ZRiDEeSq3oG5XMpPRg" To="_-F_8ZhiDEeSq3oG5XMpPRg">
          <xpdl2:Condition Type="OTHERWISE"/>
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_-F_8dxiDEeSq3oG5XMpPRg" xpdExt:DisplayName="lookup failed" Name="lookupfailed" From="_-F_8ZRiDEeSq3oG5XMpPRg" To="_-F_8YRiDEeSq3oG5XMpPRg">
          <xpdl2:Condition Type="CONDITION">
<xpdl2:Expression ScriptGrammar="JavaScript">caseRefType == null;</xpdl2:Expression>
</xpdl2:Condition>
          <xpdl2:ExtendedAttributes>
            <xpdl2:ExtendedAttribute Name="PostProcess" Value="LookupFailConditionalTransition"/>
          </xpdl2:ExtendedAttributes>
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo">
              <xpdl2:Coordinates XCoordinate="-20.0" YCoordinate="177.0"/>
              <xpdl2:Coordinates XCoordinate="273.0" YCoordinate="177.0"/>
              <xpdl2:Coordinates XCoordinate="-246.0" YCoordinate="177.0"/>
              <xpdl2:Coordinates XCoordinate="47.0" YCoordinate="177.0"/>
            </xpdl2:ConnectorGraphicsInfo>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.StartAnchorPosition"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.EndAnchorPosition"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_-F_8eBiDEeSq3oG5XMpPRg" xpdExt:DisplayName="" Name="" From="_-F_8bBiDEeSq3oG5XMpPRg" To="_-F_8aRiDEeSq3oG5XMpPRg">
          <xpdl2:Condition Type="CONDITION">
<xpdl2:Expression ScriptGrammar="JavaScript">ConfirmCaseObjectDelete == true;</xpdl2:Expression>
</xpdl2:Condition>
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.StartAnchorPosition"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_-F_8eRiDEeSq3oG5XMpPRg" xpdExt:DisplayName="" Name="" From="_-F_8ZhiDEeSq3oG5XMpPRg" To="_-F_8bBiDEeSq3oG5XMpPRg">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_-F_8ehiDEeSq3oG5XMpPRg" xpdExt:DisplayName="delete cancelled by user" Name="deletecancelledbyuser" From="_-F_8bBiDEeSq3oG5XMpPRg" To="_-F_8YRiDEeSq3oG5XMpPRg">
          <xpdl2:Condition Type="OTHERWISE"/>
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo">
              <xpdl2:Coordinates XCoordinate="-20.0" YCoordinate="212.0"/>
              <xpdl2:Coordinates XCoordinate="561.0" YCoordinate="212.0"/>
              <xpdl2:Coordinates XCoordinate="-534.0" YCoordinate="212.0"/>
              <xpdl2:Coordinates XCoordinate="47.0" YCoordinate="212.0"/>
            </xpdl2:ConnectorGraphicsInfo>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.LabelAnchorPosition">
              <xpdl2:Coordinates XCoordinate="51.840168243953734" YCoordinate="0.0"/>
              <xpdl2:Coordinates XCoordinate="0.0" YCoordinate="-13.0"/>
            </xpdl2:ConnectorGraphicsInfo>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_-F_8exiDEeSq3oG5XMpPRg" xpdExt:DisplayName="" Name="" From="_-F_8bRiDEeSq3oG5XMpPRg" To="_-F_8bxiDEeSq3oG5XMpPRg">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_-F_8fBiDEeSq3oG5XMpPRg" xpdExt:DisplayName="" Name="" From="_-F_8bxiDEeSq3oG5XMpPRg" To="_-F_8YRiDEeSq3oG5XMpPRg">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo">
              <xpdl2:Coordinates XCoordinate="-46.0" YCoordinate="104.0"/>
              <xpdl2:Coordinates XCoordinate="741.0" YCoordinate="229.0"/>
              <xpdl2:Coordinates XCoordinate="-768.0" YCoordinate="104.0"/>
              <xpdl2:Coordinates XCoordinate="19.0" YCoordinate="229.0"/>
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