package com.lxisoft.cast;

public class Hero extends Actor
 {
 	 


		Hero(){

		}
		Hero(String heroName,String heroCharacterName)
		{
			super(heroName,heroCharacterName);
			
		
		}

		public Hero(String heroName,String heroCharacterName,String dialogueSaidByHero)
		{
			super(heroName,heroCharacterName,dialogueSaidByHero);
		}


}