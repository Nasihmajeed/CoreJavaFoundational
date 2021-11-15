public class TDD {
       public static void main(String[] args) {
              System.out.println("---------- WELCOME TO MHSS ---------");
        School s = new School();
        ClassRoom c1 = new ClassRoom();
        s.classes = c1;
        Teacher t1 = new Teacher();
        s.T1 = t1;
        Student s1 = new Student();
        s.S1 = s1;
        s.inputDetails();
        s.printDetails();      
       }
}
