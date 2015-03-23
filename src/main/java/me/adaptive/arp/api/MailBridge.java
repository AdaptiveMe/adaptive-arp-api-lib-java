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
   Interface for Managing the Mail operations
   Auto-generated implementation of IMail specification.
*/
public class MailBridge extends BasePIMBridge implements IMail, APIBridge {

     /**
        API Delegate.
     */
     private IMail delegate;

     /**
        Constructor with delegate.

        @param delegate The delegate implementing platform specific functions.
     */
     public MailBridge(IMail delegate) {
          super();
          this.delegate = delegate;
     }
     /**
        Get the delegate implementation.
        @return IMail delegate that manages platform specific functions..
     */
     public final IMail getDelegate() {
          return this.delegate;
     }
     /**
        Set the delegate implementation.

        @param delegate The delegate implementing platform specific functions.
     */
     public final void setDelegate(IMail delegate) {
          this.delegate = delegate;
     }

     /**
        Send an Email

        @param data     Payload of the email
        @param callback Result callback of the operation
        @since v2.0
     */
     public void sendEmail(Email data, IMessagingCallback callback) {
          // Start logging elapsed time.
          long tIn = System.currentTimeMillis();
          ILogging logger = AppRegistryBridge.getInstance().getLoggingBridge();

          if (logger!=null) logger.log(ILoggingLogLevel.Debug, this.apiGroup.name(),this.getClass().getSimpleName()+" executing sendEmail...");

          if (this.delegate != null) {
               this.delegate.sendEmail(data, callback);
               if (logger!=null) logger.log(ILoggingLogLevel.Debug, this.apiGroup.name(),this.getClass().getSimpleName()+" executed 'sendEmail' in "+(System.currentTimeMillis()-tIn)+"ms.");
          } else {
               if (logger!=null) logger.log(ILoggingLogLevel.Error, this.apiGroup.name(),this.getClass().getSimpleName()+" no delegate for 'sendEmail'.");
          }
          
     }

     /**
        Invokes the given method specified in the API request object.

        @param request APIRequest object containing method name and parameters.
        @return APIResponse with status code, message and JSON response or a JSON null string for void functions. Status code 200 is OK, all others are HTTP standard error conditions.
     */
     public APIResponse invoke(APIRequest request) {
          APIResponse response = new APIResponse();
          int responseCode = 200;
          String responseMessage = "OK";
          String responseJSON = "null";
          switch (request.getMethodName()) {
               case "sendEmail":
                    Email data0 = getJSONParser().fromJson(request.getParameters()[0], Email.class);
                    IMessagingCallback callback0 = new MessagingCallbackImpl(request.getAsyncId());
                    this.sendEmail(data0, callback0);
                    break;
               default:
                    // 404 - response null.
                    responseCode = 404;
                    responseMessage = "MailBridge does not provide the function '"+request.getMethodName()+"' Please check your client-side API version; should be API version >= v2.2.0.";
          }
          response.setResponse(responseJSON);
          response.setStatusCode(responseCode);
          response.setStatusMessage(responseMessage);
          return response;
     }
}
/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
