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
   Represents a specific user or system locate.

   @author Aryslan
   @since v2.0
   @version 1.0
*/
public class Locale extends APIBean {

     /**
        A valid ISO Country Code.
     */
     private String country;
     /**
        A valid ISO Language Code.
     */
     private String language;

     /**
        Default constructor

        @since v2.0
     */
     public Locale() {
     }

     /**
        Constructor used by the implementation

        @param country  Country of the Locale
        @param language Language of the Locale
        @since v2.0
     */
     public Locale(String language, String country) {
          super();
          this.language = language;
          this.country = country;
     }

     /**
        Returns the country code

        @return country code
        @since v2.0
     */
     public String getCountry() {
          return this.country;
     }

     /**
        Set the country code

        @param country code
        @since v2.0
     */
     public void setCountry(String country) {
          this.country = country;
     }

     /**
        Returns the language code

        @return language code
        @since v2.0
     */
     public String getLanguage() {
          return this.language;
     }

     /**
        Set the language code

        @param language code
        @since v2.0
     */
     public void setLanguage(String language) {
          this.language = language;
     }


}

/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
