package com.thread.threagroup;

public class ThreadGrpMain {

	public static void main(String[] args) {
		
		Task1 th1 = new Task1();
		Thread thr1 = new Thread(th1,"ThreadGrpTest");
		thr1.start();
		ThreadGroup tgroup = Thread.currentThread().getThreadGroup();
		while(null != tgroup.getParent()){
			tgroup = tgroup.getParent();
		}
		tgroup.list();
	}

}
