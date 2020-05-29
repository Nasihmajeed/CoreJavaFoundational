package com.lxisoft.file;
import com.lxisoft.website.*;
import com.lxisoft.users.*;
import java.io.*;
import java.util.*;
public class FileManager
{
	public void storeToFile(ArrayList<Customer> customers,int ind)
		{
			
				
				String na = customers.get(ind).name;
				int p = customers.get(ind).serviceNumber;
				int rate = customers.get(ind).price;
				int mNum= customers.get(ind).itemModel;
				try
				{
					FileWriter fw = new FileWriter("E:\\hackathon\\CoreJavaFoundational\\WaterPurifier\\src\\com\\lxisoft\\file\\cust.csv",true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(na);bw.write(',');bw.write(Integer.toString(p));bw.write(',');bw.write(Integer.toString(rate));bw.write(mNum);bw.write(',');bw.newLine();bw.close();
					
				}
				catch(Exception e)
				{
					e.printStackTrace();			
				}

			
			
		}  
}