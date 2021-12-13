package com.lxisoft.snakesandladders;

import com.lxisoft.game.Player;

public class Ladder {

	private int topPosition;
	private int bottomPosition;

	public Ladder(int topPosition, int bottomPosition) {
		this.topPosition = topPosition;
		this.bottomPosition = bottomPosition;
	}

	public void lift(Player player) {
		player.setPosition(topPosition);
	}

	public int getTopPosition() {
		return topPosition;
	}

	public int getBottomPosition() {
		return bottomPosition;
	}

}
