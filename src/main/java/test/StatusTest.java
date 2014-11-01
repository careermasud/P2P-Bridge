package test;

import com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub;
import com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub.GetStatus;
import com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub.GetStatusResponse;
import com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub.ResponseResult;


public class StatusTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            P2PBridgeWebServiceStub stub = new P2PBridgeWebServiceStub();
            GetStatus stat = new GetStatus();
            stat.setIpAddress("216.157.170.112");
            stat.setMake("Polycom");
            stat.setModel("HDX 4000 Series");
            stat.setUserName("admin");
            stat.setPassword("1234");
            
            GetStatusResponse response = stub.getStatus(stat);
            ResponseResult result = response.get_return();
       
            System.out.println(result.getResult());
            System.out.println(result.getSuccess());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
