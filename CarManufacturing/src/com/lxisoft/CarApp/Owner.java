package com.lxisoft.CarApp;
public class Owner
{
	private String rcowner;
	private	String rcadress;
	private String regNo;
	private String rto; 

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