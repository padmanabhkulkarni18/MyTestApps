package test.list;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ListTest {

	public ArrayList<Integer> list_int= new ArrayList<>();
	public HashMap<String, String> map= new HashMap<>();
	
	public static void main(String[] args) {
		ListTest lt= new ListTest();
		lt.test();
		
		
		
	}
	void test() {
		
		list_int.add(1);
		list_int.add(2);
		list_int.add(3);
		list_int.add(4);
		list_int.add(5);
		System.out.println("Elements before removing are :" +list_int.toString());
		int size1= list_int.size();
		System.out.println("Size of the list is :"+ list_int.size());
		list_int.remove(0);
		int size2= list_int.size();
		System.out.println("Size of the list is :"+ list_int.size());
		list_int.remove(0);
		System.out.println("Elements after removing are :" +list_int.toString());
		
		map.put("a","lock");
		map.put("b", "unlock");
		map.put("c", "lock");
		map.put("d", "unlock");
		map.put("e", "lock");
		map.put("f", "unlock");
		map.put("g", "lock");
		System.out.println("Map values are  :"+ map);
		
		Instant current_millis=Instant.now();
		long cm= current_millis.toEpochMilli();
		System.out.println(current_millis.toEpochMilli());
		AtomicInteger ab = new AtomicInteger(2);
		String a = cm+"_"+ab.getAndIncrement();
//		String a = cm+"_"+ab.getAndIncrement();
		System.out.println(Arrays.toString(a.getBytes()));
		
	}

}
