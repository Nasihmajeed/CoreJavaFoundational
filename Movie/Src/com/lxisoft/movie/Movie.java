package com.lxisoft.movie;
import com.lxisoft.movie.Movie;
import com.lxisoft.movie.Actor;
import com.lxisoft.movie.Script;
public class Movie
{
	Script[] script=new Script[4];
	Actor [] actor=new Actor[4];
	
	public void getdetails()
	{
		Comedian spiderman=new Comedian();
		spiderman.name="Spiderman";
		System.out.println(spiderman.name);
		actor[0]=spiderman;
		actor[0].type();
		if(actor[0] instanceof Actor)
		{
			Comedian s=(Comedian) actor[0];
			s.charecter();
			/*script[0].*/
		}
		Villain thanos=new Villain();
		System.out.println("\n");
		thanos.name="Thanos";
		System.out.println(thanos.name);
		actor[1]=thanos;
		actor[1].type();
		if(actor[1] instanceof Actor)
		{
			Villain v=(Villain) actor[1];
			v.charecter();
			/*script[0].*/
		}

	}
}