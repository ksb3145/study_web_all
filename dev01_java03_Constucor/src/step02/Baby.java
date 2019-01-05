package step02;


/*
 * this => 클래스 전체를 가르킴
 * this() => 클래스 내에 있는 생성자를 가르킴
 * this.변수명 -> 클래스 내에 있는 인스턴스를 가르킴
 */

public class Baby {
	
	//변수
	private String name;
	private int age;
	private char gender;
	
	Baby(){
		System.out.println("[기본 생성자]응애 응애");
	}
	
	Baby(char genter){
		System.out.println("생성자 호출");
	}
	
	Baby(char genter, int age){
		// this로 생성자 호출은 생성자 안에서 1번만 호출할수 있고 맨 윗줄에 있어야 한다.
		//this();
		this('M');
		
		this.gender = genter;
		this.age = age;
	}
	
	
	//메서드
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Baby [name=" + name + ", age=" + age + ", gender=" + gender + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getGender()=" + getGender() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
