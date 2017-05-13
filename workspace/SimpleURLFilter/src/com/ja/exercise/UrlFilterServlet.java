package com.ja.exercise;
import java.io.IOException;
import java.io.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UrlFilterServlet
 */
public class UrlFilterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init(ServletConfig config) {
        System.out.println("Servlet is being initialized");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
        writer.println("<html>Hello, I am a Java servlet!</html>");
        writer.flush();
	}
	
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String Url = request.getParameter("Enter Url:");
       
        PrintWriter writer = response.getWriter();
        writer.println("<html>Url " + Url + "is safe</html>");
        writer.flush();
    }
}
