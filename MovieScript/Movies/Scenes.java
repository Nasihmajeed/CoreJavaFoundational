package com.lxisoft.Movies;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

import java.util.*;

public class Scenes
{
		ArrayList<Script> script=new ArrayList<Script>();

	public void scenePrint()
	{

		script.add(new Buzz());
				script.get(0).setDialogue0("Hang on there jessie,we will rescue you");
				script.get(0).setDialogue1("I cant its my brother after all");
				script.get(0).setDialogue2("OK ,thats enough,When i needed someone the most i had only my friends");
				script.get(0).setDialogue3("Sorry sid this has to end somehow");
				script.get(0).setDialogue4("weeps ----");
				script.get(0).setDialogue5("hmm ,evil has to end somehow,come lets go back to our house");
				script.get(0).setDialogue6("Yea ,anyway im happy we got you in one piece (giggles)");

			script.add(new Jessie());
				script.get(1).setDialogue0("Help ME guys ,kill this scumbag!!!");
				script.get(1).setDialogue1("Buzz!!! Dont listen to him");
				script.get(1).setDialogue2("Do it Buzz..");
				script.get(1).setDialogue3("kill him Buzz");
				script.get(1).setDialogue4("I knew you would rescue me,nd we are sorry for your brother");
				script.get(1).setDialogue5("Yippie");

			script.add(new Sheriff());
 				script.get(2).setDialogue0("Stop!!! right there sid you have no where to go");
				script.get(2).setDialogue1("Buzz kill him with your laser shot");
				script.get(2).setDialogue2("Dont listen to him,he is playing with your mind");
				script.get(2).setDialogue3("Yes jessie is ryt he is just playing with your mind");
				script.get(2).setDialogue4("Buzz, remember all the fun we had together");
				script.get(2).setDialogue5("Its over buzz come buddy lets untie jessie");
				script.get(2).setDialogue6("haha yeahh ,finally we r a family again");

			script.add(new Sid());
				script.get(3).setDialogue0("HAHAHA!!!! you are wrong you imbeciles you guys are no...match for me.");
				script.get(3).setDialogue1("He wont");
 				script.get(3).setDialogue2("Before you strike me ,think for a second im your family and do u wish to take words from ur friends who doesnt value you");
				script.get(3).setDialogue3("Just think,how they treated you ,being a soldier they never gave you the position,everyone needs only woodie even this jeesie");
				script.get(3).setDialogue4("Think!!! do wou want to kill me");
				script.get(3).setDialogue5("HAHAHA!!! the almighty is always on my side");
				script.get(3).setDialogue6("NO!!!!......");
				script.get(3).setDialogue7("I am sorry BUzz i couldnt be a good brother for you,have a happy life");

	}
	public void print()
	{
		Movie movie=new Movie();
		System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+script.get(2).getDialogue0()+"\n"); //woodie
		System.out.println("\u001b[37m\033[1mBuzz  :\033[0m"+script.get(0).getDialogue1()+"\n"); //buzz
		System.out.println("\u001b[33m\033[1mJessie:\033[0m"+script.get(1).getDialogue0()+"\n"); //jessie
		movie.villain1();
		System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(3).getDialogue0()+"\n"); //sid
		System.out.println("\u001b[35m\033[1mWoodie:\033[0m"+script.get(2).getDialogue1()+"\n");
		System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(3).getDialogue1()+"\n"); //sid
		System.out.println("\u001b[33m\033[1mJessie:\033[0m"+script.get(1).getDialogue2()+"\n"); //jessie
		System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(3).getDialogue2()+"\n"); //sid
		System.out.println("\u001b[33m\033[1mJessie:\033[0m"+script.get(1).getDialogue1()+"\n"); //jessie
		movie.villain2();
				System.out.println("\u001b[31m\033[1mSid   :\033[0m"+script.get(3).getDialogue4()+"\n"); //sid
				








		//Sheriff sh=new Sheriff();
		//sh.scriptDisplay();	
	}
}