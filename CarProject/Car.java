public class Car 
{
    String name;           
    String color;    
    String fuel;    
    String price;
    String position;
        
    public void showDetails()
    {
        System.out.println("Car Model : "+name);
        System.out.println("");

        System.out.print("Color : "+color+" , "+"Fuel : "+carFuel+", "+"Price : "+carPrice);
        System.out.println("");
               
        d.showDetails();        
        
        s.showDetails();        
        
        t.showDetails();                   
    }
}
