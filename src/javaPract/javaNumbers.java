package javaPract;

import java.util.Scanner;

public class javaNumbers {

	public static void main(String[] args) {
		//Numbers Usage in Java
		
		//Count reverse from 100 to 0 
		
		/*
		 * for(int i=100; i>=0;i--) { System.out.println("Number is " + i); }
		 */
		
		
		//Tizz - Pizz Program
		for(int i=1; i<=10; i++) {
			int j=i%5;
			if(j==0) {
				System.out.println(i + ": Pizz");
			}
			else {
				System.out.println(i + ": Tizz");
			}
		}
		
		//Prime Number
		
		Scanner check = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int numPrime = check.nextInt();
		int count = 0;
		
		if(numPrime==0||numPrime==1) {
			System.out.println("The Number is not a Prime/Not compatible");
		}
		else {
			for(int i=2;i<numPrime;i++) {
				if(numPrime%i==0) {
					count=1;
				}	
			}
			
			System.out.println(count);
			if(count!=0) {
				System.out.println("The number is Prime");
			}
			else {
				System.out.println("The Number is not Prime");
			}
		}
				
		
		
	}

}
