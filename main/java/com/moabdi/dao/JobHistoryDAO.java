package com.moabdi.dao;

import java.util.List;

import com.moabdi.entities.JobHistory;

/**
 * JobHistoryDAO
 * 
 * @author moabdi
 *
 */
public interface JobHistoryDAO {

	/**
	 * find JobHistory all
	 * 
	 * @return
	 */
	public List<JobHistory> findAll();

	/**
	 * find JobHistory by id
	 * 
	 * @param id
	 * @return
	 */
	public JobHistory findById(long id);

	/**
	 * Find by Criteria
	 * 
	 * @param id
	 * @return List<JobHistory>
	 */
	public List<JobHistory> findByCriteria(JobHistory jobHist);

	/**
	 * save JobHistory
	 * 
	 * @param jobHist
	 */
	public void save(JobHistory jobHist);

	/**
	 * update JobHistory
	 * 
	 * @param jobHist
	 */
	public void update(JobHistory jobHist);

	/**
	 * save or update JobHistory
	 * 
	 * @param jobHist
	 */
	public void saveOrUpdate(JobHistory jobHist);

	/**
	 * delete JobHistory
	 * 
	 * @param jobHist
	 */
	public void delete(JobHistory jobHist);

}