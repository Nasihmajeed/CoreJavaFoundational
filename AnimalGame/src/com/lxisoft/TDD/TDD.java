package com.lxisoft.TDD;
import com.lxisoft.Game.Forest;
public class TDD
{
public static void main(String [] args)
{
try
{
Forest forest=new Forest();
forest.Start();
System.out.println("Code works Fine");
}
catch (Exception e)
{
System.err.println("The input must be an integer");
}
//finally
//{
//System.out.println("Code works Fine");
//}
}
}

