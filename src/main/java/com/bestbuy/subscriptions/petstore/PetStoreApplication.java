package com.bestbuy.subscriptions.petstore;

import com.bestbuy.subscriptions.petstore.model.PetPageableResponseModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class PetStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetStoreApplication.class, args);
		System.out.println("Welcome to Petstore !!!");
		List<PetPageableResponseModel> petPageableResponseModels = new ArrayList<>();
		Map<String, PetPageableResponseModel> stringPetPageableResponseModelMap = new HashMap<>();
	}

}
