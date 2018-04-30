package com.sky.webportal.web;

import java.util.Comparator;

import com.sky.webportal.web.model.Catalogue;

public class CatalogueComparator implements Comparator<Catalogue> {

	@Override
	public int compare(Catalogue o1, Catalogue o2) {
		return o1.getLocId().compareTo(o2.getLocId()) ;
	}

}
