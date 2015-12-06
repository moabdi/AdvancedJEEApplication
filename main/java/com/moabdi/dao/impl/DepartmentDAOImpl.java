package com.moabdi.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.moabdi.dao.DepartmentDAO;
import com.moabdi.entities.Department;

/**
 * DepartmentDAO implementation.
 * 
 * @see .Departments
 * @author moabdi
 */
@Repository
@Transactional
public class DepartmentDAOImpl implements DepartmentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.DepartmentDAO#getAll()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Department> findAll() {
		return getSession().createQuery("from Department").list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.DepartmentDAO#getById(long)
	 */
	@Override
	public Department findById(long id) {
		return (Department) getSession().load(Department.class, id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.DepartmentDAO#findByCriteria(com.moabdi.model.Department)
	 */
	@Override
	public List<Department> findByCriteria(Department dep) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.DepartmentDAO#save(com.moabdi.model.Department)
	 */
	@Override
	public void save(Department dep) {
		getSession().save(dep);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.DepartmentDAO#saveOrUpdate(com.moabdi.model.Countrie)
	 */ @Override
	public void saveOrUpdate(Department dep) {
		getSession().saveOrUpdate(dep);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.DepartmentDAO#delete(com.moabdi.model.Department)
	 */
	@Override
	public void delete(Department dep) {
		getSession().delete(dep);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.dao.DepartmentDAO#update(com.moabdi.model.Department)
	 */
	@Override
	public void update(Department dep) {
		getSession().update(dep);
		return;
	}
}
