package com.lxisoft.moviescript;

import java.util.*; 
  public class Script {
    String scene1;
    String scene2;
    String scene3;

    public void setupMovie () {
        this.scene1=" 1";
        this.scene2=" 2";
        this.scene3=" 3";       
}
    public void playMovie () {

        System.out.println("\n"); 
       
        System.out.println("\t\t\t      SCENE " +scene1);

        ArrayList <String> script= new ArrayList<String>();

        script.add("\t\t\t+----------------+" +"\n");

        script.add("\t\t    **PLAYING ROMANTIC SCENE** "+"\n");

        script.add("\t\t+-----------------------------------+" +"\n");

        script.add("\t       ( OUTSIDE THE CHURCH )  "+"\n");
       
        script.add("\t ** Hazel waits for her Mom’s car to appear ** " +"\n");

        script.add("\t** Hazel turns to find the Beautiful Boy, Augustus, standing right next to her. **" +"\n");

        script.add("\tGUS: I thought we were in a church basement but apparently we were literally in the  heart of Jesus." +"\n");

        script.add("\t** Hazel smiles. **" +"\n");

        script.add("\tHAZEL: Someone should probably tell him, dont you think? Jesus? Seems kinda dangerous  keeping all these kids with cancer in  your heart." +"\n");

        script.add("\t** Gus laughs. **" +"\n");

        script.add("\tGUS: What's your name?" +"\n");

        script.add("\tHAZEL: Hazel." +"\n");
        
        script.add("\tGUS: No your full name..." +"\n");

        script.add("\t** Hazel confused ** " +"\n");

        script.add("\tHAZEL: Hazel Grace Lancaster." +"\n");

        script.add("\t** Gus nods to himself, smiles. Still fixated on her. ** " +"\n");

        script.add("\t** Hazel Continued ** " +"\n");

        script.add("\tHAZEL: What?" +"\n");

        script.add("\tGUS: I did not say anything." +"\n");

        script.add("\tHAZEL: Why are you looking at me like that?" +"\n"); 

        script.add("\tGUS: Because you are beautiful." +"\n");

        script.add("\t** Hazel is taken aback. No one’s ever said that to her before. ** " +"\n");

        script.add("\t** Gus Continued ** " +"\n");

        script.add("\tGUS: I enjoy looking at beautiful people and I  decided a while back not to deny myself  the simpler pleasures of existence. " );
        script.add("\t     Particularly given that, as you soastutely pointed out, we are all gonna die pretty soon."+"\n");

        script.add("\tHAZEL: Iam not beaut --" +"\n");

        Iterator itr=script.iterator();

        while(itr.hasNext()){

          System.out.println(itr.next());
        }

        System.out.println("\n");

        try{ 
          Thread.sleep(1500);
          }
    catch(InterruptedException e)
         {
         Thread.currentThread().interrupt();
         }


        System.out.println("\t\t\t      SCENE " +scene2);

        System.out.println("\t\t\t+----------------+" +"\n");

        System.out.println("\t\t      **PLAYING COMEDY SCENE** "+"\n");

        System.out.println("\t\t+-----------------------------------+" +"\n");

        System.out.println("\t[**Scene: Monica and Rachel's, late at night Monica is still examining her bill as Rachel emerges from her room.**]" +"\n");

        System.out.println("\tRachel: Oh, Monica. You are not still going over that thing."+"\n");

        System.out.println("\tMonica: This woman's living my life."+"\n");

        System.out.println("\tRachel: What?"+"\n");

        System.out.println("\tMonica: She's living my life, and she's doing it better than me! Look at this, look. She buys tickets for plays that I wanna see.");
        System.out.println("\t        She, she buys clothes from stores that I'm intimidated by the sales people. She spent three hundred dollars on art supplies."+"\n");
        
        System.out.println("\tRachel: You're not an artist."+"\n");
   
        System.out.println("\tMonica: Yeah, well I might be if I had the supplies! I mean, I could do all this stuff. Only I don't."+"\n");

        System.out.println("\tRachel: Oh, Monica, c'mon, you do cool things."+"\n");

        System.out.println("\tMonica: Oh really? Okay, let's compare, shall we."+"\n");

        System.out.println("\tRachel: (Yawning) Oh, it's so late for 'Shall we'..."+"\n");

        System.out.println("\tMonica: Do I go horseback riding in the park? Do I take classes at the New School?"+"\n");

        System.out.println("\tRachel: (Yawning) Nooo..."+"\n");
        
        System.out.println("\tMonica: This is so unfair! She's got everything I want, and she doesn't have my mother."+"\n");

        System.out.println("\t[**Scene: Central Perk, Joey and Chandler are discussing stage names.**]"+"\n");

        System.out.println("\tChandler: How about Joey... Pepponi?"+"\n");

        System.out.println("\tJoey: No, still too ethnic. My agent thinks I should have a name that's more neutral."+"\n");

        System.out.println("\tChandler: Joey... Switzerland?"+"\n");

        System.out.println("\t(*The waitress brings their coffee.*)"+"\n");

        System.out.println("\tJoey: Plus, y'know, I think it should be Joe. Y'know, Joey makes me sound like I'm, I dunno, this big. (Waitress looks at him funny) Which I'm not."+"\n");

        System.out.println("\tChandler: Joe...Joe...Joe...Stalin?"+"\n");

        System.out.println("\tJoey: Stalin...Stalin...do I know that name? It sounds familiar."+"\n");

        System.out.println("\tChandler: Well, it does not ring a bell with me..."+"\n");

        System.out.println("\tJoey: (Writes it down) Joe Stalin. Y'know, that's pretty good."+"\n");

        System.out.println("\tChandler: Might wanna try Joseph."+"\n");

        System.out.println("\t(*Joey visibly thinks 'Of course!' and writes it down.*)"+"\n");

        System.out.println("\tJoey: Joseph Stalin. I think you'd remember that!"+"\n");

        System.out.println("\tChandler: Oh yes! Bye Bye Birdie, starring Joseph Stalin. Joseph Stalin is the Fiddler on the Roof."+"\n");
        
      

      }
    }  

        