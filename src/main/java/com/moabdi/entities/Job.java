package com.moabdi.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Mostapha
 *
 */
@Entity
@Table(name = "jobs")
public class Job implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="job_id")
	private String jobId;
	
	@Column(name="job_title")
	private String jobTitle;
	
	@Column(name="min_salary")
	private Integer minSalary;

	@Column(name="max_salary")
	private Integer maxSalary;
	
	@OneToMany(targetEntity=Employee.class, mappedBy="employeeId")
	private Set employees = new HashSet(0);
	
//	@OneToMany(targetEntity=JobHistory.class, mappedBy="job_history")
//	private Set jobHistories = new HashSet(0);

	public Job() {
	}

	public Job(String jobId, String jobTitle) {
		this.jobId = jobId;
		this.jobTitle = jobTitle;
	}

	public Job(String jobId, String jobTitle, Integer minSalary, Integer maxSalary, Set employeeses) {
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.employees = employeeses;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getMinSalary() {
		return this.minSalary;
	}

	public void setMinSalary(Integer minSalary) {
		this.minSalary = minSalary;
	}

	public Integer getMaxSalary() {
		return this.maxSalary;
	}

	public void setMaxSalary(Integer maxSalary) {
		this.maxSalary = maxSalary;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

//	public Set getJobHistories() {
//		return this.jobHistories;
//	}
//
//	public void setJobHistories(Set jobHistories) {
//		this.jobHistories = jobHistories;
//	}

}
