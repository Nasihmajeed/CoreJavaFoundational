public class Tdd
{
     public static void main(String args[])
    {   
        Car car = new Car();      

        car.type="SUV";
        car.name="RangeRover Sport By LandRover";                
        car.engine="2997cc";
        car.color="Black"; 
        
        Door door1 = new Door();        
        Door door2 = new Door();
        Door door3 = new Door();
        Door door4 = new Door();
    
        Steering steer = new Steering();
        
        Tyre tyre1 = new Tyre();
        Tyre tyre2 = new Tyre();
        Tyre tyre3 = new Tyre();
        Tyre tyre4 = new Tyre();
                   

        car.door1="Lambo Door";             ////////Door//////
        door1.length="36 inches";                
        door1.color="Black";
        door1.doorDetails();                                
            
        car.door2="Lambo Door";
        door2.length="36 inches";                
        door2.color="Black";
        door2.doorDetails();
    
        car.door3="Lambo Door";
        door3.length="36 inches";                
        door3.color="Black";
        door3.doorDetails();

        car.door4="Lambo Door";
        door4.length="36 inches";                
        door4.color="Black";        
        door4.doorDetails();                        
                                        
            
        car.steer="Thrustmaster T248";            //////Steering//////  
        steer.size="14 Inches";   
        steer.feature="German Quality Sport";        
        steer.steerDetails();    

        car.tyre1="MRF WANDERER";                //////Tyre///////   
        tyre1.speedRate="H (130 mph)";
        tyre1.size="235/65 R17";
        tyre1.tyreDetails();

        car.tyre2="MRF WANDERER";
        tyre2.speedRate="H (130 mph)";
        tyre2.size="235/65 R17";
        tyre2.tyreDetails();

        car.tyre3="MRF WANDERER";
        tyre3.speedRate="H (130 mph)";
        tyre3.size="235/65 R17";
        tyre3.tyreDetails();

        car.tyre4="MRF WANDERER";            
        tyre4.speedRate="H (130 mph)";
        tyre4.size="235/65 R17";            
        tyre4.tyreDetails();  

        
        car.showDetails();        
     
    }
}

