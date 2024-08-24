package com.evergent.corejava.wrapperclasses;

public class WrapperClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		float f1 = 4.5f;
		int i1 = 100;
		
		Integer t1 = new Integer(i1);
		int t2 = t1.intValue();
		
		double d1 = 799.99;
		Double d2 = new Double(d1);
		
		double d3 = d2.doubleValue();
		
		
		byte b1 = 10;
		Byte b2 = new Byte(b1);
		byte b3 = b2.byteValue();
		
		System.out.println("int value"+i1);
		System.out.println("Int obj value"+t1);
		System.out.println("Converted Integer object to int : "+t2);
		
		
		System.out.println("double value"+d1);
		System.out.println("Double obj value"+d2);
		System.out.println("Converted Double object to double : "+d3);
		
		
		System.out.println("byte value"+b1);
		System.out.println("Byte obj value"+b2);
		System.out.println("Converted Byte object to byte : "+b3);		
		
		
	}

}
