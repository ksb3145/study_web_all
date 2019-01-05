package step03;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		//1. 이름이 김새봄, 나이가 28인 Member객체 생성
		//2. 이름이 성영식, 20 생성
		//3. 이름이 김준성, 31 생성
		Member[] list;
		list = new Member[3];
		list[0] = new Member("김새봄",28);
		list[1] = new Member("성영식",20);
		list[2] = new Member("김준성",31);
		
		
		//4. className 자바프로그래밍반, students 위에 3개가 들어가도록.
		School s = new School("프로그래밍반",list);
		
		//5. School의 toString이 호출되면 학교정보, 학생정보 모두 나오도록.
		System.out.println(s.toString());
	}
}
class Member{
	String name;
	int age;
	public Member() {
		super();
	}
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
}
class School{
	String className;
	Member[] students;
	public School() {
		super();
	}
	public School(String className, Member[] students) {
		super();
		this.className = className;
		this.students = students;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Member[] getStudents() {
		return students;
	}
	public void setStudents(Member[] students) {
		this.students = students;
	}
	
	@Override
	public String toString() {
		
		String studentsList = "";
		
		for(int i=0; i<students.length; i++){
			if(i != 0){
				studentsList += ", ";
			}
			studentsList += students[i].toString();
			
		}
		
		
		//return "School [className=" + className + ", students=" + Arrays.toString(students) + "]";
		return "School [className=" + className + ", students=" + studentsList + "]";
	}
}