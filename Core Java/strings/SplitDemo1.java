package com.evergent.corejava.strings;

//SplitDemo using normal for loop
public class SplitDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is a powerfull prgramming language";
		String words[] = str.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
	}

}
