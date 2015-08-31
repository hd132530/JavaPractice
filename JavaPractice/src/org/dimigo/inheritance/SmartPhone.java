/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *        |_Circle
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class SmartPhone{
	
	private String model;
	private String company;
	private int price;

	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	protected void turnOn(){
		
		
	}
	protected void turnOff(){
		
	}	
	
}
