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

/**
   Represents a local or remote service request.

   @author Aryslan
   @since v2.0
   @version 1.0
*/
public class ServiceRequest extends APIBean {

     /**
        Encoding of the content - by default assumed to be UTF8. This may be populated by the application, the platform
populates this field with defaults for the service.
     */
     private IServiceContentEncoding contentEncoding;
     /**
        Body parameters to be included in the body of the request to a service. These may be applied
during GET/POST operations. No body parameters are included if this array is null or length zero.
     */
     private ServiceRequestParameter[] bodyParameters;
     /**
        Request data content (plain text). This should be populated by the application. The content should be
in some well-known web format - in specific, binaries submitted should be encoded to base64 and the content
type should be set respectively by the application.
     */
     private String content;
     /**
        The length in bytes of the content. This may be populated by the application, the platform
calculates this length automatically if a specific contentLength is not specified.
     */
     private int contentLength;
     /**
        The request content type (MIME TYPE). This may be populated by the application, the platform
populates this field with defaults for the service.
     */
     private String contentType;
     /**
        Query string parameters to be appended to the service URL when making the request. These may be applied
during GET/POST operations. No query parameters are appended if this array is null or length zero.
     */
     private ServiceRequestParameter[] queryParameters;
     /**
        This host indicates the origin host of the request. This, could be useful in case of redirected requests.
     */
     private String refererHost;
     /**
        The serviceHeaders array (name,value pairs) to be included in the request. This may be populated by the
application, the platform populates this field with defaults for the service and the previous headers.
In specific, the platform maintains request and response state automatically.
     */
     private ServiceHeader[] serviceHeaders;
     /**
        Session attributes and cookies. This may be populated by the application, the platform populates
this field with defaults for the service and the previous state information. In specific, the platform
maintains request and response state automatically.
     */
     private ServiceSession serviceSession;
     /**
        Token used for the creation of the request with the destination service, endpoint, function and method
identifiers. This should not be manipulated by the application directly.
     */
     private ServiceToken serviceToken;
     /**
        This attribute allows for the default user-agent string to be overridden by the application.
     */
     private String userAgent;

     /**
        Default constructor.

        @since v2.0
     */
     public ServiceRequest() {
     }

     /**
        Convenience constructor.

        @param content      Content payload.
        @param serviceToken ServiceToken for the request.
        @since v2.0.6
     */
     public ServiceRequest(String content, ServiceToken serviceToken) {
          super();
          this.content = content;
          this.serviceToken = serviceToken;
     }

     /**
        Returns the content encoding

        @return contentEncoding
        @since v2.0
     */
     public IServiceContentEncoding getContentEncoding() {
          return this.contentEncoding;
     }

     /**
        Set the content encoding

        @param contentEncoding Encoding of the binary payload - by default assumed to be UTF8.
        @since v2.0
     */
     public void setContentEncoding(IServiceContentEncoding contentEncoding) {
          this.contentEncoding = contentEncoding;
     }

     /**
        Gets the body parameters of the request.

        @return ServiceRequestParameter array or null if none are specified.
        @since v2.0.6
     */
     public ServiceRequestParameter[] getBodyParameters() {
          return this.bodyParameters;
     }

     /**
        Sets the body parameters of the request.

        @param bodyParameters ServiceRequestParameter array or null if none are specified.
        @since v2.0.6
     */
     public void setBodyParameters(ServiceRequestParameter[] bodyParameters) {
          this.bodyParameters = bodyParameters;
     }

     /**
        Returns the content

        @return content
        @since v2.0
     */
     public String getContent() {
          return this.content;
     }

     /**
        Set the content

        @param content Request/Response data content (plain text)
        @since v2.0
     */
     public void setContent(String content) {
          this.content = content;
     }

     /**
        Returns the content length

        @return contentLength
        @since v2.0
     */
     public int getContentLength() {
          return this.contentLength;
     }

     /**
        Set the content length

        @param contentLength The length in bytes for the Content field.
        @since v2.0
     */
     public void setContentLength(int contentLength) {
          this.contentLength = contentLength;
     }

     /**
        Returns the content type

        @return contentType
        @since v2.0
     */
     public String getContentType() {
          return this.contentType;
     }

     /**
        Set the content type

        @param contentType The request/response content type (MIME TYPE).
        @since v2.0
     */
     public void setContentType(String contentType) {
          this.contentType = contentType;
     }

     /**
        Gets the query parameters of the request.

        @return ServiceRequestParameter array or null if none are specified.
        @since v2.0.6
     */
     public ServiceRequestParameter[] getQueryParameters() {
          return this.queryParameters;
     }

     /**
        Sets the query parameters of the request.

        @param queryParameters ServiceRequestParameter array or null if none are specified.
        @since v2.0.6
     */
     public void setQueryParameters(ServiceRequestParameter[] queryParameters) {
          this.queryParameters = queryParameters;
     }

     /**
        Returns the referer host (origin) of the request.

        @return Referer host of the request
        @since v2.1.4
     */
     public String getRefererHost() {
          return this.refererHost;
     }

     /**
        Sets the value for the referer host of the request.

        @param refererHost Referer host of the request
        @since v2.1.4
     */
     public void setRefererHost(String refererHost) {
          this.refererHost = refererHost;
     }

     /**
        Returns the array of ServiceHeader

        @return serviceHeaders
        @since v2.0
     */
     public ServiceHeader[] getServiceHeaders() {
          return this.serviceHeaders;
     }

     /**
        Set the array of ServiceHeader

        @param serviceHeaders The serviceHeaders array (name,value pairs) to be included on the I/O service request.
        @since v2.0
     */
     public void setServiceHeaders(ServiceHeader[] serviceHeaders) {
          this.serviceHeaders = serviceHeaders;
     }

     /**
        Getter for service session

        @return The element service session
        @since v2.0
     */
     public ServiceSession getServiceSession() {
          return this.serviceSession;
     }

     /**
        Setter for service session

        @param serviceSession The element service session
        @since v2.0
     */
     public void setServiceSession(ServiceSession serviceSession) {
          this.serviceSession = serviceSession;
     }

     /**
        Gets the ServiceToken of the request.

        @return ServiceToken.
        @since v2.0.6
     */
     public ServiceToken getServiceToken() {
          return this.serviceToken;
     }

     /**
        Sets the ServiceToken of the request.

        @param serviceToken ServiceToken to be used for the invocation.
        @since v2.0.6
     */
     public void setServiceToken(ServiceToken serviceToken) {
          this.serviceToken = serviceToken;
     }

     /**
        Gets the overridden user-agent string.

        @return User-agent string.
        @since v2.0.6
     */
     public String getUserAgent() {
          return this.userAgent;
     }

     /**
        Sets the user-agent to override the default user-agent string.

        @param userAgent User-agent string.
        @since v2.0.6
     */
     public void setUserAgent(String userAgent) {
          this.userAgent = userAgent;
     }


}

/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
