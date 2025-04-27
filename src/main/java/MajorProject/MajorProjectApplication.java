package MajorProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MajorProjectApplication {

	 public static void main(String[] args) {
	        SpringApplication.run(MajorProjectApplication.class, args);
	    }
	    
	    // CORS configuration to allow frontend to access the API
	    @Bean
	    public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurer() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/**")
	                        .allowedOrigins("*")
	                        .allowedMethods("GET", "POST", "PUT", "DELETE")
	                        .allowedHeaders("*");
	            }
	        };
	    }
	}


