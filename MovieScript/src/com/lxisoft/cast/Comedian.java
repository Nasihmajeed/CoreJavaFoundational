package com.lxisoft.cast;

public class Comedian extends Actor
{
	private int numOfComedian;

	private String comedianName,comedianCharName;


    public Comedian()
	{
		
	}


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











/*

public boolean equals(Object o) {
if((o instanceof Dog) &&
(((Dog)o).name == name)) {
return true;
} else {
return false;
}
}
public int hashCode() {return name.length(); }
*/




}