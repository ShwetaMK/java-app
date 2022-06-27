package com.basics.threadgroups;
 
public class ThreadGroupTest {
	public static void main(String[] args) {
//		priorities();
//		list();
		enumerateMeth();
	}
	
	public static void enumerateMeth() {
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		int activeCount = system.activeCount();
		Thread[] activeThreads = new Thread[activeCount];
		system.enumerate(activeThreads);
		for(int i=0;i<activeCount;i++) {
			System.out.println(activeThreads[i]+" is daemon : "+activeThreads[i].isDaemon());
		}
	}
	
	public static void list()   {
		ThreadGroup pg = new ThreadGroup("Parent Group 1");
		
		ThreadGroup cg = new ThreadGroup(pg,"Child Group 2");
		Thread t1 = new Thread(pg,"Thread 1");
		Thread t2 = new Thread(pg,"Thread 2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
	}
	public static void priorities() {
		ThreadGroup tg = new ThreadGroup("Group 1");
		System.out.println(tg.getName());
		System.out.println(tg.getParent().getName());
		System.out.println(tg.getParent().getParent().getName());
		
		ThreadGroup tg2 = new ThreadGroup(tg,"Group 2");
		System.out.println(tg2.getName());
		System.out.println(tg2.getParent().getName());
		System.out.println(tg2.getParent().getParent().getName());
		
		Thread t1 = new Thread(tg,"Thread 1");
		Thread t2 = new Thread(tg,"Thread 2");
		System.out.println(t1.getPriority()+" "+t2.getPriority());
		t1.setPriority(6);
		t2.setPriority(8);
		t1.start();
		t2.start();
		System.out.println(t1.getPriority()+" "+t2.getPriority());
		tg.setMaxPriority(9);
		System.out.println(t1.getPriority()+" "+t2.getPriority());
		Thread t3 = new Thread(tg,"Thread 3");
		t3.start();
		System.out.println(t1.getPriority()+" "+t2.getPriority()+" "+t3.getPriority()); // t3 priority should be 9
		System.out.println(tg.getMaxPriority());
	}
}
