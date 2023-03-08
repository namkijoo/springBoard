package com.spring.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.board.dto.TestVO;

import com.spring.board.service.TestService;



@Controller
@Service
public class TestController {
	
	@Autowired
	TestService service;

	

	@RequestMapping(value="/test",method = RequestMethod.GET ,produces="text/plain;charset=UTF-8")
	public String test(TestVO TestVO,Model model) throws Exception {

		List<TestVO> list;		

		list = service.test();	

		model.addAttribute("list",list);	

		

		return "board2/home";

	}
	
	@RequestMapping(value = "/boardWrite2",method=RequestMethod.GET ,produces="text/plain;charset=UTF-8")
	public String boardWrite() throws Exception{
    	return "board2/board2";
    }
	
	@RequestMapping(value = "/boardWrite2Do",method=RequestMethod.POST, produces="text/plain;charset=UTF-8")
	public String write(TestVO testVO) throws Exception{
		service.insertBoard2(testVO);
		
		return "redirect:/test";
	}
	
	@RequestMapping(value = "/detail", method=RequestMethod.GET)
	public String getdetail(Model model,int bo_no) throws Exception{
		TestVO data = service.detail(bo_no);
		model.addAttribute("data",data);
		return "board2/detail";
	}
	
	@RequestMapping(value = "/update", method=RequestMethod.GET)
	public String getupdate(int bo_no, Model model) throws Exception{
		TestVO data = service.detail(bo_no);
		model.addAttribute("data",data);
		return "board2/update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String postupdate(TestVO testVO) throws Exception{
		service.update(testVO);
		return "redirect:/test";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(int bo_no) throws Exception{
		service.delete(bo_no);
		return "redirect:/test";
	}
}