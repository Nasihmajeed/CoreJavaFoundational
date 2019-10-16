public class Race
{
	Cars[] cars=new Cars[10];
	public void Details()
	{

		Cars renult=new Norcar();
		renult.name="Renult";
		renult.espeed=350;
		renult.twt=25;
		renult.petro=16;
		renult.cc=1500;
	//	renult.dist();
		cars[0]=renult;
		System.out.println("1st Race car "+ cars[0].name);


		System.out.println("\n");

		Cars toyota=new Norcar();
		toyota.name="Toyota";
		toyota.espeed=390;
		toyota.twt=30;
		toyota.petro=18;
		toyota.cc=1700;
	//	toyota.dist();
		cars[1]=toyota;
		System.out.println("2nd Race car "+ cars[1].name);

		System.out.println("\n");

		Cars maruti=new Norcar();
		maruti.name="Maruti";
		maruti.espeed=320;
		maruti.twt=23;
		maruti.petro=19;
		maruti.cc=1600;
	//	maruti.dist();
		cars[2]=maruti;
		System.out.println("3rd Race car "+ cars[2].name);

		System.out.println("\n");

		Cars mahindra=new Norcar();
		mahindra.name="Mahindra";
		mahindra.espeed=400;
		mahindra.twt=18;
		mahindra.petro=14;
	//	mahindra.dist();
		mahindra.cc=1900;
		cars[3]=mahindra;
		System.out.println("4th Race car "+ cars[3].name);

		System.out.println("\n");

		Cars cybo=new Norcar();
		cybo.name="Cybo";
		cybo.espeed=390;
		cybo.twt=34;
		cybo.petro=18;
		cybo.cc=1800;
	//	cybo.dist();
		cars[4]=cybo;
		System.out.println("5th Race car "+ cars[4].name);


		System.out.println("\n");

		Cars ferrari=new Sporcar();
		ferrari.name="Ferrari";
		ferrari.espeed=420;
		ferrari.twt=33;
		ferrari.petro=20;
		ferrari.cc=1890;
	//	ferrari.dist();
		cars[5]=ferrari;
		System.out.println("6th Race car "+ cars[5].name);

		System.out.println("\n");

		Cars benze=new Sporcar();
		benze.name="Benze";
		benze.espeed=450;
		benze.twt=28;
		benze.petro=19;
	//	benze.dist();
		benze.cc=1900;
		cars[6]=benze;
		System.out.println("7th Race car "+ cars[6].name);

		System.out.println("\n");

		Cars shinch=new Sporcar();
		shinch.name="Shinch";
		shinch.espeed=430;
		shinch.twt=20;
		shinch.petro=20;
		shinch.cc=1900;
		//shinch.dist();
		cars[7]=shinch;
		System.out.println("8th Race car "+ cars[7].name);

		System.out.println("\n");

		Cars mechoi=new Sporcar();
		mechoi.name="Mechoi";
		mechoi.espeed=500;
		mechoi.twt=17;
		mechoi.petro=20;
		mechoi.cc=2000;
		//mechoi.dist();
		cars[8]=mechoi;
		System.out.println("9th Race car "+ cars[8].name);

		System.out.println("\n");

		Cars cell0=new Sporcar();
		cell0.name="Cell0";
		cell0.espeed=380;
		cell0.twt=29;
		cell0.petro=19;
		cell0.cc=1800;
		//cell0.dist();
		cars[9]=mechoi;
		System.out.println("10th Race car "+ cars[9].name);

		racing();
	}
	public void racing()
	{
		int c=0,s=0;
		for (int i=0;i<cars.length;i++)
		{
			//cars[i].dist();
			c=cars[i].espeed*cars[i].twt/4;
			s=c*cars[i].petro*cars[i].cc;
						

			System.out.println("velocity"+s);

		}
		winner();
	}
	public void winner()
	{
		Cars temp;
		for (int i=0;i<cars.length;i++) 
		{
			for (int j=0;j<cars.length;j++) 
			{
				temp=cars[i];
				cars[i]=cars[j];
				cars[j]=temp;
				
			}
		}
					System.out.println("winner is"+cars[j]);

	}
}