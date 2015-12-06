package com.moabdi.dao;

import java.util.List;

import com.moabdi.entities.Job;

/**
 * JobDAO
 * 
 * @author moabdi
 *
 */
public interface JobDAO {

	/**
	 * find Job all
	 * 
	 * @return
	 */
	public List<Job> findAll();

	/**
	 * find Job by id
	 * 
	 * @param id
	 * @return
	 */
	public Job findById(long id);

	/**
	 * Find by Criteria
	 * 
	 * @param id
	 * @return List<Job>
	 */
	public List<Job> findByCriteria(Job job);

	/**
	 * save Job
	 * 
	 * @param job
	 */
	public void save(Job job);

	/**
	 * update Job
	 * 
	 * @param job
	 */
	public void update(Job job);

	/**
	 * save or update Job
	 * 
	 * @param job
	 */
	public void saveOrUpdate(Job job);

	/**
	 * delete Job
	 * 
	 * @param job
	 */
	public void delete(Job job);

}