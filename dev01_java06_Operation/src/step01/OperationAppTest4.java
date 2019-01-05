package step01;

public class OperationAppTest4 {
	public static void main(String[] args) {
		Operator o = new Operator();
		System.out.println("==============연산자 || ==============");
		System.out.println(o.test1() || o.test2());
		System.out.println("==============연산자 && ==============");
		System.out.println(o.test1() && o.test2());
		
		/*
		 	[ 앞에 값이 true 이므로 더이상 검사 안하고 넘어간다. ]
			==============연산자 || ==============
			test1() calling…
			true
			
			[ and 연산자는 두 값이 모두 참 일때만 true 이므로 두 값 모두 검사한다. ]
			==============연산자 && ==============
			test1() calling…
			test2() calling…
			flase
		*/
	}
}
class Operator{
	public boolean test1() {
		System.out.println("test1() calling…");
		return true;
	}
	public boolean test2() {
		System.out.println("test2() calling…");
		return false;
	}
}