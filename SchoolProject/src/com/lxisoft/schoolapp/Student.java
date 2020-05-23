package com.lxisoft.schoolapp;

public class Student
{
	
    private String name;   //Student name
    private int clss;   //student Class.
    private String div;   //student Division.
    private int rNo;   //student roll no.
    private int t1;   //student mark for English
    private int t2;   //student mark for Malayalam
    private int t3;   //student mark for Maths
    private int t4;   //student mark for Science
    private int t5;   //student mark for Social Science


    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    
      public void setclss(int a )
      {
       this.clss=a;
      }
      public int getclss()
      {
       return   clss;
      }

    public void setdiv(String div)
    {
        this.div=div;
    }
    public String getdiv()
    {
        return div;
    }

      public void setrNo(int a )
      {
       this.rNo=a;
      }
      public int getrNo()
      {
       return   rNo;
      }

   
    public void sett1(int  a )
    {
        this.t1=a;
    }
    public int gett1()
    {
        return   t1;
    }

        public void sett2(int a )
        {
            this.t2=a;
        }
        public int gett2()
        {
            return   t2;
        }

    public void sett3(int  a )
    {
        this.t3=a;
    }
    public int gett3()
    {
        return   t3;
    }

        public void sett4(int  a )
        {
            this.t4=a;
        }
        public int gett4()
        {
            return   t4;
        }

    public void sett5(int  a )
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
    public void setparentNo(int  a )
    {
        this.parentNo=a;
    }
    public int getparentNo()
    {
        return   parentNo;
    }
}

