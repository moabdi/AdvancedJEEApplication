package com.moabdi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moabdi.dao.CountryDAO;
import com.moabdi.dto.CountryDTO;
import com.moabdi.entities.Country;
import com.moabdi.mappers.CountryMapper;
import com.moabdi.service.ContryManager;

@Service
public class ContryManagerImpl implements ContryManager {

	@Autowired
	CountryDAO dao;

	@Autowired
	CountryMapper mapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.ContryManager#findAll()
	 */
	@Override
	public List<CountryDTO> findAll() {
		List<CountryDTO> countries = new ArrayList<CountryDTO>();
		for (Country cont : dao.findAll()) {
			countries.add(mapper.countryToCountryDTO(cont));
		}
		return countries;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.ContryManager#findById(long)
	 */
	@Override
	public CountryDTO findById(long id) {
		return mapper.countryToCountryDTO(dao.findById(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.ContryManager#findByCriteria(com.moabdi.dto.
	 * CountryDTO)
	 */
	@Override
	public List<CountryDTO> findByCriteria(CountryDTO country) {
		List<CountryDTO> countries = new ArrayList<CountryDTO>();
		for (Country cont : dao.findByCriteria(mapper.countryDTOToCountry(country))) {
			countries.add(mapper.countryToCountryDTO(cont));
		}
		return countries;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.ContryManager#save(com.moabdi.dto.CountryDTO)
	 */
	@Override
	public void save(CountryDTO country) {
		dao.save(mapper.countryDTOToCountry(country));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.ContryManager#update(com.moabdi.dto.CountryDTO)
	 */
	@Override
	public void update(CountryDTO country) {
		dao.update(mapper.countryDTOToCountry(country));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.moabdi.service.ContryManager#saveOrUpdate(com.moabdi.dto.CountryDTO)
	 */
	@Override
	public void saveOrUpdate(CountryDTO country) {
		dao.saveOrUpdate(mapper.countryDTOToCountry(country));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.ContryManager#delete(com.moabdi.dto.CountryDTO)
	 */ 
	@Override
	public void delete(CountryDTO country) {
		dao.delete(mapper.countryDTOToCountry(country));
	}
}
