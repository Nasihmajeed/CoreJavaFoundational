
package com.lxisoft.tdd ;

import com.lxisoft.game.Game ;

public class Tdd 
{
	public static void main(String[] args)
	{
		Game game = new Game() ;

		char s = game.displayStartGamePrompt() ;
		game.initialiseGame(s) ;
		game.finaliseGame() ;
	}
}