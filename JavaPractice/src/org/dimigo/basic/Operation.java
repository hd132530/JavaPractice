package org.dimigo.basic;

public class Operation {

	public static void main(String[] args) {
		
		int pa = 9;
		double ph = 5.4;
		int sa = 9;
		int sb = 10;
		double sh = 5.8;
		double s;
		double p;
		
		System.out.println("<<도형 넓이 비교>>");
		
		s = (double)((sa+sb)*sh)/2;
		p = (double)(pa*ph);
		System.out.printf("사다리꼴의 넓이 %.1f \n", s);
		System.out.printf("평행사변형의 넓이 %.1f \n", p);
	}

}
