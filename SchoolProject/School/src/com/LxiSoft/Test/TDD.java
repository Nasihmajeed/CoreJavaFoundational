package com.LxiSoft.Test;
import com.LxiSoft.Schools.School;

public class TDD
{
    public static void main(String[] args) 
    {
        System.out.println("\n\n");
        System.out.println(">----------------------------<");
        System.out.println(">----- Enter the Details-----<");
        
        School school = new School();

        school.addSchoolDetails();
        school.printSchoolDetails();
    } 
}