package com.piraxx.DBsharding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
public class DBshardingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DBshardingApplication.class, args);
	}

//	@Bean(name="entityManagerFactory")
//	public LocalSessionFactoryBean sessionFactory() {
//		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//		return sessionFactory;
//	}
}
