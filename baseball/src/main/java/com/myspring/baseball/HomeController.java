package com.myspring.baseball;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("name", "홍길동");
		
		return "home";
	}
	
	@RequestMapping(value="/main.do", method= {RequestMethod.GET,RequestMethod.POST})
	public String main() {
				
		return "main";
	}

}
