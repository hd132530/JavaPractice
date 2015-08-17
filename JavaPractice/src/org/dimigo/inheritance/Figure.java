/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *        |_Figure
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Figure {
	
	private int centerX;
	private int centerY;
	
	public Figure (int centerX, int centerY) {
		super();
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea() {
		return 0.0;
	}
}
