package com.bascis.threads.concurrent;

import com.bascis.threads.CustomerThread;

public class ThreadLocalMultipleThreads {

	public static void main(String[] args) {
		CustomerThread c1 = new CustomerThread("Customer-1");
		CustomerThread c2 = new CustomerThread("Customer-2");
		CustomerThread c3 = new CustomerThread("Customer-3");
		CustomerThread c4 = new CustomerThread("Customer-4");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}

}
