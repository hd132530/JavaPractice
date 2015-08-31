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
public class SmartPhoneTest extends SmartPhone {

	public static void main(String[] args) {
		
		SmartPhone[] pl = {new IPhone("iPhone 6", "애플", 700000), new Galaxy("갤럭시 S6", "삼성", 650000)};
		
		for(SmartPhone phone : pl) {
			System.out.println(phone.toString());
			
			phone.turnOn();
			phone.pay();
			phone.useSpecialFunction();
			phone.turnOff();
		
		}
	}
}
