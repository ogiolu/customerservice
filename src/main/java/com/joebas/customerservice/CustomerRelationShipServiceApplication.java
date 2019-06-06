package com.joebas.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableMongoAuditing
@EnableReactiveMongoRepositories
@SpringBootApplication
public class CustomerRelationShipServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRelationShipServiceApplication.class, args);
	}


}
