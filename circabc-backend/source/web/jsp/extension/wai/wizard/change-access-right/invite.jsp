<%--
Copyright 2006 European Community

 Licensed under the EUPL, Version 1.1 or ? as soon they
 will be approved by the European Commission - subsequent
 versions of the EUPL (the "Licence");
 You may not use this work except in compliance with the
 Licence.
 You may obtain a copy of the Licence at:

 https://joinup.ec.europa.eu/software/page/eupl

 Unless required by applicable law or agreed to in
 writing, software distributed under the Licence is
 distributed on an "AS IS" basis,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 express or implied.
 See the Licence for the specific language governing
 permissions and limitations under the Licence.
--%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="/WEB-INF/alfresco.tld" prefix="a"%>
<%@ taglib uri="/WEB-INF/repo.tld" prefix="r"%>
<%@ taglib uri="/WEB-INF/circabc.tld" prefix="circabc"%>

<%@ page isELIgnored="false"%>

<%-- C'est le mien --%>
<%-- load a bundle of properties with I18N strings --%>
<f:loadBundle basename="alfresco.messages.webclient" var="msg" />
<f:loadBundle basename="alfresco.extension.webclient" var="cmsg" />

<circabc:panel id="invite-space-user-section-1" styleClass="signup_rub_title" >
	<h:outputText value="&nbsp;#{msg.general_properties}" escape="false" />
</circabc:panel>

<h:panelGrid columns="1" cellpadding="3" cellspacing="3" border="0">
	<a:genericPicker id="picker" showAddButton="false"
		filters="#{WizardManager.bean.filters}"
		queryCallback="#{WizardManager.bean.pickerCallback}" />
	<h:outputText value="" />
</h:panelGrid>

<circabc:panel id="invite-space-user-section-2" styleClass="signup_rub_title" >
	<h:outputText value="&nbsp;#{cmsg.select_role}" escape="false" />
</circabc:panel>

<h:panelGrid columns="1" cellpadding="3" cellspacing="3" border="0">
	<h:selectOneListbox id="profiles" style="width:250px" size="6">
		<f:selectItems value="#{WizardManager.bean.permissions}" />
	</h:selectOneListbox>

	<h:commandButton id="AddToList" value="#{msg.add_to_list_button}"
		actionListener="#{WizardManager.bean.addSelection}"
		styleClass="wizardButton" />

	<h:dataTable value="#{WizardManager.bean.userProfilesDataModel}" var="row"
		rowClasses="selectedItemsRow,selectedItemsRowAlt"
		styleClass="selectedItems" headerClass="selectedItemsHeader"
		cellspacing="0" cellpadding="4"
		rendered="#{WizardManager.bean.userProfilesDataModel.rowCount != 0}">
		<h:column>
			<f:facet name="header">
				<h:outputText value="#{msg.name}" />
			</f:facet>
			<h:outputText value="#{row.label}" />
		</h:column>
		<h:column>
			<circabc:actionLink actionListener="#{WizardManager.bean.removeSelection}"
				image="/images/icons/delete.gif" tooltip="#{msg.remove}" value="#{msg.remove}" showLink="false"
				styleClass="pad6Left" />
		</h:column>
	</h:dataTable>
	<a:panel id="no-items"
		rendered="#{WizardManager.bean.userProfilesDataModel.rowCount == 0}">
		<table cellspacing='0' cellpadding='2' border='0' class='selectedItems'>
			<tr>
				<td colspan='2' class='selectedItemsHeader'><h:outputText
					id="no-items-name" value="#{msg.name}:" /></td>
			</tr>
			<tr>
				<td class='selectedItemsRow'>
					<h:outputText id="no-items-msg" value="#{msg.no_selected_items}" />
				</td>
			</tr>
		</table>
	</a:panel>
</h:panelGrid>
