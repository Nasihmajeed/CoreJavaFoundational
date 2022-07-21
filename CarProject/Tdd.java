public class Tdd
{
     public static void main(String args[])
    {   
        Car car = new Car();      

        car.setType="SUV";
        car.setName="RangeRover Sport By LandRover";                
        car.setEngine="2997cc";
        car.setColor="Black";                 
        
        Door doorOne = new Door();        
        Door doorTwo = new Door();
        Door doorThree = new Door();
        Door doorFour = new Door();
    
        Steering steering = new Steering();
        
        Tyre tyreOne = new Tyre();
        Tyre tyreTwo = new Tyre();
        Tyre tyreThree = new Tyre();
        Tyre tyreFour = new Tyre();
        
        //Car Door Settings                           
        car.door1=doorOne;                   
        doorOne.setPosition="Right Front";
        doorOne.setBrand="Lambo Door";             
        doorOne.setLength="36 inches";                 
        doorOne.setColor="Black";                                                      
            
        car.door2=doorTwo;  
        doorTwo.setPosition="Left Front";
        doorTwo.setBrand="Lambo Door";             
        doorTwo.setLength="36 inches";                
        doorTwo.setColor="Black";
    
        car.door3=doorThree;  
        doorThree.setPosition="Right Rear";
        doorThree.setBrand="Lambo Door";             
        doorThree.setLength="36 inches";                
        doorThree.setColor="Black";

        car.door4=doorFour;  
        doorFour.setPosition="Left Rear";
        doorFour.setBrand="Lambo Door";             
        doorFour.setLength="36 inches";                
        doorFour.setColor="Black";                                        
        
        //Car Steering Settings    
        car.steer=steering;                    
        steering.setPosition="Left Front";             
        steering.setSize="14 Inches";   
        steering.setFeature="German Quality Sport";       
        
        //Car Tyre Settings
        car.tyre1=tyreOne;                  
        tyreOne.setPosition="Right Front";
        tyreOne.setSpeedRate="H (130 mph)";
        tyreOne.setSize="235/65 R17";       

        car.tyre2=tyreTwo;
        tyreTwo.setPosition="Left Front";
        tyreTwo.setSpeedRate="H (130 mph)";
        tyreTwo.setSize="235/65 R17";

        car.tyre3=tyreThree;
        tyreThree.setPosition="Right Rear";
        tyreThree.setSpeedRate="H (130 mph)";
        tyreThree.setSize="235/65 R17";      
        
        car.tyre4=tyreFour;
        tyreFour.setPosition="Left Rear";
        tyreFour.setSpeedRate="H (130 mph)";
        tyreFour.setSize="235/65 R17";
    
        car.showDetails();                    
    }
}

