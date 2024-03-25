// Code generated by connect-kotlin. DO NOT EDIT.
//
// Source: gitpod/v1/ssh.proto
//
package io.gitpod.publicapi.v1

import com.connectrpc.Headers
import com.connectrpc.MethodSpec
import com.connectrpc.ProtocolClientInterface
import com.connectrpc.ResponseMessage
import com.connectrpc.StreamType

public class SSHServiceClient(
  private val client: ProtocolClientInterface,
) : SSHServiceClientInterface {
  /**
   *  ListSSHPublicKeys returns all the ssh public keys for the
   *  authenticated user.
   */
  override suspend fun listSSHPublicKeys(request: Ssh.ListSSHPublicKeysRequest, headers: Headers):
      ResponseMessage<Ssh.ListSSHPublicKeysResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.SSHService/ListSSHPublicKeys",
      io.gitpod.publicapi.v1.Ssh.ListSSHPublicKeysRequest::class,
      io.gitpod.publicapi.v1.Ssh.ListSSHPublicKeysResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  CreateSSHPublicKeys creates an ssh public key for the
   *  authenticated user.
   */
  override suspend fun createSSHPublicKey(request: Ssh.CreateSSHPublicKeyRequest, headers: Headers):
      ResponseMessage<Ssh.CreateSSHPublicKeyResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.SSHService/CreateSSHPublicKey",
      io.gitpod.publicapi.v1.Ssh.CreateSSHPublicKeyRequest::class,
      io.gitpod.publicapi.v1.Ssh.CreateSSHPublicKeyResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  DeleteSSHPublicKeys deletes an ssh public key for the
   *  authenticated user.
   */
  override suspend fun deleteSSHPublicKey(request: Ssh.DeleteSSHPublicKeyRequest, headers: Headers):
      ResponseMessage<Ssh.DeleteSSHPublicKeyResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.SSHService/DeleteSSHPublicKey",
      io.gitpod.publicapi.v1.Ssh.DeleteSSHPublicKeyRequest::class,
      io.gitpod.publicapi.v1.Ssh.DeleteSSHPublicKeyResponse::class,
      StreamType.UNARY,
    ),
  )

}
