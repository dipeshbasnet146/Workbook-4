package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager{
    public Dealership getDealership() {
        try (BufferedReader reader = new BufferedReader(new FileReader()));
        String dealershipInfo = reader.readLine();
        String[] dealershipInfoArray = dealershipInfo.split("\\|");
        String name = dealershipInfoArray[0];
        String address = dealershipInfoArray[1];
        String phoneNumber = dealershipInfoArray[2];

        Dealership dealership = new Dealership(name, address, phoneNumber);

        String line;
        while ((line = reader.readLine()) != null) {
            String[] vehicleInfoArray = line.split("\\|");

            return null;
        }
    }

    public void saveDealership(String dealership) {

    }
}







