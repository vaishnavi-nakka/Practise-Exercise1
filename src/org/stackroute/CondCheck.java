package org.stackroute;

import java.util.Scanner;

public class CondCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>20 && n<30){
			if(n%2 !=0){
				System.out.println("Tom");
			}
			else{
				System.out.println("Jerry");
			}
		
		}
		else
		{
			System.out.println("Enter number between 20 and 30");
		}
		sc.close();
	}

}
