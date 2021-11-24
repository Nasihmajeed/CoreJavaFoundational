package com.school;

public class TDD {

	public static void main(String[] args) {
		School school = new School();
		school.classRooms = new ClassRoom[3];

		Student[] students = new Student[3];
		students[0] = new Student("Jameesh", 1);
		students[1] = new Student("Nazeera", 2);
		students[2] = new Student("Shabna", 3);
		Teacher classTeacher = new Teacher("Sanil", "Maths", 9000000000l);
		school.classRooms[0] = new ClassRoom(35, "PRE KG", "A", students, classTeacher);

		students = new Student[4];
		students[0] = new Student("Sirajudeen", 1);
		students[1] = new Student("Shakeela", 2);
		students[2] = new Student("Shaanif", 3);
		students[3] = new Student("Ibrahim", 4);
		classTeacher = new Teacher("Sai Krishna", "Social", 9100000000l);
		school.classRooms[1] = new ClassRoom(25, "LKG", "A", students, classTeacher);

		students = new Student[4];
		students[0] = new Student("Jamsheera", 1);
		students[1] = new Student("Riyaz", 2);
		students[2] = new Student("Sayan", 3);
		students[3] = new Student("Ayrin", 4);
		classTeacher = new Teacher("Sarangi", "English", 9200000000l);
		school.classRooms[2] = new ClassRoom(30, "UKG", "A", students, classTeacher);

		school.inputDetails();
		school.printDetails();

	}

}