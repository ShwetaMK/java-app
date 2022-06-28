package com.bascis.threads.concurrent;

import com.bascis.threads.ParentThreadInheritableCustomVal;

public class ThreadLocalInheritCustom {

	public static void main(String[] args) {
		ParentThreadInheritableCustomVal p = new ParentThreadInheritableCustomVal();
		p.start();
	}

}
