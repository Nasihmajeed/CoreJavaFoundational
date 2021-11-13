public class School{

       String Name;

       String Address;

       String PhNo;

       String Class;

       public void printDetails(){

              System.out.println("NAME OF SCHOOL : " +this.Name);

              System.out.println("ADDRESS : " +this.Address);

              System.out.println("PHONE NO : " +this.PhNo);

              ClassRoom c1 = new ClassRoom();

             // c1.std = "10";

              //c1.div = "A";

              c1.printDetails();
       }
}
