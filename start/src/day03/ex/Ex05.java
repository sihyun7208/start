package day03.ex;

public class Ex05 {
	public static void main(String[] args) {
		int total = 276341;
		
		int tmp = total;
		
		// 십만원권
		int shipman = tmp / 100000;
		// 십만원권 제외한 금액 기억
		tmp = tmp % 100000;
		
		// 오만원권
		int oman = tmp / 50000;
		// 오만원권 제외한 금액 기억
		tmp = tmp % 50000;
		
		// 만원권
		int man = tmp / 10000;
		// 만원권 제외한 금액 기억
		tmp = tmp % 10000;
		
		// 5천원권
		int ochun = tmp / 5000;
		// 5천원권 제외한 금액 기억
		tmp = tmp % 5000;
		
		// 천원권
		int chun = tmp / 1000;
		// 천원권 제외한 금액 기억
		tmp = tmp % 1000;
		
		// 오백원권
		int obeak = tmp / 500;
		// 오백원권
		tmp = tmp % 500;
		
		// 백원권
		int beak = tmp / 100;
		// 백원권
		tmp = tmp % 100;
		
		// 오십원권
		int oship = tmp / 50;
		// 오십원권
		tmp = tmp % 50;
		
		// 십원권
		int ship = tmp / 10;
		
		// 일원권
		int il = tmp / 1;
		
		// 결과출력
		
		System.out.printf("총금액 " + total + "원은 ");
		System.out.printf("만원권 " + man + "장 ");
		System.out.printf("오천원권 " + ochun + "장 ");
		System.out.printf("천원권" + chun + "장 ");
		System.out.printf("오백원권 " + obeak + "장 ");
		System.out.printf("백원권 " + beak + "장 ");
		System.out.printf("오십원권 " + oship + "장 ");
		System.out.printf("십원권 " + ship + "장 ");
		System.out.printf("일원권 " + il + "장 ");
		System.out.printf("총금액 " + total + "장 ");	
	}
}
