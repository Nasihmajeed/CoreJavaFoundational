package com.lxisoft.movie;
import com.lxisoft.movie.*;
public class Script
{
 	public Dialogue[] vdiaQuest;
 	public Dialogue[] vdiaAns;
 	public Dialogue[] cdiaQuest;
 	public Dialogue[] cdiaAns;
 	public void addDialogues()
 	{
 		vdiaQuest=new Dialogue[3];
 		for(int i=0;i<vdiaQuest.length;i++)
 		{
			vdiaQuest [i]=new Dialogue();
		}	
		vdiaQuest[0].dialogueType="q1";
		vdiaQuest[1].dialogueType="q2";
		vdiaQuest[2].dialogueType="q3";

		vdiaAns=new Dialogue[3];
		for(int j=0;j<vdiaAns.length;j++)
		{
			vdiaAns [j]=new Dialogue();
		}
		vdiaAns[0].dialogueType="a1";
		vdiaAns[1].dialogueType="a2";
		vdiaAns[2].dialogueType="a3";

		cdiaQuest=new Dialogue[3];
		for(int k=0;k<cdiaQuest.length;k++)
		{
			cdiaQuest[k]=new Dialogue();
		}
		cdiaQuest[0].dialogueType="cq1";
		cdiaQuest[1].dialogueType="cq2";
		cdiaQuest[2].dialogueType="cq3";

		cdiaAns=new Dialogue[3];
		for(int h=0;h<cdiaAns.length;h++)
		{
			cdiaAns[h]=new Dialogue();
		}
		cdiaAns[0].dialogueType="ca1";
		cdiaAns[1].dialogueType="ca2";
		cdiaAns[2].dialogueType="ca3";
			
		
 	}
 
}
		