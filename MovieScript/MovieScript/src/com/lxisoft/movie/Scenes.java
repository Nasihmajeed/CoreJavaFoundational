package com.lxisoft.movie;
import com.lxisoft.movie.*;
import java.util.*;

public class Scenes 
{
    ArrayList<Script> script1 = new ArrayList<Script>();
	ArrayList<Script> script2 = new ArrayList<Script>();
	ArrayList<Script> script3 = new ArrayList<Script>();
    ArrayList<Script> script4 = new ArrayList<Script>();
    ArrayList<Script> script5 = new ArrayList<Script>();

	public void setScene1()
    {
        script1.add(new Gopi());
        script1.get(0).setDialogue0("You stupid idiot fool....");
        script1.get(0).setDialogue1("Oh! so you are from kerala... \n Why are you pushing this trolley where poeple are walking?");
        script1.get(0).setDialogue2("What?  What did you call me?");
        script1.get(0).setDialogue3("Call me that again.");
        script1.get(0).setDialogue4("Call me again.");
        script1.get(0).setDialogue5("I knew you would call.  You are so rude.");

        script1.add(new Veena());
        script1.get(1).setDialogue0("Get lost");
        script1.get(1).setDialogue1("Are you blind?  This is a public place, you should walk with your eyes opened. \n Blind fellow...");
        script1.get(1).setDialogue2("Blind fellow");
        script1.get(1).setDialogue3("Blind fellow"); 
        script1.get(1).setDialogue4("Blind fellow");

    }

