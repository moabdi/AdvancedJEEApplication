package com.moabdi.dao;

import java.util.List;

import com.moabdi.entities.Department;

/**
 * DepartmentDAO
 * 
 * @author moabdi
 *
 */
public interface DepartmentDAO {

	/**
	 * Get all Departments
	 * 
	 * @return
	 */
	public List<Department> findAll();

	/**
	 * get Department by id
	 * 
	 * @param id
	 * @return
	 */
	public Department findById(long id);

	/**
	 * Find by Criteria
	 * 
	 * @param id
	 * @return List<Department>
	 */
	public List<Department> findByCriteria(Department dep);

	/**
	 * Save Department
	 * 
	 * @param dep
	 */
	public void save(Department dep);

	/**
	 * Update Department
	 * 
	 * @param dep
	 */
	public void update(Department dep);

	/**
	 * Save or update Department
	 * 
	 * @param dep
	 */
	public void saveOrUpdate(Department dep);

	/**
	 * delete Department
	 * 
	 * @param dep
	 */
	public void delete(Department dep);

}