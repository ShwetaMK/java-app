package com.bascis.threads;

import java.util.concurrent.locks.ReentrantLock;

public class TryLockThread extends Thread {
	static ReentrantLock l = new ReentrantLock();

	public TryLockThread(String name) {
		super();
	}

	public void run() {

		if (l.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " got lock");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
			l.unlock();
		} else {
			System.out.println(Thread.currentThread().getName() + " didn't get lock. Perfoming other operations.");
		}
	}
}
