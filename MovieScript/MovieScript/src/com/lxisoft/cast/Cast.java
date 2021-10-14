package com.lxisoft.cast;


import java.util.Scanner;
import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.Map.Entry; 
import java.util.Set; 

public class Cast 
{	
	ArrayList<Entry<String, String>> cast = new ArrayList<Entry<String,String>>();
	
	ArrayList<String> heroList = new ArrayList<>();
	ArrayList<String> heroineList = new ArrayList<>();
	ArrayList<String> comedianList = new ArrayList<>();
	ArrayList<String> villainList = new ArrayList<>();

	ArrayList<String> heroCast = new ArrayList<>();
	ArrayList<String> heroineCast = new ArrayList<>();
	ArrayList<String> comedianCast = new ArrayList<>();
	ArrayList<String> villainCast = new ArrayList<>();

	int i, heroNumber, heroineNumber, comedianNumber, villainNumber;

	public void setCast(ArrayList<Entry<String, String>> cast)
	{
		// int i;
		Scanner scan = new Scanner(System.in);

		HashMap<String, String> hero = new HashMap<>();
        System.out.print("\nNumber of heros\t\t : ");
			 heroNumber = scan.nextInt();

        for(i=0;i<heroNumber;i++)
        {
			System.out.print("\nName\t\t : ");
			String name = scan.next();

			System.out.print("Character\t : ");
			String characterName = scan.next();
			String value = hero.put(name, characterName);
			heroList.add(characterName);
		} 

        HashMap<String, String> heroine = new HashMap<>();
        System.out.print("\nNumber of heroines\t : ");
			 heroineNumber = scan.nextInt();

        for(i=0;i<heroineNumber;i++)
        {
			System.out.print("\nName\t\t : ");
			String name = scan.next();

			System.out.print("Character\t : ");
			String characterName = scan.next();
			String value = heroine.put(name, characterName);
			heroineList.add(characterName);
		} 

        HashMap<String, String> comedian = new HashMap<>();
        System.out.print("\nNumber of comedians\t : ");
			 comedianNumber = scan.nextInt();

        for(i=0;i<comedianNumber;i++)
        {
			System.out.print("\nName\t\t : ");
			String name = scan.next();

			System.out.print("Character\t : ");
			String characterName = scan.next();
			String value = comedian.put(name, characterName);
			comedianList.add(characterName);
		}

		HashMap<String, String> villain = new HashMap<>();
        System.out.print("\nNumber of villains\t : ");
			 villainNumber = scan.nextInt();

        for(i=0;i<villainNumber;i++)
        {
			System.out.print("\nName\t\t : ");
			String name = scan.next();

			System.out.print("Character\t : ");
			String characterName = scan.next();
			String value = villain.put(name, characterName);
			villainList.add(characterName);
		}

		Set<Entry<String, String>> actorSet1 = hero.entrySet(); 
        Set<Entry<String, String>> actorSet2 = heroine.entrySet(); 
        Set<Entry<String, String>> actorSet3 = comedian.entrySet(); 
		Set<Entry<String, String>> actorSet4 = villain.entrySet(); 
                  
        ArrayList<Entry<String, String>> actors = new ArrayList<Entry<String,String>>(actorSet1); 
        ArrayList<Entry<String, String>> actors1 = new ArrayList<Entry<String,String>>(actorSet2); 
        ArrayList<Entry<String, String>> actors2 = new ArrayList<Entry<String,String>>(actorSet3); 
		ArrayList<Entry<String, String>> actors3 = new ArrayList<Entry<String,String>>(actorSet4);

      	actors.addAll(actors1);
      	actors.addAll(actors2);
		actors.addAll(actors3);
		cast.addAll(actors);
	}

	public void setHero(ArrayList<String>heroCast)
	{
		heroCast.addAll(heroList);
	}
	public void setHeroine(ArrayList<String> heroineCast)
	{
		heroineCast.addAll(heroineList);
	}
	public void setComedian(ArrayList<String> comedianCast)
	{	
		comedianCast.addAll(comedianList);
	}
	public void setVillain(ArrayList<String> villainCast)
	{
		villainCast.addAll(villainList);
	}

}