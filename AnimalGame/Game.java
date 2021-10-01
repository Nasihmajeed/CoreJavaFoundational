package com.AnimalGame.Game;
import com.AnimalGame.Game.Animal;
import com.AnimalGame.Game.Fight;
import com.AnimalGame.User.Player;
public class Game {
Animal animal=new Animal();
   Player player=new Player();
   Fight fight = new Fight();
   public void startGame(){
     System.out.println("Welcome To Animal Game ");
     
   }
   public void playGame(){
   animal.createAnimalList();
   player.printanimalList(animal);
   player.selectanimalList();
   fight.animalFight(player);
   }
}