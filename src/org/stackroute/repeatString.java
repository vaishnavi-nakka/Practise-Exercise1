package org.stackroute;

import java.util.Scanner;

public class repeatString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int n = sc.nextInt();
	    sc.close();
	    String substr = a.substring(a.length()-n);
	    System.out.print(a);
	    while(n>0){
	    	System.out.print(substr);
	    	n--;
	    }
	}

}
