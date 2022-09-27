/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeppe
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> database;
    
    
    public VehicleRegistry() {
            this.database = new HashMap<>();
           
    }
    
    public boolean add(LicensePlate licenseplate, String owner) {
        if (this.database.containsKey(licenseplate)) {
            return false;
        }
        
        this.database.put(licenseplate, owner);
        return true;
    }
    
    public String get(LicensePlate licenseplate) {
        if (this.database.containsKey(licenseplate)) {
            return this.database.get(licenseplate);
        }
        
        return null;
    }
    
    public boolean remove(LicensePlate licenseplate) {
        if (this.database.containsKey(licenseplate)) {
            this.database.remove(licenseplate);
            return true;
        }
        
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate licenseplate: this.database.keySet()) {
            System.out.println(licenseplate);
        }
    }
    
    public void printOwners() {
        ArrayList owners = new ArrayList<>();
        for (String owner: this.database.values()) {
            if (!(owners.contains(owner))) {
                owners.add(owner);
                System.out.println(owner);
            } 
            
        }
    }
}

