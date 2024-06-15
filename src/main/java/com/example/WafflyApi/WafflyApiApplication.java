package com.example.WafflyApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableWebMvc
public class WafflyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WafflyApiApplication.class, args);
	}
         @Bean
        public WebMvcConfigurer corsConfigurer2(){
            return new WebMvcConfigurer(){
            @Override
            public void addCorsMappings(CorsRegistry registry){
            registry.addMapping("/**")
                    .allowedOrigins("https://wafflyapp.azurewebsites.net")
                    .allowCredentials(true)
                    .allowedHeaders("*")
                    .allowedMethods("GET","POST","PUT","DELETE");
                    
                    }
            };
        }

}
