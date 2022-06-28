package com.bascis.threads.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.bascis.threads.PrintJob;

public class ThreadExecutorDemo {

	public static void main(String[] args) {

		PrintJob[] p = { new PrintJob("aaa"), new PrintJob("bbb"), new PrintJob("ccc"), new PrintJob("ddd"),
				new PrintJob("eee"), new PrintJob("fff") };
		ExecutorService s = Executors.newFixedThreadPool(4);
		for (PrintJob pj : p) {
			s.submit(pj);
		}
		s.shutdown();
	}

}
