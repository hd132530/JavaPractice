/**
 * 
 */
package org.dimigo.oop;

import org.dimigo.oop.Car;

/**
 * <pre>
 * org.dimigo.oop
 *        |_CarTest
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class CarTest {
	public static void main(String[] args) {
		
		Car3 car1 = new Car3("현대 자동차", "제네시스", "검정색", 225, 50000000); 
		Car3 car2 = new Car3("기아 자동차","K7", "흰색", 246/*, 40000000*/);
		Car3 car3 = new Car3("삼성 자동차","SM7", "회색"/*, 200, 38000000*/);
		
		System.out.println("제조사명 : "+car1.getCompany());
		System.out.println("모델명 : "+car1.getModel());
		System.out.println("색상 : "+car1.getColur());
		System.out.println("최대속도 : "+car1.getMaxspeed() + "Km");
		System.out.printf("가격  : %,d원 \n", car1.getPrice());
		
		System.out.println("제조사명 : "+car2.getCompany());
		System.out.println("모델명 : "+car2.getModel());
		System.out.println("색상 : "+car2.getColur());
		System.out.println("최대속도 : "+car2.getMaxspeed() + "Km");
		System.out.printf("가격  : %,d원 \n", car2.getPrice());
		
		System.out.println("제조사명 : "+car3.getCompany());
		System.out.println("모델명 : "+car3.getModel());
		System.out.println("색상 : "+car3.getColur());
		System.out.println("최대속도 : "+car3.getMaxspeed() + "Km");
		System.out.printf("가격  : %,d원 \n", car3.getPrice());
		
}
}
