public class School {
       String schoolName;
       String location;
       String address;
       String phNo;
       ClassRoom[] class1 = new ClassRoom[2];
       //class1[0] = {0};
       //class1[1] = {0};
       public void inputDetails() {
              this.schoolName = "MOULANA HEIGHER SECOUNDARY SCHOOL";
              this.location = "MALAMPUZHA CENTER";
              this.address = "MALAMPUZHA (P.O),  PALAKKAD  PIN: 678001";
              this.phNo = "9876501234";
              this.class1[0].inputDetails1();
              this.class1[1].inputDetails2();   
       }
       public void printDetails() {
              System.out.println("SCHOOL NAME IS : " +schoolName);
              System.out.println("LOCATE AT : "+location+" " +address);
              System.out.println("FOR ADMISSION AND ENQUIRY CONTACT : " +phNo);
              this.class1[0].printDetails1();
             this.class1[1].printDetails2();
             
       }
}
