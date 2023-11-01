package org.example;

import java.util.ArrayList;

public class Dealership {
    String name;
    String address;
    String phoneNumber;

    ArrayList<Vehicle>inventory;

    public Dealership(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.inventory = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){

    }

    public ArrayList<Vehicle> getAllVehicles(){

        return inventory;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Vehicle> getAllVehicle() {
        return inventory;
    }
}
