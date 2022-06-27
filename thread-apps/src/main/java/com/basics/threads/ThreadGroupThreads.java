package com.basics.threads;

public class ThreadGroupThreads extends Thread{

	ThreadGroupThreads(ThreadGroup tg,String name){
		super(tg,name);
	}
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			 
		}
	}
}
