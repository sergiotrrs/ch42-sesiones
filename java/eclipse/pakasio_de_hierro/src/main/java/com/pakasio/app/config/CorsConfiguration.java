package com.pakasio.app.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

// @Component
public class CorsConfiguration implements RepositoryRestConfigurer {
	@Override
	  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {

	    cors.addMapping("/person/**")
	      .allowedOrigins("http://domain2.example")
	      .allowedMethods("PUT", "DELETE")
	      .allowedHeaders("header1", "header2", "header3")
	      .exposedHeaders("header1", "header2")
	      .allowCredentials(false).maxAge(3600);
	  }
	
}
