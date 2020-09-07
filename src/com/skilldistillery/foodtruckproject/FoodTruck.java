package com.skilldistillery.foodtruckproject;

public class FoodTruck {
//no main method in this
	
	 private String name;
	 private String foodType;
	 private int numId;
	 private int numRating;
	 private static int nextNumId = 000_001;
	  
	 

	public FoodTruck() {}
	 
	public FoodTruck(String name, String foodType, int numRating) {
		this.name = name;
		this.foodType = foodType;
		this.numRating = numRating;
		this.numId = nextNumId;
		nextNumId ++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getNumRating() {
		return numRating;
	}
	public void setNumRating(int numRating) {
		this.numRating = numRating;
	}
	 

	
	public String toString() {
		String output = "name: " + name + ", food type: " + foodType + ", number ID: " + numId 
		        + ", number Rating: " + numRating;
	    return output;
	}
}
