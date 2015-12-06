package com.moabdi.service;

import java.util.List;

import com.moabdi.dto.DepartmentDTO;

/**
 * DepartmentManager
 * 
 * @author moabdi
 *
 */
public interface DepartmentManager {

	/**
	 * Get all DepartmentDTOs
	 * 
	 * @return
	 */
	public List<DepartmentDTO> findAll();

	/**
	 * get DepartmentDTO by id
	 * 
	 * @param id
	 * @return
	 */
	public DepartmentDTO findById(long id);

	/**
	 * Find by Criteria
	 * 
	 * @param id
	 * @return List<DepartmentDTO>
	 */
	public List<DepartmentDTO> findByCriteria(DepartmentDTO dep);

	/**
	 * Save DepartmentDTO
	 * 
	 * @param dep
	 */
	public void save(DepartmentDTO dep);

	/**
	 * Update DepartmentDTO
	 * 
	 * @param dep
	 */
	public void update(DepartmentDTO dep);

	/**
	 * Save or update DepartmentDTO
	 * 
	 * @param dep
	 */
	public void saveOrUpdate(DepartmentDTO dep);

	/**
	 * delete DepartmentDTO
	 * 
	 * @param dep
	 */
	public void delete(DepartmentDTO dep);

}