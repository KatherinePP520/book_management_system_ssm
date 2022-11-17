package com.springExample.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.springExample.controller")
@EnableWebMvc
public class SpringMvcConfig {


}
