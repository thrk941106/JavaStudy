
public class OOPEx1 {
	//static의 개념 ->
	/*
	 OOP
	 오브젝트  오리엔티드  프로그래밍
	 오브젝트(객체)
	class 
	//메모리에 모든 프로그램을 올릴 수 없기에.
	->OOP에서는 쓰고 싶으면 메모리에 올리고 써야함. -> classname 변수 = new classname();
	
	 */
	int x =10;
	public static void main(String args[]){
		//int  i = ~~
		OOPEx1 Y = new OOPEx1(); // class를 통째로 메모리에 올림  -> 메모리에 올라간 CLASS = Y를 객체라고 부름 : 그 클래스의 코드를 쓰겠다!
		// 객체화 하라! new해서 써라.
		// -> 기본자료형x 이기에 주소가 넘어감 
		// 실제로는 main에 있는 친구를 올리는 경우는 잘 없음.
		System.out.println(Y.x); // 위의 x가 메모리에 없어서 컴파일 에러가 됨.
		OOPEx1 Y1 = new OOPEx1(); 
		OOPEx1 Y2 = new OOPEx1(); 
		OOPEx1 Y3 = new OOPEx1();
		//--> main은 한번만 올려짐. BUT 필요에 있어서 여러번 불려올 수 있음?? -> 추후 설명
		// 문법적으로 올리는 것만 있음!! BUT JAVA에서는 알아서 끌어내려줌. -> 편리 BUT 잘 못 내릴 수 있기에 확인해야함.
		//그럼?
		int x2=20;
		
		System.out.println(x2);// 이 친구는 왜 되냐?? -->> main의 코드들은 이미 올려져 있음. -> static 달려 있기에
		//********************** --->> static은 알아서 메모리에 올라감!!!!!!! ** 시작될 때 올라가서 계속 남아있음.
		//프로그램이 시작될 때 제일 처음 메모리에 단 한번 올라가며 프로그램이 끝날 때 까지 존재.
		// 대표적 static --> main method
		
	}

}
