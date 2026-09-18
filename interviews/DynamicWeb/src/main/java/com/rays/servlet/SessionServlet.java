package com.rays.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	 HttpSession session = request.getSession();


    	 session.setAttribute("username", request.getRequestedSessionId());
         String username = (String) session.getAttribute("username");


         response.setContentType("text/html");


         response.getWriter().println("<html><body>");
         response.getWriter().println("<h1>Welcome to the Session Servlet</h1>");
         if (username != null) {
             response.getWriter().println("<p>Session Attribute: SessionID = " + username + "</p>");
         } else {
             response.getWriter().println("<p>No session attribute found.</p>");
         }


         String encodedBackURL = response.encodeURL("Cookie.jsp" );
         response.getWriter().println("<a href=\"" + encodedBackURL + "\">Go Back</a>");

         response.getWriter().println("</body></html>");
     }
}