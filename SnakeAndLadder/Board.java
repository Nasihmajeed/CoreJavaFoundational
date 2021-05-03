class Board
{
	
	int boardColumns;
	String p1="P1";
	String p2="P2";
	/*Player p1=new Player1();
	Player p2=new Player2();*/
	int pos1,pos2;
	public void setColumns()
	{

		for(int i=0;i<=10;i++)
		{

			System.out.print(i+"  ");
		}
	}

	public void getBoard(int pos1,int pos2)
	{
		for(int i=0;i<=10;i++)
		{
			if(i==pos1){
			System.out.print(p1+"  ");
			}
			else if(i==pos2)
			{
				System.out.print(p2+"  ");
			} 
			else
			{
					System.out.print(i+"  ");
			}
		}
	}
}