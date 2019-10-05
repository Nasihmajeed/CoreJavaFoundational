package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;

public interface Herbivores
{
  public abstract Animal escape(Animal enemy,int luckfactor);
  public abstract int luckfactor();
  public abstract int[] graze();
  
}