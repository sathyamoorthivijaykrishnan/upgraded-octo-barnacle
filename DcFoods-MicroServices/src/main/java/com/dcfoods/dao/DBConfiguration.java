package com.dcfoods.dao;

import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

@Configuration
@ComponentScan
@EntityScan("com.dcfoods.model")
@EnableJpaRepositories("com.dcfoods.dao")
@PropertySource("classpath:database.properties")
public class DBConfiguration {

		protected Logger logger;

		public DBConfiguration() {
			logger = Logger.getLogger(getClass().getName());
		}

		@Bean
		public DataSource dataSource() {
			DataSource dataSource = (new EmbeddedDatabaseBuilder()).addScript("classpath:menuDB/schema.sql")
					.addScript("classpath:menuDB/data.sql").build();
			logger.info("dataSource = " + dataSource);

			return dataSource;

		}

	}