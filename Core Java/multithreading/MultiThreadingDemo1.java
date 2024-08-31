package com.evergent.corejava.multithreading;


class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
}
public class MultiThreadingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread t1 = new MyThread();
		t1.start();
		MyThread t2 = new MyThread();
		t2.start();
	}
}
