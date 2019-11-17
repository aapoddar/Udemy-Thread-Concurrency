package com.thread.sequentialparall;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SeqParallelTest2 {

	public static void main(String[] args) throws IOException {
		
		String srcFile1= "a.txt";
		String destFile1 = "c.txt";
		
		String srcFile2= "b.txt";
		String destFile2 = "d.txt";
		//CopyFileUtils.copyFile(srcFile1, destFile1);
		
		//Parallel
		/*Thread t1 = new Thread(new TaskCopyFile(srcFile1, destFile1));
		t1.start();		
		
		Thread t2 = new Thread(new TaskCopyFile(srcFile2, destFile2));
		t2.start();	*/
		
		ExecutorService executorServ = Executors.newFixedThreadPool(2);
		executorServ.execute(new TaskCopyFile(srcFile1, destFile1));
		executorServ.execute(new TaskCopyFile(srcFile2, destFile2));
		
		executorServ.shutdown();
				
				
				
				
				

	}

}
