package com.ser.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import static com.ser.user.config.constants.GROUP_ID;
import static com.ser.user.config.constants.LOCATION_UPDATE_TOPIC;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = LOCATION_UPDATE_TOPIC, groupId = GROUP_ID )
    public void updatedLocation(String value){
        System.out.print(value);
    }
}
