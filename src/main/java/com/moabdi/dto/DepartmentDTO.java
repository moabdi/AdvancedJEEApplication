package com.moabdi.dto;

import java.util.HashSet;
import java.util.Set;

import com.moabdi.dao.EmployeeDAO;

/**
 * 
 * @author Mostapha
 *
 */
public class DepartmentDTO implements java.io.Serializable {

	private int departmentId;
	private String departmentName;
	private Set employeeses = new HashSet(0);
	private Set jobHistories = new HashSet(0);

	public DepartmentDTO() {
	}

	/**
	 * @return the departmentId
	 */
	public int getDepartmentId() {
		return departmentId;
	}

	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return the employeeses
	 */
	public Set getEmployeeses() {
		return employeeses;
	}

	/**
	 * @param employeeses the employeeses to set
	 */
	public void setEmployeeses(Set employeeses) {
		this.employeeses = employeeses;
	}

	/**
	 * @return the jobHistories
	 */
	public Set getJobHistories() {
		return jobHistories;
	}

	/**
	 * @param jobHistories the jobHistories to set
	 */
	public void setJobHistories(Set jobHistories) {
		this.jobHistories = jobHistories;
	}

}
