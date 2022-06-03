package com.zeynep.kafpack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafpackApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafpackApplication.class, args);
	}

}
