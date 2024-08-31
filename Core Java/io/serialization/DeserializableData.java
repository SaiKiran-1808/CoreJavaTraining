package com.evergent.corejava.io.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializableData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fis = new FileInputStream(
					"D:\\CoreJAVA_Workspace\\CoreJAVA_Development\\myData_Files\\product.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Product p;
			while ((p = (Product) ois.readObject()) != null) {
				System.out.println(p.getPid() + " " + p.getPname() + " " + p.getPrice());
			}
		} catch (Exception e) {
			if (e.getMessage() == null) {
				System.exit(0);
			}

		}
	}

}
