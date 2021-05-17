package com.lxisoft.game;
import com.lxisoft.players.*;

public class Board
{

//Initializer----1

{
	for(int i=0;i<=100;i++)
		{
			Board1[i]=Board1[i]+i;
		}		
}

//Initializer----2

{
	for(int j=0;j<=150;j++)
		{
			Board2[j]=Board2[j]+j;
		}		
}

//Initializer----3

{
	for(int k=0;k<=200;k++)
		{
			Board3[k]=Board3[k]+k;
		}
		
}



	
	Player player1=new Player1();
	Player player2=new Player2();
	
	int columns,position1,position2;
	
	String p1="P1";
	String p2="P2";
	
	int[]  Board1=new int[101];
	int[]  Board2=new int[151];
	int[]  Board3=new int[201];






	public void setColumns()
	{
		
		for(int i=0; i<=100; i++)
		{ 
    
  	  	System.out.print("\t "+Board1[i]+"\t ");
  	  	if(i%10==0){
        System.out.print("\n");
		}
		}
	}

	public void getBoardEasy(int pos1, Player player1,int pos2,Player player2)
	{
		for(int i=0;i<=100;i++)
		{
			
			if((player1 instanceof Player1) && (i==pos1)){
			System.out.print("\t"+p1+"\t");
			}
			else if((player2 instanceof Player2 )&& (i==pos2))
			{
				System.out.print("\t"+p2+"\t");
			} 
			else
			{
					System.out.print("\t"+Board1[i]+"\t");
			}

				if(i%10==0){
      	  System.out.print("\n");
			}
		}
	}

//Medium Board-----------------Board 2
	public void getBoardMedium(int pos1, Player player1,int pos2,Player player2)
	{
		for(int j=0;j<=150;j++)
		{
			
			if((player1 instanceof Player1) && (j==pos1))
			{
			System.out.print("\t"+p1+"\t");
			}
			
			else if((player2 instanceof Player2 )&& (j==pos2))
			{
				System.out.print("\t"+p2+"\t");
			}
			
			else
			{
					System.out.print("\t"+Board2[j]+"\t");
			}

				if(j%10==0) 
				{
      	           System.out.print("\n");
			    }
		 }
	}


//Hard Board-----------------Board 3

public void getBoardHard(int pos1, Player player1,int pos2,Player player2)
	{
		for(int k=0;k<=200;k++)
		{
			if((player1 instanceof Player1) && (k==pos1))
			{
			System.out.print("\t"+p1+"\t");
			}
			
			else if((player2 instanceof Player2 )&& (k==pos2))
			{
				System.out.print("\t"+p2+"\t");
			} 
			
			else
			{
					System.out.print("\t"+Board3[k]+"\t");
			}

				if(k%10==0)
				{
      	         System.out.print("\n");
			    }
		  }
	}

}