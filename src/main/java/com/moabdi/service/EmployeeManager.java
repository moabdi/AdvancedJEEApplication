package com.moabdi.service;

import java.util.List;

import com.moabdi.dto.EmployeeDTO;

/**
 * EmployeeDAO
 * 
 * @author moabdi
 *
 */
public interface EmployeeManager {

	/**
	 * find EmployeeDTO all
	 * 
	 * @return
	 */
	public List<EmployeeDTO> findAll();

	/**
	 * find EmployeeDTO by id
	 * 
	 * @param id
	 * @return
	 */
	public EmployeeDTO findById(long id);

	/**
	 * find EmployeeDTO by email
	 * 
	 * @param email
	 * @return
	 */
	public EmployeeDTO findByEmail(String email);

	/**
	 * Find by Criteria
	 * 
	 * @param id
	 * @return List<EmployeeDTO>
	 */
	public List<EmployeeDTO> findByCriteria(EmployeeDTO emp);

	/**
	 * save EmployeeDTO
	 * 
	 * @param emp
	 */
	public void save(EmployeeDTO emp);

	/**
	 * update EmployeeDTO
	 * 
	 * @param emp
	 */
	public void update(EmployeeDTO emp);

	/**
	 * save or update EmployeeDTO
	 * 
	 * @param emp
	 */
	public void saveOrUpdate(EmployeeDTO emp);

	/**
	 * delete EmployeeDTO
	 * 
	 * @param emp
	 */
	public void delete(EmployeeDTO emp);

}