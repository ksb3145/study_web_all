package step03;

// 같은 패키지 안에서는 import 안해도 된다.

public class TestApp {
	public static void main(String[] args) {
		Coffee c01 = new Coffee();
		
		//c01.printInfo();
		
		// 변수에 직접대입 (변수 접근제어는 public )
//		c01.name = "아메리카노";
//		c01.price = 4100;
		
		// 캡슐화
//		c01.setName("아메리카노");
//		c01.setPrice(5500);
//		c01.printInfo();
		
		
		// 스타벅스 셋팅
//		Starbucks s = new Starbucks();
//		s.setLocation("범박점");
//		System.out.println(s.toString());
		
		
		Coffee cf01 = new Coffee("아메리카노",4100);
		Starbucks s01 = new Starbucks("범박점",cf01);
		
		// 이름 : 아메리카노, 가격 : 4100
		System.out.println(c01.info());
		
		// 지점 : 범박점, 커피 [ 이름 : 아메리카노, 가격 : 4100 ]
		System.out.println(s01);	//toString은 자바 오브젝트에서 구현 되어있기 때문에 안써줘도 자동으로 인식한다.. (코드내에 toString구현 되어있음.)
		
	}
}
