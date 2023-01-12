package com.example.myProd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MyProdApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProdApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/users/add";


	}

}
