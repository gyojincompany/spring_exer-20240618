package com.gyojincompany.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gyojincompany.board.dto.BoardDto;

@Controller
public class BoardController {
	
	@RequestMapping(value = "/write")
	public String write() {
		return "write";
	}
	
	@RequestMapping(value = "/writeOk", method = RequestMethod.GET)
	public String writeOk(@ModelAttribute("bdto") BoardDto boardDto, Model model) {
		
//		String name = request.getParameter("userName");
//		String title = request.getParameter("title");
//		String content = request.getParameter("content");
		
//		BoardDto boardDto = new BoardDto();
//		boardDto.setUserName(name);
//		boardDto.setTitle(title);
//		boardDto.setContent(content);
		
//		model.addAttribute("name", name);
//		model.addAttribute("title", title);
//		model.addAttribute("content", content);
		
//		model.addAttribute("boardDto", boardDto);
		
		return "writeOk";
	}
	
	@RequestMapping(value = "/writeOk", method = RequestMethod.POST)
	public String writeOk2() {
		
		System.out.println("post 방식 실행!!");
		
		return "";
	}
	
	@RequestMapping(value = "/keyword")
	public String keyword() {
		return "keyword";
	}
	
	@RequestMapping(value = "/keywordOk")
	public String keywordOk(HttpServletRequest request) {
		
		String keyword = request.getParameter("keyword");
		
		if(keyword.equals("abc")) {
			return "redirect:keywordGood";
			//return "keywordGood";
		} else {		
			return "redirect:keywordBad";
			//return "keywordBad";
		}
	}
	
	@RequestMapping(value = "/keywordBad")
	public String keywordBad(Model model) {
		
		model.addAttribute("keyword", "xxx");
		
		return "keywordBad";
	}
	
	@RequestMapping(value = "/keywordGood")
	public String keywordGood(Model model) {
		
		System.out.println("redirect 실행됨!!");
		
		return "keywordGood";
	}
	
	
	
	

}
