public class Car 
{
    String carName;           
    String carColor;    
    String carFuel;    
    String carPrice;
        
    public void showDetails()
    {
        System.out.println("Car Model : "+carName);
        System.out.println("");

        System.out.print("Color : "+carColor+" , "+"Fuel : "+carFuel+", "+"Price : "+carPrice);
        System.out.println("");
       
        Door d = new Door();
        d.showDetails();
        
        Steering s= new Steering();
        s.showDetails();        

        Tyre t = new Tyre();
        t.showDetails();                   
    }
}
