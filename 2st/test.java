
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수형  음수 포함 
		int i;// 대부분 이거 쓴다고 보면 됨
		
		//실수형 -> 대부분 double 쓴다고 보면 됨
		//float fx = 0.1;
		float f = 0.1F;// 명시적으로 0.1은 DOUBLE
		double d = 0.1;
		
		//문자형 -> 기본 자료형 중에는 문자열 저장 X
		//char c = 'A';
		//char c =65; // ASCII 코드 상 65=A
		char c = '가'; // -> 한글은 1byte로 커버x
		System.out.println( c );
		
		//boolean
		boolean boo = true;
		
		
		/*위의 기본자료형 이외에는 전부 주소값이 넘어감!!!!!*/
		int[] x ={10,20,30};//-> int가 아니라 int배열형
		int[] y = x;
		y[0] =100;//-> x[0] 도  100이 됨
		System.out.println(x[0]);
		String s = "ABC"; //-> ABC가 저장된 곳을 알려주는 
	}

}
