package com.demo.configurations;


import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.demo.dtos.AccountDTO;
import com.demo.entities.Account;

@Configuration
public class ModelMapperConfiguration {
	@Autowired
	private Environment environment;
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper mapper = new ModelMapper();
		
		
		   mapper.addMappings(new PropertyMap<Account, AccountDTO>() {
	            @Override
	            protected void configure() {
	                map().setId(source.getId());
	                map().setUsername(source.getUsername());
	                map().setEmail(source.getEmail());
	                map().setSecurityCode(source.getSecurityCode());
	                map().setCreated(source.getCreated());
	                map().setStatus(source.isStatus());
	                map().setTypeAccountID(source.getTypeAccount().getId());
	                map().setWallet(source.getWallet());
	                map().setPassword(source.getPassword());
	               
	            }
	        });

	
		return mapper;
	}
}