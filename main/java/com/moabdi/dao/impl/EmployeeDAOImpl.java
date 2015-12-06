package com.moabdi.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.moabdi.dao.EmployeeDAO;
import com.moabdi.entities.Employee;

/**
 * EmployeeDAO implementation.
 * 
 * @see .Employees
 * @author moabdi
 */
@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.EmployeeDAO#getAll()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Employee> findAll() {
		return getSession().createQuery("from Employee").list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.EmployeeDAO#getByEmail(java.lang.String)
	 */
	@Override
	public Employee findByEmail(String email) {
		return (Employee) getSession().createQuery("from Employee where email = :email").setParameter("email", email)
				.uniqueResult();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.EmployeeDAO#getById(long)
	 */
	@Override
	public Employee findById(long id) {
		return (Employee) getSession().load(Employee.class, id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.EmployeeDAO#findByCriteria(com.moabdi.model.Employee)
	 */
	@Override
	public List<Employee> findByCriteria(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.EmployeeDAO#save(com.moabdi.model.Employee)
	 */
	@Override
	public void save(Employee emp) {
		getSession().save(emp);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.EmployeeDAO#delete(com.moabdi.model.Employee)
	 */
	@Override
	public void delete(Employee emp) {
		getSession().delete(emp);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.EmployeeDAO#update(com.moabdi.model.Employee)
	 */
	@Override
	public void update(Employee emp) {
		getSession().update(emp);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.EmployeeDAO#saveOrUpdate(com.moabdi.model.Employee)
	 */
	@Override
	public void saveOrUpdate(Employee emp) {
		getSession().saveOrUpdate(emp);
		return;

	}
}
