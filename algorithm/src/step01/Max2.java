package step01;

// 중간값 구하기
// (1,2,3) 의 경우 2
// (1,3,3) 의 경우 3
// (1,1,2) 의 경우 1

public class Max2 {

	static int max2(int a, int b, int c) {
		// 코드 작성.
		int middelNumber = 0; // 중간 값
		
		if(a<=b){
			if(b<=c){
				middelNumber = b;
			}else if(a > c){
				middelNumber = a;
			}else{
				middelNumber = c;
			}
		}else if(a>=b){
			if(b>=c){
				middelNumber = b;
			}else if( a < c){
				middelNumber = a;
			}else{
				middelNumber = c;
			}
		}

		return middelNumber;
	}

	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max2(3, 2, 1)); // [A] a>b>c
		System.out.println("max3(3,2,2) = " + max2(3, 2, 2)); // [B] a>b=c
		System.out.println("max3(3,1,2) = " + max2(3, 1, 2)); // [C] a>c>b
		System.out.println("max3(3,2,3) = " + max2(3, 2, 3)); // [D] a=c>b
		System.out.println("max3(2,1,3) = " + max2(2, 1, 3)); // [E] c>a>b
		System.out.println("max3(3,3,2) = " + max2(3, 3, 2)); // [F] a=b>c
		System.out.println("max3(3,3,3) = " + max2(3, 3, 3)); // [G] a=b=c
		System.out.println("max3(2,2,3) = " + max2(2, 2, 3)); // [H] c>a=b
		System.out.println("max3(2,3,1) = " + max2(2, 3, 1)); // [I] b>a>c
		System.out.println("max3(2,3,2) = " + max2(2, 3, 2)); // [J] b>a=c
		System.out.println("max3(1,3,2) = " + max2(1, 3, 2)); // [K] b>c>a
		System.out.println("max3(2,3,3) = " + max2(2, 3, 3)); // [L] b=c>a
		System.out.println("max3(1,2,3) = " + max2(1, 2, 3)); // [M] c>b>a
		
		System.out.println("max3(12,2,23) = " + max2(12,2,23)); // [M] c>b>a
		System.out.println("max3(12,42,23) = " + max2(12,42,23)); // [M] c>b>a
		System.out.println("max3(12,42,123) = " + max2(12,42,123)); // [M] c>b>a
	}
}
