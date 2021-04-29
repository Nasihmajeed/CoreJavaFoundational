class TDD
{
	
	public static void main(String [] args)
	{
			Play play=new Play();
			boolean isHome;
			Player p1=new Player1();
			Player p2=new Player2();	
			isHome=play.getHome(p1);
			if(isHome)
			{			play.play(p1);

			}
			else 
			{
				System.out.println("switch player");
				isHome=play.getHome(p2);
				if(isHome)
				{
					play.play(p2);
				}
			}
	}
}