package com.imaginnovate.Employee2.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class Employee2Config {

    @Bean
    public NewTopic employee2Topic(){
        return TopicBuilder
                .name("employee2ToManager")
                .build();
    }
}
