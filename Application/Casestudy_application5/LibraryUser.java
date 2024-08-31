package com.evergent.corejava.saikiran.application5;

public interface LibraryUser {

	public void registerAccount(int age) throws AgeNotSupportedException;

	public void requestBook(String book) throws InvalidBookException;



}
