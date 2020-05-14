package com.example.test;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input N: ");
		int n = in.nextInt();
		
		Random rand = new Random();
		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "abcdefghijklmnopqrstuvxyz"
				+ "0123456789";
		
		StringBuilder str_new = new StringBuilder(n);
		for(int i=0;i<n;i++) {
			int index = rand.nextInt(alphabet.length());
			str_new.append(alphabet.charAt(index));
		}
		
		System.out.println(str_new);
		
		
		System.out.println("Input a: ");
		in = new Scanner(System.in);
		String a = in.nextLine();
		
		char ch_a = a.charAt(0);
		int counter_a = 0;
		
		for(int i=0;i<n;i++) {
			if(Character.isLetter(str_new.charAt(i))) {
				str_new.setCharAt(i,ch_a);
				counter_a++;
			}					
		}

		
		System.out.println("Input b: ");
		String b = in.nextLine();

		
		char ch_b = b.charAt(0);
		int counter_b = 0;
		
		for(int i=0;i<n;i++) {
			if(Character.isDigit(str_new.charAt(i))) {
				str_new.setCharAt(i, ch_b);
				counter_b++;
			}
		}
		System.out.printf("result: %s \n"
				+ "counter a: %d \n"
				+ "counter b: %d", str_new, counter_a, counter_b);
	}
	  
}
