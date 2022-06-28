package com.bascis.threads.concurrent;

import com.bascis.threads.WishMessageThread;
import com.bascis.threads.service.WishMessage;

public class ReentrantLockReplaceSynchronized {

	public static void main(String[] args) {

		 WishMessage wm  = new WishMessage();
		 WishMessageThread w1 = new WishMessageThread(wm,"Shweta");
		 WishMessageThread w2 = new WishMessageThread(wm,"Sayali");
		 WishMessageThread w3 = new WishMessageThread(wm,"Ujwala");
		 w1.start();
		 w2.start();
		 w3.start();

	}

}
