package com.sky.webportal.web;

import java.util.Comparator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sky.webportal.web.model.Catalogue;

public class CatalogueComparator implements Comparator<Catalogue> {
	Logger logger = LoggerFactory.getLogger(CatalogueComparator.class);
	@Override
	public int compare(Catalogue o1, Catalogue o2) {
		Integer catInt1=new Integer(o1.getProductId());
		Integer catInt2=new Integer(o2.getProductId());
		logger.info("compared value is "+catInt1.compareTo(catInt2));
		return catInt1.compareTo(catInt2) ;
	}

}
