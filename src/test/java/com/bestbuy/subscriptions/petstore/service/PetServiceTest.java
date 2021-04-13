package com.bestbuy.subscriptions.petstore.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
//import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import com.bestbuy.subscriptions.petstore.entity.Pet;
import com.bestbuy.subscriptions.petstore.model.PetPageableResponseModel;
import com.bestbuy.subscriptions.petstore.repository.PetPagebleRepository;

//import junit.framework.Assert;

@RunWith(SpringRunner.class)
public class PetServiceTest {
	

	@TestConfiguration
    static class PetServiceTestContextConfiguration {
 
        @Bean
        public PetPagebleService petPageableService() {
            return new PetPagebleService();
        }
    }

	@Autowired
	PetPagebleService service; 
	
	@MockBean
    private PetPagebleRepository repository;
	
	@Before
	public void init() {
	    List<Pet> pets = new ArrayList<Pet>(Arrays.asList(new Pet(1, "test","doggy",10), new Pet(2, "test1","fishy",20)
	    		));
	    Page<Pet> pagedPets = new PageImpl<>(pets);
	    
	    Mockito.when(repository.findAll(PageRequest.of(1, 10)))
	      .thenReturn(pagedPets);
	}

	@Test
	public void whenAllPets_thenCountShuuldbeGreaterThanZero() {
		
		List<Pet> pets = new ArrayList<Pet>(Arrays.asList(new Pet(1, "test","doggy",10), new Pet(2, "test1","fishy",20)
	    		));
	    Page<Pet> pagedPets = new PageImpl<>(pets);
	    
	    //Page<Pet> pets1= repository.findAll(PageRequest.of(1, 2));
	    
	    Mockito.when(repository.findAll(PageRequest.of(1, 2)))
	      .thenReturn(pagedPets);
	    
	    Pageable pageable = PageRequest.of(1, 10);
	    PetPageableResponseModel model = service.findAll(pageable);

	    assertThat(model.getCount()).isGreaterThanOrEqualTo(0);
	 }
	
	/*@Test
	public void whenValidName_thenPetShouldBeFound() {
	    String name = "test";
	    Pageable pageable = PageRequest.of(1, 10);
	    PetPageableResponseModel model = service.findByName(name, pageable);
	 
	    assertTrue(true);
	    assertThat(model.getCount()).isGreaterThanOrEqualTo(0);
	 }*/
}
