package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * create on 2020/4/21 20:00 by jc
 **/
@Configuration
@PropertySource("classpath:dubbo.properties")
@ImportResource({"classpath:*.xml"})
public class DubboConfig {

}