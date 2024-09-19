package com.ict.day03;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		//요청에 따른 한글처리
		request.setCharacterEncoding("UTF-8");
		//응답에 따른 한글처리
		response.setContentType("text/html; charset=UTF-8");
		//응답결과를 출려갛기 위한 객체
		PrintWriter out = response.getWriter();
		//같은 이름으로 값이 여러개 넘어오면 무조건 배열처리.
		
		String[] hobby = request.getParameterValues("hobby");
		String[] web = request.getParameterValues("web");
		
		out.println("<h2>결과보기</h2>");
		out.println("<h3><ul>");
		for (String k : hobby) {
			out.println("<li>"+k+"</li>");
		}	
		out.println("</ul></h3>");
		out.println("<hr>");
		
		out.println("<h3><ul>");
		for (String k : web) {
			out.println("<li>"+k+"</li>");
		}	
		out.println("</ul></h3>");
		out.println("<hr>");
		
	
	}

}
