package a;

public class B {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz=Class.forName("a.A");
		A a=(A)clazz.newInstance();
		a.aca();
	}
}
