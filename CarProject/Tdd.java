public class Tdd
{
     public static void main(String args[])
    {   
        Car car = new Car();      

        car.setType("SUV");
        car.setName("RangeRover Sport By LandRover");                
        car.setEngine("2997cc");
        car.setColor("Black");                 
        
        Door door[] = new Door[4];
        door[0]=new Door();
        door[1]=new Door();
        door[2]=new Door();
        door[3]=new Door();
            
        Steering steering = new Steering();
        
        Tyre tyre[] = new Tyre[4];
        tyre[0]=new Tyre();
        tyre[1]=new Tyre();
        tyre[2]=new Tyre();
        tyre[3]=new Tyre();
        
        //Car Door Settings                           
        car.setDoor(door);                   
        door[0].setPosition("Right Front");
        door[0].setBrand("Lambo Door");             
        door[0].setLength("36 inches");                 
        door[0].setColor("Black");                                                      
                     
        door[1].setPosition("Left Front");
        door[1].setBrand("Lambo Door");             
        door[1].setLength("36 inches");                
        door[1].setColor("Black");
              
        door[2].setPosition("Right Rear");
        door[2].setBrand("Lambo Door");             
        door[2].setLength("36 inches");                
        door[2].setColor("Black");

        door[3].setPosition("Left Rear");
        door[3].setBrand("Lambo Door");             
        door[3].setLength("36 inches");                
        door[3].setColor("Black");                                        
        
        //Car Steering Settings    
        car.setSteer(steering);                    
        steering.setPosition("Left Front");             
        steering.setSize("14 Inches");   
        steering.setFeature("German Quality Sport");       
        
        //Car Tyre Settings
        car.setTyre(tyre);                  
        tyre[0].setPosition("Right Front");
        tyre[0].setSpeedRate("H (130 mph)");
        tyre[0].setSize("235/65 R17");       

        tyre[1].setPosition("Left Front");
        tyre[1].setSpeedRate("H (130 mph)");
        tyre[1].setSize("235/65 R17");

        tyre[2].setPosition("Right Rear");
        tyre[2].setSpeedRate("H (130 mph)");
        tyre[2].setSize("235/65 R17");      
        
        tyre[3].setPosition("Left Rear");
        tyre[3].setSpeedRate("H (130 mph)");
        tyre[3].setSize("235/65 R17");
    
        car.showDetails();                    
    }
}

