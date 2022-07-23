public class Car 
{
    private String type;
    private String name;                   
    private String engine;
    private String color;

    private Door[] doorArr;

    private Steering steer;
    
    private Tyre[] tyreArr;
    
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
    
        public Door[] getDoorArr0()
        {
            return doorArr[0];
        }       
        
        public void setDoorArr0(Door DoorArr0)
        {
            this.doorArr[0]=DoorArr0;
        }

        public Door[] getDoorArr1()
        {
            return doorArr[1];
        }       
        
        public void setDoorArr1(Door DoorArr1)
        {
            this.doorArr[1]=DoorArr1;
        }

        public Door[] getDoorArr2()
        {
            return doorArr[2];
        }       
        
        public void setDoorArr2(Door DoorArr2)
        {
            this.doorArr[2]=DoorArr2;
        }

        public Door[] getDoorArr3()
        {
            return doorArr[3];
        }       
        
        public void setDoorArr3(Door DoorArr3)
        {
            this.doorArr[3]=DoorArr3;
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

        public Tyre[] getTyreArr0()
        {
            return tyreArr[0];
        }       
        
        public void setTyreArr0(Tyre TyreArr0)
        {
            this.tyreArr[0]=TyreArr0;
        }    
    
        public Tyre[] getTyreArr1()
        {
            return tyreArr[1];
        }       
        
        public void setTyreArr1(Tyre TyreArr1)
        {
            this.tyreArr[1]=TyreArr1;
        }     

        public Tyre[] getTyreArr2()
        {
            return tyreArr[2];
        }       
        
        public void setTyreArr2(Tyre TyreArr2)
        {
            this.tyreArr[2]=TyreArr2;
        }     
        
        public Tyre[] getTyreArr3()
        {
            return tyreArr[3];
        }       
        
        public void setTyreArr3(Tyre TyreArr3)
        {
            this.tyreArr[3]=TyreArr3;
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
        doorArr[0].printDetails();
        doorArr[1].printDetails();
        doorArr[2].printDetails();
        doorArr[3].printDetails();

        System.out.println("\t\t  Steering Features ");
        System.out.println("\t\t---------------------");
        steer.printDetails();

        System.out.println("\t\t  Tyre Features ");    
        System.out.println("\t\t----------------");
        tyreArr[0].printDetails();
        tyreArr[1].printDetails();
        tyreArr[3].printDetails();
        tyreArr[4].printDetails();
                                                                                   
    }
}
