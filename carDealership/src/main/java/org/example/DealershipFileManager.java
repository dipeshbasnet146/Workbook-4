package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {

    String filePath;

    public DealershipFileManager(String filePath){
        this.filePath = filePath;
    }

    public Dealership getDealership(){
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)));
        String dealershipInfo = reader.readLine();
        String[] dealershipInfoArray = dealershipInfo.split("\\|");
        String name = dealershipInfoArray[0];
        String address = dealershipInfoArray[1];
        String phoneNumber = dealershipInfoArray[2];

        Dealership dealership = new Dealership(name, address, phoneNumber);

        String line;
        while ((line = reader.readLine()) != null){
            String[] vehicleInfoArray = line.split("\\|");
        }

        return dealership;
    } catch (IOException e){
        return null;
    }

    public void getDealership(){
        return null;
    }

    public void saveDealership(){

        return null;

    }

}
