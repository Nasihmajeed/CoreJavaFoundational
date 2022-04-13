package com.lxisoft.dogtype;

import com.lxisoft.dogprice.Dog;

public class FamilyDog extends Dog {

    public FamilyDog(String name, String healthLevel, String type) {
        super(name, healthLevel, type);
        
    }

    public void showDogDetails(){

        System.out.println("Dog Name:" + getName());
        System.out.println("Dog Health Level:" + getHealthLevel());
        System.out.println("Dog Type:" + getType());
    }
    
}
