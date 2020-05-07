package com.lxisoft.FileOperations ;

import java.util.* ;
import java.io.* ;
import com.lxisoft.Hotel.* ;

public class StaffManager
{
	String filePath = "C:\\Users\\mradw\\Documents\\Internship-Lxi\\Java\\Projects\\Hotel\\src\\com\\lxisoft\\FileOperations\\StaffData.csv" ;	
	
	boolean titleRow; 

	public File fetchFile()
	{
		
		File file = new File(filePath) ;

		try
		{
			Boolean checkExistence = file.exists() ;

			if(!checkExistence)
			{
				file.createNewFile() ;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace() ;
		}

		return file ;
	}

	public int fetchDataFromFile(Staff[] st)
	{
		int index = -1 ;
		File staffData = fetchFile() ;

		titleRow = true ;

		try
		{
			
			String rowDetails="" ;

			FileReader fr = new FileReader(staffData);
			BufferedReader br = new BufferedReader(fr);
			
			while((rowDetails = br.readLine())!=null)
			{
			   if(titleRow)
			   {
			   		rowDetails = br.readLine() ;
			   		titleRow = false ;
			   }

			    index++ ;

			    String[] rowDetailsSplit = rowDetails.split(",");
				st[index].setWholeStaff((Integer.parseInt(rowDetailsSplit[0])),rowDetailsSplit[1],rowDetailsSplit[2],(Integer.parseInt(rowDetailsSplit[3]))) ;
			}

			return index ;
		}
		catch(Exception e)
		{
			e.printStackTrace() ;
		}

		return index ;
	}

	public void syncFileData(Staff[] st,int index)
	{
		File staffData = fetchFile() ;

		titleRow = true ;

		String titleRowData = "Emp.No,NAME,DESIGNATION,SALARY" ;

		try
		{
			FileWriter fw = new FileWriter(staffData,false);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.flush();
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
				
		for(int i=0;i<=index;i++)
		{
			int empNo = st[i].getEmpNo() ;
			String name = st[i].getStaffName();
			String des = st[i].getStaffDesignation();
			int sal = st[i].getStaffSalary();
			
			String dataRow = Integer.toString(empNo) + "," + name + "," + des + "," + Integer.toString(sal);
	
			try
			{

				FileWriter fW = new FileWriter(staffData,true);
				BufferedWriter bW = new BufferedWriter(fW);
				PrintWriter pW = new PrintWriter(bW) ;
			
				if(titleRow)
				{
					pW.println(titleRowData) ;
					titleRow = false ;	
				}

			pW.println(dataRow) ;

			pW.flush() ;
			pW.close() ;
				
			}
			catch(Exception e)
			{
				e.printStackTrace();			
			}
		}
	}
}


