package com.bestbuy.subscriptions.petstore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bestbuy.subscriptions.petstore.entity.Pet;
import com.bestbuy.subscriptions.petstore.repository.PetRepository;


@RestController
@RequestMapping("/api")
public class PetController {
	
	@Autowired
	PetRepository petRepository;
	
	/**
	 * This end point is to get all pets in the pet store
	 * @return List<Pet>
	 */
	@GetMapping("/pets")
	public ResponseEntity<List<Pet>> getAllPets() {
		try {
			List<Pet> pets = petRepository.findAll();
			if(pets.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(pets, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);	
		}
	}
	
	/**
	 * This end point return list of pets by parameter name
	 * @param name
	 * @return List<Pet> 
	 */
	@GetMapping("/petbyname/{name}")
	public List<Pet> getPetByName(@PathVariable("name") String name) {		
		System.out.println("Pet name given "+name);
		return petRepository.findByName(name);
		
	}
	
	/**
	 * This end point is to get pet by requested ID
	 * @param id
	 * @return Pet
	 */
	@GetMapping("/petbyid/{id}")
	public ResponseEntity<Pet> getPetById(@PathVariable("id") int id) {		
		System.out.println("Pet id given "+id);
    	Optional<Pet> petData = petRepository.findById(id);
    	if(petData.isPresent()) {
        	Pet _pet = petData.get();
    	    return new ResponseEntity<>(_pet, HttpStatus.OK);
    	}else {
    	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    	}
		
	}
	
	/**
	 * This is an another version of request using request parameter this case get pet by name
	 * @param name
	 * @return List<Pet> 
	 */
	@GetMapping("/pet")
	public List<Pet> getPetByNameReqParam(@RequestParam String name) {		
		System.out.println("Pet name given "+name);
		return petRepository.findByName(name);
		
	}
	
	/**
	 * THis endpoint is to add pets
	 * @param pets
	 * @return List<Pet> 
	 */
	@PostMapping("/createpets")
	public List<Pet> createPets(@RequestBody List<Pet> pets) {		
	
		return petRepository.saveAll(pets);
		
	}
	
	/**
	 * This endpoint is to create single pet
	 * @param pet
	 * @return Pet
	 */
	@PostMapping("/createpet")
	  public ResponseEntity<Pet> createpet(@RequestBody Pet pet) {
	    try {
	    	Pet _pet = petRepository.save(pet);
	      return new ResponseEntity<>(_pet, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
	/**
	 * This endpoint is to update Pet by id
	 * @param pet_id
	 * @param pet
	 * @return Pet
	 */
	@PutMapping("/updatepet/{pet_id}")
	  public ResponseEntity<Pet> updatepet(@PathVariable("pet_id") int pet_id , @RequestBody Pet pet) {
	    try {
	    	Optional<Pet> petData = petRepository.findById(pet_id);
	    	if(petData.isPresent()) {
	    		Pet _pet = petData.get();
	    		_pet.setName(pet.getName());
	    		_pet.setType(pet.getType());
	    		_pet.setPrice(pet.getPrice());
	    		petRepository.save(_pet);
	    	    return new ResponseEntity<>(_pet, HttpStatus.OK);
	    	}else {
	    	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	    	}
	    } catch (Exception e) {
  	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	
	/**
	 * This endpoint is to delete a pet by ids
	 * @param pet_id
	 * @return Pet
	 */
	@DeleteMapping("/deletepet/{pet_id}")
	  public ResponseEntity<Pet> deletepet(@PathVariable("pet_id") int pet_id) {
	    try {
	    	Optional<Pet> petData = petRepository.findById(pet_id);
	    	if(petData.isPresent()) {
	    	
	    		petRepository.deleteById(pet_id);
	    	      return new ResponseEntity<>(HttpStatus.OK);
	    	}else {
	    	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	    	}
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }

}
