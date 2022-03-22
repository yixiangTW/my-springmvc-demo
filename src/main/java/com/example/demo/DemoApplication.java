package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {


	@Value("${server.port}")
	private String port;

	private final Environment env; // 依赖注入

	public DemoApplication(Environment env) {
		this.env = env; // 依赖注入 构造器注入
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("port is " + port);
		System.out.println("port is " + env.getProperty("server.port"));
	}
}
