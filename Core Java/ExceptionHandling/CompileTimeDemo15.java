package com.evergent.corejava.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompileTimeDemo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File f = new File("D:/CoreJAVA_Workspace/CoreJAVA_Development/myData_Files/file1.txt");
			Scanner scanner = new Scanner(f);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
