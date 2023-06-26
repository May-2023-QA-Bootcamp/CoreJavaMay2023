package lec16_02_java_read_and_write;

import java.io.File;
import java.io.IOException;

public class C_creating_folder_and_file {

	public static void main(String[] args) {
		// Creating a Folder (file explorer)
		// for Mac user -- go to the properties -- if the folder name is MayQABootcamp -- /Users/YourName/Desktop/MayQABootcamp
		
		File folder = new File("C:\\Users\\Tofael\\Desktop\\MayQABootcamp");
		folder.mkdir(); // this method create directory or folder
		// above line also can be inside try catch block
		if (folder.exists()) {
			System.out.println(folder.getName() + " folder is created");
			// Creating a file
			File file = new File("C:\\Users\\Tofael\\Desktop\\MayQABootcamp\\May2023.txt");
			try {
				file.createNewFile(); // this method create the file
			} catch (IOException e) {
				System.out.println("The exception occured is >>>>> " + e);
				// e.printStackTrace(); // we can also use method of Exception class
			}
			if (file.exists()) {
				System.out.println(file.getName() + " file is created inside the MayQABootcamp folder.");
			} else {
				System.out.println("Exception occured, file is not created");
			}
		} else {
			System.out.println("Folder is not created");
		}

	}

}
