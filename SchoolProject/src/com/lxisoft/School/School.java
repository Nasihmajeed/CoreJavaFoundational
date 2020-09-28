package com.lxisoft.School;
import com.lxisoft.School.Classroom;
import java.util.Scanner;
public class School
{    
	public String Name,Principal,Address,Teacher,Students;
	public void schoolDetails()
	{
		System.out.println("                SCHOOL NAME IS VYASA VIDYA PEETHAM               ");




		System.out.println(" vyasa vidya peetham \n Near District Police camp \n kallekkad (po) ,palakkad \n pincode :678006");

    	System.out.println(" Principal of vyasa vidya peetham is       : ABCD");

    	System.out.println(" Contact number :   160057");
    }






    public void display()
    {
    	Classroom cr = new Classroom();
        cr.setstudentdetails1();
        cr.setstudentdetails2();
        cr.getstudentdetails1();
        cr.getstudentdetails2();
        cr.topper1();
        cr.topper2();
        cr.schooltopper();
        cr.teacher(cr.teacher);
    }

}
