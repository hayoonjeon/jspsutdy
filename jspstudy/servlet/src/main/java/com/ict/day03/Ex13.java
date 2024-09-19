package com.ict.day03;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

public class Ex13 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		// cmd 파라미터 먼저

		String cmd = request.getParameter("cmd");
		switch (cmd) {
		case "1":

			Calendar now = Calendar.getInstance();
			int year = now.get(Calendar.YEAR);
			int month = now.get(Calendar.MONTH) + 1;
			int day = now.get(Calendar.DATE);

			out.println("<h2> 오늘 날짜</h2>");
			out.println("<h2>" + year + "-" + month + "-" + day + "</h2>");

			break;
		case "2":

			int luck = (int)(Math.random()*101);
			
			out.println("<h2>오늘의 운세</h2>");
			out.println("<h3> "+luck+" % </h3>");
			
			break;
		case "3":
			
			String s1 = request.getParameter("s1");
			String s2 = request.getParameter("s2");
			String op = request.getParameter("op");

			int su1 = Integer.parseInt(s1);
			int su2 = Integer.parseInt(s2);

			String result = "";
			switch (op) {
			case "+":
				result = String.valueOf(su1 + su2);
				break;
			case "-":
				result = String.valueOf(su1 - su2);
				break;
			case "*":
				result = String.valueOf(su1 * su2);
				break;
			case "/":
				if (su2 == 0) {
					result = "0으로는 나눌 수 없습니다.";
				} else {
					result = String.valueOf(su1 / su2);
				}
				break;
			}

			out.println("<h3> 결과 : " + su1 + op + su2 + "=" + result + "<h3>");
			
			break;

		default:
			break;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
