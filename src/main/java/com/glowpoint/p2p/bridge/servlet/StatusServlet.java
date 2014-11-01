package com.glowpoint.p2p.bridge.servlet;

import com.glowpoint.p2p.bridge.Utils;
import com.google.gson.Gson;
import com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub;
import com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub.GetStatus;
import com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub.GetStatusResponse;
import com.vonair.p2p_bridge.p2pbridgeservice.service.P2PBridgeWebServiceStub.ResponseResult;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Masud
 */
//@WebServlet(name = "StatusServlet", urlPatterns = {"/StatusServlet"})
public class StatusServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ResponseResult result = null;

        try {
            P2PBridgeWebServiceStub stub = new P2PBridgeWebServiceStub();
            GetStatus stat = new GetStatus();
            stat.setIpAddress(request.getParameter("ip_address"));
            stat.setMake(request.getParameter("device"));
            stat.setModel(request.getParameter("model"));
            stat.setUserName(request.getParameter("username"));
            stat.setPassword(request.getParameter("password"));

            GetStatusResponse res = stub.getStatus(stat);
            result = res.get_return();

            System.out.println(result.getResult());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Utils.generateResponse(result, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
