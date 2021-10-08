package com.animalGame.game;
import com.animalGame.game.Animal;
//import com.animalGame.game.Fight;
import com.animalGame.user.Player;
public class Game {
Animal animal=new Animal();
   Player player=new Player();
 //  Fight fight = new Fight();
   public void startGame(){
     System.out.println("Welcome To Animal Game ");
     
   }
   public void playGame(){
   animal.createAnimalList();
   player.printAnimalList(animal);
   player.selectAnimalList();
   animal.animalFight(player);
   }
}