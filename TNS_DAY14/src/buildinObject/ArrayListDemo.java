package buildinObject;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List list= new ArrayList();
		System.out.println(list.isEmpty());
		
		list.add("Shajahan");
		list.add("Sakshi");
		list.add(false);
		list.add(true);
		list.add(12.03f);
		list.add(10);
		
		System.out.println("List is "+list);
		System.out.println(list.isEmpty());
		
		System.out.println(list.size());
		System.out.println();
	}

}
