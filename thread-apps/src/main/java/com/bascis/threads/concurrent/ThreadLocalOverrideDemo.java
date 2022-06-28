package com.bascis.threads.concurrent;

public class ThreadLocalOverrideDemo {

	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal() {
			public Object initialValue() {
				return "abc";
			}
		};
		System.out.println(tl.get());
		tl.set("Shweta");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
	}

}
