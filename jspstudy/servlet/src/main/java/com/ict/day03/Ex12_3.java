package com.ict.day03;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex12_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

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

	}

}
