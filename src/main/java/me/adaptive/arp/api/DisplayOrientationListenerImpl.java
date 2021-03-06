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
   Interface for handling display orientation change events.
   Auto-generated implementation of IDisplayOrientationListener specification.
*/
public class DisplayOrientationListenerImpl extends BaseListenerImpl implements IDisplayOrientationListener, Serializable {

     /**
        Java serialization support.
        @since 2.2.13
     */
     private static final long serialVersionUID = 100484212L;

     /**
        Constructor with listener id.

        @param id  The id of the listener.
     */
     public DisplayOrientationListenerImpl(long id) {
          super(id);
     }

     /**
        Although extremely unlikely, this event will be fired if something beyond the control of the
platform impedes the rotation of the display.

        @param error The error condition... generally unknown as it is unexpected!
        @since v2.0.5
     */
     public void onError(IDisplayOrientationListenerError error) {
          AppRegistryBridge.getInstance().getPlatformContextWeb().executeJavaScript("Adaptive.handleDisplayOrientationListenerError( '"+getId()+"', Adaptive.IDisplayOrientationListenerError.toObject(JSON.parse(\"" + AppRegistryBridge.escapeString(getJSONParser().toJson(error)) + "\")) )");
     }

     /**
        Event fired with the successful start and finish of a rotation.

        @param rotationEvent RotationEvent containing origin, destination and state of the event.
        @since v2.0.5
     */
     public void onResult(RotationEvent rotationEvent) {
          AppRegistryBridge.getInstance().getPlatformContextWeb().executeJavaScript("Adaptive.handleDisplayOrientationListenerResult( '"+getId()+"', Adaptive.RotationEvent.toObject(JSON.parse(\"" + AppRegistryBridge.escapeString(getJSONParser().toJson(rotationEvent)) + "\")) )");
     }

     /**
        Event fired with a warning when the rotation is aborted. In specific, this
event may be fired if the application vetoes display rotation before rotation is completed.

        @param rotationEvent   RotationEvent containing origin, destination and state of the event.
        @param warning Type of condition that aborted rotation execution.
        @since v2.0.5
     */
     public void onWarning(RotationEvent rotationEvent, IDisplayOrientationListenerWarning warning) {
          AppRegistryBridge.getInstance().getPlatformContextWeb().executeJavaScript("Adaptive.handleDisplayOrientationListenerWarning( '"+getId()+"', Adaptive.RotationEvent.toObject(JSON.parse(\"" + AppRegistryBridge.escapeString(getJSONParser().toJson(rotationEvent)) + "\")), Adaptive.IDisplayOrientationListenerWarning.toObject(JSON.parse(\"" + AppRegistryBridge.escapeString(getJSONParser().toJson(warning)) + "\")) )");
     }

}
/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
