package com.assignment;

public class Vehicle {
	    String brand;
	    String model;
	    int year;

	    // Default constructor
	    public Vehicle() {
	        this.brand = "Unknown";
	        this.model = "Unknown";
	        this.year = 0;
	    }

	    // Parameterized constructor
	    public Vehicle(String brand, String model, int year) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	    }

	    // Copy constructor
	    public Vehicle(Vehicle v) {
	        this.brand = v.brand;
	        this.model = v.model;
	        this.year = v.year;
	    }

	    // Method to display vehicle info
	    public void displayInfo() {
	        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
	    }

	    // Method to start the engine
	    public void startEngine() {
	        System.out.println("Vehicle engine is starting...");
	    }
	}


