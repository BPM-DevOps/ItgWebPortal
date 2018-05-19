package com.itechgenie.webportal.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itechgenie.webportal.web.model.Location;
import com.itechgenie.webportal.web.service.CustomerLocationService;

@Controller
public class WelcomeController {

	@Autowired
	CustomerLocationService customerLocationService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showWelcomePage(ModelMap model) {
		List<Location> locations = customerLocationService.getLocationId();
		System.out.println(locations);
		model.put("locations", locations);
		model.put("name", getLoggedinUserName());
		return "welcome";

	}

	private String getLoggedinUserName() {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}
		return principal.toString();
	}
}
