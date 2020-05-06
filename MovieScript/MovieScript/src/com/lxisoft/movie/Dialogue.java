package com.lxisoft.movie;

public class Dialogue {
	private String dialogue;
	private boolean diaStatus;
	
	public String getDialogue() {
		return dialogue;
	}
	
	public void setDialogue(String dialogue) {
		this.dialogue = dialogue;
	}
	
	public boolean isDiaStatus() {
		return diaStatus;
	}
	
	public void setDiaStatus(boolean diaStatus) {
		this.diaStatus = diaStatus;
	}

	
	public String toString() {
	
		return dialogue.toString();
	}

}
