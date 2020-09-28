package org.oauth.social;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringBootOauth2SocialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOauth2SocialApplication.class, args);
	}

}
