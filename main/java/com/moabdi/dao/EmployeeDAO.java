package com.moabdi.dao;

import java.util.List;

import com.moabdi.entities.Employee;

/**
 * EmployeeDAO
 * 
 * @author moabdi
 *
 */
public interface EmployeeDAO {

	/**
	 * find Employee all
	 * 
	 * @return
	 */
	public List<Employee> findAll();

	/**
	 * find Employee by id
	 * 
	 * @param id
	 * @return
	 */
	public Employee findById(long id);

	/**
	 * find Employee by email
	 * 
	 * @param email
	 * @return
	 */
	public Employee findByEmail(String email);

	/**
	 * Find by Criteria
	 * 
	 * @param id
	 * @return List<Employee>
	 */
	public List<Employee> findByCriteria(Employee emp);

	/**
	 * save Employee
	 * 
	 * @param emp
	 */
	public void save(Employee emp);

	/**
	 * update Employee
	 * 
	 * @param emp
	 */
	public void update(Employee emp);

	/**
	 * save or update Employee
	 * 
	 * @param emp
	 */
	public void saveOrUpdate(Employee emp);

	/**
	 * delete Employee
	 * 
	 * @param emp
	 */
	public void delete(Employee emp);

}