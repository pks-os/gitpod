// Code generated by connect-kotlin. DO NOT EDIT.
//
// Source: gitpod/v1/configuration.proto
//
package io.gitpod.publicapi.v1

import com.connectrpc.Headers
import com.connectrpc.ResponseMessage

public interface ConfigurationServiceClientInterface {
  /**
   *  Creates a new configuration.
   */
  public suspend
      fun createConfiguration(request: ConfigurationOuterClass.CreateConfigurationRequest,
      headers: Headers = emptyMap()):
      ResponseMessage<ConfigurationOuterClass.CreateConfigurationResponse>

  /**
   *  Retrieves a configuration.
   */
  public suspend fun getConfiguration(request: ConfigurationOuterClass.GetConfigurationRequest,
      headers: Headers = emptyMap()):
      ResponseMessage<ConfigurationOuterClass.GetConfigurationResponse>

  /**
   *  Lists configurations.
   */
  public suspend fun listConfigurations(request: ConfigurationOuterClass.ListConfigurationsRequest,
      headers: Headers = emptyMap()):
      ResponseMessage<ConfigurationOuterClass.ListConfigurationsResponse>

  /**
   *  Updates a configuration.
   */
  public suspend
      fun updateConfiguration(request: ConfigurationOuterClass.UpdateConfigurationRequest,
      headers: Headers = emptyMap()):
      ResponseMessage<ConfigurationOuterClass.UpdateConfigurationResponse>

  /**
   *  Deletes a configuration.
   */
  public suspend
      fun deleteConfiguration(request: ConfigurationOuterClass.DeleteConfigurationRequest,
      headers: Headers = emptyMap()):
      ResponseMessage<ConfigurationOuterClass.DeleteConfigurationResponse>
}
