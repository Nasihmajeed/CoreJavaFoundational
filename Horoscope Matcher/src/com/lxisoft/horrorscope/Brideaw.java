package com.lxisoft.horrorscope;
import java.util.Scanner;
public class Brideaw{

	private String brideNameAw;
	public void setBrideNameAw(String a){
		this.brideNameAw=a;
	}

	public String getBrideNameAw(){
		return brideNameAw;
	}
	
	private Integer brideAgeAw;
	public void setBrideAgeAw(Integer a){
		this.brideAgeAw=a;
	}

	public Integer getBrideAgeAw(){
		return brideAgeAw;
	}

	Integer brideDate;
	String brideMonth;
	Integer brideYear;

	String zodiacSign;
	
	public void setBrideDate(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the date of bride");
		 brideDate=scanner.nextInt();
		}

		public void setBrideMonth(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Month of the bride");
		brideMonth=scanner.nextLine();
		}
		
		
		public void setBrideYear(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the year of the bride");
		brideYear=scanner.nextInt();	
		}

		public void printBrideDate(){//printing functions
			System.out.println("Date of the bride is"+brideDate);
		}

		public void printBrideMonth(){
			System.out.println("Month of the bride is"+brideMonth);
		}

		public void printBrideYear(){
			System.out.println("Date of the bride is"+brideYear);
		}

	 public void brideZodiacSign() 
    { 

    	//for(int i=0;i<brides.length;i++){
        String zodiacSign=" "; //optional
          
       
        if (brideMonth == "december"){ 
              
            if (brideDate < 22) 
           zodiacSign = "Sagittarius"; 
            else
            zodiacSign ="capricorn"; 
        } 
              
        else if (brideMonth == "january"){ 
            if (brideDate < 20) 
            zodiacSign = "Capricorn"; 
            else
            zodiacSign = "aquarius"; 
        } 
              
        else if (brideMonth == "february"){ 
            if (brideDate < 19) 
            zodiacSign = "Aquarius"; 
            else
            zodiacSign = "pisces"; 
        } 
              
        else if(brideMonth == "march"){ 
            if (brideDate< 21)  
            zodiacSign = "Pisces"; 
            else
            zodiacSign = "aries"; 
        } 
        else if (brideMonth == "april"){ 
            if (brideDate< 20) 
            zodiacSign = "Aries"; 
            else
            zodiacSign = "taurus"; 
        } 
              
        else if (brideMonth == "may"){ 
            if (brideDate< 21) 
            zodiacSign = "Taurus"; 
            else
            zodiacSign = "gemini"; 
        } 
              
        else if( brideMonth == "june"){ 
            if (brideDate < 21) 
            zodiacSign = "Gemini"; 
            else
            zodiacSign = "cancer"; 
        } 
              
        else if (brideMonth == "july"){ 
            if (brideDate< 23) 
            zodiacSign = "Cancer"; 
            else
            zodiacSign = "leo"; 
        } 
              
        else if(brideMonth == "august"){ 
            if (brideDate< 23)  
            zodiacSign = "Leo"; 
            else
            zodiacSign = "virgo"; 
        } 
              
        else if (brideMonth== "september"){ 
            if (brideDate< 23) 
            zodiacSign = "Virgo"; 
            else
            zodiacSign = "libra"; 
        } 
              
        else if (brideMonth== "october"){ 
            if (brideDate< 23) 
            zodiacSign = "Libra"; 
            else
            zodiacSign = "scorpio"; 
        } 
              
        else if (brideMonth== "november"){ 
            if (brideDate< 22) 
            zodiacSign = "scorpio"; 
            else
            zodiacSign = "sagittarius"; 
        } 
              
        System.out.println("The Zodiac sign of the bride is"+zodiacSign); 
     
}

	/*public void printBrideDetails(){
		System.out.println(" "+brideDate);
		System.out.println(" "+brideMonth);
		System.out.println(" "+brideMonth);
	}*/
}