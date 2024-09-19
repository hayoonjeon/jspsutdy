package com.ict.day03;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Ex11 extends HttpServlet {
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
	
	out.println("<h2>여기는 현재 EX11 페이지입니다.</h2>");
	out.println("<h3><ul>");
	out.println("<li> 이름 : " + username + "</li>");
	out.println("<li> 나이 : " + userage +   "</li>");
	out.println("</ul></h3>");
	
	//페이지 이동 (포워딩, 리다이렉트)
	// >> 현재페이지에서 작업을 다 한 후 다른페이지로 이동 ( 현재페이지안보임)
	//리다이렉트 : 다른 페이지로 이동하면서 기존의 request/response 정보가 사라진다.
	// 즉 파라미터도 사라진다
	//	새로운 request,response가 만들어진다
	//  주솽에 최종 주소가 보인다.
	//   사용법 : response.sendRedirect("Ex11_2") // 서블릿으로 이동 
	//   사용법 : response.sendRedirect("day03/Ex11.html") //html 이동
	
	// response.sendRedirect("Ex11_2");
	// 포워딩 : 다른 페이지로 이동하면서 기존의 request와 response 정보를 가지고 간다.
	//  즉 파라미터가 살아있따. 
	// 주소창에는 최초 주소가 보입니다. 
	// 사용법 :	request.getRequestDispatcher("이동할 주소").forward(request, response);
	
	request.getRequestDispatcher("Ex11_2").forward(request, response);


	
	
	
	}

}
