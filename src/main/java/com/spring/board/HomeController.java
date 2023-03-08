package com.spring.board;



import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {
	
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@RequestMapping(value = "/home",produces="text/plain;charset=UTF-8")
	public String home(Locale locale,Model model) {
		logger.debug("====home 화면====");
		return "board2/home";
	}
	
}
