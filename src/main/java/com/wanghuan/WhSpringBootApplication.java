package com.wanghuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wanghuan.dao.mapper")
public class WhSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhSpringBootApplication.class, args);
	}
}
