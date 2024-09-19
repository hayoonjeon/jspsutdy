package com.ict.day02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Ex08 extends HttpServlet {
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
	
		out.println("<h2>여기는 Ex08 서블릿 입니다.</h2>");

		String cmd = request.getParameter("cmd");
		switch (cmd) {
		case "1":
			String username = request.getParameter("username");
			String userage =  request.getParameter("userage");
			out.println("<h3>");
			out.println("<ul>");
			out.println("<li> 이름 : " + username + "</li>" );
			out.println("<li> 나이 : " + userage + "</li>" );
			out.println("</ul>");
			out.println("</h3>");
			break;

		case "2":
			
			String s1 = request.getParameter("s1");
			String s2 = request.getParameter("s2");
			String op = request.getParameter("op");
			
			int num1 = Integer.parseInt(s1);
			int num2 = Integer.parseInt(s2);
			String result = "" ;
			
			switch (op) {
				case "+": result = String.valueOf(num1 + num2) ; break;
				case "-": result = String.valueOf(num1 - num2) ; break;
				case "*":result = String.valueOf(num1 * num2) ; break;
				case "/": //result = num1 / num2 ; break;
					if(num2 == 0) {
						result = "0으로 나눌 수 없습니다.";
					}else {
						result = String.valueOf(num1 / num2) ; break;
				  }
			}
			
			out.println("<h3>");
			out.println("결과 : " + num1 + op + num2 + " = " + result);
			out.println("</h3>");
			break;
		}
		
	}

}















