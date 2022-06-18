public class Tdd {

public static void main(String[] args) {


School ss = new School ("GHSS Pathiripala","Ottapalam");


ClassRoom c1 = new ClassRoom ("10" , "A");

ss.class1 = c1;

ClassRoom c2 = new ClassRoom ("10" , "B");

ss.class2 = c2;


Teacher tt = new Teacher ("Teacher1", "Subject1");

c1.tr = tt;


Teacher tt1 = new Teacher ("Teacher2", "Subject2");

c2.tr = tt1;


Student st1 = new Student("Ram", "Maths", "75", "7");

c1.student1 =st1;

Student st2 = new Student("Akhil", "Science", "95", "10");

c1.student2 =st2;

Student st3 = new Student("Ajith", "Social Science", "65", "11");

c1.student3 =st3;

Student st4 = new Student("Rohan", "English", "95", "33");

c1.student4 =st4;


Student st5 = new Student("Ravi", "Maths", "75", "7");

c2.student1 =st5;

Student st6 = new Student("Joseph", "Science", "95", "10");

c2.student2 =st6;

Student st7 = new Student("Alfi", "Social Science", "65", "11");

c2.student3 =st7;

Student st8 = new Student("Rahul", "English", "95", "33");

c2.student4 =st8;



ss.printdetails();

}

}