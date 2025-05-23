# 🚗 Vehicle Management System - Java OOP Project

This Java-based project demonstrates the fundamental concepts of **Object-Oriented Programming (OOP)**, including **inheritance**, **method overloading**, **method overriding**, and **constructor chaining**, through a simple **Vehicle Management System**.

## 📌 Features

- **Base Class (`Vehicle`)**: Stores basic vehicle details.
- **Derived Class (`Car`)**: Adds fuel type and overloads the `startEngine()` method.
- **Derived Class (`Bike`)**: Adds engine capacity and overrides the `displayInfo()` method.
- **Constructor Overloading and Chaining**.
- **Method Overloading & Overriding**.
- **Encapsulation of Vehicle Data**.

## 📁 Project Structure
<pre>
com.assignment/
├── Vehicle.java
├── Car.java
├── Bike.java
└── Main.java
</pre>

## 🧠 Concepts Demonstrated

| Concept             | Implemented In               |
|---------------------|------------------------------|
| Inheritance         | `Car` and `Bike` extend `Vehicle` |
| Method Overriding   | `displayInfo()` in `Car` and `Bike` |
| Method Overloading  | `startEngine()` in `Car`     |
| Constructor Chaining| Using `super()` in child class constructors |
| Copy Constructor    | `Vehicle(Vehicle v)`         |

## 💡 Sample Output
<pre>
Brand: Toyota, Model: Camry, Year: 2022
Vehicle engine is starting...

Brand: Honda, Model: Civic, Year: 2023
Fuel Type: Petrol
Vehicle engine is starting...
Car engine is starting using Push Button

Brand: Yamaha, Model: R15, Year: 2021
Engine Capacity: 155cc
Vehicle engine is starting...
</pre>


## 🚀 Getting Started


```bash
1. Clone the Repository
git clone https://github.com/palatul16/Vehicle_Management_Repositary
cd vehicle-management-system

2. Compile the Code
javac com/assignment/*.java

3. Run the Program
java com.assignment.Main


```

## 📜 Author
Atul Pal</br>
Feel free to connect.
