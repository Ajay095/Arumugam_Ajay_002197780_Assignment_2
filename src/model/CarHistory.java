package model;


import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajay09
 */
public class CarHistory {
    
    private ArrayList<CarDetails> history;
    
    private String lastUpdatedTime;
    public CarHistory() {
        this.history = new ArrayList<CarDetails>();    
}
    public ArrayList<CarDetails> getHistory(){
        return history;
    }
    
    public void setHistory(ArrayList<CarDetails> history){
        this.history = history;
    }
    
    public CarDetails addNewCars() {
        lastUpdatedTime = new Date ().toString();
        CarDetails newCars = new CarDetails();
        history.add(newCars);
        return newCars;
    }  

    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }
    
    public void deleteCars(CarDetails cd) {
        lastUpdatedTime = new Date ().toString();
        history.remove(cd);
    }
    
    public CarDetails updateCars(int i, CarDetails cd) {
        lastUpdatedTime = new Date ().toString();
        history.set(i, cd);
        return cd;
    }
}
