// Code generated by connect-kotlin. DO NOT EDIT.
//
// Source: gitpod/experimental/v1/teams.proto
//
package io.gitpod.publicapi.experimental.v1

import com.connectrpc.Headers
import com.connectrpc.ResponseMessage

public interface TeamsServiceClientInterface {
  /**
   *  CreateTeam creates a new Team.
   */
  public suspend fun createTeam(request: Teams.CreateTeamRequest, headers: Headers = emptyMap()):
      ResponseMessage<Teams.CreateTeamResponse>

  /**
   *  GetTeam retrieves a single Team.
   */
  public suspend fun getTeam(request: Teams.GetTeamRequest, headers: Headers = emptyMap()):
      ResponseMessage<Teams.GetTeamResponse>

  /**
   *  ListTeams lists the caller has access to.
   */
  public suspend fun listTeams(request: Teams.ListTeamsRequest, headers: Headers = emptyMap()):
      ResponseMessage<Teams.ListTeamsResponse>

  /**
   *  DeleteTeam deletes the specified team.
   */
  public suspend fun deleteTeam(request: Teams.DeleteTeamRequest, headers: Headers = emptyMap()):
      ResponseMessage<Teams.DeleteTeamResponse>

  /**
   *  GetTeamInvitation retrieves the invitation for a Team.
   */
  public suspend fun getTeamInvitation(request: Teams.GetTeamInvitationRequest, headers: Headers =
      emptyMap()): ResponseMessage<Teams.GetTeamInvitationResponse>

  /**
   *  JoinTeam makes the caller a TeamMember of the Team.
   */
  public suspend fun joinTeam(request: Teams.JoinTeamRequest, headers: Headers = emptyMap()):
      ResponseMessage<Teams.JoinTeamResponse>

  /**
   *  ResetTeamInvitation resets the invitation_id for a Team.
   */
  public suspend fun resetTeamInvitation(request: Teams.ResetTeamInvitationRequest, headers: Headers
      = emptyMap()): ResponseMessage<Teams.ResetTeamInvitationResponse>

  /**
   *  ListTeamMembers lists the members of a Team.
   */
  public suspend fun listTeamMembers(request: Teams.ListTeamMembersRequest, headers: Headers =
      emptyMap()): ResponseMessage<Teams.ListTeamMembersResponse>

  /**
   *  UpdateTeamMember updates team membership properties.
   */
  public suspend fun updateTeamMember(request: Teams.UpdateTeamMemberRequest, headers: Headers =
      emptyMap()): ResponseMessage<Teams.UpdateTeamMemberResponse>

  /**
   *  DeleteTeamMember removes a TeamMember from the Team.
   */
  public suspend fun deleteTeamMember(request: Teams.DeleteTeamMemberRequest, headers: Headers =
      emptyMap()): ResponseMessage<Teams.DeleteTeamMemberResponse>
}
