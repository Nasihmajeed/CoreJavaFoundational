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
        
        System.out.println("Door Features :");
    
        System.out.println("Door Position : "+door1.position+" , "+"Door Brand  : "+door1.brand+" , "+"Door length : "+door4.length+" , "+"Door Color : "+door1.color);
        System.out.println("Door Position : "+door2.position+" , "+"Door Brand  : "+door2.brand+" , "+"Door length : "+door4.length+" , "+"Door Color : "+door2.color);
        System.out.println("Door Position : "+door3.position+" , "+"Door Brand  : "+door3.brand+" , "+"Door length : "+door4.length+" , "+"Door Color : "+door3.color);
        System.out.println("Door Position : "+door4.position+" , "+"Door Brand  : "+door4.brand+" , "+"Door length : "+door4.length+" , "+"Door Color : "+door4.color);
        System.out.println("");

        System.out.println("Steering Features :");

        System.out.println("Steering Position : "+steer.position+" , "+"Steering Size : "+steer.size+" , "+"Steering Perfomance : "+steer.feature);
        System.out.println("");

        System.out.println("Tyre Features :");

        System.out.println("Tyre Position : "+tyre1.position+" , "+"Tyre Speed Rating : "+tyre1.speedRate+" , "+"Tyre Size : "+tyre1.size);
        System.out.println("Tyre Position : "+tyre2.position+" , "+"Tyre Speed Rating : "+tyre2.speedRate+" , "+"Tyre Size : "+tyre2.size);
        System.out.println("Tyre Position : "+tyre3.position+" , "+"Tyre Speed Rating : "+tyre3.speedRate+" , "+"Tyre Size : "+tyre3.size);
        System.out.println("Tyre Position : "+tyre4.position+" , "+"Tyre Speed Rating : "+tyre4.speedRate+" , "+"Tyre Size : "+tyre4.size);
                                                                  
    }
}
