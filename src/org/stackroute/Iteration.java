package org.stackroute;

import java.util.Scanner;

public class Iteration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n; i++){
			for(int j=i;j>0;j--){
				System.out.print(i + " ");
			}
		}
		
		sc.close();

	}

}
