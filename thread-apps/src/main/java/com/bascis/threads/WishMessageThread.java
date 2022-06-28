package com.bascis.threads;

import com.bascis.threads.service.WishMessage;

public class WishMessageThread extends Thread {

	WishMessage wm;
	String name;
	public WishMessageThread(WishMessage wm , String name){
		this.wm = wm;
		this.name = name;
	}
	public void run() {
		wm.wish(name);
	}
}
