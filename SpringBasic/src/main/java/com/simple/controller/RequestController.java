package com.simple.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ReqVO;

@Controller
@RequestMapping("/request") //각 메서드의 공통 분모
public class RequestController {

	@RequestMapping("/req_ex01") //request/req_ex01
	public String ex01() {
		return "request/req_ex01";
	}
	
	//get, post 둘 다 혀용
	@RequestMapping("/basic1") //request/basic1
	public String basic1() {
		System.out.println("basic요청");
		return "request/basic1";
	}
	
	//get요청만 허용
	//@RequestMapping(value = "/basic2", method = RequestMethod.GET) //request/basic1
	@GetMapping("/basic2")
	public void basic2() {
		System.out.println("basic2요청");
	}
	
	//post요청만 혀용
	//@RequestMapping(value = "/basic2", method = RequestMethod.POST) //request/basic1
	@PostMapping("/basic3")
	public void basic3() {
		System.out.println("basic2요청");
	}
	
	//////////////////////////////////////////////////////
	////////////파라미터값 받기/
	@RequestMapping("/req_ex02")
	public String ex02() {
		return "request/req_ex02";
	}
	
	//전통적인 방법
//	@RequestMapping("/param1")
//	public String param1(HttpServletRequest request) { //()에 객체를 넣으면
//		
//		String name = request.getParameter("name");
//		String age = request.getParameter("age");
//		String[] inter = request.getParameterValues("inter");
//		
//		System.out.println(name);
//		
//		return "request/result";//result 페이지로 이동
//	}
	
	//@RequestParam(네임값) - 반드시 필수로 값이 전달되어야 합니다.
	//required = false는 반드시 필수가 아님
	//defaultValue는 값이 없을 때 기본값
//	@RequestMapping("/param1")
//	public String param1(@RequestParam("name") String x,
//						 @RequestParam(value = "age", required = false, defaultValue = "0") int y,
//						 @RequestParam(value = "inter", required = false, defaultValue = "") ArrayList<String> z ) {//배열이나 리스트 사용해서 받음
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z.toString());
//		
//		return "request/result";//result 페이지로 이동
//	}
	
	//커맨트객체를 이용하는 방법
	@RequestMapping("/param1")
	public String param1(ReqVO vo) {
		
		System.out.println(vo.toString());
		
		return "request/result";//result 페이지로 이동
	}
	
	///////////////////////////////////////////////////
	//화면처리
	@RequestMapping("/req_quiz01")
	public String quiz01() {
		
		return "request/req_quiz01";
	}
	//로그인요청
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request) {
		String ID = request.getParameter("id");
		String PW = request.getParameter("pw");
		
		if(ID.equals("abc123") && PW.equals("xxx123")) {
			return "request/req_quiz01_ok";
		} else {
			
			return "request/req_quiz01_no";
		}
		
	}
	
}
