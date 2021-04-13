package com.bestbuy.subscriptions.petstore;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PetstoreApplicationTest {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void PetstoreApplication() {
		PetstoreApplication application = new PetstoreApplication();
		assertNotNull(application);
	}

}
