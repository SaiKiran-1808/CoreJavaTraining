package com.evergent.corejava.saikiran.application4;

public class Login {

	//----------------------------------------- FINAL VARIABLE ----------------------------------------
	final static String bankname = "ICICI";
	
	//----------------------------------------- STATIC BLOCK ----------------------------------------
	static {
		System.out.println("\t\t\t ---------------------------- Welcome to "+bankname+" bank -------------------------------------\n");
	}
	
	//----------------------------------------- LOCAL METHOD ----------------------------------------
	public boolean yes(String ve, String vp,String e,String p) {
		if(ve.equals(e) && vp.equals(p)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
