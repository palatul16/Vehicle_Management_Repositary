package com.assignment;

class Car extends Vehicle {
    String fuelType;

    // Parameterized constructor using super()
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    // Overriding displayInfo() method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Type: " + fuelType);
    }

    // Overloading startEngine() method
    public void startEngine(String startupMode) {
        System.out.println("Car engine is starting using " + startupMode);
    }
}
