package com.bascis.threads.concurrent;

import com.bascis.threads.ParentThreadInheritableThreadLocal;

public class ThreadLocalInheritParent {

	public static void main(String[] args) {
		ParentThreadInheritableThreadLocal p = new ParentThreadInheritableThreadLocal();
		p.start();
	}

}
