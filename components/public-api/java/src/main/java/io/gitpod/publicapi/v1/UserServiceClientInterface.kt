// Code generated by connect-kotlin. DO NOT EDIT.
//
// Source: gitpod/v1/user.proto
//
package io.gitpod.publicapi.v1

import com.connectrpc.Headers
import com.connectrpc.ResponseMessage

public interface UserServiceClientInterface {
  /**
   *  GetAuthenticatedUser allows to retrieve the current user.
   */
  public suspend fun getAuthenticatedUser(request: UserOuterClass.GetAuthenticatedUserRequest,
      headers: Headers = emptyMap()): ResponseMessage<UserOuterClass.GetAuthenticatedUserResponse>

  /**
   *  UpdateUser updates the properties of a user.
   */
  public suspend fun updateUser(request: UserOuterClass.UpdateUserRequest, headers: Headers =
      emptyMap()): ResponseMessage<UserOuterClass.UpdateUserResponse>

  /**
   *  SetWorkspaceAutoStartOptions updates the auto start options for the Gitpod Dashboard.
   *  +internal - only used by the Gitpod Dashboard.
   */
  public suspend
      fun setWorkspaceAutoStartOptions(request: UserOuterClass.SetWorkspaceAutoStartOptionsRequest,
      headers: Headers = emptyMap()):
      ResponseMessage<UserOuterClass.SetWorkspaceAutoStartOptionsResponse>

  /**
   *  DeleteUser deletes the specified user.
   */
  public suspend fun deleteUser(request: UserOuterClass.DeleteUserRequest, headers: Headers =
      emptyMap()): ResponseMessage<UserOuterClass.DeleteUserResponse>

  /**
   *  VerifyUser markes the specified user as verified.
   *  +admin – only to be used by installation admins
   */
  public suspend fun verifyUser(request: UserOuterClass.VerifyUserRequest, headers: Headers =
      emptyMap()): ResponseMessage<UserOuterClass.VerifyUserResponse>

  /**
   *  BlockUser markes the specified user as blocked.
   *  +admin – only to be used by installation admins
   */
  public suspend fun blockUser(request: UserOuterClass.BlockUserRequest, headers: Headers =
      emptyMap()): ResponseMessage<UserOuterClass.BlockUserResponse>

  /**
   *  ListUsers markes the specified user as blocked.
   *  +admin – only to be used by installation admins
   */
  public suspend fun listUsers(request: UserOuterClass.ListUsersRequest, headers: Headers =
      emptyMap()): ResponseMessage<UserOuterClass.ListUsersResponse>

  /**
   *  GetUser allows to retrieve the specified user.
   *  +admin – only to be used by installation admins
   */
  public suspend fun getUser(request: UserOuterClass.GetUserRequest, headers: Headers = emptyMap()):
      ResponseMessage<UserOuterClass.GetUserResponse>

  /**
   *  SetRolesOrPermissions allows to set roles or permissions for the specified user.
   *  +admin – only to be used by installation admins
   */
  public suspend fun setRolesOrPermissions(request: UserOuterClass.SetRolesOrPermissionsRequest,
      headers: Headers = emptyMap()): ResponseMessage<UserOuterClass.SetRolesOrPermissionsResponse>
}
