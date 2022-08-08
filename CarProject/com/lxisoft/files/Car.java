package com.lxisoft.files;
public class Car 
{
    private String type;
    private String name;                   
    private String engine;
    private String color;

    private Door[] doors;        

    private Steering steer;
    
    private Tyre[] tyres;                
    
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
            return doors;
        }        
        
        public void setDoor(Door[] Door)
        {
            this.doors=Door;
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
            return tyres;
        } 

        public void setTyre(Tyre[] Tyre)
        {
            this.tyres=Tyre;
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
        for(int i = 0;i < 4;i++)
        {            
            doors[i].printDetails();            
        }
       
        System.out.println("\t\t  Steering Features ");
        System.out.println("\t\t---------------------");
        steer.printDetails();

        System.out.println("\t\t  Tyre Features ");    
        System.out.println("\t\t----------------");
        for(int j = 0;j < 4;j++)
        {
            tyres[j].printDetails();        
        }                                                                                      
    }
}
