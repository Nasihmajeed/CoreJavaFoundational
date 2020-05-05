package com.lxisoft.repository;

import java.util.*;
import java.io.*;

import com.lxisoft.movie.Dialouge;

public interface FileRepository {
	
	public void writeToFile(List<Dialouge> dialouge);
	
	public List<Dialouge> readFromFile(List<Dialouge> dialouge,File file);
	

}
