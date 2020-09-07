package com.skilldistillery.foodtruckproject;

import java.util.Scanner;

public class FoodTruckApp {
	
	Scanner scanner = new Scanner(System.in).useDelimiter("\n");
	FoodTruck[] truckArray = new FoodTruck[5];
//	array creation 
	public int MAX_TRUCKS = 5;

	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
//		fta is an instance of foodtruckApp(calling non static)
		fta.run();
	}

//	end of main method 
	private void run() {

		System.out.println("\uD83D\uDE9A" + "Welcome to our Food Truck App!" + "\uD83D\uDE9A"
				+ "\nYou can input and rate up to five trucks...\nhow groovy!" + "\n"
				+ "\uD83D\uDE9A\t\uD83D\uDE9A\t\uD83D\uDE9A\t\uD83D\uDE9A\t\uD83D\uDE9A");
		System.out.println("-----------------------------------");
//		User Story #1	
		for (int i = 0; i < truckArray.length; i++) {
			System.out.println("~~You may type quit if you are done~~");
			System.out.println("Please input the name of food truck " + (i + 1) + ": ");
			String name = scanner.next();
			if (name.equals("quit") || name.equals("Quit") || name.equals("QUIT")) {
				break;
			}
//			user story 2: if user inputs quit for truck name, they will be taken to the menu
			
			System.out.println("Please input the food type of " + name + " :");
			String foodType = scanner.next();

			System.out.println("Please input a rating (1-100) for how tasty the truck " + name + " is: ");
			int numRating = scanner.nextInt();

			FoodTruck truck = new FoodTruck(name, foodType, numRating);
//		 object
			truckArray[i] = truck;
		}

		printMenu();
	}
//	end run method

	public void printMenu() {

		boolean keepGoing = true;
		do {
			System.out.println("-----------------------------------");
			System.out.println("   \uD83D\uDE9A  *Menu*  \uD83D\uDE9A       ");
			System.out.println("1. List all food trucks ");
			System.out.println("2. See the average rating");
			System.out.println("3. See the highest rated food truck");
			System.out.println("4. Quit");
			System.out.println("-----------------------------------");
//			user story 3
			
			int menuChoice;
			System.out.println("Please select an option: ");
			menuChoice = scanner.nextInt();

			switch (menuChoice) {
			case 1:
				listAllTrucks();
				break;

			case 2:
				averageRating();
				break;

			case 3:
				maxTruckRating();
				break;
			case 4:
				System.out.println("You have selected quit. Have a yummy day!");
				System.out.println("\uD83D\uDE9A\t\uD83D\uDE9A\t\uD83D\uDE9A\t\uD83D\uDE9A\t\uD83D\uDE9A");
				keepGoing = false;
				break;
			default:
				System.out.println("Please select a valid entry from the menu (1-4).");
			}
		} while (keepGoing);

	}
//end of printMenu() method.

	public void listAllTrucks() {
		for (int i = 0; i < truckArray.length; i++) {
			if (truckArray[i] == null)
				break;
			System.out.println("Truck " + (i+1) + "  "+ truckArray[i].toString());
			System.out.println("-----------------------------------");
		}
	}

	public void maxTruckRating() {
		int rating = 0;
		String highestRated = null;

		for (int i = 0; i < truckArray.length; i++) {
			if (truckArray[i] == null) {
				continue;
			} else if (truckArray[i].getNumRating() > rating) {
				rating = truckArray[i].getNumRating();
				highestRated = truckArray[i].getName();
			}
		}
		System.out.println("The highest rated food truck is: " + highestRated);

	}

	public void averageRating() {
		double sum = 0;
		double average = 0;
		int counter = 0;
		for (int i = 0; i < truckArray.length; i++) {
			if (truckArray[i] == null) {
				break;
			} else {
				sum = sum + truckArray[i].getNumRating();
				counter++;
				average = (sum / counter);
			}
		}
		System.out.println("The average food truck rating of the " + counter + " food trucks is: " + average);
	}
}
