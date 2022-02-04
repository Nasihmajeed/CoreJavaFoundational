package com.lxisoft.factors;

import java.util.*;

import com.lxisoft.*;
import com.lxisoft.localization.Localization;
import com.lxisoft.test.*;


public class AnimalEscapeException extends Exception
{
	String message;
	Localization object = new Localization();
	TDD opt = new TDD();

	public AnimalEscapeException(String str) {
	   message = str;
	}
	public String toString() {
		if (opt.getOption() == 1) {
	   return (object.initialize().getProperty("Exception_stmt") + message);
		} else if (opt.getOption() == 2) {
			return (object.initializeM().getProperty("Exception_stmt") + message);
		}
		return (object.initialize().getProperty("Exception_stmt") + message);
	}
	
	
 }