package com.evergent.corejava.oops;

public class MethodOverloading {

	public void loginDetails() {
		System.out.println("Login Details");
	}
	
	public void loginDetails(String name, String pass) {
		System.out.println("Name : "+name+" Password : "+pass);
	}
	
	public void loginDetails(String name, String pass, String captcha) {
		System.out.println("Name : "+name+" Password : "+pass+" Captcha : "+captcha);
	}
	
	public void loginDetails(int mobile, String pass) {
		System.out.println("Mobile : " + mobile+" Password : " + pass);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading mi =  new MethodOverloading();
		mi.loginDetails();
		mi.loginDetails("Hari","1234");
		mi.loginDetails("Mani", "1122","o4sf3");
		mi.loginDetails(9999999, "7777");

	}

}
