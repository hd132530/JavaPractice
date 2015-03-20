package org.dimigo.basic;
// 두번째 과제
public class TypeCasting {

	public static void main(String[] args) {
	
		int employer = 3;
		int storeN = 1500;
		long monthpay = 1700000;
		long tot;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.printf("월 평균 급여 : %,d원\n", monthpay);
		System.out.printf("점포 내 직원 수 : %,d명\n", employer);
		System.out.printf("점포 수 : %,d개\n", storeN);
		
		tot = (12 * monthpay * employer * storeN);
		
		System.out.printf("연간 인건비  : %,d원 \n", tot);
		
	}

}
