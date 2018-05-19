package com.itechgenie.webportal.web.dao;

import java.util.List;

import com.itechgenie.webportal.web.model.Catalogue;

public interface CatalogueDao {

	public List<Catalogue> getProduct(String locId);
	public List<Catalogue> getProducts() ;
		

}
