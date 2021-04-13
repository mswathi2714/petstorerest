package com.bestbuy.subscriptions.petstore.model;

import java.util.List;

import com.bestbuy.subscriptions.petstore.entity.Pet;

public class PetPageableResponseModel {

	private int currentPage;
	private int totalItems;
	private int count;
	private List<Pet> pets;
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Pet> getPets() {
		return pets;
	}
	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
}
