
package com.lxisoft.test;


import com.lxisoft.schoolproject.School;


import java.util.Scanner;

public class TDD
{
	public static void main(String[] args)
	{
		School h=new School();

			String sname;

			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter schoolname");
			sname=scanner.nextLine();


		h.setSchoolName(sname);
		h.getSchoolName();

		h.schoolDetail();
		h.printDetails();
		h.printSchoolRankDetails();
		

	}
}