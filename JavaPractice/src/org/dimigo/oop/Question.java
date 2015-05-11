/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *        |_Question
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String singer = "ClariS";
		String actor = "한석규";
		String subject = "한국사";
		
		System.out.println("가장 좋아하는 가수는?");
		String answer = scanner.nextLine();
		if(singer.equals(answer)){
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("한심한놈 끌끌끌");
		}
		
		System.out.println("가장 좋아하는 배우는?");
		answer = scanner.nextLine();
		if(actor.equals(answer)){
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("한심한놈 끌끌끌");
		}
		
		System.out.println("가장 좋아하는 과목은?");
		answer = scanner.nextLine();
		
		if(subject.equals(answer)){
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("한심한놈 끌끌끌");
		}
		
		scanner.close();
	}

}
