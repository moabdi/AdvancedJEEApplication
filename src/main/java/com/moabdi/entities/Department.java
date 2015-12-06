package com.moabdi.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@Column(name="department_id")
	private int departmentId;
	
	@ManyToOne
	@JoinColumn(name="manager_id", nullable=false)
	private Employee employee;
	
    @ManyToOne
    @JoinColumn(name="location_id", nullable=false)
	private Location location;
    
    @Column(name="department_name")
	private String departmentName;

	@OneToMany(targetEntity=Employee.class, mappedBy="employeeId")
	private Set employees = new HashSet(0);
	
//	@OneToMany(targetEntity = JobHistory.class, mappedBy = "job_history")
//	private Set jobHistories = new HashSet(0);

	public Department() {
		
	}

	public Department(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
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
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
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
	 * @return the employees
	 */
	public Set getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(Set employees) {
		this.employees = employees;
	}
	/**
	 * @return the jobHistories
	 */
//	public Set getJobHistories() {
//		return jobHistories;
//	}

	/**
	 * @param jobHistories the jobHistories to set
	 */
//	public void setJobHistories(Set jobHistories) {
//		this.jobHistories = jobHistories;
//	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
