package com.lxisoft.area;
import java.util.*;

public class Sortbyname implements Comparator<Player>
{
	public int compare(Player p1, Player p2) {
		
		return p1.getPlayerName().compareTo(p2.getPlayerName());
	}


}