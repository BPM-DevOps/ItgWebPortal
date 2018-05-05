package com.sky.webportal.web.dao;

import java.util.List;

import com.sky.webportal.web.model.Catalogue;

public interface CatalogueDao {

	public List<Catalogue> getProduct(String locId);
	public List<Catalogue> getProducts() ;
		

}
