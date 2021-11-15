public class Student {
       String Name;
       String Gardian;
       String Gender;
       String Age;
       String phNo;
       public void inputDetails() {
            
              this.Name = "mubhashir";
              this.Gardian = "muhammad";
              this.Gender = "Male";
              this.Age = "15";
              this.phNo = "8976354201";
       }
       public void printDetails() {
              System.out.println("$$$$$--STUDENT DETAILS--$$$$$$$");
              
              System.out.println("NAME OF STUDENT : " +Name);
              System.out.println("NAME OF GARDIAN : " +Gardian);
              System.out.println("GENDER : " +Gender);
              System.out.println("AGE : " +Age);
              System.out.println("CONTACT NUMBER : " +phNo);
       }
}
