package com.lxisoft.Hotel ;

public class Staff
{
	private String stName,stDesignation ;
	private int empNo ;
	private int stSal ;

	public int getEmpNo()
	{
		return empNo ;
	}

	public void setEmpNo(int e)
	{
		empNo = e ;
	}

	public String getStaffDesignation()
	{
		return stDesignation ;
	}

	public void setStaffDesignation(String des)
	{
		stDesignation = des ;
	}

	public void setStaffName(String n)
	{
		stName = n ;
	}

	public String getStaffName()
	{
		return stName ;
	}

	public void setStaffSalary(int sal)
	{
		stSal = sal ;
	}

	public int getStaffSalary()
	{
		return stSal ;
	}

	
	public void setWholeStaff(int eNo,String name,String des,int sal)
	{
		setEmpNo(eNo) ;
		setStaffName(name) ;
		setStaffDesignation(des) ;
		setStaffSalary(sal) ;
	} 

}