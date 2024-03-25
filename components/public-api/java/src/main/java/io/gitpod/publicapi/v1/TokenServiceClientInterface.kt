// Code generated by connect-kotlin. DO NOT EDIT.
//
// Source: gitpod/v1/token.proto
//
package io.gitpod.publicapi.v1

import com.connectrpc.Headers
import com.connectrpc.ResponseMessage

public interface TokenServiceClientInterface {
  /**
   *  CreateUserToken creates a new temporary access token for the specified user.
   *  +admin – only to be used by installation admins
   */
  public suspend fun createTemporaryAccessToken(request: Token.CreateTemporaryAccessTokenRequest,
      headers: Headers = emptyMap()): ResponseMessage<Token.CreateTemporaryAccessTokenResponse>
}
