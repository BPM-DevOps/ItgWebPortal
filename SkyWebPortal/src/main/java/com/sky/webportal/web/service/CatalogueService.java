package com.sky.webportal.web.service;

import java.util.List;

import com.sky.webportal.web.model.Catalogue;


public interface CatalogueService {

	List<Catalogue> getProduct(String locId);
	List<Catalogue> getProducts () ;

}
