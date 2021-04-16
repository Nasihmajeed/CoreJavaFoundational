import java.util.*;
class TDD
{
	public static void main(String [] args)
		{
			 Random rand = new Random();
			  int x = rand.nextInt(3);
		Tiger t=new Tiger();
		Animal []a={new Deer(),new Rabbit()};
		t.fight(a[x]);
		}
}