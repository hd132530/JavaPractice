/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *        |_Tri
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Tri extends Figure {
	private int width;
	private int height;
	
	public Tri (int width, int height) {
		super(0, 0);
		this.width = width;
		this.height = height;
	}

	public Tri (int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea() {
		return width*height/2.0;
	}
	
	protected void printCenter() {
		System.out.print("삼각형 ");
		super.printCenter();
	}
}
