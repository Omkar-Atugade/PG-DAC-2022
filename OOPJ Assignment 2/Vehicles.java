import java.lang.*;
import java.util.*;

abstract class Automobile{
	
	String maker;
	String type;
	int maxSpeed;
	double price;
	int mileage;
	long registrationNumber;
	
	abstract void printDetails();
}

class Truck extends Automobile{
	
	int capacity;
	String hoodType;
	int noOfWheels;
	
	Truck(){
	
	}
	
	Truck(String maker, String type, int maxSpeed, double price , int mileage, long registrationNumber, int capacity, String hoodType, int noOfWheels){
		
		this.maker = maker;
		this.type = type;
		this.maxSpeed = maxSpeed;
		this.price = price;
		this.mileage = mileage;
		this.registrationNumber = registrationNumber;
		this.capacity = capacity;
		this.hoodType = hoodType;
		this.noOfWheels = noOfWheels;
	
	}
	
	public void printDetails(){
		
		System.out.println("Maker of truck is : "+maker);
		System.out.println("Type of the truck is : "+type);
		System.out.println("Max speed of truck in km/hr is : "+maxSpeed);
		System.out.println("Price of truck in lakhs is : "+price);
		System.out.println("Mileage of truck in km/l is : "+mileage);
		System.out.println("Registration number of truck is : "+registrationNumber);
		System.out.println("Capacity of truck in kg is : "+capacity);
		System.out.println("Hood type of truck is : "+hoodType);
		System.out.println("Number of wheels of truck is : "+noOfWheels);
		
	}
}

class Car extends Automobile{
	
	int noOfDoors;
	int seatingCapacity;
	
	Car(){
	
	
	}
	
	Car(String maker, String type, int maxSpeed, double price , int mileage, long registrationNumber, int noOfDoors, int seatingCapacity){
		
		this.maker = maker;
		this.type = type;
		this.maxSpeed = maxSpeed;
		this.price = price;
		this.mileage = mileage;
		this.registrationNumber = registrationNumber;
		this.noOfDoors = noOfDoors;
		this.seatingCapacity = seatingCapacity;
	
	}
	
	public void printDetails(){
		
		System.out.println("Maker of car is : "+maker);
		System.out.println("Type of the car is : "+type);
		System.out.println("Max speed of car in km/hr is : "+maxSpeed);
		System.out.println("Price of car in lakhs is : "+price);
		System.out.println("Mileage of car km/l is : "+mileage);
		System.out.println("Registration number of car is : "+registrationNumber);
		System.out.println("No of doors of car is : "+noOfDoors);
		System.out.println("Seating capacity of car is : "+seatingCapacity);
		
		
	}
}

class Vehicles{
	
	public static void main(String args[]){
		
		Truck t1 = new Truck("TATA", "Box truck", 120, 40.0, 8, 123456l, 500, "Canopy hood", 10);
		Car c1 = new Car("Maruthi", "Swift", 100, 5.0, 15, 987654l, 4, 5);
		
		t1.printDetails();
		System.out.println("=======================================================");
		c1.printDetails();
		
	}
}

