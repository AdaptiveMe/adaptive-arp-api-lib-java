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

    * @version v2.2.1

-------------------------------------------| aut inveniam viam aut faciam |--------------------------------------------
*/

package me.adaptive.arp.api;

/**
   Structure representing the a physical or logical button on a device.

   @author Francisco Javier Martin Bueno
   @since v2.0
   @version 1.0
*/
public class Button extends APIBean {

     /**
        Button type
     */
     private ICapabilitiesButton type;
     /**
        Timestamp of the button event.
     */
     private long timestamp;

     /**
        Default constructor

        @since v2.0
     */
     public Button() {
     }

     /**
        Constructor with fields

        @param type Button type.
        @param timestamp Timestamp of the event
        @since v2.0
     */
     public Button(ICapabilitiesButton type, long timestamp) {
          super();
          this.type = type;
          this.timestamp = timestamp;
     }

     /**
        Returns the button type

        @return type Button type.
        @since v2.0
     */
     public ICapabilitiesButton getType() {
          return this.type;
     }

     /**
        Setter for the button type

        @param type Button Type
        @since v2.0
     */
     public void setType(ICapabilitiesButton type) {
          this.type = type;
     }

     /**
        Timestamp Getter

        @return Timestamp
        @since v2.2.1
     */
     public long getTimestamp() {
          return this.timestamp;
     }

     /**
        Timestamp Setter

        @param timestamp Timestamp
        @since v2.2.1
     */
     public void setTimestamp(long timestamp) {
          this.timestamp = timestamp;
     }


}

/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
