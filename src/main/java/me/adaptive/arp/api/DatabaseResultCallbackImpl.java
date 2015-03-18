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
   Interface for Managing the Cloud operations
   Auto-generated implementation of IDatabaseResultCallback specification.
*/
public class DatabaseResultCallbackImpl extends BaseCallbackImpl implements IDatabaseResultCallback {

     /**
        Constructor with callback id.

        @param id  The id of the callback.
     */
     public DatabaseResultCallbackImpl(long id) {
          super(id);
     }

     /**
        Result callback for error responses

        @param error Returned error
        @since v2.0
     */
     public void onError(IDatabaseResultCallbackError error) {
          AppRegistryBridge.getInstance().getPlatformContextWeb().executeJavaScript("Adaptive.handleDatabaseResultCallbackError( '"+getId()+"', JSON.parse(" + getJSONParser().toJson(error) +") )");
     }

     /**
        Result callback for correct responses

        @param database Returns the database
        @since v2.0
     */
     public void onResult(Database database) {
          AppRegistryBridge.getInstance().getPlatformContextWeb().executeJavaScript("Adaptive.handleDatabaseResultCallbackResult( '"+getId()+"', JSON.parse(" + getJSONParser().toJson(database) +") )");
     }

     /**
        Result callback for warning responses

        @param database Returns the database
        @param warning  Returned Warning
        @since v2.0
     */
     public void onWarning(Database database, IDatabaseResultCallbackWarning warning) {
          AppRegistryBridge.getInstance().getPlatformContextWeb().executeJavaScript("Adaptive.handleDatabaseResultCallbackWarning( '"+getId()+"', JSON.parse(" + getJSONParser().toJson(database) +"), JSON.parse(" + getJSONParser().toJson(warning) +") )");
     }

}
/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
