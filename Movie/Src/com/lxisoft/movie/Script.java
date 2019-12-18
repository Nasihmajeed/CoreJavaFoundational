package com.lxisoft.movie;
import com.lxisoft.movie.Script;
public class Script
{	
	
	public String setDialouge1(int num)
	{ 	
		String[] cdialouge={"life is an race","what are you talking about","so tell what is the real meaning of life","hehehehee","how are you","what are you doing","No why you are getting only negative ","you still alive that is what i am talking about","hahahaha.... one day you will","heloo","where are you going","hai buddy"};
		return cdialouge[num];
	}
	public String scenes(int randscenenum)
	{
		String[] scene={"on the bridge","center of meetingroom","In the car","Ship basement","The company"};
		return scene[randscenenum];
	}
	

	
}
