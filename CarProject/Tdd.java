public class Tdd
{
    public static void main(String args[])
    {   
        Car car = new Car();      

        car.type="SUV";
        car.name="RangeRover Sport By LandRover";                
        car.engine="2997cc";
        car.color="Black"; 
        
        car.carDetails();        

        Door door1 = new Door();
        Door door2 = new Door();
        Door door3 = new Door();
        Door door4 = new Door();
    
        car.door1="Lambo Door"; 
        door1.length="36 inches";                
        door1.color="Black";                            
            
        car.door2="Lambo Door";
        door2.length="36 inches";                
        door2.color="Black";
    
        car.door3="Lambo Door";
        door3.length="36 inches";                
        door3.color="Black";
        
        car.door4="Lambo Door";
        door4.length="36 inches";                
        door4.color="Black";
        car.doorDetails();
        door4.doorDetails();                        
            
        Steering steer = new Steering();

        car.steer="Thrustmaster T248";
        steer.size="14 Inches";   
        steer.feature="German Quality Sport";
        car.steerDetails();
        steer.steerDetails();    

        Tyre tyre1 = new Tyre();
        Tyre tyre2 = new Tyre();
        Tyre tyre3 = new Tyre();
        Tyre tyre4 = new Tyre();
    
        car.tyre1="MRF WANDERER";
        tyre1.speedRate="H (130 mph)";
        tyre1.size="235/65 R17";

        car.tyre2="MRF WANDERER";
        tyre2.speedRate="H (130 mph)";
        tyre2.size="235/65 R17";

        car.tyre3="MRF WANDERER";
        tyre3.speedRate="H (130 mph)";
        tyre3.size="235/65 R17";

        car.tyre4="MRF WANDERER";            
        tyre4.speedRate="H (130 mph)";
        tyre4.size="235/65 R17";    
        car.tyreDetails();
        tyre4.tyreDetails();       
    }
}

