import java.util.Scanner;
public class ClassRoom {
       String classes;
       String div;
       int numOfSeats;
       public void inputDetails() {
              Scanner in = new Scanner(System.in);
              
              System.out.println("WHICH CLASS DETAILS YOU WANT ?");
              this.classes = in.nextLine();
              System.out.println("ENTER THE DIVISSION");
              this.div = in.nextLine();
              this.numOfSeats = 60;
       }
       public void printDetails() {
              System.out.println("~~~~~~CLASS DATA'S~~~~~~~~~");
              
              System.out.println("THE DETAILS OF "+classes+"TH "+div);
              System.out.println("TOTAL NUMBER OF SEATS ARE: " +numOfSeats);
       }
}
