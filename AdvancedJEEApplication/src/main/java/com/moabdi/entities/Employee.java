package com.moabdi.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private int employeeId;
	// private Employee employees;
	// private Department departments;
	// private Job jobs;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private String email;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "hire_date")
	private Date hireDate;
	private BigDecimal salary;
	@Column(name = "commission_pct")
	private BigDecimal commissionPct;
	// private Set departmentses = new HashSet(0);
	// private Set jobHistories = new HashSet(0);
	// private Set employeeses = new HashSet(0);

	public Employee() {
	}

	public Employee(int employeeId, Job jobs, String lastName, String email, Date hireDate, BigDecimal salary) {
		this.employeeId = employeeId;
		// this.jobs = jobs;
		this.lastName = lastName;
		this.email = email;
		this.hireDate = hireDate;
		this.salary = salary;
	}

	public Employee(int employeeId, Employee employees, Department departments, Job jobs, String firstName,
			String lastName, String email, String phoneNumber, Date hireDate, BigDecimal salary,
			BigDecimal commissionPct, Set departmentses, Set jobHistories, Set employeeses) {
		this.employeeId = employeeId;
		// this.employees = employees;
		// this.departments = departments;
		// this.jobs = jobs;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.salary = salary;
		this.commissionPct = commissionPct;
		// this.departmentses = departmentses;
		// this.jobHistories = jobHistories;
		// this.employeeses = employeeses;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/*
	 * public Employee getEmployees() { return this.employees; }
	 * 
	 * public void setEmployees(Employee employees) { this.employees =
	 * employees; }
	 * 
	 * public Department getDepartments() { return this.departments; }
	 * 
	 * public void setDepartments(Department departments) { this.departments =
	 * departments; }
	 * 
	 * public Job getJobs() { return this.jobs; }
	 * 
	 * public void setJobs(Job jobs) { this.jobs = jobs; }
	 */
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public BigDecimal getCommissionPct() {
		return this.commissionPct;
	}

	public void setCommissionPct(BigDecimal commissionPct) {
		this.commissionPct = commissionPct;
	}
	/*
	 * public Set getDepartmentses() { return this.departmentses; }
	 * 
	 * public void setDepartmentses(Set departmentses) { this.departmentses =
	 * departmentses; }
	 * 
	 * public Set getJobHistories() { return this.jobHistories; }
	 * 
	 * public void setJobHistories(Set jobHistories) { this.jobHistories =
	 * jobHistories; }
	 * 
	 * public Set getEmployeeses() { return this.employeeses; }
	 * 
	 * public void setEmployeeses(Set employeeses) { this.employeeses =
	 * employeeses; }
	 */
}
