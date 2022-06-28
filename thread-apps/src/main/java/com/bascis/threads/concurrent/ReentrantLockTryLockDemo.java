package com.bascis.threads.concurrent;

import com.bascis.threads.TryLockThread;

public class ReentrantLockTryLockDemo {

	public static void main(String[] args) {

		 
		 TryLockThread w1 = new TryLockThread("Shweta");
		 TryLockThread w2 = new TryLockThread("Sayali");
		 TryLockThread w3 = new TryLockThread("Ujwala");
		 w1.start();
		 w2.start();
		 w3.start();

	}

}
