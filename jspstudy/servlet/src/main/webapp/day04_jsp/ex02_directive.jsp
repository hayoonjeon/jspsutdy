<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지시어 : directive</title>
</head>
<body>
<%--
	지시어(Directive) : jsp 파일의 속성을 기술하는 곳
	                  JSP 페이지의 전반적인 설정과 동작방식을 제어하기 위해 사용된다.
	1) <%@ page %>    : 해당 페이지를 톰켓이 처리하는데 필요한 정보를 기술하는 부분 
    2) <%@ include %> : 해당 파일 안에 다른 html이나 jsp 파일을 삽입할 수  있도록 도와 주는 기능을 하는 지시어
                        html의 iframe 과 비슷하다. 
    3) <%@ taglib %>  : JSP 기능를 확장하기 위해서 만들어진 라이브러리를 해당 페이지에서 사용할 수 있도록 
                       도와 주는 기능을 한다.                    
------------------------------------------------------------------------------------

    1) page의 속성들 (기본적으로 만들어진 것을 그대로 사용) 
      - language : 스크립트 코드에서 사용하는 언어
      - contentType : 해당 페이지의 출력되는 문서 타입(MIME 타입)과 문자셋 지정(캐릭터 인코딩)
        --> 인코딩(암호화, 부호화) : 정보의 형태를 변환 
        --> 디코딩(복호화)       : 변환된 정보를 원래대로 되돌리는 것 
      - pageEncoding : JSP 파일의 문자 인코딩을 설정, 파일 자체의 인코딩 방식을 지정
      - session : 세션(저장공간) 사용 여부(기본 : true)
      - buffer : 출력할때 사용되는 임시저장공간(기본: 8kb)
      - autoFlush : 출력버퍼가 다 차지 않아도 바로 출력 시켜줌 (기본 : true)
    
      - errorPage : 해당 페이지에서 오류가 발생하면 오류를 처리하는 페이지를 지정
      - isErrorpage : 해당 페이지가 오류를 처리하는 오류 페이지 이면 true 로 지정한다.(기본:false) 
      
    2) include 지시어 : <%@ include file="삽입할 파일의 위치와 이름" %> 
                      다른 페이지 소스 전체를 가져와서 현재 페이지와 합쳐서  한번에 처리
                      파라미터 전달 안됨, 잘 변경되지 않는 정적 페이지에 많이 사용  
    			      사용 예) 고정된 헤더나 푸터 파일을 가져와 현재 페이지에 포함 시키는 경우
    			       
       include 액션태그 : <jsp:include page="삽입할 파일의 위치와 이름"></jsp:include>
                       지정한 다른 페이지의 결과를 가져와서 현재 페이지에 표시한다.
                       파라미터 전달가능, 자주 변경되는 동적 페이지에 많이 사용된다.
                      사용 예) 뉴스 업데이터나 실실간 데이터 표시할 때  
                      파라미터 전달 예시)
                        <jsp:include page="">
  							<jsp:param value="" name=""/>
  						</jsp:include>
  						
    3) taglib 지시어 : 해당 페이지에 사용할 태그 라이브러리 지정
                     나중에 JSTL 할때 필요 
 					<%@ taglib prefix="접두어"  uri="라이브러리 위치" %>
 					<%@ taglib prefix="c"  uri="라이브러리 위치" %>   
 					<%@ taglib prefix="fmt"  uri="라이브러리 위치" %>
 			 - core태그(c 태그) : if문, forEach문, choose문(switch), set문, remove문
             - formatting태그 (fmt 태그) : 날짜, 시간, 숫자 등의 형식을 처리하거나, 국제화 처리를 할때 사용
 --%>
 

</body>
</html>







