package com.moabdi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moabdi.dao.DepartmentDAO;
import com.moabdi.dto.DepartmentDTO;
import com.moabdi.entities.Department;
import com.moabdi.mappers.DepartmentMapper;
import com.moabdi.service.DepartmentManager;

@Service
public class DepartmentManagerImpl implements DepartmentManager {

	@Autowired
	DepartmentDAO dao;

	@Autowired
	DepartmentMapper mapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.DepartmentManager#findAll()
	 */
	@Override
	public List<DepartmentDTO> findAll() {
		List<DepartmentDTO> list = new ArrayList<DepartmentDTO>();
		for (Department department : dao.findAll()) {
			list.add(mapper.departmentToDepartmentDTO(department));
		}
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.DepartmentManager#findById(long)
	 */
	@Override
	public DepartmentDTO findById(long id) {
		return mapper.departmentToDepartmentDTO(dao.findById(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.DepartmentManager#findByCriteria(com.moabdi.dto.
	 * DepartmentDTO)
	 */
	@Override
	public List<DepartmentDTO> findByCriteria(DepartmentDTO dep) {
		List<DepartmentDTO> list = new ArrayList<DepartmentDTO>();
		for (Department department : dao.findByCriteria(mapper.departmentDTOToDepartment(dep))) {
			list.add(mapper.departmentToDepartmentDTO(department));
		}
		return list;
	}

	/*
	 * (non-Javadoc)
	 * @see com.moabdi.service.DepartmentManager#save(com.moabdi.dto.DepartmentDTO)
	 */
	@Override
	public void save(DepartmentDTO dep) {
		dao.save(mapper.departmentDTOToDepartment(dep));
	}

	/*
	 * (non-Javadoc)
	 * @see com.moabdi.service.DepartmentManager#update(com.moabdi.dto.DepartmentDTO)
	 */
	@Override
	public void update(DepartmentDTO dep) {
		dao.update(mapper.departmentDTOToDepartment(dep));
	}

	/*
	 * (non-Javadoc)
	 * @see com.moabdi.service.DepartmentManager#saveOrUpdate(com.moabdi.dto.DepartmentDTO)
	 */
	@Override
	public void saveOrUpdate(DepartmentDTO dep) {
		dao.saveOrUpdate(mapper.departmentDTOToDepartment(dep));

	}

	/*
	 * (non-Javadoc)
	 * @see com.moabdi.service.DepartmentManager#delete(com.moabdi.dto.DepartmentDTO)
	 */
	@Override
	public void delete(DepartmentDTO dep) {
		dao.delete(mapper.departmentDTOToDepartment(dep));

	}

}
