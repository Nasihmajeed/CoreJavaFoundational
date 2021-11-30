public class Snake {

	private int headPosition;
	private int tailPosition;

	public void bite(Player player) {
		player.setPosition(tailPosition);
	}

	public int getHeadPosition() {
		return headPosition;
	}

	public void setHeadPosition(int headPosition) {
		this.headPosition = headPosition;
	}

	public int getTailPosition() {
		return tailPosition;
	}

	public void setTailPosition(int tailPosition) {
		this.tailPosition = tailPosition;
	}
}
