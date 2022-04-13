package com.lxisoft.dogprice;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Merchant {

    public void DogDetails(){

        List<Dog> dogs = new ArrayList <Dog>();
       
        try {

            Scanner scanner = new Scanner(new FileReader("resources/DogDetails.csv"));
    
            while (scanner.hasNext()) {
    
            dogs.add(new Dog(scanner.next(),scanner.next(),scanner.next()));
           }
           //for (int i = 0; i <dogs.size(); i ++){
               
          // System.out.println(dogs.get(i).getName());
          // }
        }
           catch (Exception e) {
    
            System.out.println("Found Exception");
    
            e.printStackTrace();
           }
           
           // return dogs;
      
        }
        public void calculateDogPrice(){

            System.out.println("Family Dog Price Details");

            int price;

            price = ((65+20)/100)*10000;
            System.out.println(price);
            
        }
    
}
