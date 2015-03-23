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
   Structure representing a remote or local service access end-point.

   @author Aryslan
   @since v2.0
   @version 1.0
*/
public class ServiceEndpoint {

     /**
        Type of validation to be performed for SSL hosts.
     */
     private IServiceCertificateValidation validationType;
     /**
        The remote service hostURI URI (alias or IP) composed of scheme://hostURI:port (http://hostURI:8080).
     */
     private String hostURI;
     /**
        The remote service paths (to be added to the hostURI and port url).
     */
     private ServicePath[] paths;

     /**
        Default Constructor

        @since v2.0
     */
     public ServiceEndpoint() {
     }

     /**
        Constructor with parameters

        @param hostURI Remote service hostURI
        @param paths   Remote service Paths
        @since v2.0.6
     */
     public ServiceEndpoint(String hostURI, ServicePath[] paths) {
          this();
          this.hostURI = hostURI;
          this.paths = paths;
     }

     /**
        Gets the validation type for the certificate of a SSL host.

        @return Type of validation.
        @since v2.0.6
     */
     public IServiceCertificateValidation getValidationType() {
          return this.validationType;
     }

     /**
        Sets the validation type for the certificate of a SSL host.

        @param validationType Type of validation.
        @since v2.0.6
     */
     public void setValidationType(IServiceCertificateValidation validationType) {
          this.validationType = validationType;
     }

     /**
        Returns the Remote service hostURI

        @return Remote service hostURI
        @since v2.0
     */
     public String getHostURI() {
          return this.hostURI;
     }

     /**
        Set the Remote service hostURI

        @param hostURI Remote service hostURI
        @since v2.0
     */
     public void setHostURI(String hostURI) {
          this.hostURI = hostURI;
     }

     /**
        Returns the Remote service Paths

        @return Remote service Paths
        @since v2.0
     */
     public ServicePath[] getPaths() {
          return this.paths;
     }

     /**
        Set the Remote service Paths

        @param paths Remote service Paths
        @since v2.0
     */
     public void setPaths(ServicePath[] paths) {
          this.paths = paths;
     }


}

/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
