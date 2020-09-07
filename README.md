## Food Truck Project
### Overview
This week two project expands upon the knowledge we learned in week one, and complicates it by adding in everything we learned in week two. :) The objective of this program is to create a working food truck rating app with user input. The FoodTruck is an object class while the FoodTruckApp class contains the calculations and methods, while only having one static method (the main method).

#### Lessons Used
* Arrays
* Static/non static methods
* Objects
* Unicode
* For loops
* Switch statements
* Do/while loops
* Constructors
* Getters & Setters
* Pass by value
* Encapsulation

#### How to Run - Instructions
1. The user is greeted by the program's welcome message, which I made pretty with unicode emojis (also a week two topic).
2. The user is prompted to enter data for up to 5 food trucks, while having the option to enter 'quit' whenever they have entered enough food trucks.
3. The program prints a separate menu with options 1-4, including list all food trucks, get the average rating of all trucks, list the maximum rated food truck, and quit.
4. This menu is in a switch statement inside of a do/while loop, so the menu will keep prompting the user for another option until the user decides to quit.

#### The Method to the Madness
1. I set up the FoodTruck class with the private variables, the constructor, and the getter and setter methods (with some help from command + option + S!). This class also contained the toString() method that returns the string representation of the object (in this case, the food truck object). It is called upon in the second class.
2. I created the array and the scanner in the public class so it can be accessed in all the methods.
3. The static main method calls upon the run method.
4. In the run method, I first created the welcome message to the user with simple system out prints and the scanner to obtain the user information. The data the user inputs is then stored in the array. The printMenu() method is also in this method.
5. The printMenu method uses a do/while statement to print the menu choices. This is so that the menu keeps printing until the user chooses the quit option in the menu. Inside the do/while loop, there is a switch statement for all the menu options as cases in the switch statement.
6. The three methods at the bottom are the calculations that the food truck app were to do with the information the user inputted.
7. The menu options to the user is to list all the trucks and its information, display the highest rated truck, and to display the average rating of all the food trucks. For each of these methods, I used for loops.

ENJOY!
