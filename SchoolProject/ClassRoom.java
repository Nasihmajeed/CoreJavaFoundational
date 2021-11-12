public class ClassRoom{
       String std;
       String div;
       public void printDetails() {
             // System.out.println("YOU ARE UNDER "+this.std+" TH STANDERD ");
             // System.out.println("YOUR DIVISION IS " +this.div);
              Teachers T1 = new Teachers();
              T1.Name = "shabna";
              T1.Possition = "class_Teacher";
              T1.Subject = "Maths";
              T1.State = "permenant staff";
              T1.printDetails();
       }
}