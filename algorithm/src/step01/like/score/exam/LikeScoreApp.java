package step01.like.score.exam;

import step01.like.score.exam.LikeScore;

// Test 하는 클래스
/*
	별5개 평점 계산하기.
	addScore() 점수는를 주는 함수이다.
	getAvgScore() 점수를 합산하여 평균을 내는 함수이다.
	
	LikeScore 클래스에는
	addScore를 호출한 횟수(count변수)와
	addScore함수를 합산한 점수(totalScore)가 있다.
	
	조건.
	코드는 "코드 작성.." 외 어떠한 부분도 수정및 추가 불가.
	OverNumberException은 유효성검사할때 사용가능.
*/

public class LikeScoreApp {
	public static void main(String[] args) {
		LikeScore likeScore = new LikeScore();
		//1.addScore를 이용하여 점수를 넣으시오.
		likeScore.addScore(3);
		likeScore.addScore(2);
		likeScore.addScore(3);
		
		// likeScore.addScore(10);
	
		
		//2.평점을 계산하시오. (단, 평점은 1~5점 사이 값이여야 함.)
		System.out.println(likeScore.getAvgScore());
	}
}

