package com.lxisoft.board;


class Board
{
	
	int boardColumns;
	String p1="P1";
	String p2="P2";
	Player player1=new Player1();
	Player player2=new Player2();
	int pos1,pos2;
	int i,j,k;
	int []easyBoard=new int[101];
	int []mediumBoard=new int[151];
	int []hardBoard=new int[201];

{
	for(i=0;i<=100;i++)
		{
			easyBoard[i]=easyBoard[i]+i;
		}
		
}

{
	for(j=0;j<=150;j++)
		{
			mediumBoard[j]=mediumBoard[j]+j;
		}
		
}
{
	for(k=0;k<=200;k++)
		{
			hardBoard[k]=hardBoard[k]+k;
		}
		
}





	
	public void setColumns()
	{
		
		for( i=0; i<=100; i++)
		{ 
    
  	  	System.out.print("\t "+easyBoard[i]+"\t ");
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
					System.out.print("\t"+easyBoard[i]+"\t");
			}

				if(i%10==0){
      	  System.out.print("\n");
			}
		}
	}

//Medium
	public void getBoardMedium(int pos1, Player player1,int pos2,Player player2)
	{
		for( j=0;j<=150;j++)
		{
			
			if((player1 instanceof Player1) && (j==pos1)){
			System.out.print("\t"+p1+"\t");
			}
			else if((player2 instanceof Player2 )&& (j==pos2))
			{
				System.out.print("\t"+p2+"\t");
			} 
			else
			{
					System.out.print("\t"+mediumBoard[j]+"\t");
			}

				if(j%10==0){
      	  System.out.print("\n");
			}
		}
	}


//Hard

public void getBoardHard(int pos1, Player player1,int pos2,Player player2)
	{
		for(k=0;k<=200;k++)
		{
			
			if((player1 instanceof Player1) && (k==pos1)){
			System.out.print("\t"+p1+"\t");
			}
			else if((player2 instanceof Player2 )&& (k==pos2))
			{
				System.out.print("\t"+p2+"\t");
			} 
			else
			{
					System.out.print("\t"+hardBoard[k]+"\t");
			}

				if(k%10==0){
      	  System.out.print("\n");
			}
		}
	}




}