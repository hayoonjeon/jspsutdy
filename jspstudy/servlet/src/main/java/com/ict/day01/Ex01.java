package com.ict.day01;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Ex01 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
		 // 초기 설정 하는 메서드
	    // 자동으로 service() 호출
	}
public Ex01() {
	System.out.println("생성자");
}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // request => 요청 정보를 가지고 있는 객체 (클라이언트 -> 서버)
	    // response => 응답 정보를 가지고 있는 객체 (서버 -> 클라이언트)

	    // 클라이언트의 요청 방식에 따라 알맞는 메서드를 호출하는 역할
	    // 요청 방식 - get 방식 -> doGet() 메서드로 보낸다.
	    // post 방식 -> doPost() 메서드로 보낸다.
		
		System.out.println("service()");
		if(request.getMethod().equalsIgnoreCase("get")) {
			doGet(request, response);
		}else if (request.getMethod().equalsIgnoreCase("post")) {
			doPost(request, response);
		}
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("doGet");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doGet(request, response);
	}
	public void destroy() {
		
	}


}
