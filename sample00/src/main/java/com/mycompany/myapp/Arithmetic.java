package com.mycompany.myapp;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("식을 입력하세요>>");
		int op1 = sc.nextInt();
		String operator = sc.next();
		int op2 = sc.nextInt();
		int result = 0;
		switch(operator){
			case "+" : result = op1 + op2; break;
			case "-" : result = op1 - op2; break;
			case "*" : result = op1 * op2; break;
			case "/" : result = op1 / op2; break;
		
		
	
		default: System.out.println("연산 기호가 잘못되었습니다.");
		result = op1 / op2; 
		break;
		}
		System.out.println("연산 결과" + " " + result);
	}
}


