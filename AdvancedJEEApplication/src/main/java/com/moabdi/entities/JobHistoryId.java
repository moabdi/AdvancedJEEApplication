package com.moabdi.entities;

import java.util.Date;

/**
 * 
 * @author Mostapha
 *
 */
public class JobHistoryId implements java.io.Serializable {

	private int employeeId;
	private Date startDate;
	private Date endDate;
	private String jobId;
	private int departmentId;

	public JobHistoryId() {
	}

	public JobHistoryId(int employeeId, Date startDate, Date endDate,
			String jobId, int departmentId) {
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.jobId = jobId;
		this.departmentId = departmentId;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public int getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof JobHistoryId))
			return false;
		JobHistoryId castOther = (JobHistoryId) other;

		return (this.getEmployeeId() == castOther.getEmployeeId())
				&& ((this.getStartDate() == castOther.getStartDate()) || (this
						.getStartDate() != null
						&& castOther.getStartDate() != null && this
						.getStartDate().equals(castOther.getStartDate())))
				&& ((this.getEndDate() == castOther.getEndDate()) || (this
						.getEndDate() != null && castOther.getEndDate() != null && this
						.getEndDate().equals(castOther.getEndDate())))
				&& ((this.getJobId() == castOther.getJobId()) || (this
						.getJobId() != null && castOther.getJobId() != null && this
						.getJobId().equals(castOther.getJobId())))
				&& (this.getDepartmentId() == castOther.getDepartmentId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEmployeeId();
		result = 37 * result
				+ (getStartDate() == null ? 0 : this.getStartDate().hashCode());
		result = 37 * result
				+ (getEndDate() == null ? 0 : this.getEndDate().hashCode());
		result = 37 * result
				+ (getJobId() == null ? 0 : this.getJobId().hashCode());
		result = 37 * result + this.getDepartmentId();
		return result;
	}

}
