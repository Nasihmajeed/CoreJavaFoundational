package com.lxisoft.nivea;
import com.lxisoft.BallInterface.*;
public class TennisBall extends Ball implements Bouncable
{
	public String bounce()
	{
		String offer = "20% discount";
		return offer;
	}
}