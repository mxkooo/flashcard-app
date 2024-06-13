package io.github.mxkooo.flashcardapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@Configuration
public class WebApplicationContextConfig {

    @Bean
    public WebApplicationContext webApplicationContext() {
        return new AnnotationConfigWebApplicationContext();
    }
}
