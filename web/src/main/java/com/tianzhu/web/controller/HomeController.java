package com.tianzhu.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "home")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "thymeleaf", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		logger.debug("Welcome home! The client locale is {}.", locale);
		logger.trace("Welcome home! The client locale is {}.", locale);
		logger.warn("Welcome home! The client locale is {}.", locale);
		logger.error("Welcome home! The client locale is {}.", locale);
		
				
		Date date = new Date();
		//DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		//String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", date );
		
		return "home/home";
	}
	
	@RequestMapping(value = "jsp", method = RequestMethod.GET)
	public String homejsp(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		logger.debug("Welcome home! The client locale is {}.", locale);
		logger.trace("Welcome home! The client locale is {}.", locale);
		logger.warn("Welcome home! The client locale is {}.", locale);
		logger.error("Welcome home! The client locale is {}.", locale);
				
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		//ModelAndView modelandview = new ModelAndView(new InternalResourceView("/WEB-INF/jsps/homejsp.jsp"));
		//modelAndView.addObject("serverTime", formattedDate);
		//modelandview.addObject("serverTime", formattedDate);
		return "home/homejsp.jsp";
		
	}
	
	
	@RequestMapping(value = "freemarker", method = RequestMethod.GET)
	public String homefree(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		logger.debug("Welcome home! The client locale is {}.", locale);
		logger.trace("Welcome home! The client locale is {}.", locale);
		logger.warn("Welcome home! The client locale is {}.", locale);
		logger.error("Welcome home! The client locale is {}.", locale);
				
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		//ModelAndView modelandview = new ModelAndView(new InternalResourceView("/WEB-INF/jsps/homejsp.jsp"));
		//modelAndView.addObject("serverTime", formattedDate);
		//modelandview.addObject("serverTime", formattedDate);
		return "home/homefree.ftl";
		
	}
	
}
