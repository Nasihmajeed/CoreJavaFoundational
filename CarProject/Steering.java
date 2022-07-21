public class Steering
{
    private String position;
    private String size;   
    private String feature;

        public String getPosition()
        {
            return this.position;
        }

        public void setPosition(String Position)
        {
            this.position=Position;
        }

        public String getSize()
        {
            return this.size;
        }

        public void setSize(String Size)
        {
            this.size=Size;
        }

        public String getFeature()
        {
            return this.feature;
        }

        public void setFeature(String Feature)
        {
            this.feature=Feature;
        }  
    
        void printDetails()
        {
            System.out.println("Steering Position : "+getPosition()+" , "+"Steering Size : "+getSize()+" , "+"Steering Perfomance : "+getFeature() );
            System.out.println("");
        }
        
}
