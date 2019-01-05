package step01;

public class OperationAppTest {

	public static void main(String[] args) {
		//1. 값비교
		int a=1;
		int b=1;
		
		System.out.println(a == b);
		
		
		long aa = 1L;
		int bb = 1;
		
		// int, logn, short => 값 비교시 int형을 기준으로 비교 - [정수형]
		// double, float => 값 비교시 double형을 기준으로 비교 - [실수형]
		System.out.println(aa == bb); // True : 롱타입과 정수 비교시 자료형이 정수를 기준으로 비교된다. (각 타입의 기본값이 기준)
		
		//2. 객체비교
		Member m1 = new Member();		
		Member m2 = new Member();
		
		System.out.println(m1);			// 객체주소, toString이 구현되면 toString 메서드를 호출한다.
		System.out.println(m2);
		System.out.println(m1 == m2);	// 객체비교 (기본형을 제외한 참조형은 주소값을 비교한다.)
		System.out.println(m1.toString() == m2.toString());	// 문자열 비교
		
		//3. 문자열비교
		String s1 = new String("a");
		// String 만 예외적으로 자바에서 
		// String s1 = "a" 이런 표기를 허용한다.
		String s2 = new String("a");
		// String s2 = "a";
		System.out.println(s1 == s2);		// 객체 비교이므로 false
		System.out.println(s1.equals(s2));	// 문자열 비교이므로 true
		
	}

}

class Member{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "hi";
	}
}
