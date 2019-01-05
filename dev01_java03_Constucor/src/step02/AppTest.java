package step02;

public class AppTest {
	
	public static void main(String[] args) {
		
		
		// 1. 객체가 생성되고나서 값 할당
		Baby 윤후1 = new Baby();
		윤후1.setGender('M');
		윤후1.setAge(0);
		
		// 2. 객체 선언과 동시에 값 할당
		Baby 윤후2 = new Baby('M',0);
		
	}
	
}
