package com.lxisoft.kit;

public class Board
{
	 int i,j,k,columns,position1,position2;
	 String a="P1",b="P2";
	
	
	int[] easy=new int[101];
	int[] medium=new int[151];
	int[] hard=new int[201];
	
	
	Player player1=new Player1();
	Player player2=new Player2();
	
	
	
	
	for(i=0;i<=100;i++)
	{
		easy[i]=easy[i]+i;
	}
	
	for(j=0;j<=100;j++)
	{
		medium[j]=medium[j]+j;
	}
	
	for(k=0;k<=100;k++)
	{
		hard[k]=hard[k]+k;
	}
  
  
  public void setColumns()
  {
	  for(i=0;i<=100;i++)
	  {
		  System.out.println("================"+easy[i]+"=================");
		  if(i%10==0)
		  {
			  System.out.println("---\n---");
		  }
	  }
  }




}