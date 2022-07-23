public class Tdd
{
     public static void main(String args[])
    {   
        Car car = new Car();      

        car.setType("SUV");
        car.setName("RangeRover Sport By LandRover");                
        car.setEngine("2997cc");
        car.setColor("Black");                 
        
        Door doorArr[] = new Door[4];
            
        Steering steering = new Steering();
        
        Tyre tyreArr[] = new Tyre[4];
        
        //Car Door Settings                           
        car.setDoorArr0(doorArr[0]);                   
        doorArr[0].setPosition("Right Front");
        doorArr[0].setBrand("Lambo Door");             
        doorArr[0].setLength("36 inches");                 
        doorArr[0].setColor("Black");                                                      
            
        car.setDoorArr1(doorArr[1]);  
        doorArr[1].setPosition("Left Front");
        doorArr[1].setBrand("Lambo Door");             
        doorArr[1].setLength("36 inches");                
        doorArr[1].setColor("Black");
    
        car.setDoorArr2(doorArr[2]);  
        doorArr[2].setPosition("Right Rear");
        doorArr[2].setBrand("Lambo Door");             
        doorArr[2].setLength("36 inches");                
        doorArr[2].setColor("Black");

        car.setDoorArr3(doorArr[3]); 
        doorArr[3].setPosition("Left Rear");
        doorArr[3].setBrand("Lambo Door");             
        doorArr[3].setLength("36 inches");                
        doorArr[3].setColor("Black");                                        
        
        //Car Steering Settings    
        car.setSteer(steering);                    
        steering.setPosition("Left Front");             
        steering.setSize("14 Inches");   
        steering.setFeature("German Quality Sport");       
        
        //Car Tyre Settings
        car.setTyreArr0(tyreArr[0]);                  
        tyreArr[0].setPosition("Right Front");
        tyreArr[0].setSpeedRate("H (130 mph)");
        tyreArr[0].setSize("235/65 R17");       

        car.setTyreArr1(tyreArr[1]);
        tyreArr[1].setPosition("Left Front");
        tyreArr[1].setSpeedRate("H (130 mph)");
        tyreArr[1].setSize("235/65 R17");

        car.setTyreArr2(tyreArr[2]);
        tyreArr[2].setPosition("Right Rear");
        tyreArr[2].setSpeedRate("H (130 mph)");
        tyreArr[2].setSize("235/65 R17");      
        
        car.setTyreArr3(tyreArr[3]);
        tyreArr[3].setPosition("Left Rear");
        tyreArr[3].setSpeedRate("H (130 mph)");
        tyreArr[3].setSize("235/65 R17");
    
        car.showDetails();                    
    }
}

