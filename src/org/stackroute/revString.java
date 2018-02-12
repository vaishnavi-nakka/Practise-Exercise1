package org.stackroute;

import java.util.Scanner;

public class revString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
        StringBuilder input1 = new StringBuilder();
		
		input1.append(a);
		input1 = input1.reverse();
		 
        System.out.println(input1);
        sc.close();

	}

}
