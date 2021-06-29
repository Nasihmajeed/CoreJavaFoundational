package com.lxisoft.controller;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.Map.Entry; 
import java.util.Set; 

public class Controller 
{	
    CastList cl = new CastList();
	Scenes scenes = new Scenes();

	ArrayList<Entry<String, String>> cast = new ArrayList<Entry<String,String>>();
	ArrayList<String> heroList = new ArrayList<>();
	ArrayList<String> heroineList = new ArrayList<>();
	ArrayList<String> comedianList = new ArrayList<>();
	ArrayList<String> villainList = new ArrayList<>();

	public void setCast(ArrayList<Entry<String, String>> cast)
	{
		int i;
		HashMap<String, String> hero = new HashMap<>();
		Scanner scan = new Scanner(System.in);
        System.out.print("\nNumber of heros\t\t : ");
		int heroNumber = scan.nextInt();

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
			int heroineNumber = scan.nextInt();

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
			int comedianNumber = scan.nextInt();

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
			int villainNumber = scan.nextInt();

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

      	actorSet1.addAll(actorSet2);
      	actorSet1.addAll(actorSet3);
		actorSet1.addAll(actorSet4);
		cast.addAll(actorSet1);
	}

    public void database(int x, ArrayList<Entry<String, String>> cast)
    {
        Scenes scenes = new Scenes();
		
    		if(x==1)
        	{
    			cl.addToDatabase(cast);
    		}
    		else if(x==2)
        	{
    			cl.showDatabase();
    		}
    		else if(x==3)
        	{
    			cl.deleteFromDatabase();
    		}
    } 
}

// for(int j=0; j<heroList.size(); j++)
//         {
// 			System.out.println((j+1)+" "+heroList.get(j));
// 		}
// 		for(int j=0; j<heroineList.size(); j++)
//         {
// 			System.out.println((j+1)+" "+heroineList.get(j));	
// 		}
// 		for(int j=0; j<comedianList.size(); j++)
//         {
// 			System.out.println((j+1)+" "+comedianList.get(j));	
// 		}
// 		for(int j=0; j<villainList.size(); j++)
//         {
// 			System.out.println((j+1)+" "+villainList.get(j));
// 		}