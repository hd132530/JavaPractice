package org.dimigo.thread;

import java.util.Random;

public class Race {
	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Thread[] thread = {new Runner("김현승"), new Runner("박윾택")};
		
		int i = new Random().nextInt(2);
		
		thread[i].start();
		thread[1-i].start();
		
		System.out.println("main thread end");
	}
}	
