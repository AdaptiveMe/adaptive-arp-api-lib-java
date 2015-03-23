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
   General key/value holder class.

   @author Carlos Lozano Diez
   @since 2.0.6
   @version 1.0
*/
public class KeyValue extends APIBean {

     /**
        Value of the key.
     */
     private String keyData;
     /**
        Name of the key for the value.
     */
     private String keyName;

     /**
        Default constructor.

        @since v2.0.6
     */
     public KeyValue() {
     }

     /**
        Convenience constructor.

        @param keyName Name of the key.
        @param keyData Value of the key.
        @since v2.0.6
     */
     public KeyValue(String keyName, String keyData) {
          super();
          this.keyName = keyName;
          this.keyData = keyData;
     }

     /**
        Gets the value of the key.

        @return Value of the key.
        @since v2.0.6
     */
     public String getKeyData() {
          return this.keyData;
     }

     /**
        Sets the value of the key.

        @param keyData Value of the key.
        @since v2.0.6
     */
     public void setKeyData(String keyData) {
          this.keyData = keyData;
     }

     /**
        Gets the name of the key.

        @return Key name.
        @since v2.0.6
     */
     public String getKeyName() {
          return this.keyName;
     }

     /**
        Sets the name of the key.

        @param keyName Key name.
        @since v2.0.6
     */
     public void setKeyName(String keyName) {
          this.keyName = keyName;
     }


}

/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
