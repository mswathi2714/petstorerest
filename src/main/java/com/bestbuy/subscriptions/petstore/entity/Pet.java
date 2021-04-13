package com.bestbuy.subscriptions.petstore.entity;
import javax.persistence.*;

@Entity
@Table(name = "pet")
public class Pet {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pet_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "price")
	private double price;

//	@Column(name = "category_id")
//	private int category_id;

	public Pet() {
		
	}
	
	
	public Pet(int pet_id, String name, String type, double price) {
		super();
		this.pet_id = pet_id;
		this.name = name;
		this.type = type;
		this.price = price;
		//this.category_id = category_id;
	}


	public int getPet_id() {
		return pet_id;
	}

	public void setPet_id(int pet_id) {
		this.pet_id = pet_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	public int getCategory_id() {
//		return category_id;
//	}
//
//	public void setCategory_id(int category_id) {
//		this.category_id = category_id;
//	}


	@Override
	public String toString() {
		//return "Pet [id=" + pet_id + ", name=" + name + ", type=" + type + ", price=" + price + ",category_id=" + category_id + "]";
		return "Pet [id=" + pet_id + ", name=" + name + ", type=" + type + ", price=" + price + "]";


	}
	
	
}
