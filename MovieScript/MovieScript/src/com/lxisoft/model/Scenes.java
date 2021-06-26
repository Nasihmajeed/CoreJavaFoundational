package com.lxisoft.model;
import java.util.*;

import com.lxisoft.view.Felix;
import com.lxisoft.view.Gopi;
import com.lxisoft.view.Mani;
import com.lxisoft.view.Veena;

import java.io.*;


public class Scenes 
{
    ArrayList<Script> script1 = new ArrayList<Script>();
	ArrayList<Script> script2 = new ArrayList<Script>();
	ArrayList<Script> script3 = new ArrayList<Script>();
    ArrayList<Script> script4 = new ArrayList<Script>();
    ArrayList<Script> script5 = new ArrayList<Script>();
    ArrayList<Script> script6 = new ArrayList<Script>();

    ArrayList<String> hero = new ArrayList<>();
    ArrayList<String> heroine = new ArrayList<>();
    ArrayList<String> comedian = new ArrayList<>();
    ArrayList<String> villain = new ArrayList<>();

	public void setScene1()
    {
        script1.add(new Gopi());
        script1.get(0).setDialogue0("Gopi  : You stupid idiot fool....\n");
        script1.get(0).setDialogue1("Gopi  : Oh! so you are from kerala... \n       Why are you pushing this trolley where poeple are walking?\n");
        script1.get(0).setDialogue2("Gopi  : What?  What did you call me?\n");
        script1.get(0).setDialogue3("Gopi  : Call me that again.\n");
        script1.get(0).setDialogue4("Gopi  : Call me again.\n");
        script1.get(0).setDialogue5("Gopi  : I knew you would call.  You are so rude.\n\n\n");

        script1.add(new Veena());
        script1.get(1).setDialogue0("Veena : Get lost\n");
        script1.get(1).setDialogue1("Veena : Are you blind?  This is a public place, you should walk with your eyes opened. \n      Blind fellow...\n");
        script1.get(1).setDialogue2("Veena : Blind fellow\n");
        script1.get(1).setDialogue3("Veena : Blind fellow\n"); 
        script1.get(1).setDialogue4("Veena : Blind fellow\n");

    // }

    // public void printScene1()
    // {
        try
        {
            File file = new File("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\repository\\script.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write("\n                                                             *** Gopi collides with the trolley while walking to the boarding area ***");
            writer.write("\n                                                                          *** Veena runnig towards her luggage seeing this ***\n\n");
            writer.write(script1.get(0).getDialogue0());
            writer.write(script1.get(1).getDialogue0());
            writer.write(script1.get(0).getDialogue1());
            writer.write(script1.get(1).getDialogue1());
            writer.write(script1.get(0).getDialogue2());
            writer.write(script1.get(1).getDialogue2());
            writer.write(script1.get(0).getDialogue3());
            writer.write(script1.get(1).getDialogue3());
            writer.write(script1.get(0).getDialogue4());
            writer.write(script1.get(1).getDialogue4());
            writer.write(script1.get(0).getDialogue5());

            writer.write("\n\n                                                      *** Gopi and Veena are travelling in the same flight in nearby seats ***\n");
            writer.write("\n                                        *** Gopi meets a police officer in flight. He said he want to meet Gopi at the airport after landing ***\n");
            writer.write("\n                                                                        *** Gopi hides the jewel in Veena's bag ***\n");
            writer.write("\n                                                               *** At the same time Mani is waiting for Gopi at the airport ***\n");
            writer.write("\n                                                                               *** They reaches the airport ***\n");
            writer.write("\n                                                     *** Gopi sees Mani and ask him to follow Veena and goes to see the police officer ***\n\n\n");
            writer.flush();
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void printScene1()
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\repository\\script.csv"));
            String s;
            while((s = reader.readLine()) !=null)
            {
                System.out.print("\n");
                this.slowprint(s, 10);
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void setScene2()
    {
        script2.add(new Mani());
        script2.get(0).setDialogue0("Mani  : Why did the police stop you?\n");
        script2.get(0).setDialogue1("Mani  : Oh god! did they find the necklace?\n");
        script2.get(0).setDialogue2("Mani  : So all our hard work is of no use right?\n");
        script2.get(0).setDialogue3("Mani  : Which girl?\n");
        script2.get(0).setDialogue4("Mani  : Who? That skinny girl? I'm not interested. followed her for some time and I came back\n");
        script2.get(0).setDialogue5("Mani  : Oh no! She left in a taxi\n");
        script2.get(0).setDialogue6("Mani  : Yes\n");


        script2.add(new Gopi());
        script2.get(1).setDialogue0("Gopi  : Oh! it is not the first time that a police is behind a thief\n");
        script2.get(1).setDialogue1("Gopi  : Speak softly\n");
        script2.get(1).setDialogue2("Gopi  : Nothing is lost, Where is that girl?\n");
        script2.get(1).setDialogue3("Gopi  : I asked you to go behind a girl no?\n");
        script2.get(1).setDialogue4("Gopi  : I slipped the necklace inside her bag to escape from the police\n");
        script2.get(1).setDialogue5("Gopi  : Oh no by taxi? Is it an airport taxi?\n");
        script2.get(1).setDialogue6("Gopi  : Then we shall go to that counter and ask where she has gone\n");

    // }

    // public void printScene2()
    // {
        try
        {
            File file = new File("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\repository\\script.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write("\n                                                            ***Gopi meets the officer and the officer ask the policemen to check gopi ***\n");
            writer.write("\n                                                                            ***After the checking Gopi meets Mani again ***\n\n");

            writer.write(script2.get(0).getDialogue0());
            writer.write(script2.get(1).getDialogue0());
            writer.write(script2.get(0).getDialogue1());
            writer.write(script2.get(1).getDialogue1());
            writer.write(script2.get(0).getDialogue2());
            writer.write(script2.get(1).getDialogue2());
            writer.write(script2.get(0).getDialogue3());
            writer.write(script2.get(1).getDialogue3());
            writer.write(script2.get(0).getDialogue4());
            writer.write(script2.get(1).getDialogue4());
            writer.write(script2.get(0).getDialogue5());
            writer.write(script2.get(1).getDialogue5());
            writer.write(script2.get(0).getDialogue6());
            writer.write(script2.get(1).getDialogue6());
            writer.flush();
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void printScene2()
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\repository\\script.csv"));
            String s;
            while((s = reader.readLine()) !=null)
            {
                System.out.print("\n");
                this.slowprint(s, 10);
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void setScene3()
    {
        script3.add(new Gopi());
        script3.get(0).setDialogue0("Gopi  : So... Happy journey..\n");
        script3.get(0).setDialogue1("Gopi  : I haven't decided yet... I'll have to make some money somehow.. I'll get mad if I stay longer over here..\n");
        script3.get(0).setDialogue2("Gopi  : There was a light in front of me. But now..........\n");
        script3.get(0).setDialogue3("Gopi  : (Clears throat)\n");
        script3.get(0).setDialogue4("Gopi  : I went to the restroom\n");
        script3.get(0).setDialogue5("Gopi  : No I haven't cried... something went inside my eyes\n");
        script3.get(0).setDialogue6("Gopi  : Train is coming.. (gives some money) Here take this.. I have only this left and you may need it to meet your travel expenses... All your wishes will be fulfilled and I'll pray for it \n");
        script3.get(0).setDialogue7("Gopi  : The earth is round so if we are destined to meet then we will meet somewhere\n");
        script3.get(0).setDialogue8("Gopi  : (surprised)\n");
        script3.get(0).setDialogue9("Gopi  : Here I come. I'll ensure that you get married before doing anything else\n\n\n");
        

        script3.add(new Veena());
        script3.get(1).setDialogue0("Veena : Where will you go again?\n");
        script3.get(1).setDialogue1("Veena : Why did you take the responsibility then?\n");
        script3.get(1).setDialogue2("Veena : But you...\n");
        script3.get(1).setDialogue3("Veena : Where did you go?\n"); 
        script3.get(1).setDialogue4("Veena : Why did you cry?\n");
        script3.get(1).setDialogue5("Veena : ok\n");
        script3.get(1).setDialogue6("Veena : mm\n");
        script3.get(1).setDialogue7("Veena : Look. Are you searching for this?\n");
        script3.get(1).setDialogue8("Veena : If you would come with me and stay helping me then I'll reward you with this\n");
    // }

    // public void printScene3()
    // {
        try
        {
            File file = new File("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\repository\\script.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // writer.write("\n                                                              *** Gopi faces some problem there too and decides to leave from there ***\n");
            // writer.write("\n                                                                   *** He comes with veena to the railway station to see off Veena ***\n\n");
            
            writer.write(script3.get(0).getDialogue0());
            writer.write(script3.get(1).getDialogue0());
            writer.write(script3.get(0).getDialogue1());
            writer.write(script3.get(1).getDialogue1());
            writer.write(script3.get(0).getDialogue2());

            // writer.write("\n\n                                                                                        *** Gopi moves from there ***\n\n");

            writer.write(script3.get(1).getDialogue2());

            // writer.write("\n\n                                                                             *** Veena searches for Gopi and see him crying ***\n");
            // writer.write("\n                                                                                             *** Gopi comes back ***\n\n");

            writer.write(script3.get(0).getDialogue3());
            writer.write(script3.get(1).getDialogue3());
            writer.write(script3.get(0).getDialogue4());
            writer.write(script3.get(1).getDialogue4());
            writer.write(script3.get(0).getDialogue5());
            writer.write(script3.get(1).getDialogue5());

            // writer.write("\n\n                                                                                       *** Train horn sound ***\n\n");

            writer.write(script3.get(0).getDialogue6());
            writer.write(script3.get(1).getDialogue6());
            writer.write(script3.get(0).getDialogue7());

            // writer.write("\n\n                                                                                    *** Veena boards the train ***\n\n");

            writer.write(script3.get(1).getDialogue7());

            // writer.write("\n\n                                                                                *** Veena shows the necklace to Gopi ***\n\n");

            writer.write(script3.get(0).getDialogue8());
            writer.write(script3.get(1).getDialogue8());
            writer.write(script3.get(0).getDialogue9());

            // writer.write("\n\n                                                                                      *** Gopi boards the train ***\n\n");
    
            writer.flush();
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void printScene3()
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\repository\\script.csv"));
            String s;
            while((s = reader.readLine()) !=null)
            {
                System.out.print("\n");
                this.slowprint(s, 10);
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void setScene4()
    {
        script4.add(new Gopi());
        script4.get(0).setDialogue0("Gopi  : The bride's relatives have reached. Groom's relatives are yet to reach. \n");
        script4.get(0).setDialogue1("Gopi  : He is there inside\n");
        script4.get(0).setDialogue2("Gopi  : Don't hurry up. Do things carefully\n");
        script4.get(0).setDialogue3("Gopi  : Why are you here?\n");
        script4.get(0).setDialogue4("Gopi  : No. What?\n");
        script4.get(0).setDialogue5("Gopi  : By the way This is my friend Mani, Maala\n");
        script4.get(0).setDialogue6("Gopi  : not that one. This is Megha Maala the girl who he is going to marry\n");

        script4.add(new Veena());
        script4.get(1).setDialogue0("Veena : Is Feix there?\n");
        script4.get(1).setDialogue1("Veena : Can I go and meet him?\n");
        script4.get(1).setDialogue2("Veena : I have it with me\n");

        script4.add(new Mani());
        script4.get(2).setDialogue0("Mani  : Hey.. Gopi...\n");
        script4.get(2).setDialogue1("Mani  : Have you heared the news?\n");
        script4.get(2).setDialogue2("Mani  : Her father had fixed another marriage for her. We both eloped since we had no other option\n");

    // }

    // public void printScene4()
    // {
        try
        {
            File file = new File("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\repository\\script.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // writer.write("\n                                                 *** Gopi and veena arrives at the hotel where Felix is residing and Gopi goes to check in ***\n");
            // writer.write("\n                                                                     *** Veena comes to know that it's Felix's marriage ***\n\n");

            writer.write(script4.get(0).getDialogue0());
            writer.write(script4.get(1).getDialogue0());
            writer.write(script4.get(0).getDialogue1());
            writer.write(script4.get(1).getDialogue1());
            writer.write(script4.get(0).getDialogue2());

            // writer.write("\n\n                                                                                        *** Mani and Maala arrives ***\n\n");

            writer.write(script4.get(2).getDialogue0());
            writer.write(script4.get(0).getDialogue3());
            writer.write(script4.get(2).getDialogue1());
            writer.write(script4.get(0).getDialogue4());
            writer.write(script4.get(2).getDialogue2());
            writer.write(script4.get(0).getDialogue5());
            writer.write(script4.get(1).getDialogue2());
            writer.write(script4.get(0).getDialogue6());

            writer.write("\n\n                                                                 *** Veena sees Felix's engagement and tries to commit suicide ***\n");
            writer.write("\n                                                                         *** Gopi stops her from suicide and take her back ***\n\n");

            writer.flush();
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void printScene4()
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\repository\\script.csv"));
            String s;
            while((s = reader.readLine()) !=null)
            {
                System.out.print("\n");
                this.slowprint(s, 10);
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void setScene5()
    {
        script5.add(new Gopi());
        script5.get(0).setDialogue0("Gopi  : Its written to marry you is on Veena's head only. That is why all happening like this\n");
        script5.get(0).setDialogue1("Gopi  : We are relatives. In a same family , that is the reason I came here to discuss about this\n");
        script5.get(0).setDialogue2("Gopi  : She is ready to live with you on any situations. She is loving you that much\n");
        script5.get(0).setDialogue3("Gopi  : Will you agree if you get the money?\n");
        script5.get(0).setDialogue4("Gopi  : I'll give you the money\n");
        script5.get(0).setDialogue5("Gopi  : I don't think her family like to see that she is suffering due to some cash issues. I can get you the cash\n");
        script5.get(0).setDialogue6("Gopi  : You go and talk with veena first. I'm responsible for giving cash to you before marriage\n");
        script5.get(0).setDialogue7("Gopi  : She don't want to know that we already talked about this here. She will come and meet you. Try to forget everything\n");
        script5.get(0).setDialogue8("Gopi  : Don't want to go down on your love with the money you are spending. Don't make her suffer. Better inform me. I'll take care of her\n\n\n");


        script5.add(new Felix());
        script5.get(1).setDialogue0("Felix : Who are you to her?\n");
        script5.get(1).setDialogue1("Felix : that is true, we had a relationship. But she also told me that her father will allow. Finally she came alone with nothing, what will i do with her after marriage without cash?\n");
        script5.get(1).setDialogue2("Felix : No anybody ready to spoil life like that. I'm ready to marry her, but without getting money my father will never allow this. I can't do anything by hurting my father.\n");
        script5.get(1).setDialogue3("Felix : From where?\n");
        script5.get(1).setDialogue4("Felix : From where?\n");
        script5.get(1).setDialogue5("Felix : Then I'll make my father agree\n");
        script5.get(1).setDialogue6("Felix : hmm\n");
        script5.get(1).setDialogue7("Felix : I still love her, and I'll marry her once the cash problem is solved\n");
        
    // }

    // public void printScene5()
    // {
        try
        {
            File file = new File("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\repository\\script.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);
  
            // writer.write("\n                                                                                 *** Gopi Meets Felix as Veena's cousin ***\n\n");

            writer.write(script5.get(0).getDialogue0());
            writer.write(script5.get(1).getDialogue0());
            writer.write(script5.get(0).getDialogue1());
            writer.write(script5.get(1).getDialogue1());
            writer.write(script5.get(0).getDialogue2());
            writer.write(script5.get(1).getDialogue2());
            writer.write(script5.get(0).getDialogue3());
            writer.write(script5.get(1).getDialogue3());
            writer.write(script5.get(0).getDialogue4());
            writer.write(script5.get(1).getDialogue4());
            writer.write(script5.get(0).getDialogue5());
            writer.write(script5.get(1).getDialogue5());
            writer.write(script5.get(0).getDialogue6());
            writer.write(script5.get(1).getDialogue6());
            writer.write(script5.get(0).getDialogue7());
            writer.write(script5.get(1).getDialogue7());
            writer.write(script5.get(0).getDialogue8());

            writer.flush();
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void printScene5()
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\repository\\script.csv"));
            String s;
            while((s = reader.readLine()) !=null)
            {
                System.out.print("\n");
                this.slowprint(s, 10);
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void setScene6()
    {
        script6.add(new Felix());
        script6.get(0).setDialogue0("Felix : I'm not blaming anyone. I think this is faith.\n");
        script6.get(0).setDialogue1("Felix : Then the cash which you offered you can give that time as well to avoid all this problems\n");
        script6.get(0).setDialogue2("Felix : Your cousin Gopi told me, he will give cash to me before marriage\n");
        script6.get(0).setDialogue3("Felix : Yes\n");
        script6.get(0).setDialogue4("Felix : 30lakhs. I'll come to church with my father. Then give the money directly to him we can marry from there\n\n\n");
        

        script6.add(new Veena());
        script6.get(1).setDialogue0("Veena : I came here without knowing anything. I strongly believed that Felix Loved me truly\n");
        script6.get(1).setDialogue1("Veena : Cash? What cash?\n");
        script6.get(1).setDialogue2("Veena : Did Gopi said so?\n");
        script6.get(1).setDialogue3("Veena : How much he told you?\n");

    // }

    // public void printScene6()
    // {
        try
        {
            File file = new File("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\repository\\script.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // writer.write("\n\n                                                                                       *** Felix Meets Veena ***\n\n");

            writer.write(script6.get(0).getDialogue0());
            writer.write(script6.get(1).getDialogue0());
            writer.write(script6.get(0).getDialogue1());
            writer.write(script6.get(1).getDialogue1());
            writer.write(script6.get(0).getDialogue2());
            writer.write(script6.get(1).getDialogue2());
            writer.write(script6.get(0).getDialogue3());
            writer.write(script6.get(1).getDialogue3());
            writer.write(script6.get(0).getDialogue4());

            writer.write("\n\n                                                                                   *** Veena leaves from there ***\n");
            writer.write("\n                                *** Police caught Veena with the necklace. She gave it to them and she gave Gopi the money that she got from her father ***\n");
            writer.write("\n                                                 *** Next day Gopi comes to the church to handover the money to Felix but nobody was there.  ***\n");
            writer.write("\n                                                             *** Veena had already cancelled the marriage and told Gopi about it ***\n");
            writer.write("\n                                                         *** Gopi ask Veena if she is ready to live with him..... Veena agrees...... ***\n\n");

            writer.flush();
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void printScene6()
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\repository\\script.csv"));
            String s;
            while((s = reader.readLine()) !=null)
            {
                System.out.print("\n");
                this.slowprint(s, 10);
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
  
    public void printArray1()
    {
		try
        {
			Thread.sleep(1100);
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

    public void comedyScene()
    {
        this.setScene2();
        this.printScene2();
        this.setScene4();
        this.printScene4();
    }
    public void romanticScene()
    {
        this.setScene3();
        this.printScene3();
    }
    public void thrillerScene()
    {
        this.setScene5();
        this.printScene5();
    }
    public void emotionalScene()
    {
        this.setScene6();
        this.printScene6();
    }
}
