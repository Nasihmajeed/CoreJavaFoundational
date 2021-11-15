public class Teacher {
       String Name;
       String Possition;
       String Subject;
       String phNo;
       public void inputDetails() {
             
              this.Name = "SHABNA SIRAJUDHEEN";
              this.Possition = "CLASS_TEACHER";
              this.Subject = "MATHS";
              this.phNo = "9384726501";
       }
       public void printDetails() {
              System.out.println("******TEACHERS DATA***********");
              
              System.out.println("NAME OF TEACHER : " +Name);
              System.out.println(""+Name+" IS "+Possition+" AND DEALS WITH "+Subject+"");
              System.out.println("CONTACT ON : " +phNo);
       }
}
