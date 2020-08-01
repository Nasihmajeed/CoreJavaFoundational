package com.LxiSoft.Forest;
public class Designs
{
	public void gameRun()
	{
		 System.out.println("\t --------------------------------------");
			System.out.println("\t\t \t  ANIMAL GAME ");
			System.out.println("\t ---------------------------------------");
	}
    public void pattern()
{
  
    int rows = 4;       
    for (int i= 0; i<= rows-1 ; i++)
    {
        for (int j=0; j<=i; j++)
        {
            System.out.print(" ");
        }
        for (int k=0; k<=rows-1-i; k++)
        {
            System.out.print("*" + " ");
        }
        System.out.println();
    }
   
 
}

    public  void pyramidPattern1() 
    {  
        for (int i=0; i<5; i++) 
        { 
        for (int j=4; j>1; j--) 
            { 
                System.out.print(" ");
            }  
            for (int j=0; j<=i; j++ ) 
            { 
                System.out.print("* "); 
            } 
  
         System.out.println(); 
        } 
    } 
    public void pyramidPattern2()
    {

int i, j, row = 6;       

for (i=0; i<row; i++)   
{  
for (j=2*(row-i); j>=0; j--)         
{  
System.out.print(" ");   
}   
for (j=0; j<=i; j++ )   
{   
System.out.print("* ");   
}   
System.out.println();   
}   
}
    public void pyramidPattern3()
    {

  int i, j, row = 6;        
for (i=0; i<row; i++)   
{        
for (j=row-i; j>1; j--)   
{    
System.out.print(" ");   
}  
for (j=0; j<=i; j++ )   
{       
System.out.print("* ");   
}    
System.out.println();   
}   
}   
}  