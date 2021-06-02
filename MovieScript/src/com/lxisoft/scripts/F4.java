//Method-1

import java.io.*;
import java.nio.*;
import java.util.*;

import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class F4
{
	public static void main(String[] args){

  try (BufferedReader reader = Files.newBufferedReader(
        Paths.get("E:\\rough folder\\file.txt"), StandardCharsets.UTF_8)) {
    List<String> line = reader.lines()
                              .skip(8)
                              .limit(1)
                              .collect(Collectors.toList());

    line.stream().forEach(System.out::println);
                            }				
	
	}

}

