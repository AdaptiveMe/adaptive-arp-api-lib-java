/**
--| ADAPTIVE RUNTIME PLATFORM |----------------------------------------------------------------------------------------

(C) Copyright 2013-2015 Carlos Lozano Diez t/a Adaptive.me <http://adaptive.me>.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 . Unless required by appli-
-cable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,  WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the  License  for the specific language governing
permissions and limitations under the License.

Original author:

    * Carlos Lozano Diez
            <http://github.com/carloslozano>
            <http://twitter.com/adaptivecoder>
            <mailto:carlos@adaptive.me>

Contributors:

    * Ferran Vila Conesa
             <http://github.com/fnva>
             <http://twitter.com/ferran_vila>
             <mailto:ferran.vila.conesa@gmail.com>

    * See source code files for contributors.

Release:

    * @version v2.2.0

-------------------------------------------| aut inveniam viam aut faciam |--------------------------------------------
*/

package me.adaptive.arp.api;

import com.google.gson.Gson;

/**
   Interface for Managing the Services operations
   Auto-generated implementation of IService specification.
*/
public class ServiceBridge extends BaseCommunicationBridge implements IService, APIBridge {

     /**
        API Delegate.
     */
     private IService delegate;

     /**
        Constructor with delegate.

        @param delegate The delegate implementing platform specific functions.
     */
     public ServiceBridge(IService delegate) {
          super();
          this.delegate = delegate;
     }
     /**
        Get the delegate implementation.
        @return IService delegate that manages platform specific functions..
     */
     public final IService getDelegate() {
          return this.delegate;
     }
     /**
        Set the delegate implementation.

        @param delegate The delegate implementing platform specific functions.
     */
     public final void setDelegate(IService delegate) {
          this.delegate = delegate;
     }

     /**
        Create a service request for the given ServiceToken. This method creates the request, populating
existing headers and cookies for the same service. The request is populated with all the defaults
for the service being invoked and requires only the request body to be set. Headers and cookies may be
manipulated as needed by the application before submitting the ServiceRequest via invokeService.

        @param serviceToken ServiceToken to be used for the creation of the request.
        @return ServiceRequest with pre-populated headers, cookies and defaults for the service.
        @since v2.0.6
     */
     public ServiceRequest getServiceRequest(ServiceToken serviceToken) {
          // Start logging elapsed time.
          long tIn = System.currentTimeMillis();
          ILogging logger = AppRegistryBridge.getInstance().getLoggingBridge();

          if (logger!=null) logger.log(ILoggingLogLevel.Debug, this.apiGroup.name(),this.getClass().getSimpleName()+" executing getServiceRequest...");

          ServiceRequest result = null;
          if (this.delegate != null) {
               result = this.delegate.getServiceRequest(serviceToken);
               if (logger!=null) logger.log(ILoggingLogLevel.Debug, this.apiGroup.name(),this.getClass().getSimpleName()+" executed 'getServiceRequest' in "+(System.currentTimeMillis()-tIn)+"ms.");
          } else {
               if (logger!=null) logger.log(ILoggingLogLevel.Error, this.apiGroup.name(),this.getClass().getSimpleName()+" no delegate for 'getServiceRequest'.");
          }
          return result;          
     }

     /**
        Obtains a ServiceToken for the given parameters to be used for the creation of requests.

        @param serviceName  Service name.
        @param endpointName Endpoint name.
        @param functionName Function name.
        @param method       Method type.
        @return ServiceToken to create a service request or null if the given parameter combination is not
configured in the platform's XML service definition file.
        @since v2.0.6
     */
     public ServiceToken getServiceToken(String serviceName, String endpointName, String functionName, IServiceMethod method) {
          // Start logging elapsed time.
          long tIn = System.currentTimeMillis();
          ILogging logger = AppRegistryBridge.getInstance().getLoggingBridge();

          if (logger!=null) logger.log(ILoggingLogLevel.Debug, this.apiGroup.name(),this.getClass().getSimpleName()+" executing getServiceToken...");

          ServiceToken result = null;
          if (this.delegate != null) {
               result = this.delegate.getServiceToken(serviceName, endpointName, functionName, method);
               if (logger!=null) logger.log(ILoggingLogLevel.Debug, this.apiGroup.name(),this.getClass().getSimpleName()+" executed 'getServiceToken' in "+(System.currentTimeMillis()-tIn)+"ms.");
          } else {
               if (logger!=null) logger.log(ILoggingLogLevel.Error, this.apiGroup.name(),this.getClass().getSimpleName()+" no delegate for 'getServiceToken'.");
          }
          return result;          
     }

