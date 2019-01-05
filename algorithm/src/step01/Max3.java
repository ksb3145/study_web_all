package step01;

public class Max3 {
	
	//a,b,c의 최대값을 구하여 반환합니다.
	static int max3(int a, int b, int c){
		if(a < b) 
			a = b;
		if(a < c) 
			a = c;
		return a;
	}
	
	static int max3_1(int a, int b, int c){
		// 코드 작성.
		int maxNumber = 0;	// 최대값  
		int numberArr[];	// 비교값 담을 배열선언
		
		// 배열 값 할당
		numberArr = new int[3];
		numberArr[0] = a;
		numberArr[1] = b;
		numberArr[2] = c;
		
		// 최대값을 구하기위한 코드
		for(int i=0; i<numberArr.length; i++){
			if(i == 0){
				maxNumber = numberArr[i];
			}
			
			if(maxNumber < numberArr[i]){
				maxNumber = numberArr[i];
			}
		}

		
		
		return maxNumber;
	}
   
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3, 2, 1)); //[A] a>b>c
		System.out.println("max3(3,2,2) = " + max3(3, 2, 2)); //[B] a>b=c
		System.out.println("max3(3,1,2) = " + max3(3, 1, 2)); //[C] a>c>b
		System.out.println("max3(3,2,3) = " + max3(3, 2, 3)); //[D] a=c>b
		System.out.println("max3(2,1,3) = " + max3(2, 1, 3)); //[E] c>a>b
		System.out.println("max3(3,3,2) = " + max3(3, 3, 2)); //[F] a=b>c
		System.out.println("max3(3,3,3) = " + max3(3, 3, 3)); //[G] a=b=c
		System.out.println("max3(2,2,3) = " + max3(2, 2, 3)); //[H] c>a=b
		System.out.println("max3(2,3,1) = " + max3(2, 3, 1)); //[I] b>a>c
		System.out.println("max3(2,3,2) = " + max3(2, 3, 2)); //[J] b>a=c
		System.out.println("max3(1,3,2) = " + max3(1, 3, 2)); //[K] b>c>a
		System.out.println("max3(2,3,3) = " + max3(2, 3, 3)); //[L] b=c>a
		System.out.println("max3(1,2,3) = " + max3(1, 2, 3)); //[M] c>b>a
		
		
		System.out.println("max3(10,22,3) = " + max3(10,22,3));
		System.out.println("max3(1,22,33) = " + max3(1,22,33));
		System.out.println("max3(44,2,11) = " + max3(44,2,11));
	}
}
