package com.bestbuy.subscriptions.petstore.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bestbuy.subscriptions.petstore.entity.Pet;

@Repository
public interface PetPagebleRepository extends JpaRepository<Pet, Integer> {
	
	Page<Pet> findByName(String name ,Pageable pageable);


}
