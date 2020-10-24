package com.lxisoft.Movies;
public class Sheriff extends Script implements Hero
{
	public void scriptDisplay()
	{
		//System.out.println(" ");
		//System.out.println("sees his position as Andy's favorite toy jeopardized when his parents buy him a Buzz Lightyear (Tim Allen) action figure.");
		//System.out.println("Even worse, the arrogant Buzz thinks he's a real spaceman on a mission to return to his home planet.");
		//System.out.println("When Andy's family moves to a new house, Woody and Buzz must escape the clutches of maladjusted neighbor Sid Phillips (Erik von Detten) and reunite with their boy.");
        String message = "Sheriff Woody Pride, commonly known simply as Woody, is the main character in the Toy Story franchise created by Pixar.\nHe is a pullstring cowboy rag doll and one of the two leaders of the toys in the movies.\nHis facial features are based on Tone Thyne, a former Disney animator.";
        slowPrint(message, 40);
    }
    public static void slowPrint(String message, long millisPerChar)
    {
        for (int i = 0; i < message.length(); i++)
        {
            System.out.print(message.charAt(i));

            try
            {
                Thread.sleep(millisPerChar);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
	

}