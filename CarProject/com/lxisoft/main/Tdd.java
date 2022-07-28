package com.lxisoft.main;
import com.lxisoft.files.*;

public class Tdd
{
     public static void main(String args[])
    {   
        Car car = new Car();      

        car.setType("SUV");
        car.setName("RangeRover Sport By LandRover");                
        car.setEngine("2997cc");
        car.setColor("Black");                 
        
        Door doors[] = new Door[4];
        doors[0]=new Door();
        doors[1]=new Door();
        doors[2]=new Door();
        doors[3]=new Door();
            
        Steering steering = new Steering();
        
        Tyre tyres[] = new Tyre[4];
        tyres[0]=new Tyre();
        tyres[1]=new Tyre();
        tyres[2]=new Tyre();
        tyres[3]=new Tyre();
        
        //Car doors Settings                           
        car.setDoor(doors);                   
        doors[0].setPosition("Right Front");
        doors[0].setBrand("Lambo Door");             
        doors[0].setLength("36 inches");                 
        doors[0].setColor("Black");                                                      
                     
        doors[1].setPosition("Left Front");
        doors[1].setBrand("Lambo Door");             
        doors[1].setLength("36 inches");                
        doors[1].setColor("Black");
              
        doors[2].setPosition("Right Rear");
        doors[2].setBrand("Lambo Door");             
        doors[2].setLength("36 inches");                
        doors[2].setColor("Black");

        doors[3].setPosition("Left Rear");
        doors[3].setBrand("Lambo Door");             
        doors[3].setLength("36 inches");                
        doors[3].setColor("Black");                                        
        
        //Car Steering Settings    
        car.setSteer(steering);                    
        steering.setPosition("Left Front");             
        steering.setSize("14 Inches");   
        steering.setFeature("German Quality Sport");       
        
        //Car tyres Settings
        car.setTyre(tyres);                  
        tyres[0].setPosition("Right Front");
        tyres[0].setSpeedRate("H (130 mph)");
        tyres[0].setSize("235/65 R17");       

        tyres[1].setPosition("Left Front");
        tyres[1].setSpeedRate("H (130 mph)");
        tyres[1].setSize("235/65 R17");

        tyres[2].setPosition("Right Rear");
        tyres[2].setSpeedRate("H (130 mph)");
        tyres[2].setSize("235/65 R17");      
        
        tyres[3].setPosition("Left Rear");
        tyres[3].setSpeedRate("H (130 mph)");
        tyres[3].setSize("235/65 R17");
    
        car.showDetails();                    
    }
}

