package com.School;

public class ClassRoom  {
	ClassRoom[] classRoom = new ClassRoom[5];
	int seats;
	public void inputDetails() {
		
			this.seats = 35;
	}
	public void printDetails() {
		 char div[] = {'A','B','C','D','E'};
		 String std[] = {"PRE-KG","LKG","UKG"};
		 
		for (int i = 0; i < std.length; i++) {
			System.out.println("STANDARD" + " " + std[i]);
			for (int j = 0; j < div.length; j++) {
				System.out.println("DIVISION-" + div[j]);
			}
		System.out.println("NUMBER OF SEATS : " + seats + "\n");
		}
	}

}
