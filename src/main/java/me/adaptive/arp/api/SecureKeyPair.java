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
   Represents a single secureKey-value pair.

   @author Aryslan
   @since v2.0
   @version 1.0
*/
public class SecureKeyPair extends APIBean {

     /**
        Value of the secured element
     */
     private String secureData;
     /**
        Key of the secured element
     */
     private String secureKey;

     /**
        Default constructor

        @since v2.0
     */
     public SecureKeyPair() {
     }

     /**
        Constructor with parameters

        @param secureKey  name of the keypair
        @param secureData value of the keypair
        @since v2.0
     */
     public SecureKeyPair(String secureKey, String secureData) {
          super();
          this.secureKey = secureKey;
          this.secureData = secureData;
     }

     /**
        Returns the object value

        @return Value.
        @since v2.0
     */
     public String getSecureData() {
          return this.secureData;
     }

     /**
        Sets the value for this object

        @param secureData value to set.
        @since v2.0
     */
     public void setSecureData(String secureData) {
          this.secureData = secureData;
     }

     /**
        Returns the object secureKey name.

        @return Key name.
        @since v2.0
     */
     public String getSecureKey() {
          return this.secureKey;
     }

     /**
        Sets the secureKey name for this object.

        @param secureKey Key name.
        @since v2.0
     */
     public void setSecureKey(String secureKey) {
          this.secureKey = secureKey;
     }


}

/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
