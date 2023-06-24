package com.example.demo;

import com.example.demo.model.Post;
import com.example.demo.repository.Postrepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InstazooApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstazooApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(Postrepository postrepository) {
//		return new CommandLineRunner() {
//			@Override
//			public void run(String... args) throws Exception {
//				postrepository.save(new Post("hello world 111", "body of Post 111"));
//			}
//		};
//	}

}
