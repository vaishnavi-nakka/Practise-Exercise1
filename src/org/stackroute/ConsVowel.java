package org.stackroute;

import java.util.Scanner;

public class ConsVowel{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.matches("[a-zA-Z]+")){
			str = str.toUpperCase();
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
					System.out.print("Vowel ");
				}
				else{
					System.out.print("Consonant ");
				}
			}
			
		}
		else{
			System.out.println("Invalid Input");
		
		}
		
		sc.close();

	}

}
