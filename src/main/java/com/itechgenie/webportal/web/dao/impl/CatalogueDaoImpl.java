package com.itechgenie.webportal.web.dao.impl;

import java.util.Collections;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.itechgenie.webportal.web.dao.CatalogueDao;
import com.itechgenie.webportal.web.model.Catalogue;
import com.itechgenie.webportal.web.utils.CatalogueComparator;

@Service
public class CatalogueDaoImpl extends HibernateDaoSupport implements
		CatalogueDao {

	@Autowired
	public void setMySessionFactory(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}

	@SuppressWarnings("unchecked")
	public List<Catalogue> getProduct(String locId) {
		return (List<Catalogue>) getHibernateTemplate().findByNamedParam(
				"from Catalogue where locId = :locId or category='News'",
				"locId", locId);
	}

	@Override
	public List<Catalogue> getProducts() {
		List<Catalogue> cats = (List<Catalogue>) getHibernateTemplate()
				.loadAll(Catalogue.class);
		Collections.sort(cats, new CatalogueComparator());
		return cats;
	}

}
