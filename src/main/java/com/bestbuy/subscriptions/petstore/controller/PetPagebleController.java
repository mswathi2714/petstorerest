package com.bestbuy.subscriptions.petstore.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bestbuy.subscriptions.petstore.model.PetPageableResponseModel;
import com.bestbuy.subscriptions.petstore.service.IPetPagebleService;

@RestController
@RequestMapping("/pageapi")
public class PetPagebleController {

	Logger logger = LoggerFactory.getLogger(PetPagebleController.class);
	
	@Autowired 
	IPetPagebleService petPagebleService;
	
	/**
	 * This method returns pets with pagination size
	 * @param page
	 * @param size
	 * @return
	 */
	@GetMapping("/pets")
	public ResponseEntity<PetPageableResponseModel>findAll(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "100") int size) {
		logger.info("Added logging capability..");
		Pageable pageable = PageRequest.of(page, size);
		
		PetPageableResponseModel model = petPagebleService.findAll(pageable);
		if(model.getCount()<=0)
		{
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(model, HttpStatus.OK);
	}
	
	/**
	 * This returns pets by name provided
	 * @param name
	 * @param page
	 * @param size
	 * @return PetPageableResponseModel
	 */
	@GetMapping("/petsByName")
	public ResponseEntity<PetPageableResponseModel> findByName(
			@RequestParam(defaultValue = "Max") String name,
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "100") int size
			){
		Pageable pageable = PageRequest.of(page, size);

		PetPageableResponseModel model= petPagebleService.findByName(name, pageable);
		
		if(model.getCount()<=0)
		{
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(model, HttpStatus.OK);	}
	
	
}
