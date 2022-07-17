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
    
        System.out.println("Door1 Position : "+door1.position+" , "+"Door1 Brand  : "+door1.brand+" , "+"Door1 length : "+door4.length+" , "+"Door1 Color : "+door1.color);
        System.out.println("Door2 Position : "+door2.position+" , "+"Door2 Brand  : "+door2.brand+" , "+"Door2 length : "+door4.length+" , "+"Door2 Color : "+door2.color);
        System.out.println("Door3 Position : "+door3.position+" , "+"Door3 Brand  : "+door3.brand+" , "+"Door3 length : "+door4.length+" , "+"Door3 Color : "+door3.color);
        System.out.println("Door4 Position : "+door4.position+" , "+"Door4 Brand  : "+door4.brand+" , "+"Door4 length : "+door4.length+" , "+"Door4 Color : "+door4.color);
        System.out.println("");

        System.out.println("Steering Features :");

        System.out.println("Steering Position : "+steer.position+" , "+"Steering Size : "+steer.size+" , "+"Steering Perfomance : "+steer.feature);
        System.out.println("");

        System.out.println("Tyre Features :");

        System.out.println("Tyre1 Position : "+tyre1.position+" , "+"Tyre1 Speed Rating : "+tyre1.speedRate+" , "+"Tyre1 Size : "+tyre1.size);
        System.out.println("Tyre2 Position : "+tyre2.position+" , "+"Tyre2 Speed Rating : "+tyre2.speedRate+" , "+"Tyre2 Size : "+tyre2.size);
        System.out.println("Tyre3 Position : "+tyre3.position+" , "+"Tyre3 Speed Rating : "+tyre3.speedRate+" , "+"Tyre3 Size : "+tyre3.size);
        System.out.println("Tyre4 Position : "+tyre4.position+" , "+"Tyre4 Speed Rating : "+tyre4.speedRate+" , "+"Tyre4 Size : "+tyre4.size);
                                                                  
    }
}
