

public class TDD {

	public static void main(String[] args) {
		School school = new School();
		school.setClassRooms(new ClassRoom[3]);

		for (int i = 1; i < 4; i++) {
			Student[] students = new Student[3];
			for (int j = 1; j <= students.length; j++) {
				students[j - 1] = new Student("Student " + j, j);
			}
			Teacher classTeacher = new Teacher("Teacher " + i, "Subject " + i, 9000000000l + i);
			school.getClassRooms()[i - 1] = new ClassRoom(35 + i, "Class " + i, "A", students, classTeacher);
		}

		school.inputDetails();
		school.printDetails();

	}

}