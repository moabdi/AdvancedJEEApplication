package com.moabdi.service;

import java.util.List;

import com.moabdi.dto.JobDTO;

/**
 * JobManager
 * 
 * @author moabdi
 *
 */
public interface JobManager {

	/**
	 * find JobDTO all
	 * 
	 * @return
	 */
	public List<JobDTO> findAll();

	/**
	 * find JobDTO by id
	 * 
	 * @param id
	 * @return
	 */
	public JobDTO findById(long id);

	/**
	 * Find by Criteria
	 * 
	 * @param id
	 * @return List<JobDTO>
	 */
	public List<JobDTO> findByCriteria(JobDTO job);

	/**
	 * save JobDTO
	 * 
	 * @param job
	 */
	public void save(JobDTO job);

	/**
	 * update JobDTO
	 * 
	 * @param job
	 */
	public void update(JobDTO job);

	/**
	 * save or update JobDTO
	 * 
	 * @param job
	 */
	public void saveOrUpdate(JobDTO job);

	/**
	 * delete JobDTO
	 * 
	 * @param job
	 */
	public void delete(JobDTO job);

}