package com.bascis.threads;

public class PrintJob implements Runnable {
	String name;

	public PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " job is started by " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);

		} catch (Exception e) {

		}
		System.out.println(name + " job is completed by " + Thread.currentThread().getName());

	}
}
