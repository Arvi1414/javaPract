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
		for(int i=1; i<=50; i++) {
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
		
		int numPrime = check.nextInt();
		
		int m=numPrime/2;
		if(numPrime==0&&numPrime==1) {
			System.out.println("The number is not compatible");
		}
		else {
			for(int i=1;i<9;i++) {
				if(numPrime%i==0) {
					System.out.println("The Number is not a Prime");
				}
				else {
					System.out.println("The Number is Prime");
				}
			}
		}
		
		
		//Armstrong Number 
		
		Scanner armCheck = new Scanner(System.in);
		
		int num = armCheck.nextInt();
		
		int temp;
		
		temp = num%10;
		
		
	
	}

}
