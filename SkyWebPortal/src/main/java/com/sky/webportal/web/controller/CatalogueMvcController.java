package com.sky.webportal.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sky.webportal.web.model.Catalogue;
import com.sky.webportal.web.model.Location;
import com.sky.webportal.web.service.CatalogueService;
import com.sky.webportal.web.service.CustomerLocationService;
 

@Controller
@RequestMapping("/products")
public class CatalogueMvcController {

	@Autowired
	CatalogueService catalogueService;
	
	

	@RequestMapping(value = "/allproductlist", method = RequestMethod.GET)
	public Object getProduct() {
		List<Catalogue> catalogues = catalogueService.getProducts() ;
		System.out.println(catalogues);
		 ModelAndView model = new ModelAndView("AllProductList");
		 model.addObject("location", "ALL");
		 model.addObject("catalogues", catalogues);
		 return model;

	}
	
	
	
	@RequestMapping(value = "/{locId}", method = RequestMethod.GET)
	public Object getProducts(@PathVariable("locId") String locId) {
		List<Catalogue> catalogues = catalogueService.getProduct(locId) ;
		System.out.println(catalogues);
		 ModelAndView model = new ModelAndView("ProductList");
		 model.addObject("location", locId);
		 model.addObject("catalogues", catalogues);
		 return model;

	}
	
	
}
