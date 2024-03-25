// Code generated by connect-kotlin. DO NOT EDIT.
//
// Source: gitpod/v1/scm.proto
//
package io.gitpod.publicapi.v1

import com.connectrpc.Headers
import com.connectrpc.ResponseMessage

public interface SCMServiceClientInterface {
  /**
   *  SearchSCMTokens allows clients to retrieve SCM tokens based on the
   *  specified host.
   */
  public suspend fun searchSCMTokens(request: Scm.SearchSCMTokensRequest, headers: Headers =
      emptyMap()): ResponseMessage<Scm.SearchSCMTokensResponse>

  /**
   *  GuessTokenScopes allows clients to retrieve scopes their SCM token would
   *  require for the specified git command.
   */
  public suspend fun guessTokenScopes(request: Scm.GuessTokenScopesRequest, headers: Headers =
      emptyMap()): ResponseMessage<Scm.GuessTokenScopesResponse>

  /**
   *  SearchRepositories allows clients to search for suggested repositories of
   *  SCM providers they are connected with.
   */
  public suspend fun searchRepositories(request: Scm.SearchRepositoriesRequest, headers: Headers =
      emptyMap()): ResponseMessage<Scm.SearchRepositoriesResponse>

  /**
   *  ListSuggestedRepositories allows clients to list suggested repositories
   *  based on recent workspaces and accessible repo configurations.
   */
  public suspend fun listSuggestedRepositories(request: Scm.ListSuggestedRepositoriesRequest,
      headers: Headers = emptyMap()): ResponseMessage<Scm.ListSuggestedRepositoriesResponse>
}
