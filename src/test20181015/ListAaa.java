package test20181015;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ListAaa {
	
	public static void main(String[] args) {
/*		List<String> list1=new ArrayList<String>();
		list1.add("sas");
		list1.add("sas");
		list1.add("sas");
		list1.add("dsfsd");
		list1.add("xzcz");
		list1.add("zczcz");
	
		System.out.println(list1);
		List<Emp> list3=new ArrayList<Emp>();
		Emp e1=new Emp();
		e1.setAge(23);
		Emp e2=new Emp();
		Emp e3=new Emp();
		Emp e4=new Emp();
		Emp e5=new Emp();
		list3.add(e1);
		list3.add(e2);
		list3.add(e3);
		list3.add(e4);
		list3.add(e5);
		System.out.println(list3);*/
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
	System.out.println(list2.size());
	System.out.println(list2.get(5));
	System.out.println(list2.remove(3));
	Map<String,Double> m=new HashMap<String,Double>();
	m.put("语文", 100.0);
	m.put("数学", 99.0);
	m.put("英语", 77.0);
	System.out.println(m.get("语文"));
	//int[] a= {1,2,3,4,5};
		System.out.println(list2);
		
	}
}
