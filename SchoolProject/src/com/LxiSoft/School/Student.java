package com.LxiSoft.School;

public class Student
{
	
    private String name;   //Student name
    public void settname(String a )
    {
        this.name=a;
    }
    public String getname()
    {
        return name;
    }
    
    private int rNo;   //student roll no.
    public void setrNo(String a )
    {
        this.rNo=a;
    }
    public int getrNo()
    {
        return   rNo;
    }

    private int t1;   //student mark for subject 1
    public void sett1(String a )
    {
        this.t1=a;
    }
    public int gett1()
    {
        return   t1;
    }

    private int t2;   //student mark for subject 2
    public void sett2(String a )
    {
        this.t2=a;
    }
    public int gett2()
    {
        return   t2;
    }

    private int t3;   //student mark for subject 3
    public void sett3(String a )
    {
        this.t3=a;
    }
    public int gett3()
    {
        return   t3;
    }

    private int t4;   //student mark for subject 4
    public void sett4(String a )
    {
        this.t4=a;
    }
    public int gett4()
    {
        return   t4;
    }

    private int t5;   //student mark for subject 5
    public void sett5(String a )
    {
        this.t5=a;
    }
    public int gett5()
    {
        return   t5;
    }

    int total=0;
    float percentage;
   

    private int parentNo;   //parent's contacts no
    public void setparentNo(String a )
    {
        this.parentNo=a;
    }
    public int getparentNo()
    {
        return   parentNo;
    }
}

