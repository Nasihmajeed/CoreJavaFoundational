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
		vdiaQuest[0].dialogueType="there is no other option";
		vdiaQuest[1].dialogueType="you should punish for it";
		vdiaQuest[2].dialogueType="i will kill you";

		vdiaAns=new Dialogue[3];
		for(int j=0;j<vdiaAns.length;j++)
		{
			vdiaAns [j]=new Dialogue();
		}
		vdiaAns[0].dialogueType="you should wait for a punish";
		vdiaAns[1].dialogueType="it is imposible";
		vdiaAns[2].dialogueType="i dont want any explanation";

		cdiaQuest=new Dialogue[3];
		for(int k=0;k<cdiaQuest.length;k++)
		{
			cdiaQuest[k]=new Dialogue();
		}
		cdiaQuest[0].dialogueType="please leave her";
		cdiaQuest[1].dialogueType="she is mine";
		cdiaQuest[2].dialogueType="i want to see her";

		cdiaAns=new Dialogue[3];
		for(int h=0;h<cdiaAns.length;h++)
		{
			cdiaAns[h]=new Dialogue();
		}
		cdiaAns[0].dialogueType="no";
		cdiaAns[1].dialogueType="i dont  have enough time";
		cdiaAns[2].dialogueType="i need her";
			
		 	}
 
}
		