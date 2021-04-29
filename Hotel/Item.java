class Item implements Food,Drinks
{
	
	String fname,dname;
	float fprice,dprice;

//Food

	public void setFname(String fname)
	{
		this.fname=fname;
	}
	
	public void setFprice(float fprice)
	{
		this.fprice=fprice;
	}

 public String getFname()
 {
	 return fname;
 }

public float getFprice()
{
   return fprice;	
}

//Drink
public void setDname(String dname)
{
		this.dname=dname;
}
	
public void setDprice(float dprice)
{
		this.dprice=dprice;
}

public String getDname()
{
	 return dname;
}

public float getDprice()
{
    return dprice;	
}


}