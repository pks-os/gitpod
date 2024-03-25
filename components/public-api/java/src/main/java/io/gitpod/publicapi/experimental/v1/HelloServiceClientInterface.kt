// Code generated by connect-kotlin. DO NOT EDIT.
//
// Source: gitpod/experimental/v1/dummy.proto
//
package io.gitpod.publicapi.experimental.v1

import com.connectrpc.Headers
import com.connectrpc.ResponseMessage
import com.connectrpc.ServerOnlyStreamInterface

/**
 *  HelloService is a dummy service that says hello. It is used for reliability
 *  testing.
 */
public interface HelloServiceClientInterface {
  /**
   *  Unary RPCs where the client sends a single request to the server and gets a
   *  single response back, just like a normal function call.
   */
  public suspend fun sayHello(request: Dummy.SayHelloRequest, headers: Headers = emptyMap()):
      ResponseMessage<Dummy.SayHelloResponse>

  /**
   *  Server streaming RPCs where the client sends a request to the server and
   *  gets a stream to read a sequence of messages back.
   */
  public suspend fun lotsOfReplies(headers: Headers = emptyMap()):
      ServerOnlyStreamInterface<Dummy.LotsOfRepliesRequest, Dummy.LotsOfRepliesResponse>
}
