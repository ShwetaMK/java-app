package com.bascis.threads.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.bascis.threads.CallableThread;

public class CallableFutureDemo {

	public static void main(String[] args)
			throws InterruptedException, ExecutionException {
		CallableThread[] p = { new CallableThread(11), new CallableThread(22),
				new CallableThread(33), new CallableThread(44),
				new CallableThread(55), new CallableThread(66) };
		ExecutorService s = Executors.newFixedThreadPool(4);
		for (CallableThread pj : p) {
			Future result = s.submit(pj);
			System.out.println(result.get());

		}
		s.shutdown();
	}

}
