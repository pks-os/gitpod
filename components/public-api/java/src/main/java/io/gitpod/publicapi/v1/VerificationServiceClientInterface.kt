// Code generated by connect-kotlin. DO NOT EDIT.
//
// Source: gitpod/v1/verification.proto
//
package io.gitpod.publicapi.v1

import com.connectrpc.Headers
import com.connectrpc.ResponseMessage

public interface VerificationServiceClientInterface {
  /**
   *  SendPhoneNumberVerificationToken sends a verification token to the
   *  specified phone number.
   */
  public suspend
      fun sendPhoneNumberVerificationToken(request: Verification.SendPhoneNumberVerificationTokenRequest,
      headers: Headers = emptyMap()):
      ResponseMessage<Verification.SendPhoneNumberVerificationTokenResponse>

  /**
   *  VerifyPhoneNumberVerificationToken verifies the specified verification
   *  token.
   */
  public suspend
      fun verifyPhoneNumberVerificationToken(request: Verification.VerifyPhoneNumberVerificationTokenRequest,
      headers: Headers = emptyMap()):
      ResponseMessage<Verification.VerifyPhoneNumberVerificationTokenResponse>
}
