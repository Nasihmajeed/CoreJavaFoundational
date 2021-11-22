public class ClassRoom {
       String classes;
       String div;
       int numOfSeats;
       Teacher[] ts = new  Teacher[2];
       Student[] ss = new Student[6];
       public void inputDetails1() {
              this.classes = "10 TH";
              
              this.div = "A";
	 this.numOfSeats = 60;
              
              this.ts[0].inputDetails1();
             this.ss[0].inputDetailsS1();
              this.ss[1].inputDetailsS1();
              this.ss[2].inputDetailsS1();
              
       }
       public void inputDetails2() {
            
              this.classes = "10 TH";
              this.div = "B";
              this.numOfSeats = 60;
              this.ts[1].inputDetails2();
              this.ss[3].inputDetailsS1();
              this.ss[4].inputDetailsS1();
              this.ss[5].inputDetailsS1();

       }
       public void printDetails1() {
              System.out.println();
              System.out.println("~~~~~~CLASS ~~~~~~~~~");
              System.out.println();
              System.out.println("THE DETAILS OF "+classes+" "+div);
              System.out.println("TOTAL NUMBER OF SEATS ARE: " +numOfSeats);
             this.ts[0].printDetails1();
              System.out.println();
              this.ss[0].printDetailsS1();
              System.out.println();
              this.ss[1].printDetailsS2();
              System.out.println();
              this.ss[2].printDetailsS3();
        
       }
       public void printDetails2() {
              System.out.println();
              System.out.println("~~~~~~CLASS ~~~~~~~~~");
              System.out.println();
              System.out.println("THE DETAILS OF "+classes+" "+div);
              System.out.println("TOTAL NUMBER OF SEATS ARE: " +numOfSeats);
              this.ts[1].printDetails2();
              System.out.println();
              this.ss[3].printDetailsS4();
              System.out.println();
              this.ss[4].printDetailsS5();
              System.out.println();
              this.ss[5].printDetailsS6();
       }
   
}
