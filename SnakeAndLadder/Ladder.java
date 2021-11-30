public class Ladder {

	private int topPosition;
	private int bottomPosition;

	public void lift(Player player) {
		player.setPosition(topPosition);
	}

	public int getTopPosition() {
		return topPosition;
	}

	public void setTopPosition(int topPosition) {
		this.topPosition = topPosition;
	}

	public int getBottomPosition() {
		return bottomPosition;
	}

	public void setBottomPosition(int bottomPosition) {
		this.bottomPosition = bottomPosition;
	}

}
