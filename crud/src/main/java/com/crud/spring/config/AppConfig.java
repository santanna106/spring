package com.crud.spring.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import static org.hibernate.cfg.Environment.*;

@Configuration
@PropertySource("classpath:db.properties")

@ComponentScans(value = { @ComponentScan("com.boraji.tutorial.spring.dao"),
      @ComponentScan("com.boraji.tutorial.spring.service") })
public class AppConfig {

   @Autowired
   private Environment env;

   
}