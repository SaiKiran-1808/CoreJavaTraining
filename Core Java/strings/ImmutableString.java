package com.evergent.corejava.strings;


//Immutable string example
public class ImmutableString {

	private final String value;	
	
	public ImmutableString(String value) {
		this.value = value;
	}
	
	
	public String myValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImmutableString obj = new ImmutableString("Hello World!");
		System.out.println(obj.myValue());
		System.out.println(obj.toString());
	}

}
