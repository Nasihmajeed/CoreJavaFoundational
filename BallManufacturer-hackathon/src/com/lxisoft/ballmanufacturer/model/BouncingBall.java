package com.lxisoft.ballmanufacturer.model;

public class BouncingBall implements Ball {

	private String category;
	private String modelNumber;
	private String modelName;
	private String color;
	private int price;

	public BouncingBall(String category, String modelNumber, String modelName, String color, int price) {
		this.category = category;
		this.modelNumber = modelNumber;
		this.modelName = modelName;
		this.color = color;
		this.price = price;
	}

	@Override
	public String getOffers() {
		return "20% Discount";
	}

	@Override
	public void testTheBall() {
		System.out.println("Ball bounced successfully");
	}

	@Override
	public void printDetails() {
		System.out.println(category + "\t\t" + modelNumber + "\t\t" + modelName + "\t\t" + color + "\t\t" + price + "\t\t" + getOffers());
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}