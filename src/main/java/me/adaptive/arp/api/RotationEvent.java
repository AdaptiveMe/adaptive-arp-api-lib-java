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
   Object for reporting orientation change events for device and display.

   @author Carlos Lozano Diez
   @since v2.0.5
   @version 1.0
*/
public class RotationEvent extends APIBean {

     /**
        The orientation we're rotating to. This is the future orientation when the state of the event is
WillStartRotation. This will be the current orientation when the rotation is finished with the state
DidFinishRotation.
     */
     private ICapabilitiesOrientation destination;
     /**
        The orientation we're rotating from. This is the current orientation when the state of the event is
WillStartRotation. This will be the previous orientation when the rotation is finished with the state
DidFinishRotation.
     */
     private ICapabilitiesOrientation origin;
     /**
        The state of the event to indicate the start of the rotation and the end of the rotation event. This allows
for functions to be pre-emptively performed (veto change, re-layout, etc.) before rotation is effected and
concluded.
     */
     private RotationEventState state;
     /**
        The timestamps in milliseconds when the event was fired.
     */
     private long timestamp;

     /**
        Default constructor.

        @since v2.0.5
     */
     public RotationEvent() {
     }

     /**
        Convenience constructor.

        @param origin      Source orientation when the event was fired.
        @param destination Destination orientation when the event was fired.
        @param state       State of the event (WillBegin, DidFinish).
        @param timestamp   Timestamp in milliseconds when the event was fired.
        @since v2.0.5
     */
     public RotationEvent(ICapabilitiesOrientation origin, ICapabilitiesOrientation destination, RotationEventState state, long timestamp) {
          super();
          this.origin = origin;
          this.destination = destination;
          this.state = state;
          this.timestamp = timestamp;
     }

     /**
        Gets the destination orientation of the event.

        @return Destination orientation.
        @since v2.0.5
     */
     public ICapabilitiesOrientation getDestination() {
          return this.destination;
     }

     /**
        Sets the destination orientation of the event.

        @param destination Destination orientation.
        @since v2.0.5
     */
     public void setDestination(ICapabilitiesOrientation destination) {
          this.destination = destination;
     }

     /**
        Get the origin orientation of the event.

        @return Origin orientation.
        @since v2.0.5
     */
     public ICapabilitiesOrientation getOrigin() {
          return this.origin;
     }

     /**
        Set the origin orientation of the event.

        @param origin Origin orientation
        @since v2.0.5
     */
     public void setOrigin(ICapabilitiesOrientation origin) {
          this.origin = origin;
     }

     /**
        Gets the current state of the event.

        @return State of the event.
        @since v2.0.5
     */
     public RotationEventState getState() {
          return this.state;
     }

     /**
        Sets the current state of the event.

        @param state The state of the event.
        @since v2.0.5
     */
     public void setState(RotationEventState state) {
          this.state = state;
     }

     /**
        Gets the timestamp in milliseconds of the event.

        @return Timestamp of the event.
        @since v2.0.5
     */
     public long getTimestamp() {
          return this.timestamp;
     }

     /**
        Sets the timestamp in milliseconds of the event.

        @param timestamp Timestamp of the event.
        @since v2.0.5
     */
     public void setTimestamp(long timestamp) {
          this.timestamp = timestamp;
     }


}

/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
