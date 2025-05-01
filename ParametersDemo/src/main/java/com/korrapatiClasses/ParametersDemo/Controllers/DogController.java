package com.korrapatiClasses.ParametersDemo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class DogController {
	
//	@RequestMapping("display")
//	public String display (HttpServletRequest request) {
//		HttpSession session = request.getSession();
//		String dogNameIn = request.getParameter("dogName");
//		session.setAttribute("dogNameDisplay", dogNameIn);
//		return "display.html";
//	}
	
//	@RequestMapping("display")
//	public String display(@RequestParam("maskedName") String dogName, HttpSession session) {
//		session.setAttribute("dogNameDisplay", dogName);
//		return "display.html";
//  }
	
//	@RequestMapping("display")
//	public ModelAndView display(String dogName) {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("display.html");
//		mv.addObject("dogNameDisplay", dogName);
//		return mv;
//		}
	public ModelAndView display(Dog d) {
		ModelAndView mv = new ModelAndView("display.html");
		mv.addObject("dogNameDisplay", d);
		return mv;
	}
}
