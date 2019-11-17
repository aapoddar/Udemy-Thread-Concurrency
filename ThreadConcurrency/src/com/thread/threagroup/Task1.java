package com.thread.threagroup;

public class Task1 implements Runnable  {

	@Override
	public void run() {
		System.out.println("My Thread");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
