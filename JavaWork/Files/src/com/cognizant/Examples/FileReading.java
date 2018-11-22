// reading from  and writing to a file located at 'C:\Users\Admin\Desktop\errors.txt'

package com.cognizant.Examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader (new FileReader ("C:\\Users\\Admin\\Desktop\\errors.txt"));

		String line;
		String allLines = "";
		while((line = in.readLine()) != null) {
			allLines += line + "\r\n";			
		}
		System.out.println(allLines);
		in.close();
		
		BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Admin\\Desktop\\errors.txt"));
		out.write(allLines + "new line");
		out.close();
	}

}