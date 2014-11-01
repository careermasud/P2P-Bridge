
/**
 * P2PBridgeWebServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.vonair.p2p_bridge.p2pbridgeservice.service;

    /**
     *  P2PBridgeWebServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class P2PBridgeWebServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public P2PBridgeWebServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public P2PBridgeWebServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getStatus method
            * override this method for handling normal response from getStatus operation
            */
           public void receiveResultgetStatus(
                    com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub.GetStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStatus operation
           */
            public void receiveErrorgetStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for launchCall method
            * override this method for handling normal response from launchCall operation
            */
           public void receiveResultlaunchCall(
                    com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub.LaunchCallResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from launchCall operation
           */
            public void receiveErrorlaunchCall(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for endCall method
            * override this method for handling normal response from endCall operation
            */
           public void receiveResultendCall(
                    com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub.EndCallResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from endCall operation
           */
            public void receiveErrorendCall(java.lang.Exception e) {
            }
                


    }
    