import java.util.Random;

public class Board {

	private int noOfCells;
	private Snake snakes[];
	private Ladder ladders[];
	int length = noOfCells * 5 / 100;
	Random random = new Random();

	public Board(int noOfCells) {

		this.noOfCells = noOfCells;
		addSnakesAndLadders();
	}

	public void biteOrLift(Player player) {

		Snake randomNumberFromSnake = snakes[random.nextInt(length)];
		Ladder randomNumberFromLadder = ladders[random.nextInt(length)];
	}

	private void addSnakesAndLadders() {

		snakes = new Snake[length];
		ladders = new Ladder[length];
		for (int i = 0; i < length; i++) {
			snakes[i] = new Snake();
			ladders[i] = new Ladder();
		}
	}

	public int getNoOfCells() {
		return noOfCells;
	}

	public Snake[] getSnakes() {
		return snakes;
	}

	public void setSnakes(Snake[] snakes) {
		this.snakes = snakes;
	}

	public Ladder[] getLadders() {
		return ladders;
	}

	public void setLadders(Ladder[] ladders) {
		this.ladders = ladders;
	}

}