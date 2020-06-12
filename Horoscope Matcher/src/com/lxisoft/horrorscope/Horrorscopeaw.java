package com.lxisoft.horrorscope;
import java.util.Scanner;
public class Horrorscopeaw{
	Brideaw[] brides;
	Groomaw[] grooms;

	String brideNameAw;
	Integer brideAgeAw;

	String groomNameAw;
	Integer groomAgeAw;

	public void horoscopeDetail(){
		Scanner scanner=new Scanner(System.in);

		 System.out.println("*******************************************************************");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                        HOROSCOPE MATCH MAKER                                                    ");
        System.out.println("                                                                                     			 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("*******************************************************************");
		
		System.out.println("No of brides");
		int countBride=scanner.nextInt();

		brides=new Brideaw[countBride];


		for(int i=0;i<brides.length;i++){

			brides[i]=new Brideaw();
		}

		System.out.println("No of grooms");
		int countGroom=scanner.nextInt();

		grooms=new Groomaw[countGroom];


		for(int i=0;i<grooms.length;i++){

			grooms[i]=new Groomaw();
		}
	}

		public void getBrideNameAw(){


			for(int i=0;i<brides.length;i++){

			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Brides name");
			brideNameAw=scanner.nextLine();
			brides[i].setBrideNameAw(brideNameAw);
			brides[i].getBrideNameAw();

			}
		}

			public void getBrideAgeAW(){


			for(int i=0;i<brides.length;i++){

			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Brides age");
			brideAgeAw=scanner.nextInt();
			brides[i].setBrideAgeAw(brideAgeAw);
			brides[i].getBrideAgeAw();
			 brides[i].setBrideDate();
			  brides[i].setBrideMonth();
			   brides[i].setBrideYear();
			brides[i].brideZodiacSign();//calling zodiac sign

			}
		}

		public void getGroomNameAw(){


			for(int i=0;i<brides.length;i++){

			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Groom name");
			groomNameAw=scanner.nextLine();
			grooms[i].setGroomNameAw(groomNameAw);
			grooms[i].getGroomNameAw();
			


			}
		}

		public void getGroomAgeAw(){


			for(int i=0;i<brides.length;i++){

			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Groom age");
			groomAgeAw=scanner.nextInt();
			grooms[i].setGroomAgeAw(groomAgeAw);
			grooms[i].getGroomAgeAw();
			grooms[i].setGroomDate();
			grooms[i].setGroomMonth();
			grooms[i].setGroomYear();


			}
		}

		public void printBrideDetails(){
				for(int i=0;i<brides.length;i++){


			System.out.println("								");
			System.out.println("The bride details are");
			System.out.println("The bride name is "+brideNameAw);
			System.out.println("The bride name is "+brideAgeAw);
			brides[i].printBrideDate();
			brides[i].printBrideMonth();
			brides[i].printBrideYear();
			
		}

		public void printGroomDetails(){
				for(int i=0;i<brides.length;i++){


			System.out.println("								");
			System.out.println("The bride details are");
			System.out.println("The bride name is "+groomNameAw);
			System.out.println("The bride name is "+groomAgeAw);
			grooms[i].printBrideDate();
			grooms[i].printBrideMonth();
			grooms[i].printBrideYear();
			
		}




		}




}

	
