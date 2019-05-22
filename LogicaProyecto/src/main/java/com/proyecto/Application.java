package com.proyecto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;



@SpringBootApplication
public class Application implements CommandLineRunner{
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
	@Transactional(readOnly = false)
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
