package javaPract;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class javaCollectionsSet {

	public static void main(String[] args) {
		// Collections : Set
		
		
		Set<Object> setTry = new LinkedHashSet<Object>();
		
		setTry.add("Arvi");
		setTry.add("Amar");
		setTry.add("Maha");
		setTry.add("Suda");
		
		System.out.println("======= LINKED HASH SET =======");
		
		System.out.println(setTry.size());
		
		System.out.println("======= INSERTION ORDER =======");
		
		for(Object x:setTry) {
			System.out.println(x);
		}
		
		setTry.add(4);
		setTry.add("#");
		setTry.add('m');
		setTry.add('a');
		setTry.add('A');
		setTry.add(" ");
		
		for(Object x:setTry) {
			System.out.println(x);
		}
		
		Set<Object> setTry1 = new HashSet<Object>();
		
		setTry1.addAll(setTry);
		
		System.out.println("======= HASH SET =======");
		
		
		System.out.println(setTry1.size());
		
		System.out.println("======= RANDOM ORDER =======");
		
		for(Object x:setTry1) {
			System.out.println(x);
		}
		
		Set setTry2 = new TreeSet();
		
		System.out.println("======= TREE SET =======");
		
		
		
		
		
		setTry2.add("Arvind");
		setTry2.add("Amaravathi");
		setTry2.add("Mahalakshmi");
		setTry2.add("Sudha");
		setTry2.add("Karthi");
		
		System.out.println(setTry2.size());
		
		System.out.println("======= ASCII ORDER =======");
		
		for(Object x:setTry2) {
			System.out.println(x);
		}
		
		setTry2.add('A');
		setTry2.add('a');
		setTry2.add('m');
		setTry2.add('M');
		setTry2.add(7);
		setTry2.add( " " );
		
		

	}

}
