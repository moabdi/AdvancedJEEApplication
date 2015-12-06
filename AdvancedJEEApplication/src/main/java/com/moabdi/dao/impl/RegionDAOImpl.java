package com.moabdi.dao.impl;

// default package
// Generated 2 d�c. 2015 13:56:01 by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.moabdi.dao.RegionDAO;
import com.moabdi.entities.Region;

/**
 * RegionDAO implementation.
 * 
 * @see .Regions
 * @author moabdi
 */
@Repository
@Transactional
public class RegionDAOImpl implements RegionDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.RegionDAO#getAll()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Region> findAll() {
		return getSession().createQuery("from Region").list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.RegionDAO#getById(long)
	 */
	@Override
	public Region findById(long id) {
		return (Region) getSession().load(Region.class, id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.RegionDAO#findByCriteria(com.moabdi.model.Region)
	 */
	@Override
	public List<Region> findByCriteria(Region reg) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.RegionDAO#save(com.moabdi.model.Region)
	 */
	@Override
	public void save(Region region) {
		getSession().save(region);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.RegionDAO#delete(com.moabdi.model.Region)
	 */
	@Override
	public void delete(Region region) {
		getSession().delete(region);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.RegionDAO#update(com.moabdi.model.Region)
	 */
	@Override
	public void update(Region region) {
		getSession().update(region);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.RegionDAO#saveOrUpdate(com.moabdi.model.Region)
	 */
	@Override
	public void saveOrUpdate(Region region) {
		getSession().saveOrUpdate(region);
		return;
	}
}
