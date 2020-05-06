package com.lxisoft.nivea;
import java.util.*;
public class Fileoperation
{
	public void operation()
	{
		String s;
		String csv="com/lxisoft/nivea/Balldetails.csv";
		try {
		FileReader fr = new FileReader(csv);
		BufferedReader br = new BufferedReader(fr);
		while((s = br.readLine()) != null)
		System.out.println(s,",");
		br.flush();
		} 
		catch (IOException e)
		{ 
			System.out.println("io error"); 
		}
	}
}