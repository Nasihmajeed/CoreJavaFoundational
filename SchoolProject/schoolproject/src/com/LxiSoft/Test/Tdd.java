package com.LxiSoft.Test;
// import java.util.*;
import com.LxiSoft.SchoolDetails.School;
public class Tdd
{
	public static void main(String[] args)
	{
		System.out.println("\n\n");
        System.out.println(">----------------------------<");
		System.out.println(">----- Enter the Details-----<");
		
	    School school = new School();
	    school.addSchoolDetails();
		school.printSchoolDetails();
		school.SchoolRankList();
    } 
}