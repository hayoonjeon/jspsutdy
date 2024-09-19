package com.ict.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Command02 implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		//일처리는 여기서 하기.
		
				// 결과를 보여줄 html 페이지 주소
				return "day03/result.html";
	}

}
