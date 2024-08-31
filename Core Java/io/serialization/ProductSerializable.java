package com.evergent.corejava.io.serialization;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

public class ProductSerializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try {
			FileOutputStream fis = new FileOutputStream("D:\\CoreJAVA_Workspace\\CoreJAVA_Development\\myData_Files\\product.txt");
			ObjectOutputStream ois = new ObjectOutputStream(fis);
						
			Product p1 = new Product(101,"Laptop",55000);
			Product p2 = new Product(102,"Phone",40000);
			Product p3 = new Product(103,"Tab",30000);
			
			
			ois.writeObject(p1);
			ois.writeObject(p2);
			ois.writeObject(p3);
			System.out.println("Wrote object into product.txt");
			ois.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
