/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.Admission;
import service.ApplyInterface;
import service.ApplyService;

/**
 *
 * @author HP
 */
@MultipartConfig
public class admissionservlet extends HttpServlet {

  
    protected void admissionRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        response.setContentType("text/html;charset=UTF-8");
                 

//        DateFormat formatter  = new SimpleDateFormat("yyyy-MM-dd");
        try (PrintWriter out = response.getWriter()) {

                       

            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String religion = request.getParameter("religion");
//            String date = request.getParameter("dob");
//            Date dob = formatter.parse(date);
            byte[] pic;
            byte[] pdf;
            
            Part picpart = request.getPart("image");
            Part pdfpart = request.getPart("pdf");
            
            InputStream pictureContent = picpart.getInputStream();
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buf = new byte[2046];
            int x = 0;
            while((pictureContent.read(buf))!= -1){
            output.write(buf);
            }
            pic = output.toByteArray();
            
            InputStream pdfContent = pdfpart.getInputStream();
            ByteArrayOutputStream outi = new ByteArrayOutputStream();
            byte[] buff = new byte[2046];
            int y = 0;
            while((pdfContent.read(buf))!= -1){
            outi.write(buff);
            }
            pdf = outi.toByteArray();

//            String pic = request.getParameter("image");
//            String pdf = request.getParameter("pdf");
            
//            Date dob = null;
            
            //System.out.println(dob);
            
            
            
            Admission admi = new Admission(name,email,phone,pic,pdf,religion);
            ApplyInterface stuInt = new ApplyService();
            boolean result = stuInt.RegisterAccount(admi);
            
            
            System.out.println("REGISTERED SUCCESSFULLY!!");

        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        admissionRequest(request, response);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        admissionRequest(request, response);
        
        
    }
        
    }
    
    
    
    
    
    
    
    
  
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet admissionservlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet admissionservlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
