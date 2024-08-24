package com.evergent.corejava.strings;



//SplitDemo using normal advanced for each loop
public class SplitDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is a powerfull prgramming language";
		String words[] = str.split(" ");
		for(String w : words) {
			System.out.println(w);
		}
	}

}
