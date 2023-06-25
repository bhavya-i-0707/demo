package com.example.demo.config;

import com.example.demo.model.Addition;
import com.example.demo.service.impl.ServiceImpl;
import com.example.demo.utility.HelperClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

        @Bean
        public Addition getAddition() {
            return new Addition(0,0);
        }

        @Bean
        public HelperClass getHelperClass(){
            return new HelperClass();
        }

        @Bean
        public ServiceImpl getServiceImpl(){
            return  new ServiceImpl();
        }

}
