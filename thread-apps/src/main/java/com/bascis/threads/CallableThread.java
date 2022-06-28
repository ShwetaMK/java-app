package com.bascis.threads;

import java.util.concurrent.Callable;

public class CallableThread implements Callable {

	int num;

	public CallableThread(int num) {
		this.num = num;
	}

	@Override
	public Object call() throws Exception {

		int sum = 0;
		System.out.println(Thread.currentThread().getName()
				+ " calculating the sum of first " + num + " numbers");
		for (int i = 0; i < num; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
