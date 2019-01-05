package step01.like.score.exam;

// 핵심로직이 담긴 클래스

public class LikeScore {
	double count;
	double totalScore;
	
	
	// 점수주는 함수
	public void addScore(int score) {
		//코드 작성..
		
		// 입력값 1~5제한
		if( score>=1 && score <= 5 ){
			totalScore += score;
			count += 1;
		}else{
			throw new OverNumberException();
		}
		
	}
	
	// 점수 합산하여 평균 구하는 함수
	public double getAvgScore() {
		double result = 0.0;
		
		//코드 작성..
		result = totalScore/count;
		
		return result;
	}
	
}