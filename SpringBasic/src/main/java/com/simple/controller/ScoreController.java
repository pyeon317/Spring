package com.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simple.command.ScoreVO;
import com.simple.service.ScoreService;
import com.simple.service.ScoreServiceImpl;

@Controller
@RequestMapping("/service")
public class ScoreController {

	//1st 멤버변수로 선언
	//ScoreService service =new ScoreServiceImpl();
	
	//2nd - 직접 빈등록 자동주입
//	@Autowired
//	ScoreService service;
	
	//3rd
	@Autowired
	ScoreService service;
	
	//화면처리
	@RequestMapping("/scoreRegist")
	public String regist() {
		return "service/scoreRegist";
	}
	
	//목록화면
	@RequestMapping("/scoreList")
	public String list() {
		return "service/scoreList";
	}
	
	//결과화면
	@RequestMapping("/scoreResult")
	public String result() {
		return "service/scoreResult";
	}
	
	//등록요청
	@RequestMapping(value = "/scoreForm", method=RequestMethod.POST)
	public String scoreForm(ScoreVO vo) {

		
		service.scoreRegist(vo);
		
		return "";
	}
}
