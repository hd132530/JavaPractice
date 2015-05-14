/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *        |_Score
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("국어 점수 입력 => \n");
		int kor = scanner.nextInt();
		System.out.printf("수학 점수 입력 => \n");
		int math = scanner.nextInt();
		System.out.printf("영어 점수 입력 => \n");
		int eng = scanner.nextInt();
		
		int tot = kor+math+eng;
		double avg = tot / 3.0;
		
		StringBuilder sb = new StringBuilder();
		sb.append("<<점수 출력>>\n");
		sb.append("국어 점수 : " + kor +"점\n");
		sb.append("수학 점수 : " + math +"점\n");
		sb.append("영어 점수 : " + eng +"점\n");
		sb.append("총점 : " + tot +"점\n");
		sb.append("평균 : " + String.format("%.1f", avg) +"점\n");
		System.out.println(sb.toString());
				
		scanner.close();
	}

}
