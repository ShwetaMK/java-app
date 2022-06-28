package com.bascis.threads;

public class ChildThreadInheritableThreadLocal extends Thread {

	// public static ThreadLocal tl = new ThreadLocal();

	public void run() {

		System.out.println("Child :" + ParentThreadInheritableThreadLocal.tl.get());

	}
}
