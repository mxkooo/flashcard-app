package io.github.mxkooo.flashcardapp;

import com.vaadin.flow.spring.annotation.EnableVaadin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableVaadin
public class FlashcardAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlashcardAppApplication.class, args);
	}

}
