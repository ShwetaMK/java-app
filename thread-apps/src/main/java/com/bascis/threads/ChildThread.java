package com.bascis.threads;

public class ChildThread extends Thread {

	// public static ThreadLocal tl = new ThreadLocal();

	public void run() {

		System.out.println("Child :" + ParentThread.tl.get());

	}
}
