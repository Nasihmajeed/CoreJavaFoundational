public class Car 
{
    private String type;
    private String name;                   
    private String engine;
    private String color;

    private Door[] door;        

    private Steering steer;
    
    private Tyre[] tyre;                
    
        //variables settings
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
        
        public Door[] getDoor()
        {
            return door;
        }        
        
        public void setDoor(Door[] Door)
        {
            this.door=Door;
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
        
        public Tyre[] getTyre()
        {
            return tyre;
        } 

        public void setTyre(Tyre[] Tyre)
        {
            this.tyre=Tyre;
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
        door[0].printDetails();
        door[1].printDetails();
        door[2].printDetails();
        door[3].printDetails();

        System.out.println("\t\t  Steering Features ");
        System.out.println("\t\t---------------------");
        steer.printDetails();

        System.out.println("\t\t  Tyre Features ");    
        System.out.println("\t\t----------------");
        tyre[0].printDetails();
        tyre[1].printDetails();
        tyre[2].printDetails();
        tyre[3].printDetails();
                                                                                   
    }
}
