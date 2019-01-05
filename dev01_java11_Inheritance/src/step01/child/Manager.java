package step01.child;

import step01.parent.Employee;
import step01.util.MyDate;

public class Manager extends Employee{
	
	private String job;

	public Manager(String name, double salary, MyDate birthDate, String job) {
		super(name, salary, birthDate);
		this.job = job;
	}

	
	// 메서드 오버라이드
	// 부모의 메서드를 재정의 한다.
	@Override
	public String getDetails(){
		
		return super.getDetails()+", 직업: "+job; 
	}
}
