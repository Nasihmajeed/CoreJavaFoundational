public class Tdd
{
    public static void main(String args[])
    {   
        Car c = new Car();

        c.name="RangeRover Sport By LandRover";        
        c.color="Black";
        c.fuel="Diesel";
        c.price="£84,090"; 
                        
        Door d = new Door();
        //setPosition
        //use this position and fit in here 
        c.d.doorLength="36 inches";   
        c.d.doorColor="Black"; 
        
        Steering s= new Steering();
        c.s.steerSize="14 Inches";   
        c.s.steerFeature="German Quality Sport";
    
        Tyre t = new Tyre();
        //setPosition
        //use this position and fit in here
        c.t.tyreName="MRF WANDERER";
        c.t.tyreSize=15;

        c.showDetails();                                           
    }
}

