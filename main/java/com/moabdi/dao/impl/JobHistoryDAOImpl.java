package com.moabdi.dao.impl;

// default package
// Generated 2 d�c. 2015 13:56:01 by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.moabdi.dao.JobHistoryDAO;
import com.moabdi.entities.JobHistory;

/**
 * JobHistoryDAO implementation.
 * 
 * @see .JobHistory
 * @author moabdi
 */
@Repository
@Transactional
public class JobHistoryDAOImpl implements JobHistoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.JobHistoryDAO#getAll()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<JobHistory> findAll() {
		return getSession().createQuery("from JobHistory").list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.JobHistoryDAO#getById(long)
	 */
	@Override
	public JobHistory findById(long id) {
		return (JobHistory) getSession().load(JobHistory.class, id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.moabdi.dao.JobHistoryDAO#findByCriteria(com.moabdi.model.JobHistory)
	 */
	@Override
	public List<JobHistory> findByCriteria(JobHistory jobHist) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.JobHistoryDAO#save(com.moabdi.model.JobHistory)
	 */
	@Override
	public void save(JobHistory jobHistory) {
		getSession().save(jobHistory);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.JobHistoryDAO#update(com.moabdi.model.JobHistory)
	 */
	@Override
	public void update(JobHistory jobHistory) {
		getSession().update(jobHistory);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.moabdi.dao.JobHistoryDAO#saveOrUpdate(com.moabdi.model.JobHistory)
	 */
	@Override
	public void saveOrUpdate(JobHistory jobHist) {
		getSession().saveOrUpdate(jobHist);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.JobHistoryDAO#delete(com.moabdi.model.JobHistory)
	 */
	@Override
	public void delete(JobHistory jobHistory) {
		getSession().delete(jobHistory);
		return;
	}

}
