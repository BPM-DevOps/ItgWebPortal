package com.sky.webportal.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.webportal.web.dao.LocationDao;
import com.sky.webportal.web.model.Location;
import com.sky.webportal.web.service.CustomerLocationService;

@Service("customerLocationService")
public class CustomerLocationServiceImpl implements CustomerLocationService{
	
	@Autowired
	LocationDao locationDao;
	
	public List<Location> getLocationId() {
		return locationDao.getLocation();

	}

}
