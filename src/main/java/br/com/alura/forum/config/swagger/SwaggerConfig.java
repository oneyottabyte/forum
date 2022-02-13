package br.com.alura.forum.config.swagger;

import org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties;
import org.springframework.context.annotation.Bean;

public class SwaggerConfig {
	
	@Bean
	WebFluxProperties webFluxProperties(){
		return new WebFluxProperties();
	}

}
