package com.lxisoft.factors;

import java.util.*;
import com.lxisoft.*;


public class AnimalEscapeException extends Exception
{
	String message;
	public AnimalEscapeException(String str) {
	   message = str;
	}
	public String toString() {
	   return ("Custom Exception Occurred : " + message);
	}
	
	
 }