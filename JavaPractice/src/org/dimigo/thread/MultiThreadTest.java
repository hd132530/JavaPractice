package org.dimigo.thread;

public class MultiThreadTest {
	   public static void main(String[] args) {
	        Thread t1 = new TaskThread("one");
	        Thread t2 = new TaskThread("two");
	        t1.start();
	        t2.start();
	        System.out.println("main thread end");
	    }
}
