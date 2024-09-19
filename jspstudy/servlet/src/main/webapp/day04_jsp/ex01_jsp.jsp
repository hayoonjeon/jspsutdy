<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP : Java Server Page</title>
</head>
<body>
<!-- html 주석 : 소스보기에서 보인다. -->
<%-- jsp 주석 : 소스보기에서 안보인다. --%>
<%--
	servlet : 자바에서 html,css,js 코드를 넣어 사용
    jsp(뷰=view=화면 단) : html 안에 자바 코드를 넣어 사용.
    
    1. 지시어(directive) : jsp 파일의 속성을 기술하는 곳
                          웹 컨테이너(=tomcat)에게 해당 파일을 어떻게 처리해야 하는지 전달하는 내용을 담고 있다.
     1) <%@ page %>    : 해당 페이지를 톰켓이 처리하는데 필요한 정보를 기술하는 부분 
     2) <%@ include %> : 해당 파일 안에 다른 html이나 jsp 파일을 삽입할 수  있도록 도와 주는 기능을 하는 지시어
                         html의 iframe 과 비슷 
     3) <%@ taglib %>  : JSP 기능를 확장하기 위해서 만들어진 라이브러리를 해당 페이지에서 사용할 수 있도록 
                         도와 주는 기능을 한다.  
    2. 액션 태그(Action Tag) : jsp 페이지에서 자바 코드를 보다 쉽게 재사용하고, 유지 보수성을 높이기 위해 사용되는 태그
                             jsp 페이지에서 특정 작업을 할때 도움을 주는 태그
                       종류) <jsp:include page=""></jsp:include>, <jsp:forward page=""></jsp:forward>
							<jsp:param value="" name=""/> <jsp:useBean id=""></jsp:useBean>
							<jsp:setProperty property="" name=""/> <jsp:getProperty property="" name=""/>
    3. EL과 JSTL :                    
      1) EL(Expression Language) 표현언어 : JSP에서 간단한 표현식을 사용하여 데이터를 처리할 수 있도록 하는 언어이다.
                                    형식 :  ${변수 나 메서드의 결과}   (자바에서 저장한 변수를 호출할 때 사용)                    
      2) JSTL(Java Server Page Standard Tag Library) 
         : 자바코드를 jsp에서 반복하지 않고, 간단하게 처리할 수 있는 표준 태그 라이브러리  
         종류 - core태그(c 태그) : if문, forEach문, choose문(switch), set문, remove문
             - formatting태그 (fmt 태그) : 날짜, 시간, 숫자 등의 형식을 처리하거나, 국제화 처리를 할때 사용                             
 --%>

</body>
</html>






