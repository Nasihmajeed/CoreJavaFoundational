class Board{

	public void boardView(){
		int val=100;
		int[][] board= new int[10][10];
		for (int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				board[i][j]=val;
				val--;
			}
		}
		for (int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				System.out.print("|"+board[i][j]+"|"+"\t");
			}
			System.out.println("\n-----------------------------------------------------------------------------");
			//System.out.print("\n");
		}
	}
}
