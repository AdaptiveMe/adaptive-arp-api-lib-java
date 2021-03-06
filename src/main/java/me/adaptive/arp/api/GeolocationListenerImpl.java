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

    * @version v2.2.15

-------------------------------------------| aut inveniam viam aut faciam |--------------------------------------------
*/

package me.adaptive.arp.api;

import com.google.gson.Gson;
import java.io.Serializable;

/**
   Interface for Managing the Geolocation results
   Auto-generated implementation of IGeolocationListener specification.
*/
public class GeolocationListenerImpl extends BaseListenerImpl implements IGeolocationListener, Serializable {

     /**
        Java serialization support.
        @since 2.2.13
     */
     private static final long serialVersionUID = 100402410L;

     /**
        Constructor with listener id.

        @param id  The id of the listener.
     */
     public GeolocationListenerImpl(long id) {
          super(id);
     }

     /**
        No data received - error condition, not authorized or hardware not available.

        @param error Type of error encountered during reading.
        @since v2.0
     */
     public void onError(IGeolocationListenerError error) {
          AppRegistryBridge.getInstance().getPlatformContextWeb().executeJavaScript("Adaptive.handleGeolocationListenerError( '"+getId()+"', Adaptive.IGeolocationListenerError.toObject(JSON.parse(\"" + AppRegistryBridge.escapeString(getJSONParser().toJson(error)) + "\")) )");
     }

     /**
        Correct data received.

        @param geolocation Geolocation Bean
        @since v2.0
     */
     public void onResult(Geolocation geolocation) {
          AppRegistryBridge.getInstance().getPlatformContextWeb().executeJavaScript("Adaptive.handleGeolocationListenerResult( '"+getId()+"', Adaptive.Geolocation.toObject(JSON.parse(\"" + AppRegistryBridge.escapeString(getJSONParser().toJson(geolocation)) + "\")) )");
     }

     /**
        Data received with warning - ie. HighDoP

        @param geolocation Geolocation Bean
        @param warning     Type of warning encountered during reading.
        @since v2.0
     */
     public void onWarning(Geolocation geolocation, IGeolocationListenerWarning warning) {
          AppRegistryBridge.getInstance().getPlatformContextWeb().executeJavaScript("Adaptive.handleGeolocationListenerWarning( '"+getId()+"', Adaptive.Geolocation.toObject(JSON.parse(\"" + AppRegistryBridge.escapeString(getJSONParser().toJson(geolocation)) + "\")), Adaptive.IGeolocationListenerWarning.toObject(JSON.parse(\"" + AppRegistryBridge.escapeString(getJSONParser().toJson(warning)) + "\")) )");
     }

}
/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
