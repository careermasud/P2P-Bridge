package test;

import com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub;
import com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub.LaunchCall;
import com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub.LaunchCallResponse;
import com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub.ResponseResult;


public class LaunchCallTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            P2PBridgeWebServiceStub stub = new P2PBridgeWebServiceStub();
            
            LaunchCall stat = new LaunchCall();
            stat.setIpAddress("209.90.214.130");
            stat.setMake("Polycom");
            stat.setUserName(null);
            stat.setPassword(null);
            stat.setModel("ViEWSTation FX");
            stat.setDialNumber("10.1.201.84");
            
            LaunchCallResponse response = stub.launchCall(stat);
            ResponseResult result = response.get_return();
       
            System.out.println(result.getResult());
            System.out.println(result.getSuccess());
        } catch (Exception ex) {
            System.out.println("Read timed out");
        }
    }

}
