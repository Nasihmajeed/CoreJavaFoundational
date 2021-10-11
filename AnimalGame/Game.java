package com.animalGame.game;
import com.animalGame.game.Animal;
//import com.animalGame.game.Fight;
import com.animalGame.user.Player;
import java.util.Random;
public class Game {
Animal animal=new Animal();
   Player player=new Player();
 //  Fight fight = new Fight();
   public void startGame(){
     System.out.println("Welcome To Animal Game ");
     
   }
   public void playGame(){
    Random number=new Random();
   int gameRounds=1+number.nextInt(5);
  animal.createAnimalList();
  // int gameRounds=1;
  System.out.println("game has "+gameRounds+"rounds");
for(int gameRound=0;gameRound<=gameRounds;gameRound++)
{

   player.printAnimalList(animal);
   player.selectAnimalList();
   animal.animalFight(player);
   }
   }
}