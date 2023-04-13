package programs;

import java.util.Scanner;

public class swapingTwoNumbers {
	public static void main(String[] args) {
		

		/************************/
		// swapping two numbers
		/************************
		
		int a=10, b=20;
		System.out.println("Before swaping the numbers: "+a+" "+b);
		
		int t=a;
		a=b;
		b=a;
		
		System.out.println("after swaping the numbers: "+a+" "+b);
		
                /************************/
		// arthmatic operations
		/************************
		
		 Scanner input = new Scanner(System.in);

	        System.out.println("Enter first number:");
	        double num1 = input.nextDouble();

	        System.out.println("Enter second number:");
	        double num2 = input.nextDouble();

	        System.out.println("Enter an operator (+, -, *, /):");
	        char operator = input.next().charAt(0);

	        double result;

	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                result = num1 / num2;
	                break;
	            default:
	                System.out.println("Invalid operator");
	                return;
	        }

	        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	       */
		
		/************************/
		// removing particular letters or words
		/************************/
		
		String s = "pr3ep21ins0ta";
	        String s1 = "";
	        s1 = s.replaceAll("[aeiou01234]", ""); 
	        System.out.println("String after removing vowel : "+s1); 
	}

}
