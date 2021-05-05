class Board
{
	
	int boardColumns;
	String p1="P1";
	String p2="P2";
	Player player1=new Player1();
	Player player2=new Player2();
	int pos1,pos2;
	int i,j;
	int []board=new int[101];

{
	for(i=0;i<=100;i++)
		{
			board[i]=board[i]+i;
		}
		
}
	
	public void setColumns()
	{
		
		for( i=0; i<=100; i++)
		{ 
    
  	  	System.out.print("\t "+board[i]+"\t ");
  	  	if(i%10==0){
        System.out.print("\n");
		}
		}
	}

	public void getBoard(int pos1, Player player1,int pos2,Player player2)
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
					System.out.print("\t"+board[i]+"\t");
			}

				if(i%10==0){
      	  System.out.print("\n");
			}
		}
	}
}