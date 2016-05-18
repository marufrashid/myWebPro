package com.allClass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("web/webIndex");
	}
	
	
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView contact() {
		return new ModelAndView("web/contact");
	}
	
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public ModelAndView about() {
		return new ModelAndView("web/about");
	}
	
	
	@RequestMapping(value = "/services", method = RequestMethod.GET)
	public ModelAndView service() {
		return new ModelAndView("web/services");
	}
	
	@RequestMapping(value = "/faq", method = RequestMethod.GET)
	public ModelAndView faq() {
		return new ModelAndView("web/faq");
	}
	
	
	@RequestMapping(value = "/pricing", method = RequestMethod.GET)
	public ModelAndView pricing() {
		return new ModelAndView("web/pricing");
	}	
	
	
	@RequestMapping(value = "/404", method = RequestMethod.GET)
	public ModelAndView pageNotFound() {
		return new ModelAndView("web/404");
	}	
	
	@RequestMapping(value = "/sidebar", method = RequestMethod.GET)
	public ModelAndView sidebar() {
		return new ModelAndView("web/sidebar");
	}
	
	
	@RequestMapping(value = "/shop", method = RequestMethod.GET)
	public ModelAndView shop() {
		return new ModelAndView("web/shop");
	}


}
