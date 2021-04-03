package com.lxisoft.view;
import com.lxisoft.model.*;


public class Veena extends Script implements Actors, Heroine
{
	public void character()
	{
		Veena veena = new Veena();
		if(veena instanceof Heroine)
		{
			System.out.println("-Heroine-\n");
		}
	}
    public void actorDetails()
    {
        System.out.println("+-----------------------------------------------------------------+");
		System.out.println("\n                           Bhavna Pani");
		System.out.println("                        -------------------");
		System.out.println("      Bhavna Pani is an Indian actress - model and a dancer.");
		System.out.println(" Pani has been a dancer since age of six. She is trained in Odissi");
        System.out.println("and Kathak by the legends – Kelucharan Mohapatra and Birju Maharaj.");
        System.out.println("       She has also learned Contemporary Modern dance at the");
        System.out.println("       Terrence Lewis Contemporary Dance Company and trained");
        System.out.println("                       in Jazz and Ballet.");
		System.out.println("\n+-----------------------------------------------------------------+");
	}

	public void characterDetails()
    {
		System.out.println("+-----------------------------------------------------------------+");
		System.out.println("\n                              Veena");
		System.out.println("                        -------------------");
		this.character();
		System.out.println("       Veena is a brahmin girl working in a private company.");
        System.out.println("  Her family is very orthodox. She falls in love with a christian");
		System.out.println("    boy Felix. She leaves her family behind to live with Felix.");
		System.out.println("    Felix leaves Veena as she left her family money ans assets.");
		System.out.println("    She leaves to find  Felix who is off to marry someone else.");
		System.out.println("           On the way she meets Gopi and travel with him.");
		System.out.println("                   This journey changes her life.");
		System.out.println("\n+-----------------------------------------------------------------+");

    }

	
}
