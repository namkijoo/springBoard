package com.spring.board;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.board.service.TestService;

@Controller
public class loginCheck {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	TestService service;
	
	@RequestMapping(value = "/loginCheck",method=RequestMethod.GET,produces="text/plain;charset=UTF-8")
	public String logidnCheck(HttpServletRequest request,HttpServletResponse response) {
		logger.debug("=================loginCheck");
		
		if("admin".equals(request.getParameter("id"))&&"welcome1".equals(request.getParameter("pwd"))) {
			
			Map<String, String> map= new HashMap<String,String>();
			map.put("admin_id","admin");
			map.put("admin_name","administrator");
			request.getSession().setAttribute("logininfo", map);
			return "redirect:/test";
		}
		else {
			return "redirect:/";
		}
		
			
		
	}
}
