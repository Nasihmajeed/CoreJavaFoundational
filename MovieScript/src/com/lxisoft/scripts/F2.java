//To read a specific line

import java.io.*;

import java.nio.file.Files;

import java.nio.file.Paths;

public class FileWork 
{

    public static void main(String[] args) throws IOException {

        String line = Files.readAllLines(Paths.get("E:/file.txt")).get(1);

        System.out.println(line);  
    }

}
