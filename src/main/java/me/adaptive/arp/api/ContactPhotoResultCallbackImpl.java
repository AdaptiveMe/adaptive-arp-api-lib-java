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
   Interface for Managing the Contact operations
   Auto-generated implementation of IContactPhotoResultCallback specification.
*/
public class ContactPhotoResultCallbackImpl extends BaseCallbackImpl implements IContactPhotoResultCallback {

     /**
        Constructor with callback id.

        @param id  The id of the callback.
     */
     public ContactPhotoResultCallbackImpl(long id) {
          super(id);
     }

     /**
        This method is called on Error

        @param error returned by the platform
        @since v2.0
     */
     public void onError(IContactPhotoResultCallbackError error) {
          AppRegistryBridge.getInstance().getPlatformContextWeb().executeJavaScript("Adaptive.handleContactPhotoResultCallbackError( '"+getId()+"', JSON.parse(" + getJSONParser().toJson(error) +") )");
     }

     /**
        This method is called on Result

        @param contactPhoto returned by the platform
        @since v2.0
     */
     public void onResult(byte[] contactPhoto) {
          AppRegistryBridge.getInstance().getPlatformContextWeb().executeJavaScript("Adaptive.handleContactPhotoResultCallbackResult( '"+getId()+"', JSON.parse(" + getJSONParser().toJson(contactPhoto) +") )");
     }

     /**
        This method is called on Warning

        @param contactPhoto returned by the platform
        @param warning      returned by the platform
        @since v2.0
     */
     public void onWarning(byte[] contactPhoto, IContactPhotoResultCallbackWarning warning) {
          AppRegistryBridge.getInstance().getPlatformContextWeb().executeJavaScript("Adaptive.handleContactPhotoResultCallbackWarning( '"+getId()+"', JSON.parse(" + getJSONParser().toJson(contactPhoto) +"), JSON.parse(" + getJSONParser().toJson(warning) +") )");
     }

}
/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
