package com.lxisoft.movie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Script 
{
		public String getScriptWriter() {
		return scriptWriter;
	}

	public void setScriptWriter(String scriptWriter) {
		this.scriptWriter = scriptWriter;
	}

		private String scriptWriter;
		public ArrayList<Dialogue> readFromScript(ArrayList<Dialogue> diaList,File file1)
		{
			String line="";
			String[] dia;
			try
			{
				FileReader fr = new FileReader(file1);
				BufferedReader br = new BufferedReader(fr);
				if((line = br.readLine())!=null)
				{
					dia = line.split(",");
					for(int i=0;i<dia.length;i++)
					{
						if((dia[i]!=null) || (dia[i].length())!=0)
						{
							diaList.add(new Dialogue());
							diaList.get(i).setDialogue(dia[i]);
							diaList.get(i).setDiaStatus(true);
						}
					}
				}
				br.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			return diaList;
			
		}
		
	public void writeToScript(File path,String d)
	{
		try
		{
			FileWriter fw = new FileWriter(path,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(d+",");
			bw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
