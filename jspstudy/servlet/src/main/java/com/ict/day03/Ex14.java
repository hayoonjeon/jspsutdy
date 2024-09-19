package com.ict.day03;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import com.ict.model.Command01;
import com.ict.model.Command02;
import com.ict.model.Command03;

public class Ex14 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		// cmd 파라미터 먼저

		String cmd = request.getParameter("cmd");
		String path = null;
		
		switch (cmd) {
		case "1": Command01 comm1 = new Command01();
			path=comm1.exec(request, response);break;
		case "2": Command02 comm2 = new Command02();
		path=comm2.exec(request, response);break;
		case "3": Command03 comm3 = new Command03();
		path=comm3.exec(request, response);break;

		
		}
		
		
		request.getRequestDispatcher(path).forward(request, response);
	

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}