public class Car 
{
    String type;
    String name;                   
    String engine;
    String color;

    String door1;
    String door2;
    String door3;
    String door4;

    String steering;
    
    String tyre1;
    String tyre2;
    String tyre3;
    String tyre4;

    String positionOne="Right Front";
    String positionTwo="Left Front";
    String positionThree="Right Rear";
    String positionFour="Left Rear";    
                
        
    public void showDetails()
    {
        System.out.println("Car Model : "+type);
        System.out.println("");

        System.out.print("Car Name : "+name+"  "+"Engine : "+engine+"   "+"Color : "+color+"\n");

        System.out.println("\n"+"Door Details ");
        System.out.println("Door1 Type : "+ door1 +" , "+"Position : "+positionOne);
       
        System.out.println("Door2 Type : "+ door2 +" , "+"Position : "+positionTwo);
       
        System.out.println("Door3 Type : "+ door3 +" , "+"Position : "+positionThree);
        
        System.out.println("Door4 Type : "+ door4 +" , "+"Position : "+positionFour+"\n");        
       
        System.out.println("Steering Details ");
        System.out.println("Steering Brand : "+steering+" , "+"Position : "+positionTwo+"\n"); 
      
        System.out.println("Tyre Details ");
        System.out.println("Tyre1 Brand : "+tyre1+" , "+"Position : "+positionOne);
        
        System.out.println("Tyre2 Brand : "+tyre2+" , "+"Position : "+positionTwo);
        
        System.out.println("Tyre3 Brand : "+tyre3+" , "+"Position : "+positionThree);
        
        System.out.println("Tyre4 Brand : "+tyre4+" , "+"Position : "+positionFour+"\n");
            
        System.out.println("--- Additional Details Below ---"+"\n");                       
    }
}
