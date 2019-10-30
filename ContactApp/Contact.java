import java.util.Scanner;
public class Contact
{
	Members[] members=new Members[20];
	
	
	public void details()
	{
		Members m=new Members();
		Members member1=new Members();
		member1.num=0;
		member1.name="Ajith";
		member1.number="7495089077";
		member1.email="ajithkpzone@gmail.com";
		members[0]=member1;
		System.out.println("num    : "+members[0].num);
		System.out.println("Name   : "+members[0].name);
		/*System.out.println("Number : "+members[0].number);
		System.out.println("Email  : "+members[0].email);*/
		System.out.println("\n");

		Members member2=new Members();
		member2.num=1;
		member2.name="Pushkala manikandan";
		member2.number="9747828367";
		member2.email="pushkalam@gmail.com";
		members[1]=member2;
		System.out.println("num    : "+members[1].num);
		System.out.println("Name   : "+members[1].name);
		/*System.out.println("Number : "+members[1].number);
		System.out.println("Email  : "+members[1].email);
*/		System.out.println("\n");

		Members member3=new Members();
		member3.num=2;
		member3.name="Ashik";
		member3.number="9980763514";
		member3.email="ashikbanaya@gmail.com";
		members[2]=member3;
		System.out.println("num    : "+members[2].num);
		System.out.println("Name   : "+members[2].name);
		/*System.out.println("Number : "+members[2].number);
		System.out.println("Email  : "+members[2].email);*/
		System.out.println("\n");

		m.details(members);
		m.printdetail();
		/*for (i=3;i<members.length;i++) 
		{
			members[i]=m.printdetail();	
		}*/
	}
}