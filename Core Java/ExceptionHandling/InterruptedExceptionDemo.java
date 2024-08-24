package com.evergent.corejava.ExceptionHandling;



class thread1 extends Thread {
	public void run() {
		try {
			System.out.println("Thread is sleeping...");
			Thread.sleep(2000);
			System.out.println("Thread woke up...");
			
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		
	}
}
//InterruptdException
public class InterruptedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1 t1 = new thread1();
		t1.start();
		t1.interrupt();
		
		
	}

}
