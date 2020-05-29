package com.lxisoft.CarApp; 
public class Car
{
	private String name;
	private String companyname;
	private int model;
	private String type;


	public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

    
    public void setCompanyName(String companyname)
    {
        this.companyname=companyname;
    }
    public String getCompanyName()
    {
        return companyname;
    }


    public void setModel(int a)
    {
        this.model=a;
    }
    public int getModel()
    {
        return model;
    }


    public void setType(String type)
    {
        this.type=type;
    }
    public String getType()
    {
        return type;
    }


}