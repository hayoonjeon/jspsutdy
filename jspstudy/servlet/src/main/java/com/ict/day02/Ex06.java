package com.ict.day02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex06 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청에 대한 한글 처리
		// 응답에 대한 한글 처리
		response.setContentType("text/html; charset=UTF-8");
		// 응답을 하기 위한 출력 처리 
		PrintWriter out = response.getWriter();
		
		// 링크
		out.println("<a href='hello'>서블릿 Ex03 문서호출</a><br>");
		out.println("<a href='Ex04'>서블릿 Ex04 문서호출</a><br>");
		out.println("<a href='/servlet/Ex04'>서블릿 Ex04 문서호출</a><br>");
		// 프로젝트 이름/서블릿URL Mapping ->  request.getContextPath() 
		out.println("<a href='"+ request.getContextPath() +"/Ex05'>서블릿 Ex05 문서호출</a><br>");
		
	
	}
	
}
