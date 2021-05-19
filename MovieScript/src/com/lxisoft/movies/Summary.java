package com.lxisoft.movies;

public class Summary
{
	
	StringBuffer firstSum=new StringBuffer();
	StringBuffer secondSum=new StringBuffer();
	StringBuffer thirdSum=new StringBuffer();
	
	
	
public StringBuffer getFirstSummary()  //soorarai pottru
{
	firstSum="Maara, a young man from a remote village, dreams of launching his own airline service. However, he must overcome several obstacles and challenges in order to be successful in his quest.";
    return firstSum;
}

public StringBuffer getSecondSummary()  //Niram
{
	secondSum="Aby realises that he is in love with Sona, his childhood friend, but is unable to express his feelings. However, he faces a dilemma when he learns that her marriage has already been arranged.";
    return secondSum;
}

public StringBuffer getThirdSummary()  //Kumbalangi Nights
{
	thirdSum="Saji, Bonny, Bobby and Franky are siblings who mostly do not get along. However, a series of events forces them to keep their animosity aside and support each other.";
    return thirdSum;
}

}