package com.ssi.cinema.controler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CinemaManagementController {
	
	@RequestMapping(value = "/manageCinema", method = RequestMethod.GET)
	public ModelAndView showCinemaManagement(HttpServletRequest request) {
		request.setAttribute("content", "manageCinema");
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
	}
}
