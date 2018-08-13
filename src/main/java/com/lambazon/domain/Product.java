package com.lambazon.domain;

public class Product {
	
	private Integer id;
	private String name, description, details;
	private int quantity;
	private double price;

	public Product(int id, int quantity, double price, String name, String description) {
		setId(id);
		setQuantity(quantity);
		setPrice(price);
		setName(name);
		setDescription(description);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity){
    //The quantity can not be negative. If a negative value is passed to the setQuantity () method, the quantity attribute will set to 0.
	//To work, we use the "if" condition.
		if (quantity < 0){
		} else {
			this.quantity = quantity;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
	    //The price can not be negative, If a negative value is supplied to the setPrice () method, the value will set to 0.
		if (price < 0) {
		} else {
			this.price = price;
		}
		{
		    //The price can not be greater than 1000, If a value greater than 1000 is provided, the value 1000 is assigned to the price.
			if (price > 1000) {
				this.price = 1000;
			}
		}
	}

	public double getInventoryPrice() {
		// TODO Auto-generated method stub
		//Repair of the field "Total value of the stock", Multiplication of quantities by prices
		return (quantity * price);
	}
}
