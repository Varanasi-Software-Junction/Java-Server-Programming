/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletpackages;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
       PrintWriter pw=new PrintWriter(response.getWriter());
       pw.println("GET");
       pw.flush();
       pw.close();
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter pw=new PrintWriter(response.getWriter());
       pw.println("POST");
       pw.flush();
       pw.close();
     
    }

    @Override
    public String getServletInfo() {
        return "Hello Servlet";
    }

}
