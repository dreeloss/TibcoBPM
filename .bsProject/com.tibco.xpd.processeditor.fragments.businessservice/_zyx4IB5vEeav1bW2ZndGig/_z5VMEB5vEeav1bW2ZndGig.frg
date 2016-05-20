<?xml version="1.0" encoding="UTF-8"?>
<xpdl2:Package xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:database="http://www.tibco.com/XPD/database1.0.0" xmlns:eaijava="http://www.tibco.com/XPD/EAIJava1.0.0" xmlns:email="http://www.tibco.com/XPD/email1.0.0" xmlns:iProcessExt="http://www.tibco.com/XPD/iProcessExt1.0.0" xmlns:orchestrator="http://www.tibco.com/XPD/orchestrator1.0.0" xmlns:order="http://www.tibco.com/XPD/order1.0.0" xmlns:simulation="http://www.tibco.com/xpd/Simulation1.0.1" xmlns:xpdExt="http://www.tibco.com/XPD/xpdExtension1.0.0" xmlns:xpdl2="http://www.wfmc.org/2008/XPDL2.1" xsi:schemaLocation="http://www.wfmc.org/2008/XPDL2.1 http://www.wfmc.org/standards/bpmnxpdl_31.xsd" Id="_create_case_data_bizservice_fragment_id" xpdExt:DisplayName="fragment" Name="fragment">
  <xpdl2:PackageHeader xpdExt:Language="en_GB">
    <xpdl2:XPDLVersion>2.1</xpdl2:XPDLVersion>
    <xpdl2:Vendor>TIBCO</xpdl2:Vendor>
    <xpdl2:Created>2014-01-23</xpdl2:Created>
    <xpdl2:Description></xpdl2:Description>
    <xpdl2:Documentation></xpdl2:Documentation>
    <xpdl2:CostUnit>GBP</xpdl2:CostUnit>
  </xpdl2:PackageHeader>
  <xpdl2:RedefinableHeader PublicationStatus="UNDER_REVISION">
    <xpdl2:Author>bharge</xpdl2:Author>
    <xpdl2:Version>1.0.0.qualifier</xpdl2:Version>
  </xpdl2:RedefinableHeader>
  <xpdl2:Pools>
    <xpdl2:Pool Id="_Fragment_Dummy_Pool__ZjZqcIRMEeOQy7AKEMCqTA" xpdExt:DisplayName="Pool" Name="Pool" BoundaryVisible="true" Process="_YaQREIRMEeOQy7AKEMCqTA">
      <xpdl2:Lanes>
        <xpdl2:Lane Id="_Fragment_Dummy_Lane__ZjZqcYRMEeOQy7AKEMCqTA" xpdExt:DisplayName="Lane" Name="Lane">
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo Height="388.0"/>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Lane>
      </xpdl2:Lanes>
      <xpdl2:NodeGraphicsInfos>
        <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="223,179,0" IsVisible="true"/>
      </xpdl2:NodeGraphicsInfos>
    </xpdl2:Pool>
  </xpdl2:Pools>
  <xpdl2:WorkflowProcesses>
    <xpdl2:WorkflowProcess Id="_YaQREIRMEeOQy7AKEMCqTA" xpdExt:DisplayName="fragment-Process" xpdExt:XpdModelType="PageFlow" xpdExt:PublishAsBusinessService="true" Name="fragmentProcess">
      <xpdl2:ProcessHeader>
        <xpdl2:Description></xpdl2:Description>
      </xpdl2:ProcessHeader>
      <xpdl2:DataFields>
        <xpdl2:DataField Id="_RnsTsITyEeO8dogb30k0Pg" xpdExt:DisplayName="NonUniqueIdentifier" Name="NonUniqueIdentifier" ReadOnly="true">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="STRING">
              <xpdl2:Length>150</xpdl2:Length>
            </xpdl2:BasicType>
          </xpdl2:DataType>
          <xpdExt:InitialValues>
            <xpdExt:Value>A case with the same case identifier value(s) already exists.</xpdExt:Value>
          </xpdExt:InitialValues>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_dHnV8CIqEeSiGdmz78H2Cg" xpdExt:DisplayName="caseBomType" Name="caseBomType">
          <xpdl2:DataType>
            <xpdl2:ExternalReference location=""/>
          </xpdl2:DataType>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_l1XwQCIqEeSiGdmz78H2Cg" xpdExt:DisplayName="caseRefType" Name="caseRefType">
          <xpdl2:DataType>
            <xpdl2:RecordType>
              <xpdl2:Member>
                <xpdl2:ExternalReference location=""/>
              </xpdl2:Member>
            </xpdl2:RecordType>
          </xpdl2:DataType>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_Eq4xQCI-EeSYku_6SxhRhQ" xpdExt:DisplayName="Error Code" Name="ErrorCode">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="STRING">
              <xpdl2:Length>50</xpdl2:Length>
            </xpdl2:BasicType>
          </xpdl2:DataType>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_GWq9oCI-EeSYku_6SxhRhQ" xpdExt:DisplayName="Error Detail" Name="ErrorDetail">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="STRING">
              <xpdl2:Length>250</xpdl2:Length>
            </xpdl2:BasicType>
          </xpdl2:DataType>
        </xpdl2:DataField>
      </xpdl2:DataFields>
      <xpdl2:Activities>
        <xpdl2:Activity Id="_ZjZqcoRMEeOQy7AKEMCqTA" Name="StartEvent" xpdExt:DisplayName="Start Event">
          <xpdl2:Event>
            <xpdl2:StartEvent Trigger="None"/>
          </xpdl2:Event>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="27.0" LaneId="_Fragment_Dummy_Lane__ZjZqcYRMEeOQy7AKEMCqTA" Width="27.0">
              <xpdl2:Coordinates XCoordinate="55.0" YCoordinate="155.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_ZjZqc4RMEeOQy7AKEMCqTA" Name="EndEvent" xpdExt:DisplayName="End Event">
          <xpdl2:Event>
            <xpdl2:EndEvent Result="None"/>
          </xpdl2:Event>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="30.0" LaneId="_Fragment_Dummy_Lane__ZjZqcYRMEeOQy7AKEMCqTA" Width="30.0">
              <xpdl2:Coordinates XCoordinate="592.0" YCoordinate="155.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_iypBMIRMEeOQy7AKEMCqTA" Name="EnterDataToCreateCase" xpdExt:Visibility="Private" xpdExt:DisplayName="Enter Data To Create Case">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskUser Implementation="Unspecified">
                <xpdl2:Performers>
                  <xpdl2:Performer>-defined-in-Activity-Performer-</xpdl2:Performer>
                </xpdl2:Performers>
                <xpdl2:MessageIn Id="_iypBMYRMEeOQy7AKEMCqTA"/>
                <xpdl2:MessageOut Id="_iypBMoRMEeOQy7AKEMCqTA"/>
              </xpdl2:TaskUser>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:TransitionRestrictions>
            <xpdl2:TransitionRestriction>
              <xpdl2:Join Type="Exclusive" ExclusiveType="Data"/>
            </xpdl2:TransitionRestriction>
          </xpdl2:TransitionRestrictions>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="82.0" LaneId="_Fragment_Dummy_Lane__ZjZqcYRMEeOQy7AKEMCqTA" Width="149.0">
              <xpdl2:Coordinates XCoordinate="225.0" YCoordinate="155.0"/>
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
        <xpdl2:Activity Id="_jXyVoIRMEeOQy7AKEMCqTA" Name="CreateCaseData" xpdExt:Visibility="Private" xpdExt:DisplayName="Create Case Data">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskService xpdExt:ImplementationType="GlobalData" Implementation="Other">
                <xpdl2:MessageIn Id="_jxcy0IRMEeOQy7AKEMCqTA"/>
                <xpdl2:MessageOut Id="_jxcy0YRMEeOQy7AKEMCqTA"/>
                <xpdExt:GlobalDataOperation>
                  <xpdExt:CaseAccessOperations>
                    <xpdExt:Create FromFieldPath="caseBomType" ToCaseRefField="caseRefType"/>
                  </xpdExt:CaseAccessOperations>
                </xpdExt:GlobalDataOperation>
              </xpdl2:TaskService>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="79.0" LaneId="_Fragment_Dummy_Lane__ZjZqcYRMEeOQy7AKEMCqTA" Width="135.0">
              <xpdl2:Coordinates XCoordinate="427.0" YCoordinate="155.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Strategy="SYSTEM_DETERMINED"/>
          </xpdExt:ActivityResourcePatterns>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_8ukIsITxEeO8dogb30k0Pg" Name="NonUniqueError" xpdExt:Visibility="Private" xpdExt:DisplayName="NonUnique Error">
          <xpdl2:Event>
            <xpdl2:IntermediateEvent Target="_jXyVoIRMEeOQy7AKEMCqTA" Trigger="Error">
              <xpdl2:ResultError ErrorCode="NonUniqueCaseIdentifierError">
                <xpdExt:ErrorThrowerInfo ThrowerId="_jXyVoIRMEeOQy7AKEMCqTA" ThrowerContainerId="_YaQREIRMEeOQy7AKEMCqTA" ThrowerType="ProcessActivity"/>
                <xpdExt:CatchErrorMappings>
                  <xpdExt:Message Id="_CCRTwCI_EeSYku_6SxhRhQ">
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
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="27.0" LaneId="_Fragment_Dummy_Lane__ZjZqcYRMEeOQy7AKEMCqTA" Width="27.0">
              <xpdl2:Coordinates XCoordinate="0.0" YCoordinate="0.0"/>
            </xpdl2:NodeGraphicsInfo>
            <xpdl2:NodeGraphicsInfo ToolId="XPD.BorderEventPosition">
              <xpdl2:Coordinates XCoordinate="27.102803738317753" YCoordinate="0.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ScriptInformation Id="_Kz7WoCI_EeSYku_6SxhRhQ" Direction="OUT">
            <xpdExt:Expression ScriptGrammar="JavaScript"/>
          </xpdExt:ScriptInformation>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_CiXTUITyEeO8dogb30k0Pg" Name="DuplicateCaseIdentifier" xpdExt:Visibility="Private" xpdExt:DisplayName="Duplicate Case Identifier">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskUser Implementation="Unspecified">
                <xpdl2:Performers>
                  <xpdl2:Performer>-defined-in-Activity-Performer-</xpdl2:Performer>
                </xpdl2:Performers>
                <xpdl2:MessageIn Id="_CiXTUYTyEeO8dogb30k0Pg"/>
                <xpdl2:MessageOut Id="_CiXTUoTyEeO8dogb30k0Pg"/>
              </xpdl2:TaskUser>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="205,158,233" Height="80.0" LaneId="_Fragment_Dummy_Lane__ZjZqcYRMEeOQy7AKEMCqTA" Width="117.0">
              <xpdl2:Coordinates XCoordinate="453.0" YCoordinate="330.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Offer="OfferAll" xpdExt:Strategy="SYSTEM_DETERMINED" xpdExt:ReOfferOnClose="true" xpdExt:ReOfferOnCancel="true"/>
            <xpdExt:WorkItemPriority InitialPriority="50"/>
          </xpdExt:ActivityResourcePatterns>
          <xpdExt:AssociatedParameters DisableImplicitAssociation="false">
            <xpdExt:AssociatedParameter FormalParam="NonUniqueIdentifier" Mode="IN" Mandatory="true">
              <xpdl2:Description></xpdl2:Description>
            </xpdExt:AssociatedParameter>
          </xpdExt:AssociatedParameters>
        </xpdl2:Activity>
      </xpdl2:Activities>
      <xpdl2:Transitions>
        <xpdl2:Transition Id="_ZjZqdIRMEeOQy7AKEMCqTA" xpdExt:DisplayName="" Name="" From="_jXyVoIRMEeOQy7AKEMCqTA" To="_ZjZqc4RMEeOQy7AKEMCqTA">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.StartAnchorPosition"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_iypBM4RMEeOQy7AKEMCqTA" xpdExt:DisplayName="" Name="" From="_ZjZqcoRMEeOQy7AKEMCqTA" To="_iypBMIRMEeOQy7AKEMCqTA">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_jXzjwIRMEeOQy7AKEMCqTA" xpdExt:DisplayName="" Name="" From="_iypBMIRMEeOQy7AKEMCqTA" To="_jXyVoIRMEeOQy7AKEMCqTA">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_E7u-cITyEeO8dogb30k0Pg" Name="" From="_8ukIsITxEeO8dogb30k0Pg" To="_CiXTUITyEeO8dogb30k0Pg">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.EndAnchorPosition">
              <xpdl2:Coordinates XCoordinate="86.5625" YCoordinate="0.0"/>
            </xpdl2:ConnectorGraphicsInfo>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_LtVOEITyEeO8dogb30k0Pg" Name="" From="_CiXTUITyEeO8dogb30k0Pg" To="_iypBMIRMEeOQy7AKEMCqTA">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.EndAnchorPosition">
              <xpdl2:Coordinates XCoordinate="14.06926406926407" YCoordinate="0.0"/>
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