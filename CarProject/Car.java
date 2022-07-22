public class Car 
{
    private String type;
    private String name;                   
    private String engine;
    private String color;

    private Door door1;
    private Door door2;
    private Door door3;
    private Door door4;

    private Steering steer;
    
    private Tyre tyre1;
    private Tyre tyre2;
    private Tyre tyre3;
    private Tyre tyre4;
    
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
            return name;
        }
        
        public void setName(String Name)
        {
            this.name=Name;
        }        
    
        public String getEngine()
        {
            return engine;
        }
    
        public void setEngine(String Engine) 
        {
            this.engine=Engine;
        }

        public String getColor()
        {
            return color;
        }
        
        public void setColor(String Color)
        {
            this.color=Color;
        }

        //setter and getter in Door doors
    
        public Door getDoor1()
        {
            return door1;
        }       
        
        public void setDoor1(Door Door1)
        {
            this.door1=Door1;
        }

        public Door getDoor2()
        {
            return door2;
        }       
        
        public void setDoor2(Door Door2)
        {
            this.door2=Door2;
        }

        public Door getDoor3()
        {
            return door3;
        }       
        
        public void setDoor3(Door Door3)
        {
            this.door3=Door3;
        }

        public Door getDoor4()
        {
            return door4;
        }       
        
        public void setDoor4(Door Door4)
        {
            this.door4=Door4;
        }    

        //setter and getter in Steering steer

        public Steering getSteer()
        {
            return steer;
        }       
        
        public void setSteer(Steering Steer)
        {
            this.steer=Steer;
        }   
    
        //setter and getter in Tyre tyres

        public Tyre getTyre1()
        {
            return tyre1;
        }       
        
        public void setTyre1(Tyre Tyre1)
        {
            this.tyre1=Tyre1;
        }    
    
        public Tyre getTyre2()
        {
            return tyre2;
        }       
        
        public void setTyre2(Tyre Tyre2)
        {
            this.tyre2=Tyre2;
        }    

        public Tyre getTyre3()
        {
            return tyre3;
        }       
        
        public void setTyre3(Tyre Tyre3)
        {
            this.tyre3=Tyre3;
        }    
        
        public Tyre getTyre4()
        {
            return tyre4;
        }       
        
        public void setTyre4(Tyre Tyre4)
        {
            this.tyre4=Tyre4;
        }    
        
    public void showDetails()
    {               
        System.out.println("\t\t  Car Model : "+getType());
        System.out.println("\t\t-------------");
        System.out.println("");

        System.out.print("Car Name : "+getName()+"  "+"Engine : "+getEngine()+"   "+"Color : "+getColor()+"\n");
        System.out.println("-------      ---------      -----------");
        System.out.println("");
            
        System.out.println("\t\t Door Features ");
        System.out.println("\t\t----------------");
        door1.printDetails();
        door2.printDetails();
        door3.printDetails();
        door4.printDetails();

        System.out.println("\t\t  Steering Features ");
        System.out.println("\t\t---------------------");
        steer.printDetails();

        System.out.println("\t\t  Tyre Features ");    
        System.out.println("\t\t----------------");
        tyre1.printDetails();
        tyre2.printDetails();
        tyre3.printDetails();
        tyre4.printDetails();
                                                                                   
    }
}
