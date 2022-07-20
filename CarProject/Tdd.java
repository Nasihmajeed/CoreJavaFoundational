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
        doorOne.position="Right Front";
        doorOne.brand="Lambo Door";             
        doorOne.length="36 inches";                
        doorOne.color="Black";                                                      
            
        car.door2=doorTwo;  
        doorTwo.position="Left Front";
        doorTwo.brand="Lambo Door";             
        doorTwo.length="36 inches";                
        doorTwo.color="Black";
    
        car.door3=doorThree;  
        doorThree.position="Right Rear";
        doorThree.brand="Lambo Door";             
        doorThree.length="36 inches";                
        doorThree.color="Black";

        car.door4=doorFour;  
        doorFour.position="Left Rear";
        doorFour.brand="Lambo Door";             
        doorFour.length="36 inches";                
        doorFour.color="Black";                                        
        
        //Car Steering Settings    
        car.steer=steering;                    
        steering.position="Left Front";             
        steering.size="14 Inches";   
        steering.feature="German Quality Sport";       
        
        //Car Tyre Settings
        car.tyre1=tyreOne;                  
        tyreOne.position="Right Front";
        tyreOne.speedRate="H (130 mph)";
        tyreOne.size="235/65 R17";       

        car.tyre2=tyreTwo;
        tyreTwo.position="Left Front";
        tyreTwo.speedRate="H (130 mph)";
        tyreTwo.size="235/65 R17";

        car.tyre3=tyreThree;
        tyreThree.position="Right Rear";
        tyreThree.speedRate="H (130 mph)";
        tyreThree.size="235/65 R17";      
        
        car.tyre4=tyreFour;
        tyreFour.position="Left Rear";
        tyreFour.speedRate="H (130 mph)";
        tyreFour.size="235/65 R17";
    
        car.showDetails();                    
    }
}

