import java.util.Scanner;
public class ClassRoom {
       String classes;
       String div;
       int numOfSeats;
       Teacher t1,t2;
       Student s1,s2,s3,s4,s5,s6;
       public void inputDetails1() {
              Scanner in = new Scanner(System.in);
              this.classes = "10 TH";
              this.div = "A";
              this.numOfSeats = 60;
              this.t1.inputDetails1();
              this.s1.inputDetailsS1();
              this.s2.inputDetailsS1();
              this.s3.inputDetailsS1();
              
       }
       public void inputDetails2() {
              Scanner in = new Scanner(System.in);
              this.classes = "10 TH";
              this.div = "B";
              this.numOfSeats = 60;
              this.t2.inputDetails2();
              this.s4.inputDetailsS1();
              this.s5.inputDetailsS1();
              this.s6.inputDetailsS1();

       }
       public void printDetails1() {
              System.out.println();
              System.out.println("~~~~~~CLASS ~~~~~~~~~");
              System.out.println();
              System.out.println("THE DETAILS OF "+classes+" "+div);
              System.out.println("TOTAL NUMBER OF SEATS ARE: " +numOfSeats);
              this.t1.printDetails1();
              System.out.println();
              this.s1.printDetailsS1();
              System.out.println();
              this.s2.printDetailsS2();
              System.out.println();
              this.s3.printDetailsS3();
        
       }
       public void printDetails2() {
              System.out.println();
              System.out.println("~~~~~~CLASS ~~~~~~~~~");
              System.out.println();
              System.out.println("THE DETAILS OF "+classes+" "+div);
              System.out.println("TOTAL NUMBER OF SEATS ARE: " +numOfSeats);
              this.t2.printDetails2();
              System.out.println();
              this.s4.printDetailsS4();
              System.out.println();
              this.s5.printDetailsS5();
              System.out.println();
              this.s6.printDetailsS6();
       }
}
