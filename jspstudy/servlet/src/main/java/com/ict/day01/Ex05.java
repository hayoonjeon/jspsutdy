package com.ict.day01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;


public class Ex05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//요청에 대한 한글처리
		//응답에 대한 한글처리
		response.setContentType("text/html;charset=UTF-8");
		//브라우저에 출력할 객체
		PrintWriter out=  response.getWriter();
		
		//오늘의 운세
		//오늘 날짜
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DATE);
		
		//운세
		int luck = (int)(Math.random()*101);
		
		out.println("<h2>"+year+"."+month+"."+day+"의 운수는 "+luck+"%입니다. </h2>");
		

		
	}



}
