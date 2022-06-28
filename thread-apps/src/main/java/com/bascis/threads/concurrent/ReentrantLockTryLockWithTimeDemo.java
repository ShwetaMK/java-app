package com.bascis.threads.concurrent;

import com.bascis.threads.TryLockWithTimeThread;

public class ReentrantLockTryLockWithTimeDemo {

	public static void main(String[] args) {

		 
		 TryLockWithTimeThread w1 = new TryLockWithTimeThread("Shweta");
		 TryLockWithTimeThread w2 = new TryLockWithTimeThread("Sayali");
		 TryLockWithTimeThread w3 = new TryLockWithTimeThread("Ujwala");
		 w1.start();
		 w2.start();
		 w3.start();
		 

	}

}
