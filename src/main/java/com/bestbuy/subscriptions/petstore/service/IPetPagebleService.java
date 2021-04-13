package com.bestbuy.subscriptions.petstore.service;


import org.springframework.data.domain.Pageable;

import com.bestbuy.subscriptions.petstore.model.PetPageableResponseModel;

public interface IPetPagebleService {
	PetPageableResponseModel findAll(Pageable pageable);
	PetPageableResponseModel findByName(String name, Pageable pageable);
}
