package com.lxisoft.schoolproject;

import java.util.Scanner;

public class ClassRoom{
	Student[] students;
	Teacher teacher;
	int studentslength;
	String name;//name of student in student class
	String regNo;//reg no of the student in student class
	String teacherName;
	String subject;//subject of teacher encap

	private String classNo;//encapsulated
	public void setClassNo(String a){
		this.classNo=a;
	}

	public String getClassNo(){
		return classNo;
	}
	
	

	public void classRoomDetalis(){
		System.out.println("Enter count of students");
		Scanner scanner=new Scanner(System.in);
		int studentscount=Integer.parseInt(scanner.nextLine());
		students=new Student[studentscount];
		
		for(int i=0;i<students.length;i++){
			students[i]=new Student();
		}


		teacher=new Teacher();

	
		System.out.println("Enter teacher name");
		teacherName=scanner.nextLine();
		teacher.setTeacherName(teacherName);//encap teacher
		teacher.getTeacherName();
		
		
		
		System.out.println("Enter subject name");
		subject=scanner.nextLine();
		teacher.setTeacherSubject(subject);//encap teacher subject
		teacher.getTeacherSubject();
		
		
		

		teacher.teacherDeatails();//
		
		for(int i=0;i<students.length;i++){
			
			System.out.println("Enter student name");//encap student
			name=scanner.nextLine();
			students[i].setStudentName(name);
			students[i].getStudentName();

			System.out.println("Enter register number ");//encap
			regNo=scanner.nextLine();
			students[i].setRegNo(regNo);
			students[i].getRegNo();

		
		
			students[i].studentDetails();
		}


		for(int i=0;i<students.length;i++){
			students[i].setStudentName(name);//**
			students[i].getStudentName();
			students[i].printTotalMarks();
		}
		
		
	}

	public void printClassnumber(){
		System.out.println(".............................");
		System.out.println(".............................");
		System.out.println("The class number is"+classNo);



		for(int i=0;i<students.length;i++){

			students[i].setStudentName(name);
			students[i].getStudentName();//**
			students[i].printStudentDetails();
			students[i].printPercentage();
			students[i].printResultOfStudents();
		}

		

			
	}


	public void printRankDetails(){
		System.out.println("THE RANKLIST");
		System.out.println("###############");
		System.out.println("student length"+students.length);
		for(int i=0;i<students.length;i++){
				
			for(int j=i+1;j<students.length;j++){

				System.out.println("i ="+i);
				System.out.println("j ="+j);
				students[i].setStudentName(name);
				students[i].getStudentName();//**
				if(students[i].getStudentTotal()<students[j].getStudentTotal()){//** total encap
					Student temp=students[i];
					students[i]=students[j];
					students[j]=temp;
				}
			}


		}

		for(int i=0;i<students.length;i++){

			students[i].setStudentName(name);
			students[i].getStudentName();

			System.out.println(students[i].getStudentName() + " :"+students[i].getStudentTotal());
		} 
	}


	public void setNewStudentNo(){
		for(int i=0;i<students.length;i++){
			int studentslength=students.length;
			System.out.println("NO OF STUDENTS ARE"+studentslength);
		}
	}

	
}