package com.lxisoft.kit;

public class Board
{
	
	int i,j,k;
	
	int[] playBoard1=new int[100];
	int[] playBoard2=new int[200];
	int[] playBoard3=new int[300];
	
	
	for(int i=0 ; i<100 ; i++)
	{
		playBoard1[i]=new playBoard1();
		playBoard1[i]=playBoard1[i]+i;
	}
	
	for(int j=0 ; j<200 ; j++)
	{
		playBoard2[j]=new playBoard2();
		playBoard2[j]=playBoard2[j]+j;
	}
	
	for(int k=0 ; k<300 ; k++)
	{
		playBoard3[k]=new playBoard3();
		playBoard3[k]=playBoard3[k]+k;
	}
	
}