     /**
        Obtains a Service token by a concrete uri (http://domain.com/path). This method would be useful when
a service response is a redirect (3XX) and it is necessary to make a request to another host and we
don't know by advance the name of the service.

        @param uri Unique Resource Identifier for a Service-Endpoint-Path-Method
        @return ServiceToken to create a service request or null if the given parameter is not
configured in the platform's XML service definition file.
        @since v2.1.4
     */
     public ServiceToken getServiceTokenByUri(String uri) {
          // Start logging elapsed time.
          long tIn = System.currentTimeMillis();
          ILogging logger = AppRegistryBridge.getInstance().getLoggingBridge();

          if (logger!=null) logger.log(ILoggingLogLevel.Debug, this.apiGroup.name(),this.getClass().getSimpleName()+" executing getServiceTokenByUri...");

          ServiceToken result = null;
          if (this.delegate != null) {
               result = this.delegate.getServiceTokenByUri(uri);
               if (logger!=null) logger.log(ILoggingLogLevel.Debug, this.apiGroup.name(),this.getClass().getSimpleName()+" executed 'getServiceTokenByUri' in "+(System.currentTimeMillis()-tIn)+"ms.");
          } else {
               if (logger!=null) logger.log(ILoggingLogLevel.Error, this.apiGroup.name(),this.getClass().getSimpleName()+" no delegate for 'getServiceTokenByUri'.");
          }
          return result;          
     }

     /**
        Returns all the possible service tokens configured in the platform's XML service definition file.

        @return Array of service tokens configured.
        @since v2.0.6
     */
     public ServiceToken[] getServicesRegistered() {
          // Start logging elapsed time.
          long tIn = System.currentTimeMillis();
          ILogging logger = AppRegistryBridge.getInstance().getLoggingBridge();

          if (logger!=null) logger.log(ILoggingLogLevel.Debug, this.apiGroup.name(),this.getClass().getSimpleName()+" executing getServicesRegistered...");

          ServiceToken[] result = null;
          if (this.delegate != null) {
               result = this.delegate.getServicesRegistered();
               if (logger!=null) logger.log(ILoggingLogLevel.Debug, this.apiGroup.name(),this.getClass().getSimpleName()+" executed 'getServicesRegistered' in "+(System.currentTimeMillis()-tIn)+"ms.");
          } else {
               if (logger!=null) logger.log(ILoggingLogLevel.Error, this.apiGroup.name(),this.getClass().getSimpleName()+" no delegate for 'getServicesRegistered'.");
          }
          return result;          
     }

     /**
        Executes the given ServiceRequest and provides responses to the given callback handler.

        @param serviceRequest ServiceRequest with the request body.
        @param callback       IServiceResultCallback to handle the ServiceResponse.
        @since v2.0.6
     */
     public void invokeService(ServiceRequest serviceRequest, IServiceResultCallback callback) {
          // Start logging elapsed time.
          long tIn = System.currentTimeMillis();
          ILogging logger = AppRegistryBridge.getInstance().getLoggingBridge();

          if (logger!=null) logger.log(ILoggingLogLevel.Debug, this.apiGroup.name(),this.getClass().getSimpleName()+" executing invokeService...");

          if (this.delegate != null) {
               this.delegate.invokeService(serviceRequest, callback);
               if (logger!=null) logger.log(ILoggingLogLevel.Debug, this.apiGroup.name(),this.getClass().getSimpleName()+" executed 'invokeService' in "+(System.currentTimeMillis()-tIn)+"ms.");
          } else {
               if (logger!=null) logger.log(ILoggingLogLevel.Error, this.apiGroup.name(),this.getClass().getSimpleName()+" no delegate for 'invokeService'.");
          }
          
     }

