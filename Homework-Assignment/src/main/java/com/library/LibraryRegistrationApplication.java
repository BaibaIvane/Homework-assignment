package com.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.library.controller", "com.library.service", "com.library.mapper"})
public class LibraryRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryRegistrationApplication.class, args);
	}

}
