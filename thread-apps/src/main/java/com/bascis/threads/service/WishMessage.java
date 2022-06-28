package com.bascis.threads.service;

import java.util.concurrent.locks.ReentrantLock;

public class WishMessage {
	ReentrantLock l = new ReentrantLock();

	public void wish(String name) {
		l.lock();
		for (int i = 0; i < 5; i++) {
			System.out.print("Good Morning ");
			try {
				Thread.sleep(1500);
			} catch (Exception e) {

			}
			System.out.println(name);
		}
		l.unlock();
	}

}
