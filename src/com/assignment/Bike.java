package com.assignment;

class Bike extends Vehicle {
    int engineCapacity;

    // Parameterized constructor using super()
    public Bike(String brand, String model, int year, int engineCapacity) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
    }

    // Overriding displayInfo() method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
    }
}