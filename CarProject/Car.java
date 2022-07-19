public class Car 
{
    String type;
    String name;                   
    String engine;
    String color;

    Door door1;
    Door door2;
    Door door3;
    Door door4;

    Steering steer;
    
    Tyre tyre1;
    Tyre tyre2;
    Tyre tyre3;
    Tyre tyre4;
        
    public void showDetails()
    {
        System.out.println("Car Model : "+type);
        System.out.println("");

        System.out.print("Car Name : "+name+"  "+"Engine : "+engine+"   "+"Color : "+color+"\n");
        System.out.println("-------      ---------      -----------");
        System.out.println("");                                                                           
    }
}
