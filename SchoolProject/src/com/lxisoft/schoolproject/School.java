package com.lxisoft.schoolproject;

import java.util.Scanner;

public class School{

	ClassRoom[] classRooms; 
	String clsno;//encapsulation

	private String schoolName;
	public void setSchoolName(String a){
					
		this.schoolName=a;
	}

	public String getSchoolName(){
					
		return schoolName;
	}

		
	public void schoolDetail(){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Classroom count");
		int count=scanner.nextInt();

		classRooms=new ClassRoom[count];


		for(int i=0;i<classRooms.length;i++){

			classRooms[i]=new ClassRoom();

			
			
			System.out.println("Enter classno");//***
			clsno=scanner.nextLine();
			classRooms[i].setClassNo(clsno);

			classRooms[i].getClassNo();



		
		}
		
		for(int i=0;i<classRooms.length;i++){
			classRooms[i].classRoomDetalis();
		}
	} 

	public void printDetails(){
		System.out.println("The school name is"+schoolName);

		for(int i=0;i<classRooms.length;i++){
			classRooms[i].setClassNo(clsno);
			classRooms[i].getClassNo();
			classRooms[i].printClassnumber();
			//confused one
			classRooms[i].setNewStudentNo();
			classRooms[i].printRankDetails();
		}
		
	}

	public void printSchoolRankDetails(){
		System.out.println("SCHOOL RANK DETAILS");

			String name;

			


		int arraylength=0;
		
		for(int i=0;i<classRooms.length;i++){


				
		 		arraylength=arraylength+classRooms[i].students.length;	
	
		}


		Student[] newstudents=new Student[arraylength];
		System.out.println("loc array length :"+arraylength);
		System.out.println("loc array length :"+newstudents.length);

		int k=0;
		for(int i=0;i<classRooms.length;i++){
			System.out.println(" i ="+i);
			for(int j=0;j<classRooms[i].students.length;j++){
				
				System.out.println(" j ="+j);
				newstudents[k]=classRooms[i].students[j];
				k++;
			}
		}

			
			
		for(int i=0;i<newstudents.length;i++){
			for(int j=i+1;j<newstudents.length;i++){
				System.out.println(" i ="+i);
				System.out.println(" j ="+j);

				if(newstudents[i].getStudentTotal()<newstudents[j].getStudentTotal()){
					Student temp=newstudents[i];
					newstudents[i]=newstudents[j];
					newstudents[j]=temp;
				}
			}
		}

		for(int i=0;i<newstudents.length;i++){
		
			System.out.println(newstudents[i].getStudentName() + " :"+newstudents[i].getStudentTotal());//pending work
		}
					
	}	
}


	
