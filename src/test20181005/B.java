package test20181005;
/**
 * java���������ϰ
 * @author �½�
 *
 */
public class B {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//������
		Class<?> clazz=Class.forName("test20181005.A");
		//ʵ��������
		A a=(A)clazz.newInstance();
		//����aca����
		a.aca();
	}
}
