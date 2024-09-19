<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 내장 객체 : out</title>
</head>
<body>
<%--
	JSP 내장 객체 : JSP 페이지에서 아무런 제약 없이 사용할 수 있도록 지원하는 객체를 말한다.
	   out,  request, response, page, pageContext, 
	   session, application, config, exception
	   
	   out 은 화면(브라우저)에 출력할 때 사용하는 객체
	   
	   
	   선언부     :  <%! 변수 선언, 메서드 선언;  %>
	   스크립 틀릿 :  <% 자바코드 ; %>   
	   표현식     :  <%= 변수이름 or 메서드이름 %> -> EL(표현언어) : ${변수이름 or 메서드이름}   
	   
	   단점 ) 각 요소들은 다른 요소를 포함 할 수 없다.
 --%>
   
   <% out.print("<h2>Hello JSP</h2>"); %>
   <hr>
   
   <h2><% out.println("Hi~~"); %></h2>
   <hr>
   <%
   	  String str = "Hello JSP" ;
      // System.out.println("str : " + str);
   %>
   <h2> 표현식:  <%= str %></h2>
   <hr>
    
   <h2> EL: ${str} 안 나옴</h2>
   <hr>
    <%
	    Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1 ;
		int day = now.get(Calendar.DATE);
		
		// 운세
		int luck = (int)(Math.random()*101);
    %> 
    <h2> 오늘의 운세 : <%= year%>년 <%= month%>월 <%= day%>일 <%= luck%>% 입니다. </h2>
    <hr>
     <h2> 1-10까지 for문을 이용해서 출력하기</h2>
    <% 
      for(int i=1; i<11; i++){ %>
    	<h3><%= i %></h3>
    <%} %>
    <hr>
    
     <h2> 1-10까지 for문을 이용해서 출력하기</h2>
    <% 
       for(int i=1; i<11; i++){ 
    	out.println("<h3> i=" + i + "</h3>");
       } 
    %>
    <hr>
    <h2> 0-10 까지 합 구하기 </h2>
    
    <%
    	int sum = 0 ;
    	for(int i=0; i<11; i++){
    		sum = sum + i ;
    	}
    	out.println("<h3>sum=" + sum+"</h3>") ;
    %>
    <hr>
    <%! 
        public int add(int s1, int s2){
    		return s1 + s2 ;	
    	}
    
        int result = 0 ;
        public void sub(int s1 , int s2){
        	result = s1 - s2 ;
        }
    %>
    
    <h2>
    	<p> 7 + 5 = <%= add(7,5) %>  </p>
    	
    	<%-- void 메서드일 경우 --%>
    	<% sub(7,5); %>
    	<p> 7 - 5 = <%= result %> </p>
    </h2>
</body>
</html>


















