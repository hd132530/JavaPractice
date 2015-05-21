/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *        |_SnackTest
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 18.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class SnackTest {
	public static void main(String[] args){
		int tot = 0;
		Snack[] snaArr = new Snack[]{
				new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칲", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4)
				};
				
				for(Snack snack : snaArr){
					snack.printSnack();
					
					tot += snack.Totprice();
				}
				
				System.out.println("총 구매 금액 : " + String.format("%,d", tot) + "원");
				System.out.println("");
				}
	}
