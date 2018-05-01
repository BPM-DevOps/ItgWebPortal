package com.sky.webportal.web.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

	Logger logger = LoggerFactory.getLogger(CatalogueMvcController.class);
	
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
	
	@RequestMapping(value = "/user/choice", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public Object saveUserChoice(HttpServletRequest request) {

		Map<String, String[]> parameterMap = request.getParameterMap();
		logger.info("parameterMap: " + parameterMap);
		String values[] = parameterMap.get("userOptions");

		List<String> selectedProducts = Arrays.asList(values);

		logger.info("ValuesL " + values);
		logger.info("selectedProducts " + selectedProducts);

		for (String val : values) {
			logger.info("ValuesL " + val);
		}

		List<Catalogue> catalogues = catalogueService.getProducts();
		logger.info("Catalogues: " + catalogues);

		List<Catalogue> finalCatalogues = new ArrayList<Catalogue>();

		for (Catalogue cats : catalogues) {
			logger.info("Checking cat" + cats);
			if (selectedProducts.contains(String.valueOf(cats.getProductId()))) {
				logger.info("Found product " + cats);
				finalCatalogues.add(cats);
			}
		}
		
		logger.info("finalCatalogues: " + finalCatalogues);

		ModelAndView model = new ModelAndView("UserChoice");
		model.addObject("catalogues", finalCatalogues);
		return model;

	}

	@RequestMapping(value = "/user/order", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public Object orderUserChoice(HttpServletRequest request) {
		Map<String, String[]> parameterMap = request.getParameterMap();

		String values[] = parameterMap.get("userOptions");

		List<String> selectedProducts = Arrays.asList(values);
		
		logger.info("selectedProducts: " + selectedProducts);
		
		List<Catalogue> catalogues = catalogueService.getProducts();
		logger.info("Catalogues: " + catalogues);

		List<Catalogue> finalCatalogues = new ArrayList<Catalogue>();

		for (Catalogue cats : catalogues) {
			logger.info("Checking cat" + cats);
			if (selectedProducts.contains(String.valueOf(cats.getProductId()))) {
				logger.info("Found product " + cats);
				finalCatalogues.add(cats);
			}
		}
		
		logger.info("finalCatalogues: " + finalCatalogues);

		ModelAndView model = new ModelAndView("ConfirmOrder");
		model.addObject("catalogues", finalCatalogues);
		return model;
	}
}
