package com.peaceandray.SajiloHomeStay;

import com.peaceandray.SajiloHomeStay.Model.FileStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorage.class
})
public class SajiloHomeStayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SajiloHomeStayApplication.class, args);
	}
}





