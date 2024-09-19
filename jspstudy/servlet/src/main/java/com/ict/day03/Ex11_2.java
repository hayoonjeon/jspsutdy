package com.ict.day03;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Ex11_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		String username = request.getParameter("username");
		String userage = request.getParameter("userage");
		
		out.println("<h2>여기는 현재 Ex11_2 페이지입니다.</h2>");
		out.println("<h3><ul>");
		out.println("<li> 이름 : " + username + "</li>");
		out.println("<li> 나이 : " + userage +   "</li>");
		out.println("</ul></h3>");
	}

}
