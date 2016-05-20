<?xml version="1.0" encoding="UTF-8"?>
<xpdl2:Package xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:database="http://www.tibco.com/XPD/database1.0.0" xmlns:eaijava="http://www.tibco.com/XPD/EAIJava1.0.0" xmlns:email="http://www.tibco.com/XPD/email1.0.0" xmlns:iProcessExt="http://www.tibco.com/XPD/iProcessExt1.0.0" xmlns:orchestrator="http://www.tibco.com/XPD/orchestrator1.0.0" xmlns:order="http://www.tibco.com/XPD/order1.0.0" xmlns:simulation="http://www.tibco.com/xpd/Simulation1.0.1" xmlns:xpdExt="http://www.tibco.com/XPD/xpdExtension1.0.0" xmlns:xpdl2="http://www.wfmc.org/2008/XPDL2.1" xsi:schemaLocation="http://www.wfmc.org/2008/XPDL2.1 http://www.wfmc.org/standards/bpmnxpdl_31.xsd" Id="_default_fragment_id" xpdExt:DisplayName="fragment" Name="fragment">
  <xpdl2:PackageHeader xpdExt:Language="en_US">
    <xpdl2:XPDLVersion>2.1</xpdl2:XPDLVersion>
    <xpdl2:Vendor>TIBCO</xpdl2:Vendor>
    <xpdl2:Created>2014-07-30</xpdl2:Created>
    <xpdl2:Description></xpdl2:Description>
    <xpdl2:Documentation></xpdl2:Documentation>
    <xpdl2:CostUnit>USD</xpdl2:CostUnit>
  </xpdl2:PackageHeader>
  <xpdl2:RedefinableHeader PublicationStatus="UNDER_REVISION">
    <xpdl2:Author>Ali</xpdl2:Author>
    <xpdl2:Version>1.0.0.qualifier</xpdl2:Version>
  </xpdl2:RedefinableHeader>
  <xpdl2:Pools>
    <xpdl2:Pool Id="_D_ogIBf-EeS249Me-D-Z1Q" xpdExt:DisplayName="Pool" Name="Pool" BoundaryVisible="true" Process="_D-IEQBf-EeS249Me-D-Z1Q">
      <xpdl2:Lanes>
        <xpdl2:Lane Id="_D_ogIRf-EeS249Me-D-Z1Q" xpdExt:DisplayName="Lane" Name="Lane">
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo Height="350.0"/>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Lane>
      </xpdl2:Lanes>
    </xpdl2:Pool>
  </xpdl2:Pools>
  <xpdl2:WorkflowProcesses>
    <xpdl2:WorkflowProcess Id="_D-IEQBf-EeS249Me-D-Z1Q" xpdExt:XpdModelType="PageFlow" xpdExt:PublishAsBusinessService="true" xpdExt:BusinessServiceCategory="TestBPM/TestBPM" xpdExt:IsCaseService="true" xpdExt:DisplayName="fragment-Process" Name="fragmentProcess">
      <xpdl2:ProcessHeader/>
      <xpdl2:FormalParameters>
        <xpdl2:FormalParameter Id="_HSqNECL0EeSVgIzLOi8OXQ" Name="caseRefType" Mode="IN" Required="true" xpdExt:DisplayName="caseRefType">
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
        <xpdl2:DataField Id="_FYto4CL0EeSVgIzLOi8OXQ" xpdExt:DisplayName="caseBomType" Name="caseBomType">
          <xpdl2:DataType>
            <xpdl2:ExternalReference location=""/>
          </xpdl2:DataType>
        </xpdl2:DataField>
        <xpdl2:DataField Id="_3QpoECReEeS7nfcnWLEGQg" xpdExt:DisplayName="CaseNotFound" Name="CaseNotFound" ReadOnly="true">
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
        <xpdl2:Activity Id="_EBEqkBf-EeS249Me-D-Z1Q" Name="Start" xpdExt:Visibility="Private" xpdExt:DisplayName="Start">
          <xpdl2:Event>
            <xpdl2:StartEvent Trigger="None"/>
          </xpdl2:Event>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="166,208,152" Height="27.0" LaneId="_D_ogIRf-EeS249Me-D-Z1Q" Width="27.0">
              <xpdl2:Coordinates XCoordinate="33.0" YCoordinate="76.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_EBEqlRf-EeS249Me-D-Z1Q" Name="LookupCase" xpdExt:Visibility="Private" xpdExt:DisplayName="Lookup Case">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskScript>
                <xpdl2:Script ScriptGrammar="JavaScript">//This script must be modified to match the read method name&#xD;
