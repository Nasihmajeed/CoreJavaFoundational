package com.lxisoft.movie;

import java.io.File;
import java.util.ArrayList;

public abstract class FileRepo implements Repository {
	
	public abstract void heading();
	public abstract void choiceChar2();
	public abstract void choiceChar1();
	public abstract ArrayList<Dialogue> read(File file);

}
