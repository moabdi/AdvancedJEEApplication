package com.moabdi.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.moabdi.dao.EmployeeDAO;
import com.moabdi.dto.EmployeeDTO;
import com.moabdi.entities.Employee;
import com.moabdi.mappers.EmployeeMapper;
import com.moabdi.service.EmployeeManager;

@Service
public class EmployeManagerImpl implements EmployeeManager {

	@Autowired
	EmployeeDAO dao;

	@Autowired
	EmployeeMapper mapper;

	@Autowired
	private StringRedisTemplate template;

	@Autowired
	private ObjectMapper jsonMapper;

	/*
	 * (non-Javadoc)
	 * @see com.moabdi.service.EmployeeManager#findByEmail(java.lang.String)
	 */
	@Override
	public EmployeeDTO findByEmail(String email) {
		Employee employee = dao.findByEmail(email);
		EmployeeDTO employeeDTO = mapper.employeeToEmployeeDTO(employee);
		try {
			template.opsForValue().set("emp", jsonMapper.writeValueAsString(employeeDTO));
		} catch (JsonProcessingException e1) {
			e1.printStackTrace();
		}

		String stef = template.opsForValue().get("emp");

		EmployeeDTO employeeDTO2 = null;
		try {
			employeeDTO2 = jsonMapper.readValue(stef, EmployeeDTO.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeDTO2;
	}

	/*
	 * (non-Javadoc)
	 * @see com.moabdi.service.EmployeeManager#findAll()
	 */
	@Override
	public List<EmployeeDTO> findAll() {
		List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		for (Employee employee : dao.findAll()) {
			list.add(mapper.employeeToEmployeeDTO(employee));
		}
		return list;
	}

	/*
	 * (non-Javadoc)
	 * @see com.moabdi.service.EmployeeManager#findById(long)
	 */
	@Override
	public EmployeeDTO findById(long id) {
		return mapper.employeeToEmployeeDTO(dao.findById(id));
	}

	/*
	 * (non-Javadoc)
	 * @see com.moabdi.service.EmployeeManager#findByCriteria(com.moabdi.dto.EmployeeDTO)
	 */
	@Override
	public List<EmployeeDTO> findByCriteria(EmployeeDTO emp) {
		List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		for (Employee employee : dao.findByCriteria(mapper.employeeDTOToEmployee(emp))) {
			list.add(mapper.employeeToEmployeeDTO(employee));
		}
		return list;
	}

	/*
	 * (non-Javadoc)
	 * @see com.moabdi.service.EmployeeManager#save(com.moabdi.dto.EmployeeDTO)
	 */
	@Override
	public void save(EmployeeDTO emp) {
		dao.save(mapper.employeeDTOToEmployee(emp));

	}

	/*
	 * (non-Javadoc)
	 * @see com.moabdi.service.EmployeeManager#update(com.moabdi.dto.EmployeeDTO)
	 */
	@Override
	public void update(EmployeeDTO emp) {
		dao.update(mapper.employeeDTOToEmployee(emp));
	}

	/*
	 * (non-Javadoc)
	 * @see com.moabdi.service.EmployeeManager#saveOrUpdate(com.moabdi.dto.EmployeeDTO)
	 */
	@Override
	public void saveOrUpdate(EmployeeDTO emp) {
		dao.saveOrUpdate(mapper.employeeDTOToEmployee(emp));
	}

	/*
	 * (non-Javadoc)
	 * @see com.moabdi.service.EmployeeManager#delete(com.moabdi.dto.EmployeeDTO)
	 */
	@Override
	public void delete(EmployeeDTO emp) {
		dao.delete(mapper.employeeDTOToEmployee(emp));
	}

}
