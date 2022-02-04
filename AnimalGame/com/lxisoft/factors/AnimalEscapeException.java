package com.lxisoft.factors;

import java.util.*;

import com.lxisoft.*;
import com.lxisoft.localization.Localization;



public class AnimalEscapeException extends Exception
{
	String message;
	Localization object = new Localization();

	public AnimalEscapeException(String str) {
	   message = str;
	}
	public String toString() {
	   return (object.initialize().getProperty("Exception_stmt") + message);
	}
	
	
 }