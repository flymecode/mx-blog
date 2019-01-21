package com.mx.myblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mx.myblog.mapper")
public class MxBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MxBlogApplication.class, args);
	}

}

