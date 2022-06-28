package com.bascis.threads;

public class ParentThreadInheritableCustomVal extends Thread {

	public static InheritableThreadLocal tl = new InheritableThreadLocal() {
		public Object childValue(Object p) {
			return "CC";
		}
	};

	public void run() {
		tl.set("PP");
		System.out.println("Parent :" + tl.get());
		ChildThreadInheritCustomVal c = new ChildThreadInheritCustomVal();
		c.start();
	}
}
