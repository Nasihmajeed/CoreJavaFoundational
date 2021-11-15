public class School {
       String schoolName;
       String location;
       String address;
       String phNo;
       ClassRoom classes;
       Teacher T1;
       Student S1;
       public void inputDetails() {
              this.schoolName = "MOULANA HEIGHER SECOUNDARY SCHOOL";
              this.location = "MALAMPUZHA CENTER";
              this.address = "MALAMPUZHA (P.O),  PALAKKAD  PIN: 678001";
              this.phNo = "9876501234";
              this.classes.inputDetails();
              this.T1.inputDetails();
              this.S1.inputDetails();
       }
       public void printDetails() {
              System.out.println("SCHOOL NAME IS : " +schoolName);
              System.out.println("LOCATE AT : "+location+" " +address);
              System.out.println("FOR ADMISSION AND ENQUIRY CONTACT : " +phNo);
              this.classes.printDetails();
              this.T1.printDetails();
              this.S1.printDetails();
       }
}
