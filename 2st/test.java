
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������  ���� ���� 
		int i;// ��κ� �̰� ���ٰ� ���� ��
		
		//�Ǽ��� -> ��κ� double ���ٰ� ���� ��
		//float fx = 0.1;
		float f = 0.1F;// ��������� 0.1�� DOUBLE
		double d = 0.1;
		
		//������ -> �⺻ �ڷ��� �߿��� ���ڿ� ���� X
		//char c = 'A';
		//char c =65; // ASCII �ڵ� �� 65=A
		char c = '��'; // -> �ѱ��� 1byte�� Ŀ��x
		System.out.println( c );
		
		//boolean
		boolean boo = true;
		
		
		/*���� �⺻�ڷ��� �̿ܿ��� ���� �ּҰ��� �Ѿ!!!!!*/
		int[] x ={10,20,30};//-> int�� �ƴ϶� int�迭��
		int[] y = x;
		y[0] =100;//-> x[0] ��  100�� ��
		System.out.println(x[0]);
		String s = "ABC"; //-> ABC�� ����� ���� �˷��ִ� 
	}

}
