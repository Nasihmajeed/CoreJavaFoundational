package com.lxisoft.File;
import com.lxisoft.Hotel.*;
import com.lxisoft.Person.*;
import java.io.*;
public class StaffFileManager
{
	public void staffToFile(Staff[] staff,int ind)
	{
		// int counter=1;	
		try
		{
			FileWriter fw = new FileWriter("E:\\prgmfiles\\CoreJavaFoundational\\Hotel\\src\\com\\lxisoft\\File\\StaffDetails.csv",false);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		for(int i=0;i<ind;i++)
		{
			int sNum= staff[i].getStaffNum();
			String name = staff[i].getStaffName();
			String job = staff[i].getStaffjob();
			try
			{
				FileWriter fw = new FileWriter("E:\\prgmfiles\\CoreJavaFoundational\\Hotel\\src\\com\\lxisoft\\File\\StaffDetails.csv",true);
				BufferedWriter bw = new BufferedWriter(fw);
				
				bw.write(Integer.toString(sNum));bw.write(',');bw.write(name);bw.write(',');bw.write(job);bw.newLine();bw.close();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();			
			}

		}
		
		
	} 
	public int readStaff(Staff[] staff,int ind) 
	{
		int rowCount=1,i=0;
		String details;
		try
		{
			FileReader fr = new FileReader("E:\\prgmfiles\\CoreJavaFoundational\\Hotel\\src\\com\\lxisoft\\File\\StaffDetails.csv");
			BufferedReader br = new BufferedReader(fr);
			i=0;
			while((details=br.readLine())!=null)
			{
				if(rowCount==1)
				{
					details=br.readLine();
					rowCount++;
				}
				String[] st =details.split(",");
				staff[i].setStaff((Integer.parseInt(st[0])),st[1],st[2]);
				i++;
				ind=i;
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		return ind;

	}

}