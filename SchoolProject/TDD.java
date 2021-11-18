public class TDD {
       public static void main(String[] args) {
              System.out.println("---------- WELCOME TO MHSS ---------");
              System.out.println();
        School s = new School();

        ClassRoom c1 = new ClassRoom();
        s.class1[0] = c1;

        Teacher t1 = new Teacher();
        c1.ts[0] = t1;

        Student s1 = new Student();
        c1.ss[0] = s1;
       
        Student s2 = new Student();
        c1.ss[1] = s2;

        Student s3 = new Student();
        c1.ss[2] = s3;

        ClassRoom c2 = new ClassRoom();
        s.class1[1] = c2;

        Teacher t2 = new Teacher();
        c2.ts[1] = t2;

        Student s4 = new Student();
        c2.ss[3] = s4;

        Student s5 = new Student();
        c2.ss[4] = s5;

        Student s6 = new Student();
        c2.ss[5] = s6;

        s.inputDetails();
        s.printDetails();      
       }
}
