package org.stackroute;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int sum = 0;
        String str = scan.nextLine();
        String[] a = (str.split(" "));
        int flag =1;
        for (String string : a) 
        {
	        	if(string.matches("[0-9]+")){
				sum += Integer.parseInt(string);
			    }
	        	else{
	        		
	        		flag=0;
	        	}
        }
        if(flag == 0){
        	System.out.println("Invalid input");
        }
        else{
        	System.out.println(sum);
        }
        
        scan.close();
		
		
	

	}

}
