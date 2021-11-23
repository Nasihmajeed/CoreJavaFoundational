package com.School;

public class ClassRoom  {
	
	String name;
	int seats = 35;
       int number;
       String div;
       //Teacher[] t = new Teacher[3];
	ClassRoom(String n,int i,String d){
           name = n;
           number = i;
           div = d;
       }


	public void printDetails() {
			System.out.println(name +" "+ number +" "+ div + "\n");
			
		System.out.println("NUMBER OF SEATS : " + seats + "\n");
		
             // for (int i = 0; i < t.length; i++) {
               //      this.t[i].printDetails();
            //  }
		}
	}

