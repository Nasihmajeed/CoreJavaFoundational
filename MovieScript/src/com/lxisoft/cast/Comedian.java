package com.lxisoft.cast;

public class Comedian extends Actor
{
	private int numOfComedian;

	private String comedianName,comedianCharName;


	public Comedian(String comedianName,String comedianCharName)
   {
       super(comedianName,comedianCharName);
   }



	public void setNumOfComedian(int numOfComedian)
	{
          this.numOfComedian=numOfComedian;
	}

	public int getNumOfComedian()
	{
		return numOfComedian;
	}

}