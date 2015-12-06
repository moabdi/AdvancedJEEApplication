package com.moabdi.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Mostapha
 *
 */
public class JobDTO implements java.io.Serializable {

	private String jobId;
	private String jobTitle;
	private Integer minSalary;
	private Integer maxSalary;
	private Set employeeses = new HashSet(0);
	private Set jobHistories = new HashSet(0);

	public JobDTO() {
	}

	/**
	 * @return the jobId
	 */
	public String getJobId() {
		return jobId;
	}

	/**
	 * @param jobId
	 *            the jobId to set
	 */
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle
	 *            the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @return the minSalary
	 */
	public Integer getMinSalary() {
		return minSalary;
	}

	/**
	 * @param minSalary
	 *            the minSalary to set
	 */
	public void setMinSalary(Integer minSalary) {
		this.minSalary = minSalary;
	}

	/**
	 * @return the maxSalary
	 */
	public Integer getMaxSalary() {
		return maxSalary;
	}

	/**
	 * @param maxSalary
	 *            the maxSalary to set
	 */
	public void setMaxSalary(Integer maxSalary) {
		this.maxSalary = maxSalary;
	}

	/**
	 * @return the employeeses
	 */
	public Set getEmployeeses() {
		return employeeses;
	}

	/**
	 * @param employeeses
	 *            the employeeses to set
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
	 * @param jobHistories
	 *            the jobHistories to set
	 */
	public void setJobHistories(Set jobHistories) {
		this.jobHistories = jobHistories;
	}

}
