package com.census;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.census.logdata.dao")
public class CensusApplication {

	public static void main(String[] args) {
		SpringApplication.run(CensusApplication.class, args);
	}
}
