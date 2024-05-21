package com.example.blogginApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com/example/blogginApp/entities")
public class BlogginAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogginAppApplication.class, args);
	}

}
