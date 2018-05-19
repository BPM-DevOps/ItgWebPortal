package com.itechgenie.webportal.web.service;

import java.util.List;

import com.itechgenie.webportal.web.model.Catalogue;

public interface CatalogueService {

	List<Catalogue> getProduct(String locId);

	List<Catalogue> getProducts();

}
