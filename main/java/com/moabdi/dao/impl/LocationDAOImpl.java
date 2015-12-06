package com.moabdi.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.moabdi.dao.LocationDAO;
import com.moabdi.entities.Location;

/**
 * LocationDAO implementation.
 * 
 * @see .Locations
 * @author moabdi
 */
@Repository
@Transactional
public class LocationDAOImpl implements LocationDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.LocationDAO#getAll()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Location> findAll() {
		return getSession().createQuery("from Location").list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.LocationDAO#getById(long)
	 */
	@Override
	public Location findById(long id) {
		return (Location) getSession().load(Location.class, id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.LocationDAO#findByCriteria(com.moabdi.model.Location)
	 */
	@Override
	public List<Location> findByCriteria(Location locat) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.LocationDAO#save(com.moabdi.model.Location)
	 */
	@Override
	public void save(Location location) {
		getSession().save(location);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.LocationDAO#delete(com.moabdi.model.Location)
	 */
	@Override
	public void delete(Location location) {
		getSession().delete(location);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.LocationDAO#update(com.moabdi.model.Location)
	 */
	@Override
	public void update(Location location) {
		getSession().update(location);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.LocationDAO#saveOrUpdate(com.moabdi.model.Location)
	 */
	@Override
	public void saveOrUpdate(Location locat) {
		getSession().saveOrUpdate(locat);
		return;
	}
}
