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
   Structure representing a row for a data table.

   @author Ferran Vila Conesa
   @since v2.0
   @version 1.0
*/
public class DatabaseRow extends APIBean {

     /**
        The values of the row.
     */
     private String[] values;

     /**
        Default constructor

        @since v2.0
     */
     public DatabaseRow() {
     }

     /**
        Constructor for implementation using.

        @param values The values of the row
        @since v2.0
     */
     public DatabaseRow(String[] values) {
          super();
          this.values = values;
     }

     /**
        Returns the values of the row.

        @return The values of the row.
        @since v2.0
     */
     public String[] getValues() {
          return this.values;
     }

     /**
        Sets the values of the row.

        @param values The values of the row.
        @since v2.0
     */
     public void setValues(String[] values) {
          this.values = values;
     }


}

/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
