import java.util.Scanner;
public class ClassRoom {
       String classes;
       String div;
       int numOfSeats;
       Teacher T1,T2;
       Student S1,S2,S3,S4,S5,S6;
       public void inputDetails1() {
              Scanner in = new Scanner(System.in);
              this.classes = "10 TH";
              this.div = "A";
              this.numOfSeats = 60;
              this.T1.inputDetails1();
              this.S1.inputDetailsS1();
              this.S2.inputDetailsS1();
              this.S3.inputDetailsS1();
              
       }
       public void inputDetails2() {
              Scanner in = new Scanner(System.in);
              this.classes = "10 TH";
              this.div = "B";
              this.numOfSeats = 60;
              this.T2.inputDetails2();
              this.S4.inputDetailsS1();
              this.S5.inputDetailsS1();
              this.S6.inputDetailsS1();

       }
       public void printDetails1() {
              System.out.println();
              System.out.println("~~~~~~CLASS ~~~~~~~~~");
              System.out.println();
              System.out.println("THE DETAILS OF "+classes+" "+div);
              System.out.println("TOTAL NUMBER OF SEATS ARE: " +numOfSeats);
              this.T1.printDetails1();
              System.out.println();
              this.S1.printDetailsS1();
              System.out.println();
              this.S2.printDetailsS2();
              System.out.println();
              this.S3.printDetailsS3();
        
       }
       public void printDetails2() {
              System.out.println();
              System.out.println("~~~~~~CLASS ~~~~~~~~~");
              System.out.println();
              System.out.println("THE DETAILS OF "+classes+" "+div);
              System.out.println("TOTAL NUMBER OF SEATS ARE: " +numOfSeats);
              this.T2.printDetails2();
              System.out.println();
              this.S4.printDetailsS4();
              System.out.println();
              this.S5.printDetailsS5();
              System.out.println();
              this.S6.printDetailsS6();
       }
}
