package com.lxisoft.FileOperations ;

import java.util.* ;
import java.io.* ;
import com.lxisoft.Item.* ;

public class InventoryManager
{
	String filePath = "C:\\Users\\mradw\\Documents\\Internship-Lxi\\Java\\Projects\\Hotel\\src\\com\\lxisoft\\FileOperations\\InventoryData.csv" ;	
	
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


	public int fetchDataFromFile(Item[] it)
	{
		int index = -1 ;
		File inventoryData = fetchFile() ;

		titleRow = true ;

		try
		{
			
			String rowDetails="" ;

			FileReader fr = new FileReader(inventoryData);
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
				it[index].setWholeItem((Integer.parseInt(rowDetailsSplit[0])),rowDetailsSplit[1],(Integer.parseInt(rowDetailsSplit[2])),(Integer.parseInt(rowDetailsSplit[3]))) ;
			}

			return index ;
		}
		catch(Exception e)
		{
			e.printStackTrace() ;
		}

		return index ;
	}

	public void syncFileData(Item[] it,int index)
	{
		File inventoryData = fetchFile() ;

		titleRow = true ;

		String titleRowData = "It.No,NAME,PRICE,STOCK" ;

		try
		{
			FileWriter fw = new FileWriter(inventoryData,false);
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
			int itNo = it[i].getItemNo() ;
			String itName = it[i].getItemName();
			int itPrice = it[i].getItemPrice();
			int itStock = it[i].getItemStock();

			String dataRow = Integer.toString(itNo) + "," + itName + "," + Integer.toString(itPrice) + "," + Integer.toString(itStock) ;
	
			try
			{

				FileWriter fW = new FileWriter(inventoryData,true);
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