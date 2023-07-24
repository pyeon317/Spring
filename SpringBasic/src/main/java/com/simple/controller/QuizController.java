package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.QuizVO;

@Controller
@RequestMapping("quiz")//각 메서드의 공통 분모
public class QuizController {

	@RequestMapping("/quiz01")
	public void quiz01() {}
	
	@RequestMapping("/birthday")
	public String birthday(@RequestParam("year") String year,
							@RequestParam("month") String month,
							@RequestParam("day") String day,
							Model model) {
		model.addAttribute("year", year);
		model.addAttribute("month", month);
		model.addAttribute("day", day);
		
		return "quiz/quiz01_ok";
	}
	
	@RequestMapping("/quiz02")
	public void quiz02() {}
	
	@RequestMapping(value = "/join", method=RequestMethod.POST)
	public String join(com.simple.command.QuizVO vo) {
		System.out.println(vo);
		
		return "/quiz/quiz02_ok";
	}
	
	
}
