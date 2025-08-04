package com.deliveryboy.deliveryBoy.service;

import com.deliveryboy.deliveryBoy.config.constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class kafkaService {

    @Autowired
    private KafkaTemplate<String,String>kafkaTemplate;

    private Logger logger = LoggerFactory.getLogger(kafkaService.class);
    public boolean updatelocation(String location){
        this.kafkaTemplate.send(constants.LOCATION_TOPIC_NAME,location);
        this.logger.info("message produced");
        return true;
    }
}
