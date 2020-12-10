package com.springboot.auctionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.ComponentScan;

//import com.springboot.auctionservice.controller.AuctionController;

@SpringBootApplication
//@EntityScan(basePackages ="com.springboot.auctionservice.model")
public class AuctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuctionApplication.class, args);
	}

}
