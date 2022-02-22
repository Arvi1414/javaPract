	package javaPract;

import java.util.ArrayList;
import java.util.List;

public class javaCollectionsList {

	public static void main(String[] args) {
		//Java Collections 
		
		List li = new ArrayList();
		
		li.add(10);
		li.add(20);
		li.add(60);
		li.add(50);
		li.add(20);
		
		int size = li.size();
		
		System.out.println("Size of the List : " + size);
		
		System.out.println(li.get(2));
		
		//Normal For Loop
		for(int i=0;i<size;i++) {
			System.out.println("List Index " + i + " : " + li.get(i));
		}
		
		//Enhanced for loop
		for(Object x:li) {
			System.out.println("Enhanced For Loop "+ x);
		}
		
		//for each statement 
		li.forEach(System.out::println);

		System.out.println(li.lastIndexOf(20));
		System.out.println(li.indexOf(20));
		System.out.println(li.contains(60));
		System.out.println(li.remove(1));
		
		int size1 = li.size();
		
		System.out.println("Size of the List : " + size1);
		
		for(int i=0;i<size1;i++) {
			System.out.println("List Index " + i + " : " + li.get(i));
		}
		
		System.out.println(li.isEmpty());
		
		List li1 = new ArrayList();
		
		li1.add(11);
		li1.add(22);
		li1.add(33);
		li1.add(44);
		li1.add(10);
		
		li1.retainAll(li1);
		
		for(Object x:li1) {
			System.out.println("List 2 : " + x);
		}
		
		li1.addAll(li);
		
		li1.forEach(System.out::println);
		
		li1.clear();
		
		boolean empty = li1.isEmpty();
		System.out.println(empty);
		
	}

}
