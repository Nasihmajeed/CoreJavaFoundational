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
        door1[0]=new Door();
        door2[1]=new Door();
        door3[2]=new Door();
        door4[3]=new Door();
            
        Steering steering = new Steering();
        
        Tyre tyre[] = new Tyre[4];
        tyre1[0]=new Tyre();
        tyre2[1]=new Tyre();
        tyre3[2]=new Tyre();
        tyre4[3]=new Tyre();
        
        //Car Door Settings                           
        car.setDoor1(door1[0]);                   
        door1[0].setPosition("Right Front");
        door1[0].setBrand("Lambo Door");             
        door1[0].setLength("36 inches");                 
        door1[0].setColor("Black");                                                      
            
        car.setDoor2(door2);  
        door2[1].setPosition("Left Front");
        door2[1].setBrand("Lambo Door");             
        door2[1].setLength("36 inches");                
        door2[1].setColor("Black");
    
        car.setDoor3(door3);  
        door3[2].setPosition("Right Rear");
        door3[2].setBrand("Lambo Door");             
        door3[2].setLength("36 inches");                
        door3[2].setColor("Black");

        car.setDoor4(door4); 
        door4[3].setPosition("Left Rear");
        door4[3].setBrand("Lambo Door");             
        door4[3].setLength("36 inches");                
        door4[3].setColor("Black");                                        
        
        //Car Steering Settings    
        car.setSteer(steering);                    
        steering.setPosition("Left Front");             
        steering.setSize("14 Inches");   
        steering.setFeature("German Quality Sport");       
        
        //Car Tyre Settings
        car.setTyre1(tyre1);                  
        tyre1[0].setPosition("Right Front");
        tyre1[0].setSpeedRate("H (130 mph)");
        tyre1[0].setSize("235/65 R17");       

        car.setTyre2(tyre2);
        tyre2[1].setPosition("Left Front");
        tyre2[1].setSpeedRate("H (130 mph)");
        tyre2[1].setSize("235/65 R17");

        car.setTyre3(tyre3);
        tyre3[2].setPosition("Right Rear");
        tyre3[2].setSpeedRate("H (130 mph)");
        tyre3[2].setSize("235/65 R17");      
        
        car.setTyre4(tyre4);
        tyre4[3].setPosition("Left Rear");
        tyre4[3].setSpeedRate("H (130 mph)");
        tyre4[3].setSize("235/65 R17");
    
        car.showDetails();                    
    }
}

