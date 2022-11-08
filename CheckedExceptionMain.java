package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionMain {

	public static void main(String[] args) throws IOException {
		String name;
		int age;
		float sal;
		
		/*	InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);*/
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name");
		
		name=br.readLine(); //String
		System.out.println("Enter age");
		age=Integer.parseInt(br.readLine()); //"23"
		System.out.println("Enter salary");
		sal=Float.parseFloat(br.readLine());
		
		System.out.println("Employee Details");
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Salary="+sal);

	}

}

	
