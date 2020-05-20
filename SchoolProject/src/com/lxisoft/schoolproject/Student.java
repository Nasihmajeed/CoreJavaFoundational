package com.lxisoft.schoolproject;

import java.util.Scanner;
public class Student
{
	private String name;
	public void setStudentName(String a){
		this.name=a;
	}
	public String getStudentName(){
		return name;
	}



	private String regNo;
	public void setRegNo(String a){
		this.regNo=a;
	}
	public String getRegNo(){
		return regNo;
	}

	
	private Integer total;
	public void setStudentTotal(Integer a){
		this.total=a;
	}
	public Integer getStudentTotal(){
		return total;
	}
	private double percentage;
	public void setPercentage(double a){
		this.percentage=a;
	}
	public double getPercentage(){
		return percentage;
	}

	Subject[] subjects;
	

	public void studentDetails(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Subjectcount");
		int subjectscount=Integer.parseInt(scanner.nextLine());

		subjects=new Subject[subjectscount];

		
		for(int i=0;i<subjects.length;i++){//encap of subjects
			
			

			subjects[i]=new Subject();

			System.out.println("Enter subject name");
			String subjectName=scanner.nextLine();
			subjects[i].setSubjectName(subjectName);
			subjects[i].getSubjectName();

			System.out.println("Enter the mark");
			Integer mark=Integer.parseInt(scanner.nextLine());
			subjects[i].setSubjectMark(mark);
			subjects[i].getSubjectMark();



		
		}


		//for(int i=0;i<subjects.length;i++){


		//	subjects[i].subjectDetails();
		//}

	}

	
	public void printStudentDetails(){
		System.out.println("The student name is"+name);

		System.out.println("The register number is"+regNo);


		for(int i=0;i<subjects.length;i++){
			subjects[i].printSubjectDetails();
		}

	}

	public void  printTotalMarks(){
		System.out.println("***************");

		total=0;
		percentage=0.0;
		for(int i=0;i<subjects.length;i++){

		
			total=total+subjects[i].getSubjectMark();
			percentage=((total/(subjects.length*100.0)*100.0));

		}

	}

	public void printPercentage(){
			System.out.println("The total marks "+total);
			System.out.println("The percentage is"+percentage);
	}
		

	public void printResultOfStudents(){
		System.out.println("RESULTS");
		
		for(int i=0;i<subjects.length;i++){
			if(subjects[i].getSubjectMark()>45){
				System.out.println("Passed in "+subjects[i].getSubjectName());
			}
			else{
				System.out.println("Failed in"+subjects[i].getSubjectName());	
			}
		}
	}

}

	



