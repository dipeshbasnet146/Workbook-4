package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {
    public Dealership getDealership() {
        Dealership dealershipFromFile = null;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));
            String fileLine;

            while ((fileLine = bufferedReader.readLine()) != null) {
                String[] tokens = fileLine.split("\\|");

                if (tokens.length == 3) {
                    dealershipFromFile = new Dealership(tokens[0], tokens[1], tokens[2]);
                } else {
                    // Process vehicle information and add it to the dealership
                    Vehicle vehicle = new Vehicle(
                            Integer.parseInt(tokens[0]),
                            Integer.parseInt(tokens[1]),
                            tokens[2],
                            tokens[3],
                            tokens[4],
                            tokens[5],
                            Integer.parseInt(tokens[6]),
                            Double.parseDouble(tokens[7])
                    );
                    if (dealershipFromFile != null) {
                        dealershipFromFile.addVehicle(vehicle);
                    }
                }
            }
            return dealershipFromFile;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void saveDealership(String dealership) {

    }
}







