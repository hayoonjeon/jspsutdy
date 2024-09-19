package com.ict.day02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Ex09 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<h2>여기는 EX09 서블렛입니다.<h2>");
		String cmd = request.getParameter("cmd");
		
		String username = request.getParameter("username");
		String userphone = request.getParameter("userphone");
		String op = request.getParameter("op");
		String text = request.getParameter("text");
		
		String N_field = "";
		
		if (op.equalsIgnoreCase("pub")) {
			N_field="웹 퍼블리싱" ;
			
		}else if (op.equalsIgnoreCase("web")) {
			N_field="웹 애플리케이션 개발" ;
		}else if (op.equalsIgnoreCase("env")) {
			N_field="개발 환경 개선" ;
		}
		
		out.println("<h3>");
		out.println("이름 : " + username );
		out.println("<br>");		
		out.println("연락처 : " + userphone );
		out.println("<br>");	
		out.println("지원분야 : " +  N_field );
		out.println("<br>");	
		out.println("지원동기 : " + text );
		
		
		out.print("</h3>");
		
	}



}
