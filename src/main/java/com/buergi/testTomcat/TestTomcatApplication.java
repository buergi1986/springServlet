package com.buergi.testTomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestTomcatApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
		return  applicationBuilder.sources(TestTomcatApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(TestTomcatApplication.class, args);
	}

	@RequestMapping("/")
	public String Hello(){ return "Hello World from Tomcat"; }
}
