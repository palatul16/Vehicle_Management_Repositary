package com.assignment;

public class Main {
    public static void main(String[] args) {
        // Creating Vehicle object
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2022);
        vehicle.displayInfo();
        vehicle.startEngine();

        System.out.println();

        // Creating Car object
        Car car = new Car("Honda", "Civic", 2023, "Petrol");
        car.displayInfo();
        car.startEngine();
        car.startEngine("Push Button");

        System.out.println();

        // Creating Bike object
        Bike bike = new Bike("Yamaha", "R15", 2021, 155);
        bike.displayInfo();
        bike.startEngine();
    }
}
