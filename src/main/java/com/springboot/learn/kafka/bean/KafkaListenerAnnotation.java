package com.springboot.learn.kafka.bean;

import com.springboot.learn.common.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * The type Kafka listener on method.
 *
 * @author 熊乾坤 <p> Kafka一共有一个主题test,该test主题有两个分区。 该test主题有两个消费者组：springboot-learn1和springboot-learn2，每个消费者组分别有两个分区。
 */

@Slf4j
@Component
@Profile("kafka")
public class KafkaListenerAnnotation {

    /**
     * KafkaListener注解的方法，可以注入Consumer，对提交偏移量进行精确的控制
     *
     * @param user   消息对象
     * @param record Kafka record
     */
    @KafkaListener(topics = "test", groupId = "test-listener1")
    @SendTo("sendto")
    public UserDTO consume1Partition2(UserDTO user, ConsumerRecord<String, UserDTO> record) {
        log.info("group:test-listener1 partition:{} consume a UserDTO msg:{} from topic:test and then send to topic :{}", record.partition(), user.toString(), "sendto");
        return user;
    }
}
