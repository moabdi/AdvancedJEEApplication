package com.moabdi.mappers;

import org.mapstruct.Mapper;

import com.moabdi.dto.EmployeeDTO;
import com.moabdi.entities.Employee;

@Mapper
public interface EmployeeMapper {

	/**
	 * Convert Employee to EmployeeDTO bean
	 * 
	 * @param employee
	 * @return EmployeeDTO
	 */
	public EmployeeDTO employeeToEmployeeDTO(Employee employee);

	/**
	 * Convert EmployeeDTO to Employee bean
	 * 
	 * @param employee
	 * @return Employee
	 */
	public Employee employeeDTOToEmployee(EmployeeDTO employee);

}