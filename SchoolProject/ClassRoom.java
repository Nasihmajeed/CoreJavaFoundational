public class ClassRoom  {
	
	int seats;
	String standard;
	String division;
	Student[] students;
	Teacher classTeacher;

	ClassRoom(int seats, String standard, String division, Student[] students, Teacher classTeacher) {
		this.seats = seats;
		this.standard = standard;
		this.division = division;
		this.students = students;
		this.classTeacher = classTeacher;
	}

	public void printDetails() {
		System.out.println(standard + " " + division + "\n");

		System.out.println();

		System.out.println("Number of seats: " + seats);
		System.out.println("\nCLASS TEACHER\n");

		System.out.println();

		classTeacher.printDetails();
		System.out.println("\nSTUDENTS\n");

		System.out.println();

		for (int i = 0; i < students.length; i++) {
			students[i].printDetails();
		}
		System.out.println();
	}
}