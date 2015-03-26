package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		System.out.println("<<고속도로 통행료 계산>>");
		
		int dis = 25;
		int toll = 0;
		int toll_for_BUS = 0;
		String Bus = "고속버스";
		toll_for_BUS = dis /10+1; //거리계산
		
		switch (Bus) {
		case "고속버스":
			toll = (850 + (300 * toll_for_BUS));
		case "경차":
			toll = (300 + (200 * toll_for_BUS));
		case "그외":
			toll = (600 + (200 * toll_for_BUS));
			
		}
		System.out.printf("거리 : %d Km\n", dis);
		System.out.println("차량 : " + Bus);
		System.out.printf("통행료 : %d 원\n", toll);
		}
	}



