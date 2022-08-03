package com.lxisoft.files;
public class Tyre
{    
    private String position;
    private String speedRate;
    private String size;
    
        public String getPosition()
        {
            return position;
        }

        public void setPosition(String Position)
        {
            this.position=Position;
        }

        public String getSpeedRate()
        {
            return speedRate;
        }

        public void setSpeedRate(String SpeedRate)
        {
            this.speedRate=SpeedRate;
        }
        
        public String getSize()
        {
            return size;
        }
        
        public void setSize(String Size)
        {
            this.size=Size;
        }

        void printDetails()
        {   
                                
                System.out.println("Tyre Position : "+getPosition()+" , "+"Tyre Speed Rating : "+getSpeedRate()+" , "+"Tyre Size : "+getSize() );
                System.out.println("");                       
        }
}
