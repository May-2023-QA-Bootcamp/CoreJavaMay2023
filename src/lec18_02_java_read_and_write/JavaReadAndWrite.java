package lec18_02_java_read_and_write;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaReadAndWrite {

	public static void main(String[] args) {
		// Creating a Folder (file explorer)
		// for Mac user -- go to the properties -- if the folder name is MayQABootcamp -- /Users/YourName/Desktop/MayQABootcamp
		
		File folder = new File("C:\\Users\\Tofael\\Desktop\\MayQABootcamp");
		folder.mkdir(); // this method create directory or folder
		// above line also can be inside try catch block
		if (folder.exists()) {
			System.out.println(folder.getName() + " folder is created.");
			// Creating a file
			File file = new File("C:\\Users\\Tofael\\Desktop\\MayQABootcamp\\May2023.txt");
			// An exception can occur during creation of a file
			// IOException is the base class for exceptions thrown while accessing information using streams,
			// files and directories. 
			try {
				file.createNewFile(); // this method create the file
			} catch (IOException e) {
				System.out.println("The exception occured is >>>>> " + e);
				// e.printStackTrace(); // we can also use method of Exception class
			}
			if (file.exists()) {
				System.out.println(file.getName() + " file is created inside the MayQABootcamp folder.");
				
				// learning here from today (37-83)
				System.out.println("<-- Please write something about the students of May 2023 Batch -->");
				Scanner scanner = new Scanner(System.in);
				String userInput = scanner.nextLine();
  				
				// how to write inside the file 42-50
				FileWriter fw = null;
				try {
					fw = new FileWriter(file);
					fw.write(userInput);
					fw.close();
				} catch (Exception f) {
					System.out.println("Filewriter failed to write in the file");
					//f.printStackTrace(); // this method print the Exception or you can use sysout like line 26
				}
				
				System.out.println("Now go to the Desktop, open the folder, then the file and see what is written in the file");
				
				String filePath = "C:\\Users\\Tofael\\Desktop\\MayQABootcamp\\May2023.txt";
				
				FileReader fr = null;
				BufferedReader br = null;
				
				try {
					fr = new FileReader(filePath);
					System.out.println("FileReader find the location of the path as: " + filePath);
				} catch (FileNotFoundException g ) {
					g.printStackTrace();
				}
				
				String data = " ";
				
				try {
					br = new BufferedReader(fr);
					while((data = br.readLine()) != null) {
					System.out.println("The BufferedReader read the file and got:  " + data);
					}
				} catch ( IOException h) {
					h.printStackTrace();
				} finally {
					if (fr != null) {
						fr = null; // If fr is not null, make it null, mean close the resource.
					}
					if (br != null) {
						br = null; // If br is not null, make it null, mean close the resource.
					}
				}
				scanner.close();				
			} else {
				System.out.println("Exception occured, file is not created");
			}
		} else {
			System.out.println("Folder is not created");
		}

	}

}
