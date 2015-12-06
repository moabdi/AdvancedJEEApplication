package com.moabdi.dao.impl;

// default package
// Generated 2 d�c. 2015 13:56:01 by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.moabdi.dao.JobDAO;
import com.moabdi.entities.Job;

/**
 * JobDAO implementation.
 * 
 * @see .Jobs
 * @author moabdi
 */
@Repository
@Transactional
public class JobDAOImpl implements JobDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.JobDAO#getAll()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Job> findAll() {
		return getSession().createQuery("from Job").list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.JobDAO#getById(long)
	 */
	@Override
	public Job findById(long id) {
		return (Job) getSession().load(Job.class, id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.JobDAO#findByCriteria(com.moabdi.model.Job)
	 */
	@Override
	public List<Job> findByCriteria(Job job) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.JobDAO#save(com.moabdi.model.Job)
	 */
	@Override
	public void save(Job job) {
		getSession().save(job);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.JobDAO#delete(com.moabdi.model.Job)
	 */
	@Override
	public void delete(Job job) {
		getSession().delete(job);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.JobDAO#update(com.moabdi.model.Job)
	 */
	@Override
	public void update(Job job) {
		getSession().update(job);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.JobDAO#saveOrUpdate(com.moabdi.model.Job)
	 */
	@Override
	public void saveOrUpdate(Job job) {
		getSession().saveOrUpdate(job);
		return;
	}

}
