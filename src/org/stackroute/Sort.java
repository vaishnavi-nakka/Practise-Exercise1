package org.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char tempArray[] = a.toCharArray();
		int sum =0;
		
		for(int i=0;i<tempArray.length;i++){
			if(Character.getNumericValue(tempArray[i]) % 2 ==0){
				sum = sum + Character.getNumericValue(tempArray[i]);
			}
		}
		
		Arrays.sort(tempArray);
		String sortedStr = new String(tempArray);
		
		
		StringBuilder input1 = new StringBuilder();
		
		input1.append(sortedStr);
		 
        // reverse StringBuilder input1
        input1 = input1.reverse();
       
        
        System.out.println("Sorted number in non-increasing order : " + input1);
        System.out.println("Sum of even numbers : " + sum);
        if(sum > 15){
        	System.out.println("true");
        }
        else{
        	System.out.println("false");
        }
		
		
		sc.close();
		
		

	}

}
