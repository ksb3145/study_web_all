package Ex20181208;

//총점, 평균구하기

public class ArrayEx01 {
	//문제
	public static void main(String[] args) {
		
		int sum = 0;			//총점을 저장하기 위한 변수
		float average = 0; 		//평균을 저장하기 위한 변수
		int[] score = {100, 88, 100, 100, 90};
		
		//문제
		//for문을 이용하여 합계(sum)를 구하고
		//합계를 이용하여 평균(average)를 구하시오.
		//------------------------------------------------//
		
		for(int i=0; i<score.length; i++){
			sum += score[i];
		}
		average = sum/score.length;
		
		//------------------------------------------------//
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+average);
		/*-출력값—————————————
		 결과값 ————————————— 
		 총점 : 478
		 평균 : 95.6
		 ————————————————*/
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
///////////////////////////////아래는 멍청이들만 본다는 정답 입니다./////////////////////////////
/*
	//정답
	public static void main(String[] args) {
		
		int sum = 0;			//총점을 저장하기 위한 변수
		float average = 0; 		//평균을 저장하기 위한 변수
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i<score.length; i++){
			sum += score[i];
		}
		average = sum / (float)score.length;	// 계산결과를 float로 얻기 위함;
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+average);
		
	}
*/
}
