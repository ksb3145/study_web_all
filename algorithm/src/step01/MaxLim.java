package step01;

public class MaxLim {
	/**
	 * 1~n 번째까지의 수중 가장 큰 값을 출력하시오.
	 * max() 메서드를 만드시오.
	 */
	public static void main(String[] args) {
		//숫자의 갯수와 값은 임의로 바뀔수 있음.
		int[] inputInt = {1,2,3,4,51,5,4,5,77,66,55,3,22};
		System.out.println("결과 : " + max(inputInt));
	}
	
	
	private static int max(int[] inputInt) {
		int a = 0;
		
		for(int i=0; i<inputInt.length; i++ ){
			if(a < inputInt[i]){
				a = inputInt[i];
			}
		}
		
		return a;
	}
}
