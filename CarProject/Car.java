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
            
        door1.printDoor1Details();
        door2.printDoor2Details();
        door3.printDoor3Details();
        door4.printDoor4Details();

        steer.printDetails();

        tyre1.printTyre1Details();
        tyre2.printTyre2Details();
        tyre3.printTyre3Details();
        tyre4.printTyre4Details();
                                                                                   
    }
}
