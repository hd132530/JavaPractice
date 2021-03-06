/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *        |_Rec
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Rec extends Figure {
	
	private int width;
	private int height;
	
	public Rec (int width, int height) {
		super(0, 0);
		this.width = width;
		this.height = height;
	}

	public Rec (int centerX, int centerY, int width, int height) {
		super (centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea() {
		return width*height;
	
	}
	
	protected void printCenter() {
		System.out.print("사각형 ");
		super.printCenter();
	}

}
