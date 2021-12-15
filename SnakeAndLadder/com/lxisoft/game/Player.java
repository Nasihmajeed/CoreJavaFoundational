package com.lxisoft.game;

public class Player {

	private String name;
	private Coin coin;

	public void movecoin(int moves) {
		coin.setPosition(coin.getPosition() + moves);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coin getCoin() {
		return coin;
	}

	public void setCoin(Coin coin) {
		this.coin = coin;
	}

}
