public class Car 
{
<<<<<<< HEAD
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
        
=======
    public String carName;
        
    public void showDetails()
    {
        System.out.println(carName);

        Door d = new Door();
        d.showDetails();

        Steering s= new Steering();
        s.showDetails();        

>>>>>>> 287a15e6104ca42bb96cb8052c61b7518ac10eea
        Tyre t = new Tyre();
        t.showDetails();                   
    }
}
