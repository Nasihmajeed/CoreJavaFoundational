public class TDD {
       public static void main(String[] args) {
              System.out.println("---------- WELCOME TO MHSS ---------");
              System.out.println();
        School s = new School();

        ClassRoom c1 = new ClassRoom();
        s.class1 = c1;

        Teacher t1 = new Teacher();
        c1.T1 = t1;

        Student s1 = new Student();
        c1.S1 = s1;
       
        Student s2 = new Student();
        c1.S2 = s2;

        Student s3 = new Student();
        c1.S3 = s3;

        ClassRoom c2 = new ClassRoom();
        s.class2 = c2;

        Teacher t2 = new Teacher();
        c2.T2 = t2;

        Student s4 = new Student();
        c2.S4 = s4;

        Student s5 = new Student();
        c2.S5 = s5;

        Student s6 = new Student();
        c2.S6 = s6;

        s.inputDetails();
        s.printDetails();      
       }
}
