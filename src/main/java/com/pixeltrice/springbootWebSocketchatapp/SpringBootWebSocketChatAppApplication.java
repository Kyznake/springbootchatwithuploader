package com.pixeltrice.springbootWebSocketchatapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.pixeltrice.springbootWebSocketchatapp.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class SpringBootWebSocketChatAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebSocketChatAppApplication.class, args);
	}

}
