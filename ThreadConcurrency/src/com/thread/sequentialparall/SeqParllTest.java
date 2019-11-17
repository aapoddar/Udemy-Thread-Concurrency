package com.thread.sequentialparall;

public class SeqParllTest {

	public static void main(String[] args) {
		
		// Sequential 
		
		for(int i=0;i<5;i++){
			System.out.println("Seq1");
		}
		for(int i=0;i<5;i++){
			System.out.println("Seq2");
		}
		
		//Parallel
		
		Task2 task = new Task2("p1");
		Thread th1 = new Thread(task);
		th1.start();
		
		Task2 task2 = new Task2("p2");
		Thread th2 = new Thread(task2);
		th2.start();
		
	
		
		
		

	}

}
