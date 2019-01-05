package step01.like.score.exam;

// Exception  클래스

public class OverNumberException extends RuntimeException{
	OverNumberException(){
		super("평점은 1~5점까지만 입력 가능합니다.");
	}
}
