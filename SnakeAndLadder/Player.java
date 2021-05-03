class Player
{
	int coinPosition,dieNumber=0;
	Die d=new Die();
	boolean isHome;

	public int getCoinPosition()
	{
		return coinPosition;
	}

	public void setCoinPosition(int coinPosition)
	{
		this.coinPosition=coinPosition;
		

	}

	public void play()
	{

			dieNumber=d.getNumberOnDie();


					System.out.println("The number on die "+dieNumber);	
				coinPosition=coinPosition+dieNumber;
				
				
				
	}



}