     /**
        Checks whether a specific service, endpoint, function and method type is configured in the platform's
XML service definition file.

        @param serviceName  Service name.
        @param endpointName Endpoint name.
        @param functionName Function name.
        @param method       Method type.
        @return Returns true if the service is configured, false otherwise.
        @since v2.0.6
     */
     public boolean isServiceRegistered(String serviceName, String endpointName, String functionName, IServiceMethod method) {
          // Start logging elapsed time.
          long tIn = System.currentTimeMillis();
          ILogging logger = AppRegistryBridge.getInstance().getLoggingBridge();

          if (logger!=null) logger.log(ILoggingLogLevel.Debug, this.apiGroup.name(),this.getClass().getSimpleName()+" executing isServiceRegistered...");

          boolean result = false;
          if (this.delegate != null) {
               result = this.delegate.isServiceRegistered(serviceName, endpointName, functionName, method);
               if (logger!=null) logger.log(ILoggingLogLevel.Debug, this.apiGroup.name(),this.getClass().getSimpleName()+" executed 'isServiceRegistered' in "+(System.currentTimeMillis()-tIn)+"ms.");
          } else {
               if (logger!=null) logger.log(ILoggingLogLevel.Error, this.apiGroup.name(),this.getClass().getSimpleName()+" no delegate for 'isServiceRegistered'.");
          }
          return result;          
     }

     /**
        Invokes the given method specified in the API request object.

        @param request APIRequest object containing method name and parameters.
        @return APIResponse with status code, message and JSON response or a JSON null string for void functions. Status code 200 is OK, all others are HTTP standard error conditions.
     */
     public APIResponse invoke(APIRequest request) {
          APIResponse response = new APIResponse();
          int responseCode = 200;
          String responseMessage = "OK";
          String responseJSON = "null";
          switch (request.getMethodName()) {
               case "getServiceRequest":
                    ServiceToken serviceToken0 = getJSONParser().fromJson(request.getParameters()[0], ServiceToken.class);
                    ServiceRequest response0 = this.getServiceRequest(serviceToken0);
                    if (response0 != null) {
                         responseJSON = getJSONParser().toJson(response0);
                    }
                    break;
               case "getServiceToken":
                    String serviceName1 = getJSONParser().fromJson(request.getParameters()[0], String.class);
                    String endpointName1 = getJSONParser().fromJson(request.getParameters()[1], String.class);
                    String functionName1 = getJSONParser().fromJson(request.getParameters()[2], String.class);
                    IServiceMethod method1 = getJSONParser().fromJson(request.getParameters()[3], IServiceMethod.class);
                    ServiceToken response1 = this.getServiceToken(serviceName1, endpointName1, functionName1, method1);
                    if (response1 != null) {
                         responseJSON = getJSONParser().toJson(response1);
                    }
                    break;
               case "getServiceTokenByUri":
                    String uri2 = getJSONParser().fromJson(request.getParameters()[0], String.class);
                    ServiceToken response2 = this.getServiceTokenByUri(uri2);
                    if (response2 != null) {
                         responseJSON = getJSONParser().toJson(response2);
                    }
                    break;
               case "getServicesRegistered":
                    ServiceToken[] response3 = this.getServicesRegistered();
                    if (response3 != null) {
                         responseJSON = getJSONParser().toJson(response3);
                    }
                    break;
               case "invokeService":
                    ServiceRequest serviceRequest4 = getJSONParser().fromJson(request.getParameters()[0], ServiceRequest.class);
                    IServiceResultCallback callback4 = new ServiceResultCallbackImpl(request.getAsyncId());
                    this.invokeService(serviceRequest4, callback4);
                    break;
               case "isServiceRegistered":
                    String serviceName5 = getJSONParser().fromJson(request.getParameters()[0], String.class);
                    String endpointName5 = getJSONParser().fromJson(request.getParameters()[1], String.class);
                    String functionName5 = getJSONParser().fromJson(request.getParameters()[2], String.class);
                    IServiceMethod method5 = getJSONParser().fromJson(request.getParameters()[3], IServiceMethod.class);
                    boolean response5 = this.isServiceRegistered(serviceName5, endpointName5, functionName5, method5);
                    responseJSON = getJSONParser().toJson(response5);
                    break;
               default:
                    // 404 - response null.
                    responseCode = 404;
                    responseMessage = "ServiceBridge does not provide the function '"+request.getMethodName()+"' Please check your client-side API version; should be API version >= v2.2.0.";
          }
          response.setResponse(responseJSON);
          response.setStatusCode(responseCode);
          response.setStatusMessage(responseMessage);
          return response;
     }
}
/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
