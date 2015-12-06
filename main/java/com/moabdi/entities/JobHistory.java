package com.moabdi.entities;

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
@Table(name = "job_history")
public class JobHistory implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private JobHistoryId id;
	private Employee employees;
	private Department departments;
	private Job jobs;

	public JobHistory() {
	}

	public JobHistory(JobHistoryId id, Employee employees,
			Department departments, Job jobs) {
		this.id = id;
		this.employees = employees;
		this.departments = departments;
		this.jobs = jobs;
	}

	public JobHistoryId getId() {
		return this.id;
	}

	public void setId(JobHistoryId id) {
		this.id = id;
	}

	public Employee getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employee employees) {
		this.employees = employees;
	}

	public Department getDepartments() {
		return this.departments;
	}

	public void setDepartments(Department departments) {
		this.departments = departments;
	}

	public Job getJobs() {
		return this.jobs;
	}

	public void setJobs(Job jobs) {
		this.jobs = jobs;
	}

}