    public void printScene1()
    {
        System.out.println("\n                                                             *** Gopi collides with the trolley while walking to the boarding area ***");
        System.out.println("\n                                                                          *** Veena runnig towards her luggage seeing this ***\n");

        System.out.println("\n Gopi   : ");
        this.slowprint(script1.get(0).getDialogue0(),50);
		
		System.out.println("\n\n Veena : ");
		this.slowprint(script1.get(1).getDialogue0(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script1.get(0).getDialogue1(),50);
		
		System.out.println("\n\n Veena : ");
		this.slowprint(script1.get(1).getDialogue1(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script1.get(0).getDialogue2(),50);
		
		System.out.println("\n\n Veena : ");
		this.slowprint(script1.get(1).getDialogue2(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script1.get(0).getDialogue3(),50);
		
		System.out.println("\n\n Veena : ");
		this.slowprint(script1.get(1).getDialogue3(),50);
        
        System.out.println("\n\n Gopi   : ");
        this.slowprint(script1.get(0).getDialogue4(),50);
		
		System.out.println("\n\n Veena : ");
		this.slowprint(script1.get(1).getDialogue4(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script1.get(0).getDialogue5(),50);

        System.out.println("\n\n                                                      *** Gopi and Veena are travelling in the same flight in nearby seats ***\n");
        System.out.println("\n                                        *** Gopi meets a police officer in flight. He said he want to meet Gopi at the airport after landing ***\n");
        System.out.println("\n                                                                        *** Gopi hides the jewel in Veena's bag ***\n");
        System.out.println("\n                                                               *** At the same time Mani is waiting for Gopi at the airport ***\n");
        System.out.println("\n                                                                               *** They reaches the airport ***\n");
        System.out.println("\n                                                     *** Gopi sees Mani and ask him to follow Veena and goes to see the police officer ***\n");
        // System.out.println("\n                                                                                   *** Mani follows Veena ***\n");		
    }

    public void setScene2()
    {
        script2.add(new Mani());
        script2.get(0).setDialogue0("Why did the police stop you?");
        script2.get(0).setDialogue1("Oh god! did they find the necklace?");
        script2.get(0).setDialogue2("So all our hard work is of no use right?");
        script2.get(0).setDialogue3("Which girl?");
        script2.get(0).setDialogue4("Who? That skinny girl? I'm not interested. followed her for some time and I came back");
        script2.get(0).setDialogue5("Oh no! She left in a taxi");
        script2.get(0).setDialogue6("Yes");


        script2.add(new Gopi());
        script2.get(1).setDialogue0("Oh! it is not the first time that a police is behind a thief");
        script2.get(1).setDialogue1("Speak softly");
        script2.get(1).setDialogue2("Nothing is lost, Where is that girl?");
        script2.get(1).setDialogue3("I asked you to go behind a girl no?");
        script2.get(1).setDialogue4("I slipped the necklace inside her bag to escape from the police");
        script2.get(1).setDialogue5("Oh no by taxi? Is it an airport taxi?");
        script2.get(1).setDialogue6("Then we shall go to that counter and ask where she has gone");
        
    }

    public void printScene2()
    {
        System.out.println("\n                                                            ***Gopi meets the officer and the officer ask the policemen to check gopi ***\n");
        System.out.println("\n                                                                            ***Afetr the checking Gopi meets Mani again ***\n");

       
		System.out.println("\n Mani : ");
		this.slowprint(script2.get(0).getDialogue0(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script2.get(1).getDialogue0(),50);

        System.out.println("\n\n Mani : ");
		this.slowprint(script2.get(0).getDialogue1(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script2.get(1).getDialogue1(),50);

        System.out.println("\n\n Mani : ");
		this.slowprint(script2.get(0).getDialogue2(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script2.get(1).getDialogue2(),50);

        System.out.println("\n\n Mani : ");
		this.slowprint(script2.get(0).getDialogue3(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script2.get(1).getDialogue3(),50);

        System.out.println("\n\n Mani : ");
		this.slowprint(script2.get(0).getDialogue4(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script2.get(1).getDialogue4(),50);

        System.out.println("\n\n Mani : ");
		this.slowprint(script2.get(0).getDialogue5(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script2.get(1).getDialogue5(),50);

        System.out.println("\n\n Mani : ");
		this.slowprint(script2.get(0).getDialogue6(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script2.get(1).getDialogue6(),50);

    }

    public void setScene3()
    {
        script3.add(new Gopi());
        script3.get(0).setDialogue0("So... Happy journey..");
        script3.get(0).setDialogue1("I haven't decided yet... I'll have to make some money somehow.. I'll get mad if I stay longer over here..");
        script3.get(0).setDialogue2("I saw a light in front of me. But now..........");
        script3.get(0).setDialogue3("(Clears throat)");
        script3.get(0).setDialogue4("I went to the restroom");
        script3.get(0).setDialogue5("No I haven't cried... something went inside my eyes");
        script3.get(0).setDialogue6("Train is coming.. Here take this.. I have only this left and you may need it to meet your travel expenses... All your wishes will be fulfilled and I'll pray for it ");
        script3.get(0).setDialogue7("The earth is round so if we are destined to meet then we will meet somewhere");
        script3.get(0).setDialogue8("(surprised)");
        script3.get(0).setDialogue9("Here I come. I'll ensure that you get married before doing anything else");
        

        script3.add(new Veena());
        script3.get(1).setDialogue0("Where will you go again?");
        script3.get(1).setDialogue1("Why did you take the responsibility then?");
        script3.get(1).setDialogue2("But you...");
        script3.get(1).setDialogue3("Where did you go?"); 
        script3.get(1).setDialogue4("Why did you cry?");
        script3.get(1).setDialogue5("ok");
        script3.get(1).setDialogue6("mm");
        script3.get(1).setDialogue7("Look. Are you searching for this?");
        script3.get(1).setDialogue8("If you would come with me and stay with me then I'll reward you with this");
    }

    public void printScene3()
    {
        System.out.println("\n\n                                                              *** Gopi faces some problem there too and decides to leave from there ***\n");
        System.out.println("\n                                                                   *** He comes with veena to the railway station to see off Veena ***\n");
        
        
        System.out.println("\n Gopi   : ");
        this.slowprint(script3.get(0).getDialogue0(),50);

        System.out.println("\n\n Veena   : ");
        this.slowprint(script3.get(1).getDialogue0(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script3.get(0).getDialogue1(),50);

        System.out.println("\n\n Veena   : ");
        this.slowprint(script3.get(1).getDialogue1(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script3.get(0).getDialogue2(),50);

        System.out.println("\n\n                                                                                        *** Gopi moves from there ***\n");

        System.out.println("\n\n Veena   : ");
        this.slowprint(script3.get(1).getDialogue2(),50);

        System.out.println("\n\n                                                                             *** Veena searches for Gopi and see him crying ***\n");
        System.out.println("\n                                                                                             *** Gopi comes back ***\n");

        System.out.println("\n Gopi   : ");
        this.slowprint(script3.get(0).getDialogue3(),50);

        System.out.println("\n\n Veena   : ");
        this.slowprint(script3.get(1).getDialogue3(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script3.get(0).getDialogue4(),50);

        System.out.println("\n\n Veena   : ");
        this.slowprint(script3.get(1).getDialogue4(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script3.get(0).getDialogue5(),50);

        System.out.println("\n\n Veena   : ");
        this.slowprint(script3.get(1).getDialogue5(),50);

        System.out.println("\n\n                                                                                       *** Train horn sound ***\n");

        System.out.println("\n Gopi   : ");
        this.slowprint(script3.get(0).getDialogue6(),50);

        System.out.println("\n\n Veena   : ");
        this.slowprint(script3.get(1).getDialogue6(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script3.get(0).getDialogue7(),50);

        System.out.println("\n\n                                                                                    *** Veena boards the train ***\n");

        System.out.println("\n Veena   : ");
        this.slowprint(script3.get(1).getDialogue7(),50);

        System.out.println("\n\n                                                                                *** Veena shows the necklace to Gopi ***\n");

        System.out.println("\n Gopi   : ");
        this.slowprint(script3.get(0).getDialogue8(),50);

        System.out.println("\n\n                                                                                      *** Gopi boards the train ***\n");

    }

    public void setScene4()
    {
        script4.add(new Gopi());
        script4.get(0).setDialogue0("The bride's relatives have reached. Groom's relatives are yet to reach. ");
        script4.get(0).setDialogue1("He is there inside");
        script4.get(0).setDialogue2("Don't hurry up. Do things carefully");
        script4.get(0).setDialogue3("Why are you here?");
        script4.get(0).setDialogue4("No.");
        script4.get(0).setDialogue5("This is my friend Mani, Maala");
        script4.get(0).setDialogue6("not that one. This is Megha Maala the girl who he is going to marry");

        script4.add(new Veena());
        script4.get(1).setDialogue0("Is Feix there?");
        script4.get(1).setDialogue1("Can I go and meet him?");
        script4.get(1).setDialogue2("I have it with me");

        script4.add(new Mani());
        script4.get(2).setDialogue0("Hey.. Gopi...");
        script4.get(2).setDialogue1("Have you heared the news?");
        script4.get(2).setDialogue2("Her father had fixed another marriage for her. We both eloped since we had no other option");

    }

    public void printScene4()
    {
        System.out.println("\n                                                 *** Gopi and veena arrives at the hotel where Felix is residing and Gopi goes to check in ***\n");
        System.out.println("\n                                                                     *** Veena comes to know that it's Felix's marriage ***\n");

        System.out.println("\n Gopi   : ");
        this.slowprint(script4.get(0).getDialogue0(),50);

        System.out.println("\n\n Veena   : ");
        this.slowprint(script4.get(1).getDialogue0(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script4.get(0).getDialogue1(),50);

        System.out.println("\n\n Veena  : ");
        this.slowprint(script4.get(1).getDialogue1(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script4.get(0).getDialogue2(),50);

        System.out.println("\n\n                                                                                        *** Mani and Maala arrives ***\n");

        System.out.println("\n Mani   : ");
        this.slowprint(script4.get(2).getDialogue0(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script4.get(0).getDialogue3(),50);

        System.out.println("\n\n Mani   : ");
        this.slowprint(script4.get(2).getDialogue1(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script4.get(0).getDialogue4(),50);

        System.out.println("\n\n Mani   : ");
        this.slowprint(script4.get(2).getDialogue2(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script4.get(0).getDialogue5(),50);

        System.out.println("\n\n Veena  : ");
        this.slowprint(script4.get(1).getDialogue2(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script4.get(0).getDialogue6(),50);

        System.out.println("\n\n                                                                 *** Veena sees Felix'sengagement and tries to commit suicide ***\n");
        System.out.println("\n                                                                         *** Gopi stops her from suicide and take her back ***\n");
    }

    public void setScene5()
    {
        script5.add(new Gopi());
        script5.get(0).setDialogue0("Its written to marry you is on Veena's head only. That is why all happening like this ");
        script5.get(0).setDialogue1("We are relatives. In a same family , that is the reason I came here to discuss about this");
        script5.get(0).setDialogue2("She is ready to live with you on any situations. She is loving you that much");
        script5.get(0).setDialogue3("Will you agree if you get the money?");
        script5.get(0).setDialogue4("I'll give you the money");
        script5.get(0).setDialogue5("I don't think her family like to see that she is suffering due to some cash issues. I can get you the cash");
        script5.get(0).setDialogue6("You go and talk with veena first. I'm responsible for giving cash to you before marriage");
        script5.get(0).setDialogue7("She don't want to know that we already talked about this here. She will come and meet you. Try to forget everything");
        script5.get(0).setDialogue8("Don't want to go down on your love with the money you are spending. Don't make her suffer. Better inform me. I'll take care of her ");


        script5.add(new Felix());
        script5.get(1).setDialogue0("Who are you to her?");
        script5.get(1).setDialogue1("that is true, we had a relationship. But she also told me that her father will allow. Finally she came alone with nothing, what i do after marriage without cash with her?");
        script5.get(1).setDialogue2("No anybody ready to spoil life like that. I'm ready to marry her, but without getting money my father will never allow this. I can't do anything by hurting my father.");
        script5.get(1).setDialogue3("From where?");
        script5.get(1).setDialogue4("From where?");
        script5.get(1).setDialogue5("Then I'll make my father agree");
        script5.get(1).setDialogue6("mm");
        script5.get(1).setDialogue7("I still love her, and I'll marry her once the cash problem is solved");
        script5.get(1).setDialogue8("I'm not blaming anyone. I think this is faith. ");
        script5.get(1).setDialogue9("Then the cash which you offered you can give that time as well to avoid all this problems");
        script5.get(1).setDialogue11("Yes");
        script5.get(1).setDialogue10("Your cousin Gopi told me, he will give cash to me before marriage");
        script5.get(1).setDialogue12("30lakhs. I'll come to church with my father. Then give the money directly to him we can marry from there");
        

        script5.add(new Veena());
        script5.get(2).setDialogue0("I came here without knowing anything. I strongly believed that Felix Loved me truly");
        script5.get(2).setDialogue1("Cash? What cash?");
        script5.get(2).setDialogue2("Did Gopi said so?");
        script5.get(2).setDialogue3("How much he told you?");

    }

    public void printScene5()
    {
        System.out.println("\n                                                                                 *** Gopi Meets Felix as Veena's cousin ***\n");

        System.out.println("\n Gopi   : ");
        this.slowprint(script5.get(0).getDialogue0(),50);

        System.out.println("\n\n Felix  : ");
        this.slowprint(script5.get(1).getDialogue0(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script5.get(0).getDialogue1(),50);

        System.out.println("\n\n Felix  : ");
        this.slowprint(script5.get(1).getDialogue1(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script5.get(0).getDialogue2(),50);

        System.out.println("\n\n Felix  : ");
        this.slowprint(script5.get(1).getDialogue2(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script5.get(0).getDialogue3(),50);

        System.out.println("\n\n Felix  : ");
        this.slowprint(script5.get(1).getDialogue3(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script5.get(0).getDialogue4(),50);

        System.out.println("\n\n Felix  : ");
        this.slowprint(script5.get(1).getDialogue4(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script5.get(0).getDialogue5(),50);

        System.out.println("\n\n Felix  : ");
        this.slowprint(script5.get(1).getDialogue5(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script5.get(0).getDialogue6(),50);

        System.out.println("\n\n Felix  : ");
        this.slowprint(script5.get(1).getDialogue6(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script5.get(0).getDialogue7(),50);

        System.out.println("\n\n Felix  : ");
        this.slowprint(script5.get(1).getDialogue7(),50);

        System.out.println("\n\n Gopi   : ");
        this.slowprint(script5.get(0).getDialogue8(),50);

        System.out.println("\n\n                                                                                       *** Felix Meets Veena ***\n");

        System.out.println("\n Felix  : ");
        this.slowprint(script5.get(1).getDialogue8(),50);

        System.out.println("\n\n Veena  : ");
        this.slowprint(script5.get(2).getDialogue0(),50);

        System.out.println("\n\n Felix  : ");
        this.slowprint(script5.get(1).getDialogue9(),50);

        System.out.println("\n\n Veena  : ");
        this.slowprint(script5.get(2).getDialogue1(),50);

        System.out.println("\n\n Felix  : ");
        this.slowprint(script5.get(1).getDialogue10(),50);

        System.out.println("\n\n Veena  : ");
        this.slowprint(script5.get(2).getDialogue2(),50);

        System.out.println("\n\n Felix  : ");
        this.slowprint(script5.get(1).getDialogue11(),50);

        System.out.println("\n\n Veena  : ");
        this.slowprint(script5.get(2).getDialogue3(),50);
        
        System.out.println("\n\n Felix  : ");
        this.slowprint(script5.get(1).getDialogue12(),50);

        System.out.println("\n\n                                                                                                            *** Veena leaves from there ***\n");
        System.out.println("\n                                                                *** Police caught Veena with the necklace. She gave it to them and she gave Gopi the money that she got from her father ***\n");
        System.out.println("\n                                                                                 *** Next day Gopi comes to the church to handover the money to Felix but nobody was there.  ***\n");
        System.out.println("\n                                                                                            *** Veena had already cancelled the marriage and told Gopi about it ***\n");
        System.out.println("\n                                                                                     *** Gopi ask Veena if she is ready to live with him..... Veena agrees...... ***\n");


    }
    // public void setScene6()
    // {

    // }

    // public void printScene6()
    // {

    // }
    public void printArray1()
    {
		try
        {
			Thread.sleep(1500);
		}
		catch(InterruptedException e)
        {
			e.printStackTrace();
		}
	}
	public String slowprint(String scne,long delay)
    {
		for(int i=0; i<scne.length();i++)
        {
		    System.out.print(scne.charAt(i)); 
			try
            {
				Thread.sleep(delay);
			}
			catch(InterruptedException e)
            {
				e.printStackTrace();
			}
		}
		return scne;
	}
}
