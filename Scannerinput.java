package com.edu;

import java.util.Scanner;

public class Scannerinput {

	public static void main(String[] args) {
		int age;
		float fees;
		String name;
		char gen;
		Scanner sc=new Scanner(System.in);
		 //user input
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter fees");
		fees=sc.nextFloat();
		System.out.println("Enter gender M/F");
		gen=sc.next().charAt(0);
		
		//display
		System.out.println("Name="+name);
		System.out.println("age="+age);
		System.out.println("fees="+fees);
		System.out.println("gender="+gen);


	}

}
