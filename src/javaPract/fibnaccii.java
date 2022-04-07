package javaPract;

import java.util.ArrayList;
import java.util.List;

public class fibnaccii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		  int a = 0; int b = 1,c;
		  
		  System.out.print(a + ",");
		  System.out.print(b + ",");
		  for(int i=1; i<10; i++){
			  c = a + b;
			  System.out.print(c + ",");
			  a=b;
			  b=c;
		  }
		  
		  System.out.println("");
		 
		
		String name = "AravinD";
		
		int length = name.length();
		
		System.out.println(length);
		
		String upperCase = name.toUpperCase();
		
		System.out.println(upperCase);
		
		String lowerCase = name.toLowerCase();
		
		System.out.println(lowerCase);
		

		String set = "arviNd Is a TesTer";
		
		String lStr = set.toLowerCase();
		
		List str = new ArrayList();
		
		String ch = " ";
		
		for(int i=0;i<lStr.length();i++) {
			str.add(lStr.charAt(i));
			System.out.println(str.get(i));
			if(str.get(i).equals(ch)) {
				str.get(i+1);
			}
		}
		
		
		String[] split = lStr.split("");
	
		
		str.add(split);
		
		/*
		 * for(int i=0;i<set.length()-1;i++) { String splStr = (String) str.get(i);
		 * System.out.println(splStr); int sinStr = splStr.indexOf(i);
		 * System.out.println(sinStr); }
		 */
		
		for (int i = 1; i <= 100; i++) {
		      if (i%5 == 0) {
		    	  break;
		      }
		      System.out.println(i);

		    }
		
		
		
	}

}
