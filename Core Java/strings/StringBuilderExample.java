package com.evergent.corejava.strings;

//StringBuilder methods example
public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);

		sb.append(" World");
		System.out.println(sb);

		sb.insert(6, "Beautifull ");
		System.out.println(sb);

		sb.replace(0, 5, "Hi");
		System.out.println(sb);

		sb.delete(0, 3);
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);
	}

}
