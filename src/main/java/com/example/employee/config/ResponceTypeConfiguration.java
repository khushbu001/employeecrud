package com.example.employee.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class ResponceTypeConfiguration implements WebMvcConfigurer {

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {

//		// set path extension to true
//		configurer.favorPathExtension(false).
//		// set favor parameter to false
//				favorParameter(true).parameterName("mediaType").
//				// ignore the accept headers
//				ignoreAcceptHeader(true).
//				// dont use Java Activation Framework since we are manually specifying the
//				// mediatypes required below
//				defaultContentType(MediaType.APPLICATION_JSON)
//				.mediaType("xml", MediaType.APPLICATION_XML)
//				.mediaType("json", MediaType.APPLICATION_JSON);
		configurer.favorPathExtension(true);
		configurer.favorParameter(false);
		configurer.parameterName("mediaType");
		configurer.defaultContentType(MediaType.APPLICATION_JSON);
		
	}
}