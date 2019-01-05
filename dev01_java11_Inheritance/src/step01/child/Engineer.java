package step01.child;

import step01.parent.Employee;
import step01.util.MyDate;

public class Engineer extends Employee{
	
	private String job;
	
	public Engineer(String name, double salary, MyDate birthDate, String job) {
		super(name, salary, birthDate);
		this.job = job;
	}
	
	// 메서드 재정의 - 오버라이드
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails()+ ", 직업: "+this.job;
	}
	
	@Override
	public String toString() {
		return "Engineer [job=" + job + "]";
}
}
