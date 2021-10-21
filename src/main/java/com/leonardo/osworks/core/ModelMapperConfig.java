package com.leonardo.osworks.core;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
		
		@Bean
		public ModelMapper modelMappe(){
			return new ModelMapper();
		}
}
