package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] names = new String[] {"Anna", "Bob", "Willian", "Peter"};
		String path = new String("C:\\temp\\out.txt");
		
//		The "true" parameter appends the text to the end of the file. 
//		Without this parameter the file will be recreated.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { 
			
			for (String name : names) {
				bw.write(name);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
