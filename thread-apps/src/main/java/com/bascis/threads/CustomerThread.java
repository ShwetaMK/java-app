package com.bascis.threads;

public class CustomerThread extends Thread {

	static int custId = 0;
	String name;
	ThreadLocal tl = new ThreadLocal() {
		public Object initialValue() {
			return ++custId;
		}
	};

	public CustomerThread(String name) {
		this.name = name;
	}

	public void run() {
		System.out
				.println(Thread.currentThread().getName() + " has id " + tl.get());
	}
}
