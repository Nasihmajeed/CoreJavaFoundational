package tst;

public class Center
{
 public static void main (String[] args)
 {
	 School sc=new School("j.m.h.s","Tirur");
	 sc.printinfoSchoo();
	 ClassRoom cr=new ClassRoom(5,'A');
	 cr.printinfoClass();
	 Teacher te=new Teacher("Radha","Malayalam");
	 te.printinfoTeacher();
	 Student stu=new Student("Aysha","Malayalam",3,48);
	 stu.printinfoStudent();
	 
 }
}
