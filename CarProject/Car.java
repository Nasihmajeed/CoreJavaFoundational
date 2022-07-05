public class Car 
{
    public String carName;
        
    public void showDetails()
    {
        System.out.println(carName);

        Door d = new Door();
        d.showDetails();

        Steering s= new Steering();
        s.showDetails();        

        Tyre t = new Tyre();
        t.showDetails();                   
    }
}
