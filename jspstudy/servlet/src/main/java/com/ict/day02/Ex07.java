package com.ict.day02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex07 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청에 따른 한글 처리 
		// 응답에 따른 한글 처리 
		   response.setContentType("text/html; charset=UTF-8");
		// 응답을 하기 위한 출력 처리
		   PrintWriter out = response.getWriter();
		   
		// 중요)   
		// 클라이언트가 서버에게 정보를 요청하면서 필요한 정보를 보낼 수 있다.
		// 이렇게 요청을 처리하기 위해서 함께 전달되는 정보를 '파라미터' 라고 한다.
		
		// 파라미터의 자료형은 기본적으로 String 이거나 String[] 이다.
		   
		// 클라이언트가 요청할때 사용하는 메서드는 get 방식, post 방식 이다.
		// get 방식 : 주소창에 보인다 (정보를 헤더에 담는다) (url ~~~~~~?name=value&name=value....)
		// post 방식 : 주소창에 정보가 안보인다.(정보를 바디에 담고 있다.)
		   
		 // 파라미터를 받아서 처리하는 메서드들
		 // 1. request.getParameter("name");  name에 매칭된 value가 String 으로 반환된다.   
		 // 2. request.getParameterValues("name");  name에 매칭된 value 들이 String[] 으로 반환된다.
		 
		 // 맵 형식의 파라미터 일때 사용
		 // 3. request.getParameterMap() : Map<String,String[]>
		   
		 // 열거형의 파라미터 일때 사용
		 // 4. request.getParameterNames() : Enumeration<String>
		   
		 // 만약에 이름(uesrname)과 나이(userage)가 파라미터로 넘어온다고 했을 때 처리 방법
		   String username = request.getParameter("username");
		   String userage = request.getParameter("userage");
		   
		   out.println("<h3>");
		   out.println("<ul>");
		   out.println("<li> 이름 : "+ username +"</li>");
		   out.println("<li> 나이 : "+ userage +"</li>");
		   out.println("</ul>");
		   out.println("</h3>");
		   out.println("<hr>");
		   
		   // 만약에 s1이라는 이름으로 숫자,  s2라는 이름으로 숫자,
		   // op라는 이름으로 +,-,*,/ 중 하나가 넘어온다고 가정하자 ( + 는 안됨)
		   // ?username=둘리&userage=1024&s1=24&s2=12&op=*
		   String s1 = request.getParameter("s1");
		   String s2 = request.getParameter("s2");
		   String op = request.getParameter("op");
		   
		   // 실제 계산 위해서 s1, s2 를 int로 변경시키자 
		   int su1 = Integer.parseInt(s1);
		   int su2 = Integer.parseInt(s2);
		   
		   // int su1 = Integer.parseInt(request.getParameter("s1"));
		   int result = 0;
		   switch (op) {
		   		case "+": result = su1 + su2;	break;
		   		case "-": result = su1 - su2;	break;
		   		case "*": result = su1 * su2;	break;
		   		case "/": result = su1 / su2;	break;
		   }
		   
		   out.println("<h3> 결과 : " + su1 + op + su2 +  "=" + result + "<h3>");
		   
	}
}














