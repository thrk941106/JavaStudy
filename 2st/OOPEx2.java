// OOP ���α׷�
// �������� ������ ��!!
// *****��� ���������  private���� �����ϰ�, get,set �޼ҵ带 ������!!!*****
//-> + ������ ���� ���α׷�! ����� ��Ģ
//1. class�� ù��° ���ڴ� *�빮��*
//2. ������, �޼ҵ��� ù��° ���ڴ� *�ҹ���*


class Person {
	private int age; // �⺻�ڷ���
	private String name; //�⺻�ڷ��� x
	//���� pubic , private �� �߽����� ���!! -> for ������
	//private�� �ش� Ŭ������ ��� ����
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int a){
		age = a;
		//�����̷� �ٲٰ� �ʹٸ�. age = a-2;
	}
	public int getAge(){
		return age;
	}
	
	
}

public class OOPEx2 {
	public static void main(String args[]){
		Person p1 = new Person();
		//p1.age = 20; 
		//-> �̷������� ó���Ѵٰ� �Ͽ��� �� �̰��� ���������� ���Ѱ�?
		//���̸� �� ���̷� �ٲ���! -> ������ ���̸� ������ �ٲ����. -> ��ü�������α׷��� �ƴϴ�.
		p1.setAge(20);
		//-> ���̸� �� ���̷� �ٲ���! -> setAge �޼ҵ常 �ٌ��ָ� ��!! -> �������� ��!
		//-> ��ü���� ���α׷��̴�!!
		
		/* ��� Ŭ������ ��� ������ private����!!! */
		p1.setName("��浿");
		Person p2 = new Person();
		p1.setName("ȫ�浿");
		p2.setAge(25);
		Person p3 = new Person();
		p1.setName("�̱浿");
		p3.setAge(26);
		
		
	}

}
