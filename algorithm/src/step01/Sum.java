package step01;

import java.util.Scanner;

public class Sum {
	/**
	 * @Auth : K. J. S.
	 * @date : 2018. 12. 17.
	 * n값을 입력 받아
	 * 1 ~ n까지 합을 구하세요.
	 */
	public static void main(String[] args) {
//		Scanner stdIn = new Scanner(System.in);
//		System.out.println("1부터 n까지의 합을구합니다.");
// 		System.out.print("n의 값：");
//		int n = stdIn.nextInt();
//		System.out.println("결과 : " + sum(n));
		
		System.out.println("결과 : " + sum(10));
	}
	
	public static int sum(int n){
		//코딩...
		int total=0;
		
		for(int i=1; i<=n; i++){
			total += 1*i;
			System.out.println("1x"+i+"="+(1*i)+"("+total+")");
		}
		
		return total;
	}
}
