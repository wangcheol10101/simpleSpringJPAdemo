package com.example.jpademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}

	// // some code running after the application startup
	// @Bean
	// CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
	// return args -> {
	// Student maria = new Student("Maria", "jones", "maria@gmail.com", 21);
	// studentRepository.save(maria)
	// };
	// }

}
