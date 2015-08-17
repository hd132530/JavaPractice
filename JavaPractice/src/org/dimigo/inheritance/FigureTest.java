/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *        |_FigureTest
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class FigureTest {
	
	public static void main(String[] args) {
			
			Circle c = new Circle(5);
			Tri t = new Tri(10, 10, 5, 8);
			Rec r = new Rec(20, 20, 5, 8);
			
			System.out.printf("원의 넓이 : %.1f\n", c.calcArea());
			System.out.println("삼각형 넓이 : " + t.calcArea());
			System.out.println("사각형 넓이 : " + r.calcArea());
			
			c.printCenter();
			t.printCenter();
			r.printCenter();
			
			System.out.println(" -- 중심좌표 이동  (x,y축으로 5씩)");
			
			c.moveFigure(5,5);
			t.moveFigure(5,5);
			r.moveFigure(5,5);
			
			c.printCenter();
			t.printCenter();
			r.printCenter();
	
	}

}
