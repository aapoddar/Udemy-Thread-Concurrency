package com.thread.sequentialparall;

public class Task2 implements Runnable {
	
	private String str ;
	public Task2(String str){
		this.str= str;
		
	}

	@Override
	public void run() {
		for(int i=0;i<200;i++){
			System.out.print(str);
		}
		
	}

}
