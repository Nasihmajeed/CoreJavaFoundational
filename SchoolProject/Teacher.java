public class Teacher {
       String name;
       String possition;
       String subject;
       String phno;
       public void inputDetails1() {
             
              this.name = "SHABNA SIRAJUDHEEN";
              
              this.possition = "CLASS_TEACHER";
              
              this.subject = "MATHS";
              
              this.phno = "9384726501";
       }
       public void inputDetails2() {
             
              this.name = "SUJITH";
              this.possition = "CLASS_TEACHER";
              this.subject = "SOCIAL_SCIENCE";
              this.phno = "9384672501";
       }
       public void printDetails1() {
              System.out.println();
              System.out.println("******TEACHERS DATA***********");
              System.out.println();
              System.out.println("NAME OF TEACHER : " +name);
              System.out.println(""+name+" IS "+possition+" AND DEALS WITH "+subject+"");
              System.out.println("CONTACT ON : " +phno);
       }
       public void printDetails2() {
              System.out.println();
              System.out.println("******TEACHERS DATA***********");
              System.out.println();
              System.out.println("NAME OF TEACHER : " +name);
              System.out.println(""+name+" IS "+possition+" AND DEALS WITH "+subject+"");
              System.out.println("CONTACT ON : " +phno);
       }
}
