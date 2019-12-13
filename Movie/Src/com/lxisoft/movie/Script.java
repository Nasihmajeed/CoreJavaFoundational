package com.lxisoft.movie;
import com.lxisoft.movie.Script;
public class Script
{	
	
	public String setDialouge1(int n)
	{ 	
		String[] cdialouge={"life is an race","what are you talking about","so tell what is the real meaning of life","hehehehee","how are you","what are you doing"};
		return cdialouge[n];
	}
	public String setDialouge2(int n)
	{ 	
		String[] vdialouge={"No why you are getting only negative ","you still alive that is what i am talking about","hahahaha.... one day you will","heloo","where are you going","hai buddy"};
		return vdialouge[n];
	}
	public String scenes(int n)
	{
		String[] scene={"on the bridge","center of meetingroom","In the car","Ship basement","The company"};
		return scene[n];
	}
	

	
}
