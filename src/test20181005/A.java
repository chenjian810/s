package test20181005;

/**
 * ��һ��java��
 * @author �½�
 *
 */
public class A {
	/**
	 * ���� ��name
	 */
	String name;
	/**
	 * ����̨���
	 */
	public void aca() {
		System.out.println("aca����");
	}
	/**
	 * ��дtoString����
	 */
	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
	
	public static void main(String[] args) {
	A a=new A();
	System.out.println(a);

		
	}
}
