package com.moabdi.mappers;

import org.mapstruct.Mapper;

import com.moabdi.dto.DepartmentDTO;
import com.moabdi.entities.Department;

@Mapper
public interface DepartmentMapper {

	/**
	 * Convert Department to DepartmentDTO bean
	 * 
	 * @param department
	 * @return DepartmentDTO
	 */
	public DepartmentDTO departmentToDepartmentDTO(Department department);

	/**
	 * Convert DepartmentDTO to Department bean
	 * 
	 * @param department
	 * @return Department
	 */
	public Department departmentDTOToDepartment(DepartmentDTO department);

}