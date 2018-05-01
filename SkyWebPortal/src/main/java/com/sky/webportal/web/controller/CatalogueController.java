package com.sky.webportal.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sky.webportal.web.model.Location;
import com.sky.webportal.web.service.CustomerLocationService;
/**
 * This class returns the customer location
 * @author vidhya
 * @version 1.0
 */
@Controller
public class CatalogueController {

	Logger logger = LoggerFactory.getLogger(CatalogueController.class);

	@Autowired
	CustomerLocationService customerLocationService;

	@RequestMapping(value = "/productlocation", method = RequestMethod.GET)
	public Object getLocation() {
		List<Location> locations = customerLocationService.getLocationId();
		ModelAndView model = new ModelAndView("ProductList");
		model.addObject("location", "ALL");
		model.addObject("locations", locations);
		return model;

	}

}
