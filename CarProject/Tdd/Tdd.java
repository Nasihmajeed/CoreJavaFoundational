package Tdd;

import java.util.*;
import CarDetails.Cars;
// import CarDetails.Tyres;
// import CarDetails.Doors;



public class Tdd
{
    

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println(">--------------------------<");
        System.out.println("Enter the number of cars");
        int number = s.nextInt();
        Cars car = new Cars();
        car.cardetails(number);
        car.printcardetails(number);

    }
}
