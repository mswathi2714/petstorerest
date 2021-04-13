package com.bestbuy.subscriptions.petstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.bestbuy.subscriptions.petstore.entity.Pet;
import com.bestbuy.subscriptions.petstore.model.PetPageableResponseModel;
import com.bestbuy.subscriptions.petstore.repository.PetPagebleRepository;

@Service
public class PetPagebleService implements IPetPagebleService {

	@Autowired 
	PetPagebleRepository pageableRepository;
	
	public PetPageableResponseModel findAll(Pageable pageable) {
		Page<Pet> pets = pageableRepository.findAll(pageable);
		PetPageableResponseModel response = new PetPageableResponseModel();
		response.setCount(pets.getTotalPages());
		response.setCurrentPage(pets.getNumber());
		response.setPets(pets.getContent());
		response.setTotalItems(pets.getSize());
		return response;
	}

	public PetPageableResponseModel findByName(String name, Pageable pageable) {
		Page<Pet> pagePets = pageableRepository.findByName(name, pageable);
		PetPageableResponseModel response = new PetPageableResponseModel();
		response.setCount(pagePets.getTotalPages());
		response.setCurrentPage(pagePets.getNumber());
		response.setPets(pagePets.getContent());
		response.setTotalItems(pagePets.getSize());
		return response;
	}

}
