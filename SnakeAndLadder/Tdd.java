public class Tdd {

	public static void main(String[] args) {

		Die die = new Die(6);
		Player player1 = new Player();
		player1.setName("Player 1");
		Player player2 = new Player();
		player2.setName("Player 2");
		Board board = new Board(100);

		System.out.println("WELCOME TO SNAKES AND LADDERS");
		System.out.println("==============================\n");
		System.out.println("Board");
		System.out.println("-------");
		System.out.println("* Number of cells: " + board.getNoOfCells());
		System.out.println("* Number of snakes: ");
		System.out.println("* Number of ladders: \n");
		System.out.println("Players");
		System.out.println("-------");
		System.out.println("* " + player1.getName());
		System.out.println("* " + player2.getName() + "\n");
		System.out.println("Die");
		System.out.println("-------");
		System.out.println("* Number of faces: " + die.getFaces());
		System.out.println("* Value to start the game: 1\n");
		System.out.println("Let's start the game...\n");
		System.out.println("Player1 rolling the die...");

	}

}