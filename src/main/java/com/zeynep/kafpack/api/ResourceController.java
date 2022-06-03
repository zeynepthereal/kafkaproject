package com.zeynep.kafpack.api;

import com.zeynep.kafpack.dto.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/message")
public class ResourceController {
    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public void sendMessage(@RequestBody Message message) {
        System.out.println("Message sent by producer: " + message);
        this.kafkaTemplate.send("test-topic", message.toString());
    }
}
