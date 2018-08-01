package com.tools.dao;


import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

@Configuration
@ComponentScan
@EntityScan("com.tools.model")
@EnableJpaRepositories("com.tools.dao")
public class DatabaseConfiguration {

	protected Logger logger;

	public DatabaseConfiguration() {
		logger = Logger.getLogger(getClass().getName());
	}

	@Bean
	public DataSource dataSource() {
		DataSource dataSource = (new EmbeddedDatabaseBuilder()).addScript("classpath:stockDB/schema.sql")
				.addScript("classpath:stockDB/data.sql").build();
		logger.info("dataSource = " + dataSource);

		return dataSource;

	}

}
