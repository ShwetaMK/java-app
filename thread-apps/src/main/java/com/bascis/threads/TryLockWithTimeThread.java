package com.bascis.threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockWithTimeThread extends Thread {
	static ReentrantLock l = new ReentrantLock();

	public TryLockWithTimeThread(String name) {
		super();
	}

	public void run() {
		do {
			try {
				if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName() + " got lock");
					try {
						Thread.sleep(20000);
					} catch (Exception e) {
					}
					l.unlock();
					System.out.println(Thread.currentThread().getName() + " releases lock");

					break;
				} else {
					System.out.println(
							Thread.currentThread().getName() + " didn't get lock. Perfoming other operations.");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (true);
	}
}
