public class Station
{
	String name;
    Train[][] train = new Train[5][5];
	 void setTrainLists()
	 {
	 	for(int i=0;i<5;i++)
	 	{
	 		for(int j=0;j<5;j++)
	 		{
	 			train[i][j]= new Train();
	 		}
	 	}
	 	train[0][0].name = "TrissurTrain1";
	 	train[0][1].name = "TrissurTrain2";
	 	train[0][2].name = "TrissurTrain3";
	 	train[0][3].name = "TrissurTrain4";
	 	train[0][4].name = "TrissurTrain5";

	 	train[1][0].name = "ErnamkulamTrain1";
	 	train[1][1].name = "ErnamkulamTrain2";
	 	train[1][2].name = "ErnamkulamTrain3";
	 	train[1][3].name = "ErnamkulamTrain4";
	 	train[1][4].name = "ErnamkulamTrain5";

	 	train[2][0].name = "KollamTrain1";
	 	train[2][1].name = "KollamTrain2";
	 	train[2][2].name = "KollamTrain3";
	 	train[2][3].name = "KollamTrain4";
	 	train[2][4].name = "KollamTrain5";

	 	train[3][0].name = "TrivandrumTrain1";
	 	train[3][1].name = "TrivandrumTrain2";
	 	train[3][2].name = "TrivandrumTrain3";
	 	train[3][3].name = "TrivandrumTrain4";
	 	train[3][4].name = "TrivandrumTrain5";

	 	train[4][0].name = "VayanadTrain1";
	 	train[4][1].name = "VayanadTrain2";
	 	train[4][2].name = "VayanadTrain3";
	 	train[4][3].name = "VayanadTrain4";
	 	train[4][4].name = "VayanadTrain5";
	 }
	void getTrainLists()
	{
	setTrainLists();
	for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
		System.out.println(train[i][j].name);
	        }
		}	
	}
	
}	