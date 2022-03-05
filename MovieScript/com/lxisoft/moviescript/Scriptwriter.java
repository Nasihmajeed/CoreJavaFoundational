package com.lxisoft.moviescript;

import java.util.*;

public class Scriptwriter {

  Script script = new Script();
  

    public String [] actor = new String[10];


    public void romanticDialogue() {

       
        ArrayList <String> script1= new ArrayList<String> ();
       
        script.viewScript();
        
        script1.add("\t\t\t+----------------+" +"\n");

        script1.add("\t\t    **PLAYING ROMANTIC SCENE** "+"\n");

        script1.add("\t\t+-----------------------------------+" +"\n");

        script1.add("\t       ( OUTSIDE THE CHURCH )  "+"\n");
       
        script1.add("\t ** Hazel waits for her Mom’s car to appear ** " +"\n");

        script1.add("\t** Hazel turns to find the Beautiful Boy, Augustus, standing right next to her. **" +"\n");

        script1.add("\t" + actor[0] +": I thought we were in a church basement but apparently we were literally in the  heart of Jesus." +"\n");

        script1.add("\t** Hazel smiles. **" +"\n");

        script1.add("\t" + actor[1] +": Someone should probably tell him, dont you think? Jesus? Seems kinda dangerous  keeping all these kids with cancer in  your heart." +"\n");

        script1.add("\t** Gus laughs. **" +"\n");

        script1.add("\t" + actor[0] +": What's your name?" +"\n");

        script1.add("\t" + actor[1] +": Hazel." +"\n");
        
        script1.add("\t" + actor[0] +": No your full name..." +"\n");

        script1.add("\t** Hazel confused ** " +"\n");

        script1.add("\t" + actor[1] +": Hazel Grace Lancaster." +"\n");

        script1.add("\t** Gus nods to himself, smiles. Still fixated on her. ** " +"\n");

        script1.add("\t** Hazel Continued ** " +"\n");

        script1.add("\t" + actor[1] +": What?" +"\n");

        script1.add("\t" + actor[0] +": I did not say anything." +"\n");

        script1.add("\t" + actor[1] +": Why are you looking at me like that?" +"\n"); 

        script1.add("\t" + actor[0] +": Because you are beautiful." +"\n");

        script1.add("\t** Hazel is taken aback. No one’s ever said that to her before. ** " +"\n");

        script1.add("\t** Gus Continued ** " +"\n");

        script1.add("\t" + actor[0] +": I enjoy looking at beautiful people and I  decided a while back not to deny myself  the simpler pleasures of existence. " );
        script1.add("\t                 Particularly given that, as you soastutely pointed out, we are all gonna die pretty soon."+"\n");

        script1.add("\t" + actor[1] +": Iam not beaut --" +"\n");

        Iterator itr=script1.iterator();

        while(itr.hasNext()){

          System.out.println(itr.next());
        }
      }
        public void comicDialogue() {

        ArrayList <String> script2= new ArrayList<String>();

        script.viewScript2();

        script2.add("\t\t\t+----------------+" +"\n");

        script2.add("\t\t      **PLAYING COMEDY SCENE** "+"\n");

        script2.add("\t\t+-----------------------------------+" +"\n");

        script2.add("\t[**Scene: Monica and Rachel's, late at night Monica is still examining her bill as Rachel emerges from her room.**]" +"\n");

        script2.add("\t" + actor[2] +": Oh, Monica. You are not still going over that thing."+"\n");

        script2.add("\t" + actor[3] +": This woman's living my life."+"\n");

        script2.add("\t" + actor[2] +": What?"+"\n");

        script2.add("\t" + actor[3] +": She's living my life, and she's doing it better than me! Look at this, look. She buys tickets for plays that I wanna see.");
        script2.add("\t        She, she buys clothes from stores that I'm intimidated by the sales people. She spent three hundred dollars on art supplies."+"\n");
        
        script2.add("\t" + actor[2] +": You're not an artist."+"\n");
   
        script2.add("\t" + actor[3] +": Yeah, well I might be if I had the supplies! I mean, I could do all this stuff. Only I don't."+"\n");

        script2.add("\t" + actor[2] +": Oh, Monica, c'mon, you do cool things."+"\n");

        script2.add("\t" + actor[3] +": Oh really? Okay, let's compare, shall we."+"\n");

        script2.add("\t" + actor[2] +": (Yawning) Oh, it's so late for 'Shall we'..."+"\n");

        script2.add("\t" + actor[3] +": Do I go horseback riding in the park? Do I take classes at the New School?"+"\n");

        script2.add("\t" + actor[2] +": (Yawning) Nooo..."+"\n");
        
        script2.add("\t" + actor[3] +": This is so unfair! She's got everything I want, and she doesn't have my mother."+"\n");

        script2.add("\t[**Scene: Central Perk, Joey and Chandler are discussing stage names.**]"+"\n");

        script2.add("\t" + actor[4] +": How about Joey... Pepponi?"+"\n");

        script2.add("\t" + actor[5] +": No, still too ethnic. My agent thinks I should have a name that's more neutral."+"\n");

        script2.add("\t" + actor[4] +": Joey... Switzerland?"+"\n");

        script2.add("\t(*The waitress brings their coffee.*)"+"\n");

        script2.add("\t" + actor[5] +": Plus, y'know, I think it should be Joe. Y'know, Joey makes me sound like I'm, I dunno, this big. (Waitress looks at him funny) Which I'm not."+"\n");

        script2.add("\t" + actor[4] +": Joe...Joe...Joe...Stalin?"+"\n");

        script2.add("\t" + actor[5] +": Stalin...Stalin...do I know that name? It sounds familiar."+"\n");

        script2.add("\t" + actor[4] +": Well, it does not ring a bell with me..."+"\n");

        script2.add("\t" + actor[5] +": (Writes it down) Joe Stalin. Y'know, that's pretty good."+"\n");

        script2.add("\t" + actor[4] +": Might wanna try Joseph."+"\n");

        script2.add("\t(*Joey visibly thinks 'Of course!' and writes it down.*)"+"\n");

        script2.add("\t" + actor[5] +": Joseph Stalin. I think you'd remember that!"+"\n");

        script2.add("\t" + actor[4] +": Oh yes! Bye Bye Birdie, starring Joseph Stalin. Joseph Stalin is the Fiddler on the Roof."+"\n");
        
        Iterator its=script2.iterator();

        while(its.hasNext()){

          System.out.println(its.next());
          
        }
      }

