package day03.ex;

/*
	84232원을 지불하려 한다.
	우리나라 화페단위로 이 금액을 지불하려면
	각 단위가 몇개씩 필요한지 계산해서 출력하라.
	
	화폐단위
		50000원권
		10000원권
		5000원권
		1000원권
		500원권
		100
		50
		10
		1
		
 */
public class Ex03 {
	public static void main(String[] args) {
		int total = 84232;
		
		int tmp = total;
		
		// 5만원권
		int oman = tmp / 50000;
		// 5만원권 제외한 금액 기억
		tmp = tmp % 50000;
		
		// 1만원권
		int man = tmp / 10000;
		// 1만원권 제외한 금액 기억
		tmp = tmp % 10000;
		
		// 5000원권
		int ochun = tmp / 5000;
		
		tmp = tmp % 5000;
		
		// 1000원권 
		int chun  = tmp / 1000;
		tmp = tmp % 1000;
		
		// 500원권
		int obeak = tmp / 500;
		tmp = tmp % 500;
		
		// 100원권
		int beak = tmp / 100;
		tmp = tmp % 100;
		
		// 50
		int oship = tmp / 50;
		tmp = tmp % 50;
		
		// 10
		int ship = tmp / 10;
		
		// 1
		int il = tmp % 10;
		
		// 결과출력
		
		System.out.println("총금액 " + total + "원은 ");
		System.out.println("오만원권 : " + oman + "장");
		System.out.println("만원권 : " + man + "장");
		System.out.println("오천원권 : " + ochun + "장");
		System.out.println("천원권 : " + chun + "장");
		System.out.println("오백원권 : " + obeak + "장");
		System.out.println("백원권 : " + beak + "장");
		System.out.println("오십원권 : " + oship + "장");
		System.out.println("십원권 : " + ship + "장");
		System.out.println("일원권 : " + il + "장");
	}
}
