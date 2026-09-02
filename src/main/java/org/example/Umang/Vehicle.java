package org.example.Umang;

public abstract class Vehicle {
    abstract String start();
}

class Car extends Vehicle {
    @Override
    String start() {
        return "Car starts with a key/push-button ignition";
    }
    String carName(String name) { return name; }
}

class Bike extends Vehicle {
    @Override
    String start() {
        return "Bike starts with a kick or self-start";
    }
    String bikeName(String name) { return name; }
}

class Buyer{
    static void main() {
       Vehicle [] fleet = new Vehicle[3];
       fleet[0] = new Car();
       fleet[1] = new Bike();
       fleet[2] = new Bike();
       for (Vehicle v : fleet){
           v.start();
       }
    }
}