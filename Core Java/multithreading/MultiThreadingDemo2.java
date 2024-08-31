package com.evergent.corejava.multithreading;


class MyThread1 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
}
public class MultiThreadingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread1 m1 = new MyThread1();
		Thread t1 = new Thread(m1);
		t1.start();
		Thread t2 = new Thread(m1);
		t2.start();
	}
}
