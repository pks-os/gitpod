// Code generated by connect-kotlin. DO NOT EDIT.
//
// Source: gitpod/v1/organization.proto
//
package io.gitpod.publicapi.v1

import com.connectrpc.Headers
import com.connectrpc.MethodSpec
import com.connectrpc.ProtocolClientInterface
import com.connectrpc.ResponseMessage
import com.connectrpc.StreamType

public class OrganizationServiceClient(
  private val client: ProtocolClientInterface,
) : OrganizationServiceClientInterface {
  /**
   *  CreateOrganization creates a new Organization.
   */
  override suspend fun createOrganization(request: OrganizationOuterClass.CreateOrganizationRequest,
      headers: Headers): ResponseMessage<OrganizationOuterClass.CreateOrganizationResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.OrganizationService/CreateOrganization",
      io.gitpod.publicapi.v1.OrganizationOuterClass.CreateOrganizationRequest::class,
      io.gitpod.publicapi.v1.OrganizationOuterClass.CreateOrganizationResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  GetOrganization retrieves a single Organization.
   */
  override suspend fun getOrganization(request: OrganizationOuterClass.GetOrganizationRequest,
      headers: Headers): ResponseMessage<OrganizationOuterClass.GetOrganizationResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.OrganizationService/GetOrganization",
      io.gitpod.publicapi.v1.OrganizationOuterClass.GetOrganizationRequest::class,
      io.gitpod.publicapi.v1.OrganizationOuterClass.GetOrganizationResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  UpdateOrganization updates the properties of an Organization.
   */
  override suspend fun updateOrganization(request: OrganizationOuterClass.UpdateOrganizationRequest,
      headers: Headers): ResponseMessage<OrganizationOuterClass.UpdateOrganizationResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.OrganizationService/UpdateOrganization",
      io.gitpod.publicapi.v1.OrganizationOuterClass.UpdateOrganizationRequest::class,
      io.gitpod.publicapi.v1.OrganizationOuterClass.UpdateOrganizationResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  ListOrganizations lists all organization the caller has access to.
   */
  override suspend fun listOrganizations(request: OrganizationOuterClass.ListOrganizationsRequest,
      headers: Headers): ResponseMessage<OrganizationOuterClass.ListOrganizationsResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.OrganizationService/ListOrganizations",
      io.gitpod.publicapi.v1.OrganizationOuterClass.ListOrganizationsRequest::class,
      io.gitpod.publicapi.v1.OrganizationOuterClass.ListOrganizationsResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  DeleteOrganization deletes the specified organization.
   */
  override suspend fun deleteOrganization(request: OrganizationOuterClass.DeleteOrganizationRequest,
      headers: Headers): ResponseMessage<OrganizationOuterClass.DeleteOrganizationResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.OrganizationService/DeleteOrganization",
      io.gitpod.publicapi.v1.OrganizationOuterClass.DeleteOrganizationRequest::class,
      io.gitpod.publicapi.v1.OrganizationOuterClass.DeleteOrganizationResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  GetOrganizationInvitation retrieves the invitation for a Organization.
   */
  override suspend
      fun getOrganizationInvitation(request: OrganizationOuterClass.GetOrganizationInvitationRequest,
      headers: Headers): ResponseMessage<OrganizationOuterClass.GetOrganizationInvitationResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.OrganizationService/GetOrganizationInvitation",
      io.gitpod.publicapi.v1.OrganizationOuterClass.GetOrganizationInvitationRequest::class,
      io.gitpod.publicapi.v1.OrganizationOuterClass.GetOrganizationInvitationResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  JoinOrganization makes the caller a OrganizationMember of the Organization.
   */
  override suspend fun joinOrganization(request: OrganizationOuterClass.JoinOrganizationRequest,
      headers: Headers): ResponseMessage<OrganizationOuterClass.JoinOrganizationResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.OrganizationService/JoinOrganization",
      io.gitpod.publicapi.v1.OrganizationOuterClass.JoinOrganizationRequest::class,
      io.gitpod.publicapi.v1.OrganizationOuterClass.JoinOrganizationResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  ResetOrganizationInvitation resets the invitation_id for a Organization.
   */
  override suspend
      fun resetOrganizationInvitation(request: OrganizationOuterClass.ResetOrganizationInvitationRequest,
      headers: Headers): ResponseMessage<OrganizationOuterClass.ResetOrganizationInvitationResponse>
      = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.OrganizationService/ResetOrganizationInvitation",
      io.gitpod.publicapi.v1.OrganizationOuterClass.ResetOrganizationInvitationRequest::class,
      io.gitpod.publicapi.v1.OrganizationOuterClass.ResetOrganizationInvitationResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  ListOrganizationMembers lists the members of a Organization.
   */
  override suspend
      fun listOrganizationMembers(request: OrganizationOuterClass.ListOrganizationMembersRequest,
      headers: Headers): ResponseMessage<OrganizationOuterClass.ListOrganizationMembersResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.OrganizationService/ListOrganizationMembers",
      io.gitpod.publicapi.v1.OrganizationOuterClass.ListOrganizationMembersRequest::class,
      io.gitpod.publicapi.v1.OrganizationOuterClass.ListOrganizationMembersResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  UpdateOrganizationMember updates organization membership properties.
   */
  override suspend
      fun updateOrganizationMember(request: OrganizationOuterClass.UpdateOrganizationMemberRequest,
      headers: Headers): ResponseMessage<OrganizationOuterClass.UpdateOrganizationMemberResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.OrganizationService/UpdateOrganizationMember",
      io.gitpod.publicapi.v1.OrganizationOuterClass.UpdateOrganizationMemberRequest::class,
      io.gitpod.publicapi.v1.OrganizationOuterClass.UpdateOrganizationMemberResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  DeleteOrganizationMember removes a OrganizationMember from the
   *  Organization.
   */
  override suspend
      fun deleteOrganizationMember(request: OrganizationOuterClass.DeleteOrganizationMemberRequest,
      headers: Headers): ResponseMessage<OrganizationOuterClass.DeleteOrganizationMemberResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.OrganizationService/DeleteOrganizationMember",
      io.gitpod.publicapi.v1.OrganizationOuterClass.DeleteOrganizationMemberRequest::class,
      io.gitpod.publicapi.v1.OrganizationOuterClass.DeleteOrganizationMemberResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  GetOrganizationSettings retrieves the settings of a Organization.
   */
  override suspend
      fun getOrganizationSettings(request: OrganizationOuterClass.GetOrganizationSettingsRequest,
      headers: Headers): ResponseMessage<OrganizationOuterClass.GetOrganizationSettingsResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.OrganizationService/GetOrganizationSettings",
      io.gitpod.publicapi.v1.OrganizationOuterClass.GetOrganizationSettingsRequest::class,
      io.gitpod.publicapi.v1.OrganizationOuterClass.GetOrganizationSettingsResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  UpdateOrganizationSettings updates the settings of a Organization.
   */
  override suspend
      fun updateOrganizationSettings(request: OrganizationOuterClass.UpdateOrganizationSettingsRequest,
      headers: Headers): ResponseMessage<OrganizationOuterClass.UpdateOrganizationSettingsResponse>
      = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.OrganizationService/UpdateOrganizationSettings",
      io.gitpod.publicapi.v1.OrganizationOuterClass.UpdateOrganizationSettingsRequest::class,
      io.gitpod.publicapi.v1.OrganizationOuterClass.UpdateOrganizationSettingsResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  ListOrganizationWorkspaceClasses lists workspace classes of a
   *  Organization.
   */
  override suspend
      fun listOrganizationWorkspaceClasses(request: OrganizationOuterClass.ListOrganizationWorkspaceClassesRequest,
      headers: Headers):
      ResponseMessage<OrganizationOuterClass.ListOrganizationWorkspaceClassesResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.OrganizationService/ListOrganizationWorkspaceClasses",
      io.gitpod.publicapi.v1.OrganizationOuterClass.ListOrganizationWorkspaceClassesRequest::class,
      io.gitpod.publicapi.v1.OrganizationOuterClass.ListOrganizationWorkspaceClassesResponse::class,
      StreamType.UNARY,
    ),
  )

}
