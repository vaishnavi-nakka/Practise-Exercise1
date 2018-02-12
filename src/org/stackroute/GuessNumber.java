package org.stackroute;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	int number;
	int max = 100;
	Scanner sc = new Scanner(System.in);
	
	public GuessNumber(){
		Random rand = new Random();
		number = Math.abs(rand.nextInt()) % (max + 1);
	}
	
	public void play(){
		while(true){
		int mv = sc.nextInt();
		if(mv>number){
			System.out.println("Number guessed is more than original number");
		} else if(mv<number){
			System.out.println("Number guessed is less than original number");
		} else{
			System.out.println("Number guessed matches the original number");
			break;
		}
		}
	}

	public static void main(String[] args) {
		GuessNumber guessNo = new GuessNumber();
		guessNo.play();
	
		

	}

}
