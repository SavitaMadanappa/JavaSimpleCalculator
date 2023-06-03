package calculator;

import java.util.Scanner;

public class Calculator {
	int add(int a,int b) {
		int add=a+b;
		return add;
	}
	int sub(int a,int b) {
		if(a>b) {
			int sub=a-b;
			return sub;
		}
		System.out.println("invalid inputs");
		return 0;
	}
	int div(int a,int b) {
		if(b>0) {
			int div=a/b;
			return div;
		}
		System.out.println("b cant be 0");
		return 0;
	}
int mul(int a,int b) {
	int mul=a*b;
	return mul;
	
}

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		while(true) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("---welcome to calculator---");
			System.out.println("1.addition\n2.substraction\n3.division\n4.multiplication");
			System.out.println("---select your choice---");
			int choice=scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("enter two numbers");
				int a=scanner.nextInt();
				int b=scanner.nextInt();
				System.out.println("result:"+calculator.add(a, b));
				}
			case 2: {
				System.out.println("enter two numbers");
				int a=scanner.nextInt();
				int b=scanner.nextInt();
				System.out.println("result:"+calculator.sub(a, b));
				}
			case 3: {
				System.out.println("enter two numbers");
				int a=scanner.nextInt();
				int b=scanner.nextInt();
				System.out.println("result:"+calculator.div(a, b));
				}
			case 4: {
				System.out.println("enter two numbers");
				int a=scanner.nextInt();
				int b=scanner.nextInt();
				System.out.println("result:"+calculator.mul(a, b));
				}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}
}
