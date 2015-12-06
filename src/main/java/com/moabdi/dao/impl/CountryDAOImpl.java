package com.moabdi.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.moabdi.dao.CountryDAO;
import com.moabdi.entities.Country;

/**
 * CountrieDAO implementation.
 * 
 * @see .Countries
 * @author moabdi
 */
@Repository
@Transactional
public class CountryDAOImpl implements CountryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.CountrieDAO#getAll()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Country> findAll() {
		return getSession().createQuery("from Countrie").list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.CountrieDAO#getById(long)
	 */
	@Override
	public Country findById(long id) {
		return (Country) getSession().load(Country.class, id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.CountrieDAO#findByCriteria(com.moabdi.model.Countrie)
	 */
	@Override
	public List<Country> findByCriteria(Country country) {
		return null;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.CountrieDAO#save(com.moabdi.model.Countrie)
	 */
	@Override
	public void save(Country country) {
		getSession().save(country);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.CountrieDAO#update(com.moabdi.model.Countrie)
	 */
	@Override
	public void update(Country country) {
		getSession().update(country);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.CountrieDAO#saveOrUpdate(com.moabdi.model.Countrie)
	 */ @Override
	public void saveOrUpdate(Country country) {
		getSession().saveOrUpdate(country);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.CountrieDAO#delete(com.moabdi.model.Countrie)
	 */
	@Override
	public void delete(Country country) {
		getSession().delete(country);
		return;
	}

}
