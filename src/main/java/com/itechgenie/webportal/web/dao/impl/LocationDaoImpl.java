package com.itechgenie.webportal.web.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.itechgenie.webportal.web.dao.LocationDao;
import com.itechgenie.webportal.web.model.Location;

@Service
public class LocationDaoImpl extends HibernateDaoSupport implements LocationDao {

	@Autowired
	public void setMySessionFactory(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}

	@Override
	public List<Location> getLocation() {
		List<Location> cats = (List<Location>) getHibernateTemplate().loadAll(
				Location.class);
		return cats;
	}

}
