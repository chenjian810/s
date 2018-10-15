package test20181015;

public class Man extends Person implements B{
	public Man() {
		super();
	}
	
	@Override
	public String toString() {
		return "Man [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public void say() {
		System.out.println("ÎÒÊÇÄĞÈË");
		
	}

	@Override
	public void say1() {
		System.out.println("man say1");
		
	}

	@Override
	public void say2() {
		System.out.println("man say2");
		
	}

	@Override
	public void e() {
		// TODO Auto-generated method stub
		
	}

	
	
}
