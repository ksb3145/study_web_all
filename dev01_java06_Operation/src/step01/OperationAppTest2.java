package step01;

public class OperationAppTest2 {
	public static void main(String[] args) {
		int i = 5;
		int j = 3;
		
		System.out.println(i % 2);
		System.out.println(i != j);
		System.out.println(!true);
		System.out.println( 3 + 1 * 2);
		System.out.println( (3 + 1) * 2);
		
		boolean b = 1<2;
		System.out.println(b);
		
		int k = 10;
		System.out.println(k++); //10
		System.out.println(k);	//11
		
		int m = 10;
		System.out.println(++m); //11
		System.out.println(m);	//11
		
		int x = 2;
		int y = 2;
		System.out.println(x * y++); // 2*2 = 4
		System.out.println(x * ++y); // 2*4 = 8
		
	}
}