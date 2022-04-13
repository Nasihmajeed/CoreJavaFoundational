public class TDD {

	public static void main(String[] args) {
		School school = new School();
		school.setClassRooms(new ClassRoom[3]);

		for (int i = 1; i < 4; i++) {
			Student[] students = new Student[3];
			for (int j = 1; j <= students.length; j++) {
				students[j - 1] = new Student("STUDENT " + j, j,"ADDRESS " + j);
			}
			Teacher classTeacher = new Teacher("T00" + i, "Teacher " + i, "Subject " + i, "PhoneNumber" + i);
			school.getClassRooms()[i - 1] = new ClassRoom(60 + i, "Class " + i, "A", students, classTeacher);
		}

		school.inputDetails();
		school.printDetails();

	}

}