      public void emotionalDialogue() {

        ArrayList <String> script3= new ArrayList<String>();
        
        script.viewScript3();

        script3.add("\t\t\t+----------------+" +"\n");

        script3.add("\t\t      **PLAYING EMOTIONAL SCENE** "+"\n");

        script3.add("\t\t+-----------------------------------+" +"\n");

        script3.add("\t  (HERENGRACHT CANAL - DAY 121)  " + "\n");
        
        script3.add("\t (*They stroll across a footbridge. Hazel notices he’s struggling with something.*) " + "\n");

        script3.add("\t" + actor[1] +": Augustus?" + "\n");

        script3.add("\t *Gus takes a cigarette out, sticks it between his lips.* " + "\n");

        script3.add("\t HAZEL (CONT’D) " + "\n");

        script3.add("\t" + actor[1] + ": What is it? " + "\n");

        script3.add("\t" + actor[0] + ": There’s something I have to tell you...They walk in silence a few beats." + "\n" );

        script3.add("\t GUS (CONT’D)" + "\n");

        script3.add("\t" + actor[0] + ": Just before you went into the hospital...There was this... I felt this... ache in my hip." + "\n");

        script3.add("\t (*Hazel grabs onto his arm, a lump already forming.Gus takes the cigarette out of his mouth, clenches his teeth  tightly, trying not to cry.*) " + "\n");

        script3.add("\t GUS (CONT’D) " + "\n");

        script3.add("\t" + actor[0] + ": It lit up like a Christmas tree, Hazel.The lining of my chest, my liver... everywhere " + "\n");

        script3.add("\t (*Hazel loses it in that moment, hugging him for dear life, her  head in his lap.*) " + "\n");

        script3.add("\t" + actor[1] + ": I’m so sorry, Augustus. I’m so so sorry -- " + "\n");

        script3.add("\t" + actor[0] + ": I’m sorry too -- " + "\n");

        script3.add("\t" + actor[1] + ": It’s so unfair -- " + "\n");

        script3.add("\t" + actor[0] + ": I should have told you --" + "\n");

        script3.add("\t" + actor[1] + ": It’s so fucking unfair!  " + "\n");

        script3.add("\t **A beat. Gus still trying not to cry.** " + "\n");

        script3.add("\t" + actor[0] + ": Apparently the world is... not a wish granting factory. " + "\n");

        script3.add("\t GUS (CONT’D) " + "\n");

        script3.add("\t" + actor[0] + ": Don’t you worry about me, Hazel Grace. I’ll find a way to hang around and annoy you for a long time." + "\n");

        script3.add("\t **She hugs him, perhaps a little too tightly. He winces.** " + "\n");

        script3.add("\t" + actor[1] + ": Does it hurt? " + "\n");

        script3.add("\t" + actor[0] + ": It’s ok. " + "\n");
        script3.add("\t                : I’m ok." + "\n");

        script3.add("\t" + actor[1] + ": Ok. " + "\n");

        script3.add("\t **Hazel takes a moment to look at him, touches his cheek.** " + "\n");

        script3.add("\t" + actor[0] + ": What? " + "\n" );

        script3.add("\t" + actor[1] + ": I’m just... I’m very fond of you. He grabs her hand and holds it. " + "\n");

        script3.add("\t" + actor[0] + ": I don’t suppose you can forget about it, treat me like I’m not dying. " + "\n");

        script3.add("\t" + actor[1] + ": I don’t think you’re dying, Augustus. You’ve just got a touch of cancer Gus nods. Squeezes her hand. " + "\n");

        Iterator it=script3.iterator();

        while(it.hasNext()){

          System.out.println(it.next());
        }

      }

}
    

