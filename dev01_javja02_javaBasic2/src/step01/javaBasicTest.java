package step01;

public class javaBasicTest {
	
	/**
	 * @param args
	 * Document 주
	 */
	
	public static void main(String[] args) {
		// -기본출력 예제
		// chapter01();
		
		// -변수 선언과 할당.
		// chapter02();
		
		// -
		chapter03();
	
		
	}
	
	
	private static void chapter03() {
		/*
		 변수에는 참조형과 기본형이 있다.
		 기본형
		 문자형 : char
		 숫자형 : short, int, long, float, double, byte
		 논리형 : boolean
		 참조형
		 8개를 제외한 모든것
		 */
		int a = 1; //숫자의 기본값 0
		boolean b = true; //기본값은 false
//		boolean b = false;
		
		String s; 
		s = new String("a");
		String str = "a";
		//"" = null
		//" " != null
		//"null" != null
	}

	
	private static void chapter02() {
		/*
		  변수 선언 방법
		  
		  - 선언
		  접근지정자 타입 변수명;
		  -할당
		  변수명 = 값;
		  
		 - 접근지정자 종류
		 1.private		: 클래스에만 공개
		 2.(default)	: 패키지에만 공개
		 3.protected	: 상속된클래스에만 공개
		 4.public		: 모두공개
		 */
		
		// 변수의 선언과 할당
		// 선언
		String name;
		
		// 할당
		name = "김새봄";	// 최초의 할당되는것을 초기화라고 함.
		
		// 선언과 동시에 초기화
		int age = 23;
		
		System.out.println(name +" : "+ age);
	}
	
	private static void chapter01() {
		System.out.println(1+1);
		System.out.println("1+1 = "+ (1+1) );
		System.out.println("1+1 = "+ 1+1 );
		System.out.println("1"+1);
		System.out.println("1"+"1");
	}
}
