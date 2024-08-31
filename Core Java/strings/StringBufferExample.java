package com.evergent.corejava.strings;

//StringBuffer methods example
public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello");
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

		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}

}
