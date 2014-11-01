/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glowpoint.p2p.bridge;

import com.google.gson.Gson;
import com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub;
import com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub.GetStatus;
import com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub.ResponseResult;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import org.apache.axis2.AxisFault;

/**
 *
 * @author Masud
 */
public class Utils {

    public static void generateResponse(ResponseResult result, HttpServletResponse response) throws IOException {

        Map<String, String> map = new LinkedHashMap<String, String>();
        if (result != null) {
            map.put("Operation Result", result.getResult());
            map.put("Status Code", Integer.toString(result.getStatusCode()));
            map.put("Status Phrase", result.getStatusPhrase());
            map.put("Is successful?", Boolean.toString(result.getSuccess()));
        } else {
            map.put("Operation Result", "Exception occur in remote server.");
            map.put("Status Code", "500");
            map.put("Status Phrase", "Error");
            map.put("Is successful?", "false");
        }
        
        String json = new Gson().toJson(map);
        System.out.println("Json Format ");
        System.out.println(json);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);

    }
}
