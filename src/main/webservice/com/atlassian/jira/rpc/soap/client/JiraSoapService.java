/**
 * JiraSoapService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.atlassian.jira.rpc.soap.client;

public interface JiraSoapService extends java.rmi.Remote {
	public com.atlassian.jira.rpc.soap.client.RemoteComment getComment(
			java.lang.String in0, long in1) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteServerInfo getServerInfo(
			java.lang.String in0) throws java.rmi.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteGroup getGroup(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public java.lang.String login(java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteUser getUser(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException;
	public com.atlassian.jira.rpc.soap.client.RemoteIssue getIssue(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteVersion[] getVersions(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteComponent[] getComponents(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteGroup createGroup(
			java.lang.String in0, java.lang.String in1,
			com.atlassian.jira.rpc.soap.client.RemoteUser in2)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteUser createUser(
			java.lang.String in0, java.lang.String in1, java.lang.String in2,
			java.lang.String in3, java.lang.String in4)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteIssue createIssue(
			java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteIssue in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteIssue updateIssue(
			java.lang.String in0, java.lang.String in1,
			com.atlassian.jira.rpc.soap.client.RemoteFieldValue[] in2)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void deleteIssue(java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteNamedObject[] getAvailableActions(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteIssueType[] getSubTaskIssueTypes(
			java.lang.String in0) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException;
	public com.atlassian.jira.rpc.soap.client.RemoteConfiguration getConfiguration(
			java.lang.String in0) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteProject createProject(
			java.lang.String in0, java.lang.String in1, java.lang.String in2,
			java.lang.String in3, java.lang.String in4, java.lang.String in5,
			com.atlassian.jira.rpc.soap.client.RemotePermissionScheme in6,
			com.atlassian.jira.rpc.soap.client.RemoteScheme in7,
			com.atlassian.jira.rpc.soap.client.RemoteScheme in8)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteProject updateProject(
			java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteProject in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteProject getProjectByKey(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void removeAllRoleActorsByProject(java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteProject in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemotePriority[] getPriorities(
			java.lang.String in0) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException;
	public com.atlassian.jira.rpc.soap.client.RemoteResolution[] getResolutions(
			java.lang.String in0) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException;
	public com.atlassian.jira.rpc.soap.client.RemoteIssueType[] getIssueTypes(
			java.lang.String in0) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException;
	public com.atlassian.jira.rpc.soap.client.RemoteStatus[] getStatuses(
			java.lang.String in0) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException;
	public com.atlassian.jira.rpc.soap.client.RemoteIssueType[] getIssueTypesForProject(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException;
	public com.atlassian.jira.rpc.soap.client.RemoteProjectRole[] getProjectRoles(
			java.lang.String in0) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteProjectRole getProjectRole(
			java.lang.String in0, long in1) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteProjectRoleActors getProjectRoleActors(
			java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteProjectRole in1,
			com.atlassian.jira.rpc.soap.client.RemoteProject in2)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteRoleActors getDefaultRoleActors(
			java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteProjectRole in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void removeAllRoleActorsByNameAndType(java.lang.String in0,
			java.lang.String in1, java.lang.String in2)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void deleteProjectRole(java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteProjectRole in1,
			boolean in2) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void updateProjectRole(java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteProjectRole in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteProjectRole createProjectRole(
			java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteProjectRole in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public boolean isProjectRoleNameUnique(java.lang.String in0,
			java.lang.String in1) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void addActorsToProjectRole(java.lang.String in0,
			java.lang.String[] in1,
			com.atlassian.jira.rpc.soap.client.RemoteProjectRole in2,
			com.atlassian.jira.rpc.soap.client.RemoteProject in3,
			java.lang.String in4) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void removeActorsFromProjectRole(java.lang.String in0,
			java.lang.String[] in1,
			com.atlassian.jira.rpc.soap.client.RemoteProjectRole in2,
			com.atlassian.jira.rpc.soap.client.RemoteProject in3,
			java.lang.String in4) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void addDefaultActorsToProjectRole(java.lang.String in0,
			java.lang.String[] in1,
			com.atlassian.jira.rpc.soap.client.RemoteProjectRole in2,
			java.lang.String in3) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void removeDefaultActorsFromProjectRole(java.lang.String in0,
			java.lang.String[] in1,
			com.atlassian.jira.rpc.soap.client.RemoteProjectRole in2,
			java.lang.String in3) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteScheme[] getAssociatedNotificationSchemes(
			java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteProjectRole in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteScheme[] getAssociatedPermissionSchemes(
			java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteProjectRole in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void deleteProject(java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteProject getProjectById(
			java.lang.String in0, long in1) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteField[] getCustomFields(
			java.lang.String in0) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteComment[] getComments(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteFilter[] getFavouriteFilters(
			java.lang.String in0) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void releaseVersion(java.lang.String in0, java.lang.String in1,
			com.atlassian.jira.rpc.soap.client.RemoteVersion in2)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void archiveVersion(java.lang.String in0, java.lang.String in1,
			java.lang.String in2, boolean in3) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteField[] getFieldsForEdit(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteIssueType[] getSubTaskIssueTypesForProject(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException;
	public void addUserToGroup(java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteGroup in1,
			com.atlassian.jira.rpc.soap.client.RemoteUser in2)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void removeUserFromGroup(java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteGroup in1,
			com.atlassian.jira.rpc.soap.client.RemoteUser in2)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteSecurityLevel getSecurityLevel(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public boolean logout(java.lang.String in0) throws java.rmi.RemoteException;
	public void addComment(java.lang.String in0, java.lang.String in1,
			com.atlassian.jira.rpc.soap.client.RemoteComment in2)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteProject getProjectWithSchemesById(
			java.lang.String in0, long in1) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteSecurityLevel[] getSecurityLevels(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteAvatar[] getProjectAvatars(
			java.lang.String in0, java.lang.String in1, boolean in2)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void setProjectAvatar(java.lang.String in0, java.lang.String in1,
			long in2) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteAvatar getProjectAvatar(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void deleteProjectAvatar(java.lang.String in0, long in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteScheme[] getNotificationSchemes(
			java.lang.String in0) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemotePermissionScheme[] getPermissionSchemes(
			java.lang.String in0) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemotePermission[] getAllPermissions(
			java.lang.String in0) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemotePermissionScheme createPermissionScheme(
			java.lang.String in0, java.lang.String in1, java.lang.String in2)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemotePermissionScheme addPermissionTo(
			java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemotePermissionScheme in1,
			com.atlassian.jira.rpc.soap.client.RemotePermission in2,
			com.atlassian.jira.rpc.soap.client.RemoteEntity in3)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemotePermissionScheme deletePermissionFrom(
			java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemotePermissionScheme in1,
			com.atlassian.jira.rpc.soap.client.RemotePermission in2,
			com.atlassian.jira.rpc.soap.client.RemoteEntity in3)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void deletePermissionScheme(java.lang.String in0,
			java.lang.String in1) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteIssue createIssueWithSecurityLevel(
			java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteIssue in1, long in2)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public boolean addAttachmentsToIssue(java.lang.String in0,
			java.lang.String in1, java.lang.String[] in2, byte[][] in3)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteAttachment[] getAttachmentsFromIssue(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public boolean hasPermissionToEditComment(java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteComment in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteComment editComment(
			java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteComment in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteField[] getFieldsForAction(
			java.lang.String in0, java.lang.String in1, java.lang.String in2)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteIssue progressWorkflowAction(
			java.lang.String in0, java.lang.String in1, java.lang.String in2,
			com.atlassian.jira.rpc.soap.client.RemoteFieldValue[] in3)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteIssue getIssueById(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteWorklog addWorklogWithNewRemainingEstimate(
			java.lang.String in0, java.lang.String in1,
			com.atlassian.jira.rpc.soap.client.RemoteWorklog in2,
			java.lang.String in3) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteWorklog addWorklogAndAutoAdjustRemainingEstimate(
			java.lang.String in0, java.lang.String in1,
			com.atlassian.jira.rpc.soap.client.RemoteWorklog in2)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteWorklog addWorklogAndRetainRemainingEstimate(
			java.lang.String in0, java.lang.String in1,
			com.atlassian.jira.rpc.soap.client.RemoteWorklog in2)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void deleteWorklogWithNewRemainingEstimate(java.lang.String in0,
			java.lang.String in1, java.lang.String in2)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void deleteWorklogAndAutoAdjustRemainingEstimate(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void deleteWorklogAndRetainRemainingEstimate(java.lang.String in0,
			java.lang.String in1) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void updateWorklogWithNewRemainingEstimate(java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteWorklog in1,
			java.lang.String in2) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void updateWorklogAndAutoAdjustRemainingEstimate(
			java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteWorklog in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void updateWorklogAndRetainRemainingEstimate(java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteWorklog in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteWorklog[] getWorklogs(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public boolean hasPermissionToCreateWorklog(java.lang.String in0,
			java.lang.String in1) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public boolean hasPermissionToDeleteWorklog(java.lang.String in0,
			java.lang.String in1) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public boolean hasPermissionToUpdateWorklog(java.lang.String in0,
			java.lang.String in1) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public java.util.Calendar getResolutionDateByKey(java.lang.String in0,
			java.lang.String in1) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public java.util.Calendar getResolutionDateById(java.lang.String in0,
			long in1) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public long getIssueCountForFilter(java.lang.String in0,
			java.lang.String in1) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteIssue[] getIssuesFromTextSearch(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteIssue[] getIssuesFromTextSearchWithProject(
			java.lang.String in0, java.lang.String[] in1, java.lang.String in2,
			int in3) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteIssue[] getIssuesFromJqlSearch(
			java.lang.String in0, java.lang.String in1, int in2)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void deleteUser(java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteGroup updateGroup(
			java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteGroup in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void deleteGroup(java.lang.String in0, java.lang.String in1,
			java.lang.String in2) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void refreshCustomFields(java.lang.String in0)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteFilter[] getSavedFilters(
			java.lang.String in0) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public boolean addBase64EncodedAttachmentsToIssue(java.lang.String in0,
			java.lang.String in1, java.lang.String[] in2, java.lang.String[] in3)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteProject createProjectFromObject(
			java.lang.String in0,
			com.atlassian.jira.rpc.soap.client.RemoteProject in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteValidationException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteScheme[] getSecuritySchemes(
			java.lang.String in0) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteVersion addVersion(
			java.lang.String in0, java.lang.String in1,
			com.atlassian.jira.rpc.soap.client.RemoteVersion in2)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteIssue[] getIssuesFromFilter(
			java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteIssue[] getIssuesFromFilterWithLimit(
			java.lang.String in0, java.lang.String in1, int in2, int in3)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteIssue[] getIssuesFromTextSearchWithLimit(
			java.lang.String in0, java.lang.String in1, int in2, int in3)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public com.atlassian.jira.rpc.soap.client.RemoteProject[] getProjectsNoSchemes(
			java.lang.String in0) throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
	public void setNewProjectAvatar(java.lang.String in0, java.lang.String in1,
			java.lang.String in2, java.lang.String in3)
			throws java.rmi.RemoteException,
			com.atlassian.jira.rpc.soap.client.RemotePermissionException,
			com.atlassian.jira.rpc.soap.client.RemoteException;
}
