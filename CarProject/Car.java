public class Car 
{
    private String type;
    private String name;                   
    private String engine;
    private String color;

    Door door1;
    Door door2;
    Door door3;
    Door door4;

    Steering steer;
    
    Tyre tyre1;
    Tyre tyre2;
    Tyre tyre3;
    Tyre tyre4;
    
        public String getType()
        {
            return type;
        }

        public void setType(String Type)
        {
            this.type=Type;    
        }
        
        public String getName()
        {
            return this.name;
        }
        
        public void setName(String Name)
        {
            this.name=Name;
        }        
    
        public String getEngine()
        {
            return this.engine;
        }
    
        public void setEngine(String Engine) 
        {
            this.engine=Engine;
        }

        public String getColor()
        {
            return this.color;
        }
        
        public void setColor(String Color)
        {
            this.color=Color;
        }       
     
    public void showDetails()
    {               
        System.out.println("\t\t  Car Model : "+getType());
        System.out.println("\t\t-------------");
        System.out.println("");

        System.out.print("Car Name : "+getName()+"  "+"Engine : "+getEngine()+"   "+"Color : "+getColor()+"\n");
        System.out.println("-------      ---------      -----------");
        System.out.println("");
            
        System.out.println("\t\t Door Features :");
        System.out.println("\t\t----------------");
        door1.printDetails();
        door2.printDetails();
        door3.printDetails();
        door4.printDetails();

        System.out.println("\t\t  Steering Features :");
        System.out.println("\t\t---------------------");
        steer.printDetails();

        System.out.println("\t\t  Tyre Features :");    
        System.out.println("\t\t----------------");
        tyre1.printDetails();
        tyre2.printDetails();
        tyre3.printDetails();
        tyre4.printDetails();
                                                                                   
    }
}
