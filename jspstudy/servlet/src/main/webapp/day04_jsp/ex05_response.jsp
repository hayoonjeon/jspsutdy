<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp 내장 객체 : response</title>
</head>
<body>
<%--
      response(응답) : 요청에 대한 응답을 생성할 때 사용하는 객체  
       - 응답 헤더 설정(파일 다운로드 할때 )  : setHeader(), setContentType() 
       - 쿠키 추가  : addCookie()
       - 응답 데이터 전송 : 클라이어트에게 반환할 HTML, JSON, XML 등의 데이터등이 포함된다.
       - 리다이렉트 사용 : response.sendRedirect("이동할 주소");
       
       웹 페이지 이동
        1. a 링크 :  <a href = "이동할 주소">텍스트</a>
                    <a href = "이동할 주소?name=value&name=value...">텍스트</a>
        2. 자바스크립트 
            function 안에 location.href = "이동할 주소"
                         location.href = "이동할 주소?name=value&name=value..."
        3. 리다이렉트 :  response.sendRedirect("이동할 주소");
                      기존의 request 와 response 는 사라진다. (파라미터도 사라진다.)
                      새로운 request 와 response 가 만들어진다.
                      주소창에 최종 주소가 보인다.
        4. 포워딩 : request.getRequestDispacher("이동할주소").forward(request, response);
                  기존의 request 와 response 를 가지고 있음 ( 파라미터가 살아있다.)
                  주소창에 최초 주소가 보인다.                                                       
 --%>
</body>
</html>
