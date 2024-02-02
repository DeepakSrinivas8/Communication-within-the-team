package com.imaginnovate.Employee1.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class Employee1Config {

    @Bean
    public NewTopic employee1Topic(){
        return TopicBuilder
                .name("employee1ToManager")
                .build();
    }
}
