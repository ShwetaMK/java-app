package com.bascis.threads;

public class ParentThread extends Thread {

	public static ThreadLocal tl = new ThreadLocal();

	public void run() {
		tl.set("PP");
		System.out.println("Parent :" + tl.get());
		ChildThread c = new ChildThread();
		c.start();
	}
}
