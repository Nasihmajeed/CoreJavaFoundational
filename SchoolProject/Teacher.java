public class Teacher {
       String Name;
       String Possition;
       String Subject;
       String phNo;
       public void inputDetails1() {
             
              this.Name = "SHABNA SIRAJUDHEEN";
              this.Possition = "CLASS_TEACHER";
              this.Subject = "MATHS";
              this.phNo = "9384726501";
       }
       public void inputDetails2() {
             
              this.Name = "SUJITH";
              this.Possition = "CLASS_TEACHER";
              this.Subject = "SOCIAL_SCIENCE";
              this.phNo = "9384672501";
       }
       public void printDetails1() {
              System.out.println();
              System.out.println("******TEACHERS DATA***********");
              System.out.println();
              System.out.println("NAME OF TEACHER : " +Name);
              System.out.println(""+Name+" IS "+Possition+" AND DEALS WITH "+Subject+"");
              System.out.println("CONTACT ON : " +phNo);
       }
       public void printDetails2() {
              System.out.println();
              System.out.println("******TEACHERS DATA***********");
              System.out.println();
              System.out.println("NAME OF TEACHER : " +Name);
              System.out.println(""+Name+" IS "+Possition+" AND DEALS WITH "+Subject+"");
              System.out.println("CONTACT ON : " +phNo);
       }
}
