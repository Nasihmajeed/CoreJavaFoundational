package com.LxiSoft.School;

public class Student
{
	
    private String name;   //Student name
    private int rNo;   //student roll no.
    private int t1;   //student mark for subject 1
    private int t2;   //student mark for subject 2
    private int t3;   //student mark for subject 3
    private int t4;   //student mark for subject 4
    private int t5;   //student mark for subject 5


    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
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

