package com.mithrenduin.azerothian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.mithrenduin.azerothian.models.blizzard.character.Profile;

@SpringBootApplication
public class AzerothianApplication {

	public static void main(String[] args) {
				
		SpringApplication.run(AzerothianApplication.class, args);
	

	}
}
