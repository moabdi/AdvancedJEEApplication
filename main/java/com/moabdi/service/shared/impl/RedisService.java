package com.moabdi.service.shared.impl;

import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.moabdi.service.shared.IRedisService;

/**
 * Created by dplantier on 16/10/2015.
 */
@Service
public class RedisService implements IRedisService {

	private static final Logger LOGGER = LoggerFactory.getLogger(RedisService.class);

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private ObjectMapper jsonMapper;
	
	@Autowired
	private RedisConnectionFactory jedisConnectionFactory;

	private ListOperations<String, String> listOperations;

	private ValueOperations<String, String> opsForValue;

	/**
	 * Initialisation des variables
	 */
	@PostConstruct
	private void postConstruct() {
		stringRedisTemplate = new StringRedisTemplate(jedisConnectionFactory);
		listOperations = stringRedisTemplate.opsForList();
		opsForValue = stringRedisTemplate.opsForValue();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.impl.IRedisService#delete(java.lang.String)
	 */
	@Override
	public void delete(final String key) {
		stringRedisTemplate.delete(key);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.impl.IRedisService#rightPush(java.lang.String,
	 * java.lang.Object)
	 */
	@Override
	public void rightPush(final String key, final Object value) throws JsonProcessingException {
		if (value != null && value.getClass().equals(String.class)) {
			listOperations.rightPush(key, (String) value);
		} else {
			listOperations.rightPush(key, jsonMapper.writeValueAsString(value));
		}
	}

	/**
	 * Get list length in Redis
	 * 
	 * @param key
	 * @return
	 */
	private Long size(final String key) {
		return listOperations.size(key);
	}

	/**
	 * Retour une sous-liste de valeurs pour une clé donnée
	 * 
	 * @param key
	 *            la clé
	 * @param beginPos
	 *            l'index de départ de la sous-liste à obtenir
	 * @param size
	 *            la taille de la sous-liste à extraire
	 * @return
	 */
	private List<String> range(final String key, final int beginPos, final Long size) {
		return listOperations.range(key, beginPos, size);
	}

	/**
	 * Set value in REDIS
	 * 
	 * @param key
	 * @param value
	 */
	private void setValue(final String key, String value) {
		LOGGER.debug("Stockage de {} avec comme valeur : {}", key, value);
		opsForValue.set(key, value);
	}

	/**
	 * Get value from redis REDIS
	 * 
	 * @param key
	 * @return value as String
	 */
	private String getValue(final String key) {
		return opsForValue.get(key);
	}

	/**
	 * update value in the list REDIS
	 * 
	 * @param key
	 * @param index
	 * @param newValue
	 */
	private void updateValueInList(final String key, final Long index, final String newValue) {
		stringRedisTemplate.opsForList().set(key, index, newValue);
	}

	/**
	 * remove value from list in REDIS
	 * 
	 * @param key
	 * @param index
	 */
	private void removeValueInList(final String key, final Long index, final String oldValue) {
		stringRedisTemplate.opsForList().remove(key, index, oldValue);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.moabdi.service.impl.IRedisService#listKeys(java.lang.String)
	 */
	@Override
	public Set<String> listKeys(final String pattern) {
		return stringRedisTemplate.keys(pattern);
	}

	/**
	 * Delete value from REDIS
	 * 
	 * @param key
	 */
	private void deleteKey(final String key) {
		LOGGER.debug("REDIS : Destruction de la clé : " + key);
		delete(key);
	}

}
