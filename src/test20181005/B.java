package test20181005;
/**
 * java反射机制练习
 * @author 陈建
 *
 */
public class B {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//加载类
		Class<?> clazz=Class.forName("test20181005.A");
		//实例化对象
		A a=(A)clazz.newInstance();
		//调用aca方法
		a.aca();
	}
}
