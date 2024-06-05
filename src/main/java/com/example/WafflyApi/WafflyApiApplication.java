package com.example.WafflyApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
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
                    .allowedOrigins("http://localhost:4200")
                    .allowCredentials(true)
                    .allowedHeaders("Origin","Authorization","Content-Type")
                    .allowedMethods("GET","POST","PUT","DELETE");
                    
                    }
            };
        }

}
