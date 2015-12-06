package com.moabdi.config;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

//import fr.thelem.enthel.redis.processors.HealthMessageProcessor;
//import fr.thelem.enthel.redis.processors.WsConnectorMessageProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import redis.clients.jedis.JedisPoolConfig;

/**
 * @author moabdi
 */
@Configuration
@EnableAspectJAutoProxy
public class RedisConfig {

	private @Value("${spring.redis.host}") String redisHostName;
	private @Value("${spring.redis.port}") int redisPort;

	@Bean
	public RedisConnectionFactory jedisConnectionFactory() {
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxTotal(5);
		poolConfig.setTestOnBorrow(true);
		poolConfig.setTestOnReturn(true);
		JedisConnectionFactory ob = new JedisConnectionFactory(poolConfig);
		ob.setUsePool(true);
		ob.setHostName(redisHostName);
		ob.setPort(redisPort);
		return ob;
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public Executor messageExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(20);
		executor.setMaxPoolSize(200);
		executor.setQueueCapacity(10);
		executor.setThreadNamePrefix("MessageExecutor-");
		executor.initialize();
		return executor;
	}

	@Bean
	public ScheduledThreadPoolExecutor scheduledExecutor() {
		ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(20);
		executor.setMaximumPoolSize(200);
		return executor;
	}

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

}
