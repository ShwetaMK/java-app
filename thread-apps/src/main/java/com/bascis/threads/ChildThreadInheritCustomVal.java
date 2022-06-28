package com.bascis.threads;

public class ChildThreadInheritCustomVal extends Thread {

	// public static ThreadLocal tl = new ThreadLocal();

	public void run() {

		System.out.println("Child :" + ParentThreadInheritableCustomVal.tl.get());

	}
}
