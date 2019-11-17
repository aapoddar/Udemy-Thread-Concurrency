package com.thread.sequentialparall;

import java.io.IOException;

public class TaskCopyFile implements Runnable {
	 
	private String srcFile ;
	private String destFile;
	public TaskCopyFile(String srcFile,String destFile){
		this.srcFile=srcFile;
		this.destFile=destFile;
	}
	@Override
	public void run() {
		try {
			CopyFileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