if (caseRefType != null){&#xD;
	caseBomType = caseRefType.readXXX();&#xD;
}</xpdl2:Script>
              </xpdl2:TaskScript>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="166,208,152" Height="54.0" LaneId="_D_ogIRf-EeS249Me-D-Z1Q" Width="90.0">
              <xpdl2:Coordinates XCoordinate="149.0" YCoordinate="76.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Strategy="SYSTEM_DETERMINED"/>
          </xpdExt:ActivityResourcePatterns>
          <xpdExt:AssociatedParameters DisableImplicitAssociation="false"/>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_EBEqlhf-EeS249Me-D-Z1Q" xpdExt:DisplayName="">
          <xpdl2:Route GatewayType="Exclusive" MarkerVisible="true" ExclusiveType="Data"/>
          <xpdl2:TransitionRestrictions>
            <xpdl2:TransitionRestriction>
              <xpdl2:Split Type="Exclusive" ExclusiveType="Data">
                <xpdl2:TransitionRefs>
                  <xpdl2:TransitionRef Id="_EBFRrBf-EeS249Me-D-Z1Q"/>
                  <xpdl2:TransitionRef Id="_u3ZeICReEeS7nfcnWLEGQg"/>
                </xpdl2:TransitionRefs>
              </xpdl2:Split>
            </xpdl2:TransitionRestriction>
          </xpdl2:TransitionRestrictions>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="166,208,152" Height="45.0" LaneId="_D_ogIRf-EeS249Me-D-Z1Q" Width="43.0">
              <xpdl2:Coordinates XCoordinate="272.0" YCoordinate="76.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_EBEqlxf-EeS249Me-D-Z1Q" Name="ViewCase" xpdExt:Visibility="Private" xpdExt:DisplayName="View Case">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskUser Implementation="Unspecified">
                <xpdl2:Performers>
                  <xpdl2:Performer>-defined-in-Activity-Performer-</xpdl2:Performer>
                </xpdl2:Performers>
                <xpdl2:MessageIn Id="_EBEqmBf-EeS249Me-D-Z1Q"/>
                <xpdl2:MessageOut Id="_EBEqmRf-EeS249Me-D-Z1Q"/>
              </xpdl2:TaskUser>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:ExtendedAttributes>
            <xpdl2:ExtendedAttribute Name="PostProcess" Value="ViewTask"/>
          </xpdl2:ExtendedAttributes>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="166,208,152" Height="54.0" LaneId="_D_ogIRf-EeS249Me-D-Z1Q" Width="90.0">
              <xpdl2:Coordinates XCoordinate="403.0" YCoordinate="76.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Offer="OfferAll" xpdExt:Strategy="SYSTEM_DETERMINED" xpdExt:ReOfferOnClose="true" xpdExt:ReOfferOnCancel="true"/>
            <xpdExt:WorkItemPriority InitialPriority="50"/>
          </xpdExt:ActivityResourcePatterns>
          <xpdExt:AssociatedParameters DisableImplicitAssociation="false">
            <xpdExt:AssociatedParameter FormalParam="caseBomType" Mode="IN" Mandatory="true">
              <xpdl2:Description></xpdl2:Description>
            </xpdExt:AssociatedParameter>
          </xpdExt:AssociatedParameters>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_uFPocCReEeS7nfcnWLEGQg" Name="LookupFailed" xpdExt:Visibility="Private" xpdExt:DisplayName="Lookup Failed">
          <xpdl2:Implementation>
            <xpdl2:Task>
              <xpdl2:TaskUser Implementation="Unspecified">
                <xpdl2:Performers>
                  <xpdl2:Performer>-defined-in-Activity-Performer-</xpdl2:Performer>
                </xpdl2:Performers>
                <xpdl2:MessageIn Id="_uFPocSReEeS7nfcnWLEGQg"/>
                <xpdl2:MessageOut Id="_uFPociReEeS7nfcnWLEGQg"/>
              </xpdl2:TaskUser>
            </xpdl2:Task>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="166,208,152" Height="54.0" LaneId="_D_ogIRf-EeS249Me-D-Z1Q" Width="90.0">
              <xpdl2:Coordinates XCoordinate="272.0" YCoordinate="171.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Offer="OfferAll" xpdExt:Strategy="SYSTEM_DETERMINED" xpdExt:ReOfferOnClose="true" xpdExt:ReOfferOnCancel="true"/>
            <xpdExt:WorkItemPriority InitialPriority="50"/>
          </xpdExt:ActivityResourcePatterns>
          <xpdExt:AssociatedParameters DisableImplicitAssociation="false">
            <xpdExt:AssociatedParameter FormalParam="CaseNotFound" Mode="IN" Mandatory="true">
              <xpdl2:Description></xpdl2:Description>
            </xpdExt:AssociatedParameter>
          </xpdExt:AssociatedParameters>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_ltQNUCRfEeS7nfcnWLEGQg" Name="End" xpdExt:Visibility="Private" xpdExt:DisplayName="End">
          <xpdl2:Event>
            <xpdl2:EndEvent Result="None"/>
          </xpdl2:Event>
          <xpdl2:TransitionRestrictions>
            <xpdl2:TransitionRestriction>
              <xpdl2:Join Type="Exclusive" ExclusiveType="Data"/>
            </xpdl2:TransitionRestriction>
          </xpdl2:TransitionRestrictions>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="166,208,152" Height="47.0" LaneId="_D_ogIRf-EeS249Me-D-Z1Q" Width="31.0">
              <xpdl2:Coordinates XCoordinate="403.0" YCoordinate="171.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
      </xpdl2:Activities>
      <xpdl2:Transitions>
        <xpdl2:Transition Id="_EBFRqxf-EeS249Me-D-Z1Q" xpdExt:DisplayName="" Name="" From="_EBEqlRf-EeS249Me-D-Z1Q" To="_EBEqlhf-EeS249Me-D-Z1Q">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_EBFRrBf-EeS249Me-D-Z1Q" xpdExt:DisplayName="" Name="" From="_EBEqlhf-EeS249Me-D-Z1Q" To="_EBEqlxf-EeS249Me-D-Z1Q">
          <xpdl2:Condition Type="OTHERWISE"/>
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_XgfpICReEeS7nfcnWLEGQg" xpdExt:DisplayName="" Name="" From="_EBEqkBf-EeS249Me-D-Z1Q" To="_EBEqlRf-EeS249Me-D-Z1Q">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.LabelAnchorPosition">
              <xpdl2:Coordinates XCoordinate="50.0" YCoordinate="0.0"/>
              <xpdl2:Coordinates XCoordinate="0.0" YCoordinate="0.0"/>
            </xpdl2:ConnectorGraphicsInfo>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_u3ZeICReEeS7nfcnWLEGQg" xpdExt:DisplayName="" Name="" From="_EBEqlhf-EeS249Me-D-Z1Q" To="_uFPocCReEeS7nfcnWLEGQg">
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
        <xpdl2:Transition Id="_meFNUCRfEeS7nfcnWLEGQg" xpdExt:DisplayName="" Name="" From="_uFPocCReEeS7nfcnWLEGQg" To="_ltQNUCRfEeS7nfcnWLEGQg">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.LabelAnchorPosition">
              <xpdl2:Coordinates XCoordinate="50.0" YCoordinate="0.0"/>
              <xpdl2:Coordinates XCoordinate="0.0" YCoordinate="0.0"/>
            </xpdl2:ConnectorGraphicsInfo>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_nhOFUCRfEeS7nfcnWLEGQg" xpdExt:DisplayName="" Name="" From="_EBEqlxf-EeS249Me-D-Z1Q" To="_ltQNUCRfEeS7nfcnWLEGQg">
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