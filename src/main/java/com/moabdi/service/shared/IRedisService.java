package com.moabdi.service.shared;

import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * 
 * @author Mostapha
 *
 */
public interface IRedisService {

	String PREFIX_CACHE = "cache:";

	/**
	 * Delete a key from REDIS
	 * @param key to delete
	 */
	void delete(String key);

	/**
	 * Push value on the right
	 * @param key 
	 * @param value serialized with JSON
	 * @throws JsonProcessingException
	 */
	void rightPush(String key, Object value) throws JsonProcessingException;

	/**
	 * Keys  list by pattern  
	 * @param pattern
	 * @return Set<String>
	 */
	Set<String> listKeys(String pattern);


}