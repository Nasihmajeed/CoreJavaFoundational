package com.lxisoft.schoolapp;

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
    
    private int clss;   //student Class.no
      public void setclss(int a )
      {
       this.clss=a;
      }
      public int getclss()
      {
       return   clss;
      }

      private String div;   //student division.
      public void setdiv(int a )
      {
       this.div=a;
      }
      public int getdiv()
      {
       return   div;
      }

      private int rNo;   //student roll no.
      public void setrNo(int a )
      {
       this.rNo=a;
      }
      public int getrNo()
      {
       return   rNo;
      }

    private int t1;   //student mark for English
    public void sett1(int  a )
    {
        this.t1=a;
    }
    public int gett1()
    {
        return   t1;
    }

        private int t2;   //student mark for Malayalam
        public void sett2(int a )
        {
            this.t2=a;
        }
        public int gett2()
        {
            return   t2;
        }

    private int t3;   //student mark for Maths
    public void sett3(int  a )
    {
        this.t3=a;
    }
    public int gett3()
    {
        return   t3;
    }

        private int t4;   //student mark for Science
        public void sett4(int  a )
        {
            this.t4=a;
        }
        public int gett4()
        {
            return   t4;
        }

    private int t5;   //student mark for Social Science
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

