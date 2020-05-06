package com.lxisoft.movie;

import java.io.File;
import java.util.ArrayList;

public interface Repository {
	public ArrayList<Dialogue> read(File file);

}
