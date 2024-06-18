package com.gyojincompany.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyojincompany.board.dto.BoardDto;

@Controller
public class BoardController {
	
	@RequestMapping(value = "/write")
	public String write() {
		return "write";
	}
	
	@RequestMapping(value = "/writeOk")
	public String writeOk(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("userName");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		BoardDto boardDto = new BoardDto();
		boardDto.setUserName(name);
		boardDto.setTitle(title);
		boardDto.setContent(content);
		
//		model.addAttribute("name", name);
//		model.addAttribute("title", title);
//		model.addAttribute("content", content);
		
		model.addAttribute("boardDto", boardDto);
		
		return "writeOk";
	}

}
