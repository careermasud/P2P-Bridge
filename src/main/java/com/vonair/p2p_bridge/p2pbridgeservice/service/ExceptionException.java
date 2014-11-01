
/**
 * ExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.vonair.p2p_bridge.p2pbridgeservice.service;

public class ExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1414753523927L;
    
    private com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub.ExceptionE faultMessage;

    
        public ExceptionException() {
            super("ExceptionException");
        }

        public ExceptionException(java.lang.String s) {
           super(s);
        }

        public ExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub.ExceptionE msg){
       faultMessage = msg;
    }
    
    public com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub.ExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    