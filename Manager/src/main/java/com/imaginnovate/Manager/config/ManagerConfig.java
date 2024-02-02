package com.imaginnovate.Manager.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ManagerConfig {

    @Bean
    public NewTopic employee1Topic(){
        return TopicBuilder
                .name("employee-1")
                .build();
    }


    @Bean
    public NewTopic employee2Topic(){
        return TopicBuilder
                .name("employee-2")
                .build();
    }

    @Bean
    public NewTopic employee3Topic(){
        return TopicBuilder
                .name("employee-3")
                .build();
    }
}
