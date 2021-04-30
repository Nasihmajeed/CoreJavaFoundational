class Player
{
	int coinPosition,dieNumber;
	Die d=new Die();

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
				System.out.println("The player moved to"+coinPosition);
				
				
	}



}