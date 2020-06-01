package com.lxisoft.CarApp; 
public class Car
{
	private String name;
	private String companyname;
	private int model;
	private String type;
    private String rcowner;
    private String rcadress;
    private String regNo;
    private String rto; 

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

    public void setRCOwner(String rcowner)
    {
        this.rcowner=rcowner;
    }
    public String getRCOwner()
    {
        return rcowner;
    }

    
    public void setRCAdress(String rcadress)
    {
        this.rcadress=rcadress;
    }
    public String getRCAdress()
    {
        return rcadress;
    }


    public void setRegNo(String regno)
    {
        this.regNo=regNo;
    }
    public String getRegNo()
    {
        return regNo;
    }


    public void setRTO(String rto)
    {
        this.rto=rto;
    }
    public String getRTO()
    {
        return rto;
    }


}