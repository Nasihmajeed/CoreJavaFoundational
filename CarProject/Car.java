public class Car
{
      
              String Brand;
             
              String Model;
             
              String RegNo;
             
              String Color;

       public void PrintDetails()
       {
              
              System.out.println("CAR BRAND IS : " +this.Brand);
              
              System.out.println("CAR MODEL IS : " +this.Model);
              
              System.out.println("CAR REGISTERED AS : " +this.RegNo);
              
              System.out.println("COLOR OF THE CAR IS : " +this.Color);
              
              Tyre t=new Tyre();
              
              t.tyreType="Flat";
              
              t.Brand="MRF";
              
              t.Radius=3.75f;
              
              t.t1="FRONT_LEFT_TYRE";
              
              t.t2="FRONT_RIGHT_TYRE";
              
              t.t3="BACK_RIGHT_TYRE";
              
              t.t4="BACK_LEFT_TYRE";

              t.PrintDetails();
             
      
       }
}