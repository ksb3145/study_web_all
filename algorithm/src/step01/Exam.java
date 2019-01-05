package step01;

public class Exam {
	public static void main(String[] args) {
		System.out.println(sumof(3,5));
		System.out.println(sumof(6,4));
		
		System.out.println(sumof(1,10));
		System.out.println(sumof(10,1));
		
		System.out.println(sumof(100,1));
	}
	public static int sumof(int a, int b) {
		//코딩...
		
		int tmpA, tmpB, total = 0;
		
		if(a>b){
			tmpA = b;
			tmpB = a;
		}else{
			tmpA = a;
			tmpB = b;
		}
		
		for(int i = tmpA; i <= tmpB; i++){
			total += i;
		}
		
		return total;
	}
}
