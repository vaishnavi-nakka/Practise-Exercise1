package org.stackroute;

import java.util.Scanner;

public class Character1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		if(a.matches("[A-Z]") ){
			System.out.println("Capital Letter");
		}
		else if(a.matches("[a-z]")){
				System.out.println("Small Case Letter");
		   }
		else if(a.matches("[0-9]")){
			System.out.println("Digit");
	       }
		else {
			System.out.println("Special Symbol");
	       }
		sc.close();
		

	}

}
