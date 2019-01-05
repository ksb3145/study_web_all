package step01.parent;

import step01.util.MyDate;

public class Employee {
	
	public String name;
	public double salary;
	public MyDate birthDate;
//	public String job;
	
	
	public Employee(String name, double salary, MyDate birthDate) {
		super();
		this.name = name;
		this.salary = salary;
		this.birthDate = birthDate;
	}
//	public Employee(String name, double salary, MyDate birthDate, String job) {
//		super();
//		this.name = name;
//		this.salary = salary;
//		this.birthDate = birthDate;
//		this.job = job;
//	}
	
	public String getDetails(){
		// 코딩
		return "이름: "+name+", 봉급: "+salary+", 생일 :"+birthDate.getDatails();
	}
	
}
