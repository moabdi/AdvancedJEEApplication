package com.moabdi.mappers;

import org.mapstruct.Mapper;

import com.moabdi.dto.CountryDTO;
import com.moabdi.entities.Country;

@Mapper
public interface CountryMapper {

	/**
	 * Convert Country to CountryDTO bean
	 * 
	 * @param country
	 * @return CountryDTO
	 */
	public CountryDTO countryToCountryDTO(Country country);

	/**
	 * Convert CountryDTO to Country bean
	 * 
	 * @param country
	 * @return Country
	 */
	public Country countryDTOToCountry(CountryDTO country);

}