package com.lxisoft.dogtype;

import com.lxisoft.dogprice.Dog;

public class GuardDog extends Dog {

    public GuardDog(String name, String healthLevel, String type) {
        super(name, healthLevel, type);
        
    }

    public void showDogDetails(){

        System.out.println("Dog Name:" + getName());
        System.out.println("Health Level:" + getHealthLevel());
        System.out.println("Dog Type:" + getType());
    }
    
}
