public class TDD {
       public static void main(String[] args) {
              System.out.println("---------- WELCOME TO MHSS ---------");
              System.out.println();
        School s = new School();

        ClassRoom c1 = new ClassRoom();
        s.class1 = c1;

        Teacher t1 = new Teacher();
        c1.t1 = t1;

        Student s1 = new Student();
        c1.s1 = s1;
       
        Student s2 = new Student();
        c1.s2 = s2;

        Student s3 = new Student();
        c1.s3 = s3;

        ClassRoom c2 = new ClassRoom();
        s.class2 = c2;

        Teacher t2 = new Teacher();
        c2.t2 = t2;

        Student s4 = new Student();
        c2.s4 = s4;

        Student s5 = new Student();
        c2.s5 = s5;

        Student s6 = new Student();
        c2.s6 = s6;

        s.inputDetails();
        s.printDetails();      
       }
}
