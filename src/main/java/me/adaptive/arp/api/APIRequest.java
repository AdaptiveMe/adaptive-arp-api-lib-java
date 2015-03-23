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
   Structure representing a HTML5 request to the native API.

   @author Carlos Lozano Diez
   @since v2.0
   @version 1.0
*/
public class APIRequest {

     /**
        Identifier of API version of this request.
     */
     private String apiVersion;
     /**
        Identifier of callback or listener for async operations.
     */
     private long asyncId;
     /**
        String representing the bridge type to obtain.
     */
     private String bridgeType;
     /**
        String representing the method name to call.
     */
     private String methodName;
     /**
        Parameters of the request as JSON formatted strings.
     */
     private String[] parameters;

     /**
        Default constructor

        @since v2.0
     */
     public APIRequest() {
     }

     /**
        Constructor with method name. No parameters

        @param bridgeType Name of the bridge to be invoked.
        @param methodName Name of the method
        @since v2.0
     */
     public APIRequest(String bridgeType, String methodName) {
          this();
          this.bridgeType = bridgeType;
          this.methodName = methodName;
     }

     /**
        Constructor with all the parameters

        @param bridgeType Name of the bridge to be invoked.
        @param methodName Name of the method
        @param parameters Array of parameters as JSON formatted strings.
        @param asyncId    Id of callback or listener or zero if none for synchronous calls.
        @since v2.0
     */
     public APIRequest(String bridgeType, String methodName, String[] parameters, long asyncId) {
          this();
          this.bridgeType = bridgeType;
          this.methodName = methodName;
          this.parameters = parameters;
          this.asyncId = asyncId;
     }

     /**
        Returns the request's API version. This should be the same or higher than the platform managing the
request.

        @return String with the API version of the request.
     */
     public String getApiVersion() {
          return this.apiVersion;
     }

     /**
        Sets the request's API version. This should be the same or higher than the platform managing the
request.

        @param apiVersion String with the API version of the request.
     */
     public void setApiVersion(String apiVersion) {
          this.apiVersion = apiVersion;
     }

     /**
        Returns the callback or listener id assigned to this request OR zero if there is no associated callback or
listener.

        @return long with the unique id of the callback or listener, or zero if there is no associated async event.
     */
     public long getAsyncId() {
          return this.asyncId;
     }

     /**
        Sets the callback or listener id to the request.

        @param asyncId The unique id of the callback or listener.
     */
     public void setAsyncId(long asyncId) {
          this.asyncId = asyncId;
     }

     /**
        Bridge Type Getter

        @return Bridge Type
        @since v2.0
     */
     public String getBridgeType() {
          return this.bridgeType;
     }

     /**
        Bridge Type Setter

        @param bridgeType Bridge Type
        @since v2.0
     */
     public void setBridgeType(String bridgeType) {
          this.bridgeType = bridgeType;
     }

     /**
        Method name Getter

        @return Method name
        @since v2.0
     */
     public String getMethodName() {
          return this.methodName;
     }

     /**
        Method name Setter

        @param methodName Method name
        @since v2.0
     */
     public void setMethodName(String methodName) {
          this.methodName = methodName;
     }

     /**
        Parameters Getter

        @return Parameters
        @since v2.0
     */
     public String[] getParameters() {
          return this.parameters;
     }

     /**
        Parameters Setter

        @param parameters Parameters, JSON formatted strings of objects.
        @since v2.0
     */
     public void setParameters(String[] parameters) {
          this.parameters = parameters;
     }


}

/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
