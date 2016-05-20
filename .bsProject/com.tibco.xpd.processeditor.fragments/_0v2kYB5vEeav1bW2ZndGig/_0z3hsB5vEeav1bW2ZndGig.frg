<?xml version="1.0" encoding="UTF-8"?>
<xpdl2:Package xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:database="http://www.tibco.com/XPD/database1.0.0" xmlns:eaijava="http://www.tibco.com/XPD/EAIJava1.0.0" xmlns:email="http://www.tibco.com/XPD/email1.0.0" xmlns:iProcessExt="http://www.tibco.com/XPD/iProcessExt1.0.0" xmlns:orchestrator="http://www.tibco.com/XPD/orchestrator1.0.0" xmlns:order="http://www.tibco.com/XPD/order1.0.0" xmlns:simulation="http://www.tibco.com/xpd/Simulation1.0.1" xmlns:xpdExt="http://www.tibco.com/XPD/xpdExtension1.0.0" xmlns:xpdl2="http://www.wfmc.org/2008/XPDL2.1" xsi:schemaLocation="http://www.wfmc.org/2008/XPDL2.1 http://www.wfmc.org/standards/bpmnxpdl_31.xsd" Id="_4Snw8IllEeGhSfo8bxwQsQ" xpdExt:DisplayName="EventHandler" Name="EventHandler">
  <xpdl2:PackageHeader xpdExt:Language="en_GB">
    <xpdl2:XPDLVersion>2.1</xpdl2:XPDLVersion>
    <xpdl2:Vendor>TIBCO</xpdl2:Vendor>
    <xpdl2:Created>2012-04-18</xpdl2:Created>
    <xpdl2:Description></xpdl2:Description>
    <xpdl2:Documentation></xpdl2:Documentation>
    <xpdl2:CostUnit>GBP</xpdl2:CostUnit>
  </xpdl2:PackageHeader>
  <xpdl2:RedefinableHeader PublicationStatus="UNDER_REVISION">
    <xpdl2:Author>aallway</xpdl2:Author>
    <xpdl2:Version>1.0.0.qualifier</xpdl2:Version>
  </xpdl2:RedefinableHeader>
  <xpdl2:Participants>
    <xpdl2:Participant Id="_EFds4IlmEeGhSfo8bxwQsQ" xpdExt:DisplayName="EventHandler-Process (API Activity EndPoint)" Name="EventHandler_EventHandlerProcess">
      <xpdl2:ParticipantType Type="SYSTEM"/>
      <xpdExt:ParticipantSharedResource>
        <xpdExt:WebService>
          <xpdExt:Inbound>
            <xpdExt:VirtualBinding Name="Virtualization"/>
            <xpdExt:SoapHttpBinding Name="SoapOverHttp" BindingStyle="RpcLiteral" SoapVersion="1.1" EndpointUrlPath="/EventHandler/EventHandlerProcess" HttpConnectorInstanceName="httpConnector"/>
          </xpdExt:Inbound>
        </xpdExt:WebService>
      </xpdExt:ParticipantSharedResource>
    </xpdl2:Participant>
  </xpdl2:Participants>
  <xpdl2:Pools>
    <xpdl2:Pool Id="_9hsd4IllEeGhSfo8bxwQsQ" xpdExt:DisplayName="Pool" Name="Pool" BoundaryVisible="true" Process="_4S9IIIllEeGhSfo8bxwQsQ">
      <xpdl2:Lanes>
        <xpdl2:Lane Id="_9hsd4YllEeGhSfo8bxwQsQ" xpdExt:DisplayName="Lane" Name="Lane">
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo Height="314.0"/>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Lane>
      </xpdl2:Lanes>
      <xpdl2:NodeGraphicsInfos>
        <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="223,179,0" IsVisible="true"/>
      </xpdl2:NodeGraphicsInfos>
    </xpdl2:Pool>
  </xpdl2:Pools>
  <xpdl2:WorkflowProcesses>
    <xpdl2:WorkflowProcess Id="_4S9IIIllEeGhSfo8bxwQsQ" xpdExt:FlowRoutingStyle="UncenteredOnTasks" xpdExt:DisplayName="EventHandler-Process" xpdExt:ApiEndPointParticipant="_EFds4IlmEeGhSfo8bxwQsQ" Name="EventHandlerProcess">
      <xpdl2:ProcessHeader>
        <xpdl2:Description></xpdl2:Description>
      </xpdl2:ProcessHeader>
      <xpdl2:FormalParameters>
        <xpdl2:FormalParameter Id="_FPw80IlmEeGhSfo8bxwQsQ" Name="Parameter" ReadOnly="false" Mode="IN" Required="true" xpdExt:DisplayName="Parameter">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="STRING">
              <xpdl2:Length>50</xpdl2:Length>
            </xpdl2:BasicType>
          </xpdl2:DataType>
        </xpdl2:FormalParameter>
        <xpdl2:FormalParameter Id="_F5bk4YlmEeGhSfo8bxwQsQ" Name="Parameter2" ReadOnly="false" Mode="IN" Required="true" xpdExt:DisplayName="Parameter2">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="STRING">
              <xpdl2:Length>50</xpdl2:Length>
            </xpdl2:BasicType>
          </xpdl2:DataType>
        </xpdl2:FormalParameter>
      </xpdl2:FormalParameters>
      <xpdl2:DataFields>
        <xpdl2:DataField Id="_GkSfwYlmEeGhSfo8bxwQsQ" xpdExt:DisplayName="CorrelationField" Name="CorrelationField" ReadOnly="true" Correlation="true">
          <xpdl2:DataType>
            <xpdl2:BasicType Type="STRING">
              <xpdl2:Length>50</xpdl2:Length>
            </xpdl2:BasicType>
          </xpdl2:DataType>
        </xpdl2:DataField>
      </xpdl2:DataFields>
      <xpdl2:Activities>
        <xpdl2:Activity Id="_9hsd4ollEeGhSfo8bxwQsQ" Name="StartProcess" xpdExt:DisplayName="Start Process">
          <xpdl2:Event>
            <xpdl2:StartEvent xpdExt:ImplementationType="WebService" Implementation="WebService" Trigger="Message">
              <xpdl2:TriggerResultMessage xpdExt:Generated="true" CatchThrow="CATCH">
                <xpdl2:Message Id="_EE9WkIlmEeGhSfo8bxwQsQ">
                  <xpdl2:DataMappings>
                    <xpdl2:DataMapping xpdExt:TargetPrimitiveProperty="true" Direction="OUT" Formal="Parameter">
                      <xpdl2:Actual ScriptGrammar="JavaScript">Parameter</xpdl2:Actual>
                    </xpdl2:DataMapping>
                    <xpdl2:DataMapping xpdExt:TargetPrimitiveProperty="true" Direction="OUT" Formal="Parameter2">
                      <xpdl2:Actual ScriptGrammar="JavaScript">Parameter2</xpdl2:Actual>
                    </xpdl2:DataMapping>
                  </xpdl2:DataMappings>
                  <xpdExt:CorrelationDataMappings>
                    <xpdExt:DataMapping xpdExt:TargetPrimitiveProperty="true" Direction="OUT" Formal="Parameter">
                      <xpdl2:Actual ScriptGrammar="JavaScript">CorrelationField</xpdl2:Actual>
                    </xpdExt:DataMapping>
                  </xpdExt:CorrelationDataMappings>
                </xpdl2:Message>
                <xpdl2:WebServiceOperation xpdExt:SecurityProfile="" xpdExt:Transport="http://www.tibco.com/service_virtualisation" xpdExt:Alias="_EFds4IlmEeGhSfo8bxwQsQ" OperationName="">
                  <xpdl2:Service xpdExt:IsRemote="true" PortName="" ServiceName="">
                    <xpdl2:EndPoint EndPointType="WSDL">
                      <xpdl2:ExternalReference location="EventHandler.wsdl"/>
                    </xpdl2:EndPoint>
                  </xpdl2:Service>
                </xpdl2:WebServiceOperation>
                <xpdExt:PortTypeOperation PortTypeName="EventHandlerProcess" OperationName="StartProcess">
                  <xpdExt:ExternalReference location="EventHandler.wsdl"/>
                </xpdExt:PortTypeOperation>
              </xpdl2:TriggerResultMessage>
            </xpdl2:StartEvent>
          </xpdl2:Event>
          <xpdl2:Performers>
            <xpdl2:Performer>_EFds4IlmEeGhSfo8bxwQsQ</xpdl2:Performer>
          </xpdl2:Performers>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="255,219,74" Height="47.0" LaneId="_9hsd4YllEeGhSfo8bxwQsQ" Width="69.0">
              <xpdl2:Coordinates XCoordinate="51.0" YCoordinate="78.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Strategy="SYSTEM_DETERMINED"/>
          </xpdExt:ActivityResourcePatterns>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_9hsd44llEeGhSfo8bxwQsQ" Name="" xpdExt:DisplayName="">
          <xpdl2:Event>
            <xpdl2:EndEvent Result="None"/>
          </xpdl2:Event>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="255,219,74" Height="47.0" LaneId="_9hsd4YllEeGhSfo8bxwQsQ" Width="54.0">
              <xpdl2:Coordinates XCoordinate="456.0" YCoordinate="78.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_Ke-zsYlmEeGhSfo8bxwQsQ" Name="MainFlowTasks" xpdExt:Visibility="Private" xpdExt:DisplayName="Main Flow Tasks...">
          <xpdl2:Implementation>
            <xpdl2:No/>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="255,219,74" Height="64.0" LaneId="_9hsd4YllEeGhSfo8bxwQsQ" Width="96.0">
              <xpdl2:Coordinates XCoordinate="230.0" YCoordinate="79.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_NS6T4IlmEeGhSfo8bxwQsQ" Name="EventHandler" xpdExt:Visibility="Private" xpdExt:DisplayName="Event Handler">
          <xpdl2:Event>
            <xpdl2:IntermediateEvent xpdExt:ImplementationType="WebService" Implementation="WebService" Trigger="Message">
              <xpdl2:TriggerResultMessage xpdExt:EventHandlerFlowStrategy="SerializeConcurrent" xpdExt:Generated="true" CatchThrow="CATCH">
                <xpdl2:Message Id="_NS6T4YlmEeGhSfo8bxwQsQ">
                  <xpdl2:DataMappings>
                    <xpdl2:DataMapping xpdExt:TargetPrimitiveProperty="true" Direction="OUT" Formal="Parameter">
                      <xpdl2:Actual ScriptGrammar="JavaScript">Parameter</xpdl2:Actual>
                    </xpdl2:DataMapping>
                    <xpdl2:DataMapping xpdExt:TargetPrimitiveProperty="true" Direction="OUT" Formal="Parameter2">
                      <xpdl2:Actual ScriptGrammar="JavaScript">Parameter2</xpdl2:Actual>
                    </xpdl2:DataMapping>
                  </xpdl2:DataMappings>
                  <xpdExt:CorrelationDataMappings>
                    <xpdExt:DataMapping xpdExt:TargetPrimitiveProperty="true" Direction="OUT" Formal="Parameter">
                      <xpdl2:Actual ScriptGrammar="JavaScript">CorrelationField</xpdl2:Actual>
                    </xpdExt:DataMapping>
                  </xpdExt:CorrelationDataMappings>
                </xpdl2:Message>
                <xpdl2:WebServiceOperation xpdExt:SecurityProfile="" xpdExt:Transport="http://www.tibco.com/service_virtualisation" xpdExt:Alias="_EFds4IlmEeGhSfo8bxwQsQ" OperationName="">
                  <xpdl2:Service xpdExt:IsRemote="true" PortName="" ServiceName="">
                    <xpdl2:EndPoint EndPointType="WSDL">
                      <xpdl2:ExternalReference location="EventHandler.wsdl"/>
                    </xpdl2:EndPoint>
                  </xpdl2:Service>
                </xpdl2:WebServiceOperation>
                <xpdExt:PortTypeOperation PortTypeName="EventHandlerProcess" OperationName="EventHandler">
                  <xpdExt:ExternalReference location="EventHandler.wsdl"/>
                </xpdExt:PortTypeOperation>
              </xpdl2:TriggerResultMessage>
            </xpdl2:IntermediateEvent>
          </xpdl2:Event>
          <xpdl2:Performers>
            <xpdl2:Performer>_EFds4IlmEeGhSfo8bxwQsQ</xpdl2:Performer>
          </xpdl2:Performers>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="255,219,74" Height="27.0" LaneId="_9hsd4YllEeGhSfo8bxwQsQ" Width="27.0">
              <xpdl2:Coordinates XCoordinate="51.0" YCoordinate="218.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
          <xpdl2:Extensions/>
          <xpdExt:ActivityResourcePatterns>
            <xpdExt:AllocationStrategy xpdExt:Strategy="SYSTEM_DETERMINED"/>
          </xpdExt:ActivityResourcePatterns>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_QNnxgIlmEeGhSfo8bxwQsQ" Name="" xpdExt:Visibility="Private" xpdExt:DisplayName="">
          <xpdl2:Event>
            <xpdl2:EndEvent Result="None"/>
          </xpdl2:Event>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="255,219,74" Height="47.0" LaneId="_9hsd4YllEeGhSfo8bxwQsQ" Width="54.0">
              <xpdl2:Coordinates XCoordinate="456.0" YCoordinate="218.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
        <xpdl2:Activity Id="_b_QMgYlmEeGhSfo8bxwQsQ" Name="EventHandlerFlowTaskamenddataetc" xpdExt:Visibility="Private" xpdExt:DisplayName="Event Handler Flow Task (amend data etc)">
          <xpdl2:Implementation>
            <xpdl2:No/>
          </xpdl2:Implementation>
          <xpdl2:NodeGraphicsInfos>
            <xpdl2:NodeGraphicsInfo BorderColor="0,0,128" FillColor="255,219,74" Height="64.0" LaneId="_9hsd4YllEeGhSfo8bxwQsQ" Width="96.0">
              <xpdl2:Coordinates XCoordinate="230.0" YCoordinate="219.0"/>
            </xpdl2:NodeGraphicsInfo>
          </xpdl2:NodeGraphicsInfos>
        </xpdl2:Activity>
      </xpdl2:Activities>
      <xpdl2:Transitions>
        <xpdl2:Transition Id="_9hsd5IllEeGhSfo8bxwQsQ" Name="" From="_Ke-zsYlmEeGhSfo8bxwQsQ" To="_9hsd44llEeGhSfo8bxwQsQ">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.StartAnchorPosition"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_KfKZ4IlmEeGhSfo8bxwQsQ" xpdExt:DisplayName="" Name="" From="_9hsd4ollEeGhSfo8bxwQsQ" To="_Ke-zsYlmEeGhSfo8bxwQsQ">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_QNnxgYlmEeGhSfo8bxwQsQ" Name="" From="_b_QMgYlmEeGhSfo8bxwQsQ" To="_QNnxgIlmEeGhSfo8bxwQsQ">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
            <xpdl2:ConnectorGraphicsInfo ToolId="XPD.StartAnchorPosition"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
        <xpdl2:Transition Id="_b_YIUIlmEeGhSfo8bxwQsQ" xpdExt:DisplayName="" Name="" From="_NS6T4IlmEeGhSfo8bxwQsQ" To="_b_QMgYlmEeGhSfo8bxwQsQ">
          <xpdl2:ConnectorGraphicsInfos>
            <xpdl2:ConnectorGraphicsInfo BorderColor="0,0,128" ToolId="XPD.ConnectionInfo"/>
          </xpdl2:ConnectorGraphicsInfos>
        </xpdl2:Transition>
      </xpdl2:Transitions>
      <xpdl2:ExtendedAttributes>
        <xpdl2:ExtendedAttribute Name="WorkflowProcessSimulationData">
<simulation:WorkflowProcessSimulationData>
            <simulation:ParameterDistribution ParameterId="Parameter"/>
            <simulation:ParameterDistribution ParameterId="Parameter2"/>
          </simulation:WorkflowProcessSimulationData>
</xpdl2:ExtendedAttribute>
      </xpdl2:ExtendedAttributes>
    </xpdl2:WorkflowProcess>
  </xpdl2:WorkflowProcesses>
  <xpdl2:ExtendedAttributes>
    <xpdl2:ExtendedAttribute Name="CreatedBy" Value="TIBCO Business Studio"/>
    <xpdl2:ExtendedAttribute Name="FormatVersion" Value="18"/>
    <xpdl2:ExtendedAttribute Name="OriginalFormatVersion" Value="13"/>
  </xpdl2:ExtendedAttributes>
</xpdl2:Package>