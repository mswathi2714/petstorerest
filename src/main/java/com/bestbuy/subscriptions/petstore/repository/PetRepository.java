package com.bestbuy.subscriptions.petstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bestbuy.subscriptions.petstore.entity.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer>{

	//List<Pet> findAll();
	//List<Pet> findByName(String name);
	//List<Pet> findByType(int pet_type);
	//List<Pet> findAllById(Iterable<Long> ids);
	//void deleteInBatch(Iterable<Pet> entities);
	List<Pet> findByName(String name);
	//List<Pet> findByPetType(String type);
	
}
