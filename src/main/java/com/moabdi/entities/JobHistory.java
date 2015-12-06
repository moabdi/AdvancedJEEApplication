package com.moabdi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 
 * @author Mostapha
 *
 */
//@Entity
//@Table(name = "job_history")
public class JobHistory implements java.io.Serializable {

    @ManyToOne
    @JoinColumn(name="employee_id", nullable=false)
	private Employee employee;
    
    @ManyToOne
    @JoinColumn(name="department_id", nullable=false)
	private Department department;
    
    @ManyToOne
    @JoinColumn(name="job_id", nullable=false)
	private Job job;

	@Column(name="start_date")
	private Date startDate;

	@Column(name="end_date")
	private Date endDate;
	
	public JobHistory() {
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job jobs) {
		this.job = jobs;
	}

}
