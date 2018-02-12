package org.stackroute;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num=n;
		int sumEven = 0;
		
		int rev = 0;
		
		while(num>0){
		    int x = num % 10;
		    if(x%2 == 0){
		    	sumEven += x;
		    }
			rev = rev * 10 + x;
			num = num / 10;
		}
		
		if(rev == n){
			System.out.print(n + " is Palindrome");
			if(sumEven > 25){
				System.out.println(" and the sum of even numbers is greater than 25");
			}
			else if(sumEven < 25){
				System.out.println(" and the sum of even numbers is less than 25");
			}
			else{
				System.out.println(" and the sum of even numbers is equal to 25");
			}
		}
		else{
			System.out.println("Not Palindrome");
		}
		
		
		sc.close();

	}

}
