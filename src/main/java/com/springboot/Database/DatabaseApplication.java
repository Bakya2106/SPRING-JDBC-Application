package com.springboot.Database;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.Db.dao.JdbcDao;

@SpringBootApplication
@ComponentScan("com")
public class DatabaseApplication implements CommandLineRunner {

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	JdbcDao jdao;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("All users -> {}", jdao.find());
	}

}
