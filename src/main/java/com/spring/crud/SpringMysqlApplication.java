package com.spring.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringMysqlApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringMysqlApplication.class, args);
	}
	
   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	   return builder.sources(SpringMysqlApplication.class);
   }
   
   @Configuration
   @EnableWebMvc
   public class WebConfig implements WebMvcConfigurer {
    
       @Override
       public void addCorsMappings(CorsRegistry registry) {
           registry.addMapping("/**")
           		   .allowedMethods("GET", "POST", "PUT", "DELETE");
       }
   }

}
