package com.lxisoft.dogprice;

public class Dog {

    private String name;
    private double healthLevel;
    private String type;

    public Dog(String name, String healthLevel, String type) {
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {

        this.name=name;
    }

    public double getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(double healthLevel){
        this.healthLevel=healthLevel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type){
        this.type=type;
    }

    public void showDogDetails(){

    }
    
}
