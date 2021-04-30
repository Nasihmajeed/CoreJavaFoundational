class TDD
{
	
	public static void main(String [] args)
	{
			Play play=new Play();
			boolean isHomeP1,isHomeP2;
			Player p1=new Player1();
			Player p2=new Player2();	
			isHomeP1=play.getHome(p1);
			if(isHomeP1)
			{
				play.start(p1);
			}
			else
			{
				System.out.println(p1.getClass().getSimpleName()+" not in home ");
			}


			isHomeP2=play.getHome(p2);
			if(isHomeP2){
			play.start(p2);
			}
			else
			{
				System.out.println(p2.getClass().getSimpleName()+" not in home ");
			}
			/*else 
			{

				System.out.println("switch player");
				isHome=play.getHome(p2);
				if(isHome){
				play.start(p2);
			}*/
				
			
	}
}