package com.lxisoft.moviescript;
import java.util.*;
import java.io.*;
public class ScriptWriter
{
	File villanQuesFile = new File("D:\\movie\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\villanQuesFile.txt");
	File comedianQuesFile = new File("D:\\movie\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\comedianQuesFile.txt");
	File villanAnsFile = new File("D:\\movie\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\villanAnsFile.txt");
	File comedianAnsFile = new File("D:\\movie\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\comedianAnsFile.txt");
    public ArrayList<Dialogue> villanQuestion = new ArrayList<Dialogue>();
	public ArrayList<Dialogue> comedianQuestion = new ArrayList<Dialogue>();
	public ArrayList<Dialogue> villanAnswer = new ArrayList<Dialogue>();
	public ArrayList<Dialogue> comedianAnswer = new ArrayList<Dialogue>();
}