/***************************************************************
 * <<첫번째 수행평가>>
 * 내용 : 아이유 프로필 출력하기
 * 작성일  : 2015.03.13
 *@author JeongSeungjin
 *@version 1.0
 */

package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		
		String name = "아이유";
		boolean flag = true;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char bloodtype = 'A';
		
		System.out.println("<<아이유 프로필>>");
		
		System.out.printf("이름 : %s \n", name);
		if(flag) {
			System.out.printf("성별 : 여자 \n");
		}
		else{
			System.out.println("남자");
		} 
		System.out.printf("나이 : %d세 \n", age);
		System.out.printf("키 : %.1f cm \n", height);
		System.out.printf("몸무게 : %.1fKg \n", weight);
		System.out.printf("혈액형 : %c 형 \n", bloodtype);

	}

}
