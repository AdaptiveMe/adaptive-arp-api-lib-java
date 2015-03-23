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
   Structure representing the email data elements of a contact.

   @author Francisco Javier Martin Bueno
   @since v2.0
   @version 1.0
*/
public class ContactEmail extends APIBean {

     /**
        The type of the email
     */
     private ContactEmailType type;
     /**
        Email of the Contact
     */
     private String email;
     /**
        Whether the email is the primary one or not
     */
     private boolean primary;

     /**
        Default constructor

        @since v2.0
     */
     public ContactEmail() {
     }

     /**
        Constructor used by the implementation

        @param type    Type of the email
        @param primary Is email primary
        @param email   Email of the contact
        @since v2.0
     */
     public ContactEmail(ContactEmailType type, boolean primary, String email) {
          super();
          this.type = type;
          this.primary = primary;
          this.email = email;
     }

     /**
        Returns the type of the email

        @return EmailType
        @since v2.0
     */
     public ContactEmailType getType() {
          return this.type;
     }

     /**
        Set the type of the email

        @param type Type of the email
        @since v2.0
     */
     public void setType(ContactEmailType type) {
          this.type = type;
     }

     /**
        Returns the email of the Contact

        @return email
        @since v2.0
     */
     public String getEmail() {
          return this.email;
     }

     /**
        Set the email of the Contact

        @param email Email of the contact
        @since v2.0
     */
     public void setEmail(String email) {
          this.email = email;
     }

     /**
        Returns if the email is primary

        @return true if the email is primary; false otherwise
        @since v2.0
     */
     public boolean getPrimary() {
          return this.primary;
     }

     /**
        Set if the email

        @param primary true if the email is primary; false otherwise
        @since v2.0
     */
     public void setPrimary(boolean primary) {
          this.primary = primary;
     }


}

/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
