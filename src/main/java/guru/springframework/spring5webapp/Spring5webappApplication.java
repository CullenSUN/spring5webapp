package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5webappApplication {
	public static void main(String[] args) {
		SpringApplication.run(Spring5webappApplication.class, args);
	}
}
