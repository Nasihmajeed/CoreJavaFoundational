package com.lxisoft.moviescript;

import java.util.*;

import com.lxisoft.moviescript.Actor; 
  public class Script {
    String scene1;
    String scene2;
    String scene3;
    //public String[] actor;
    

    public void setupMovie () {
        this.scene1=" 1";
        this.scene2=" 2";
        this.scene3=" 3";       
}
    public void playMovie () {

        System.out.println("\n"); 
       
        System.out.println("\t\t\t      SCENE " +scene1);
        
       // Movie m = new Movie();
        
        //String [] actor = new String[6];

        ArrayList <String> script1= new ArrayList<String> ();
        
        

        script1.add("\t\t\t+----------------+" +"\n");

        script1.add("\t\t    **PLAYING ROMANTIC SCENE** "+"\n");

        script1.add("\t\t+-----------------------------------+" +"\n");

        script1.add("\t       ( OUTSIDE THE CHURCH )  "+"\n");
       
        script1.add("\t ** Hazel waits for her Mom’s car to appear ** " +"\n");

        script1.add("\t** Hazel turns to find the Beautiful Boy, Augustus, standing right next to her. **" +"\n");

        script1.add("\tGUS: I thought we were in a church basement but apparently we were literally in the  heart of Jesus." +"\n");

        script1.add("\t** Hazel smiles. **" +"\n");

        script1.add("\tHAZEL: Someone should probably tell him, dont you think? Jesus? Seems kinda dangerous  keeping all these kids with cancer in  your heart." +"\n");

        script1.add("\t** Gus laughs. **" +"\n");

        script1.add("\tGUS: What's your name?" +"\n");

        script1.add("\tHAZEL: Hazel." +"\n");
        
        script1.add("\tGUS: No your full name..." +"\n");

        script1.add("\t** Hazel confused ** " +"\n");

        script1.add("\tHAZEL: Hazel Grace Lancaster." +"\n");

        script1.add("\t** Gus nods to himself, smiles. Still fixated on her. ** " +"\n");

        script1.add("\t** Hazel Continued ** " +"\n");

        script1.add("\tHAZEL: What?" +"\n");

        script1.add("\tGUS: I did not say anything." +"\n");

        script1.add("\tHAZEL: Why are you looking at me like that?" +"\n"); 

        script1.add("\tGUS: Because you are beautiful." +"\n");

        script1.add("\t** Hazel is taken aback. No one’s ever said that to her before. ** " +"\n");

        script1.add("\t** Gus Continued ** " +"\n");

        script1.add("\tGUS: I enjoy looking at beautiful people and I  decided a while back not to deny myself  the simpler pleasures of existence. " );
        script1.add("\t     Particularly given that, as you soastutely pointed out, we are all gonna die pretty soon."+"\n");

        script1.add("\tHAZEL: Iam not beaut --" +"\n");

        Iterator itr=script1.iterator();

        while(itr.hasNext()){

          System.out.println(itr.next());
        }

        System.out.println("\n");
        


        System.out.println("\t\t\t      SCENE " +scene2);

        ArrayList <String> script2= new ArrayList<String>();


        script2.add("\t\t\t+----------------+" +"\n");

        script2.add("\t\t      **PLAYING COMEDY SCENE** "+"\n");

        script2.add("\t\t+-----------------------------------+" +"\n");

        script2.add("\t[**Scene: Monica and Rachel's, late at night Monica is still examining her bill as Rachel emerges from her room.**]" +"\n");

        script2.add("\tRachel: Oh, Monica. You are not still going over that thing."+"\n");

        script2.add("\tMonica: This woman's living my life."+"\n");

        script2.add("\tRachel: What?"+"\n");

        script2.add("\tMonica: She's living my life, and she's doing it better than me! Look at this, look. She buys tickets for plays that I wanna see.");
        script2.add("\t        She, she buys clothes from stores that I'm intimidated by the sales people. She spent three hundred dollars on art supplies."+"\n");
        
        script2.add("\tRachel: You're not an artist."+"\n");
   
        script2.add("\tMonica: Yeah, well I might be if I had the supplies! I mean, I could do all this stuff. Only I don't."+"\n");

        script2.add("\tRachel: Oh, Monica, c'mon, you do cool things."+"\n");

        script2.add("\tMonica: Oh really? Okay, let's compare, shall we."+"\n");

        script2.add("\tRachel: (Yawning) Oh, it's so late for 'Shall we'..."+"\n");

        script2.add("\tMonica: Do I go horseback riding in the park? Do I take classes at the New School?"+"\n");

        script2.add("\tRachel: (Yawning) Nooo..."+"\n");
        
        script2.add("\tMonica: This is so unfair! She's got everything I want, and she doesn't have my mother."+"\n");

        script2.add("\t[**Scene: Central Perk, Joey and Chandler are discussing stage names.**]"+"\n");

        script2.add("\tChandler: How about Joey... Pepponi?"+"\n");

        script2.add("\tJoey: No, still too ethnic. My agent thinks I should have a name that's more neutral."+"\n");

        script2.add("\tChandler: Joey... Switzerland?"+"\n");

        script2.add("\t(*The waitress brings their coffee.*)"+"\n");

        script2.add("\tJoey: Plus, y'know, I think it should be Joe. Y'know, Joey makes me sound like I'm, I dunno, this big. (Waitress looks at him funny) Which I'm not."+"\n");

        script2.add("\tChandler: Joe...Joe...Joe...Stalin?"+"\n");

        script2.add("\tJoey: Stalin...Stalin...do I know that name? It sounds familiar."+"\n");

        script2.add("\tChandler: Well, it does not ring a bell with me..."+"\n");

        script2.add("\tJoey: (Writes it down) Joe Stalin. Y'know, that's pretty good."+"\n");

        script2.add("\tChandler: Might wanna try Joseph."+"\n");

        script2.add("\t(*Joey visibly thinks 'Of course!' and writes it down.*)"+"\n");

        script2.add("\tJoey: Joseph Stalin. I think you'd remember that!"+"\n");

        script2.add("\tChandler: Oh yes! Bye Bye Birdie, starring Joseph Stalin. Joseph Stalin is the Fiddler on the Roof."+"\n");
        
        Iterator its=script2.iterator();

        while(its.hasNext()){

          System.out.println(its.next());
        }
        
      }
    }  

        