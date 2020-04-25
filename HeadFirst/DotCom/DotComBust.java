
import java.util.* ;

public class DotComBust
{
	GameHelper helper = new GameHelper() ;
	ArrayList<DotCom> dotComsList = new ArrayList<DotCom>() ;
	int numOfGuesses = 0 ;

	public void setUpGame()
	{
		DotCom dc1 = new DotCom() ;
		dc1.setName("Google.com") ;
		
		DotCom dc2 = new DotCom() ;
		dc2.setName("Bing.com") ;
		
		DotCom dc3 = new DotCom() ;
		dc3.setName("Facebook.com") ;


		dotComsList.add(dc1) ;
		dotComsList.add(dc2) ;
		dotComsList.add(dc3) ;

		System.out.println("Your Goal is to sink three dot com's. ") ;
		System.out.println("Google.com, Bing.com & Facebook.com") ;
		System.out.println("Try to sink them all in the fewest number of guesses.") ;

			for(DotCom dotComLoc : dotComsList)
			{
				ArrayList<String> newLocation = helper.placeDotCom(3) ;
				dotComLoc.setLocationCells(newLocation) ;
			}
	}

	public void startPlaying()
	{
			while(!dotComsList.isEmpty()) ;
			{
				String userGuess = helper.getUserInput("Enter a Guess") ;
				checkUserGuess(userGuess) ;
			}

		finishGame() ;
	} 

	public void checkUserGuess(String uG)
	{
		++numOfGuesses ;

		String result = "miss" ;

			for(DotCom dc : dotComsList)
			{
				result = dc.checkYourself(uG) ;

				if (result.equals("hit"))
				{
					break ;
				}
				else if (result.equals("kill"))
				{
					dotComsList.remove(dc) ;
					break ;
				}

			}

		System.out.println(result) ;
	}

	public void finishGame()
	{
		System.out.println("All Dot Corns are dead! Your stock i s now worthless."); 

			if (numOfGuesses <= 18) 
			{ 
				System.out.println("It only took you" + numOfGuesses + " guesses.") ; 
				System.out.println(" You got out before your options sank."); 
			}
			else
			{ 
				System.out.println("Took you long enough. " + numOfGuesses + " guesse s ."); 
				System.out.println("Fish are dancing with your options . " ) ;
			}
	}

	public static void main (String[] args) 
	{ 
		DotComBust game = new DotComBust(); 
		game.setUpGame () ; 
		game.startPlaying () ; 
	}
}