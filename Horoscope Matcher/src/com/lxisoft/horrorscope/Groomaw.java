package com.lxisoft.horrorscope;
import java.util.Scanner;
public class Groomaw{

		private String groomNameAw;
	public void setGroomNameAw(String a){
		this.groomNameAw=a;
	}

	public String getGroomNameAw(){
		return groomNameAw;
	}
	
	private Integer brideAgeAw;
	public void setGroomAgeAw(Integer a){
		this.brideAgeAw=a;
	}

	public Integer getGroomAgeAw(){
		return brideAgeAw;
	}

	
	Integer groomDate;
	String groomMonth;
	Integer groomYear;

	String zodiacSign;
	
	public void setGroomDate(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the date of groom");
		 groomDate=scanner.nextInt();
		}

		public void setGroomMonth(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Month of the groom");
		groomMonth=scanner.nextLine();
		}

		public void setGroomYear(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the year of the groom");
		groomYear=scanner.nextInt();

	}

	public void printGroomDate(){//printing functions
			System.out.println("Date of the bride is"+groomDate);
		}

		public void printGroomMonth(){
			System.out.println("Month of the bride is"+groomMonth);
		}

		public void printGroomYear(){
			System.out.println("Date of the bride is"+groomYear);
		}






	public void printBrideDetails(){
		System.out.println(" "+groomDate);
		System.out.println(" "+groomMonth);
		System.out.println(" "+groomMonth);
	}
	
}