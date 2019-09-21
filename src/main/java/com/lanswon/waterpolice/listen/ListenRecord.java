package com.lanswon.waterpolice.listen;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Author GU-YW
 * @Date 2019/9/20 16:41
 */
@Component
public class ListenRecord {

    @KafkaListener(topics = "")
    public void ggg(ConsumerRecord<?, ?> cr) {
        cr.topic();
        cr.value();
        cr.key();
    }
}
