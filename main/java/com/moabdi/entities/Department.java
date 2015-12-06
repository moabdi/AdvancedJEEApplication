package com.moabdi.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Mostapha
 *
 */
 @Entity
 @Table(name = "departments")
public class Department implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int departmentId;
	private Employee employees;
	private Location locations;
	private String departmentName;

	private Set employeeses = new HashSet(0);
	private Set jobHistories = new HashSet(0);

	public Department() {
	}

	public Department(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public Department(int departmentId, Employee employees, Location locations, String departmentName, Set employeeses,
			Set jobHistories) {
		this.departmentId = departmentId;
		this.employees = employees;
		this.locations = locations;
		this.departmentName = departmentName;
		this.employeeses = employeeses;
		this.jobHistories = jobHistories;
	}

	public int getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public Employee getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employee employees) {
		this.employees = employees;
	}

	public Location getLocations() {
		return this.locations;
	}

	public void setLocations(Location locations) {
		this.locations = locations;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set getEmployeeses() {
		return this.employeeses;
	}

	public void setEmployeeses(Set employeeses) {
		this.employeeses = employeeses;
	}

	public Set getJobHistories() {
		return this.jobHistories;
	}

	public void setJobHistories(Set jobHistories) {
		this.jobHistories = jobHistories;
	}

}
