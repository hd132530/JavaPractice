package org.dimigo.basic;

public class Loop {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		
		for(i=1; i<= 10; i++) {
			for(j=1; j<=10; j++) {
				if(i == j){
				System.out.printf("*");
				}
				else
			System.out.printf("%d", j);
			}
			System.out.printf("\n");
		}

	}
}
