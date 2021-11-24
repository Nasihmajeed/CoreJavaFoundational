public class Student {
	String sname;
	int rollNo;
       String age;

	public Student(String name, int rollNo,String age) {
		this.sname = name;
		this.rollNo = rollNo;
              this.age = age;
	}

	public void printDetails() {
		System.out.println("Student Name: " + sname + "\nRoll Number: " + rollNo + "\n age : "+ age);
	}
}
