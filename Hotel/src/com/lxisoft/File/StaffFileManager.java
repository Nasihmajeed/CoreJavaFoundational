package com.lxisoft.File;
import com.lxisoft.Hotel.*;
import com.lxisoft.Person.*;
import java.io.*;
public class StaffFileManager
{
	public File loadFile()
	{
		Hotel hotel = new Hotel();
		File file = new File("E:\\prgmfiles\\CoreJavaFoundational\\Hotel\\src\\com\\lxisoft\\File\\StaffDetails.csv");
		try
		{
			Boolean tf = file.exists();
			if(!tf)
			{	
				file.createNewFile();
				throw new StafffileNotFound();

			}
		}
		catch(StafffileNotFound e)
		{
			System.out.println("\tFile Created\n\n \t No Staffs found\n");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return file;
	}

	public void staffToFile(Staff[] staff,int ind)
	{
		File file = loadFile();	
		try
		{
			FileWriter fw = new FileWriter(file,false);
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
				FileWriter fw = new FileWriter(file,true);
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
		File file = loadFile();
		int rowCount=1,i=0;
		String details;
		try
		{
			FileReader fr = new FileReader(file);
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
class StafffileNotFound extends Exception
{
	public StafffileNotFound()
	{
		System.out.println("Please initialize the Staffs first - file missing");
	}
}