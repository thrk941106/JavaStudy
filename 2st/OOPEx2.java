// OOP 프로그램
// 유지보수 관리가 편리!!
// *****모든 멤버변수를  private으로 선언하고, get,set 메소드를 만들어라!!!*****
//-> + 가독성 높은 프로그램! 만드는 규칙
//1. class의 첫번째 문자는 *대문자*
//2. 변수와, 메소드의 첫번째 문자는 *소문자*


class Person {
	private int age; // 기본자료형
	private String name; //기본자료형 x
	//접근 pubic , private 을 중심으로 기억!! -> for 가독성
	//private은 해당 클래스만 사용 가능
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int a){
		age = a;
		//만나이로 바꾸고 싶다면. age = a-2;
	}
	public int getAge(){
		return age;
	}
	
	
}

public class OOPEx2 {
	public static void main(String args[]){
		Person p1 = new Person();
		//p1.age = 20; 
		//-> 이런식으로 처리한다고 하였을 때 이것이 유지보수가 편리한가?
		//나이를 만 나이로 바꾸자! -> 만명의 나이를 일일이 바꿔야함. -> 객체지향프로그램이 아니다.
		p1.setAge(20);
		//-> 나이를 만 나이로 바꾸자! -> setAge 메소드만 바뚸주면 됨!! -> 유지보수 편리!
		//-> 객체지향 프로그램이다!!
		
		/* 모든 클래스의 멤버 변수는 private으로!!! */
		p1.setName("김길동");
		Person p2 = new Person();
		p1.setName("홍길동");
		p2.setAge(25);
		Person p3 = new Person();
		p1.setName("이길동");
		p3.setAge(26);
		
		
	}

}
