package com.lxisoft.player;
import com.lxisoft.game.*;

import java.util.*;

public class Player{
  String name;
  int position;
//  String player2Name;

public void setName(String name){
  this.name=name;
}
public String getName(){
  return name;
}
public void setPosition(int position){
  this.position=position;
}
public int getPosition(){
  return position;
}
  Game g=new Game();
  //Game g;
  public void playerDetails(){
    Player p1=new Player();
    Player p2=new Player();
    System.out.println("********************************");
    System.out.println("WELCOME TO SNAKE AND LADDER GAME");
    System.out.println("********************************\n");
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER PLAYER 1 NAME ");
    p1.setName(sc.nextLine());
    System.out.println("ENTER PLAYER 2 NAME ");
    p2.setName(sc.nextLine());
    //g.boardView();
    g.startGame(p1,p2);
  }
}
