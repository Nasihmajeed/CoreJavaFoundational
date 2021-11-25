public class TDD {

	public static void main(String[] args) {
		School school = new School();
		school.classRooms = new ClassRoom[3];

		Student[] students = new Student[4];
		students[0] = new Student("SANIL", 1,"15");
		students[1] = new Student("SARANGI", 2 ,"15");
		students[2] = new Student("NISHAD", 3 , "15");
		students[3] = new Student("SANDRA", 4 , "15");
		Teacher classTeacher = new Teacher("SHABNA", "MATHS", "9089786775");
		school.classRooms[0] = new ClassRoom(60, "10 TH", "A", students, classTeacher);

		students = new Student[4];
		students[0] = new Student("MUBASHIR", 1,"15");
		students[1] = new Student("GOKUL", 2,"15");
		students[2] = new Student("APPUKUTTAN", 3,"15");
		students[3] = new Student("MAHESH", 4,"15");
		classTeacher = new Teacher("SUJITH", "MALAYALAM", "9104567382");
		school.classRooms[1] = new ClassRoom(25, "10 TH", "B", students, classTeacher);

		students = new Student[4];
		students[0] = new Student("SAI KRISHNA", 1,"15");
		students[1] = new Student("SREEJITH", 2,"15");
		students[2] = new Student("SNEHA", 3,"15");
		students[3] = new Student("SOURAV", 4,"15");
		classTeacher = new Teacher("MAYA", "COMPUTERSCIENCE", "9272823646");
		school.classRooms[2] = new ClassRoom(30, "10 TH", "C", students, classTeacher);

		school.inputDetails();
		school.printDetails();

	}
}