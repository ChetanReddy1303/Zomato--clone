package com.zomato.webApp.webApp;

import org.springframework.boot.SpringApplication;

import com.zomato.webApp.WebAppApplication;

public class TestWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.from(WebAppApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
