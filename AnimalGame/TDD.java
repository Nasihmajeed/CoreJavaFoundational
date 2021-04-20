import java.util.*;
class TDD
{
	public static void main(String [] args)
		{
			
			String ans;
Scanner sc=new Scanner(System.in);
			
			 Random rand = new Random();
			 
		Tiger t=new Tiger();
		Animal []a =new Animal[6];
		a[0]=new Deer();
		a[1]=new Rabbit();
		a[2]=new Sheep();
		a[3]=new Tiger();
		a[4]=new Tiger();
		a[5]=new Lion();
		
		//Animal []b={new Herbivores(),new Carnivores()};
		Fight f=new Fight();
				do{
					 int x = rand.nextInt(5);
			  int y=rand.nextInt(5);
		f.fight(a[x],a[y]);
				System.out.println("Do you want to play again :(yes/no)");
			ans=sc.next();
			
			}while(ans.equals("yes"));
		}
}