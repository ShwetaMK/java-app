package com.bascis.threads;

public class ParentThreadInheritableThreadLocal extends Thread {

	public static InheritableThreadLocal tl = new InheritableThreadLocal();

	public void run() {
		tl.set("PP");
		System.out.println("Parent :" + tl.get());
		ChildThreadInheritableThreadLocal c = new ChildThreadInheritableThreadLocal();
		c.start();
	}
}
