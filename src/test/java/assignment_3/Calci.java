package assignment_3;

import java.util.Scanner;

public class Calci {
	public static void main(String[] args) {
		
	
	// .calculator using if else
	Scanner sc = new Scanner (System.in);

	System.out.println("enter the first no.");
	int a= sc.nextInt();
	System.out.println("enter the second no.");
	int b= sc.nextInt();
	System.out.println("enter: 1 for +, 2 for -,3 for *,4 for /");
	int c=sc.nextInt();
	if(c==1)
		System.out.println(a+b);
	else if(c==2)
		System.out.println(a-b);
	else if(c==3)
		System.out.println(a*b);
	else if(c==4)
		System.out.println(a/b);
	else
		System.out.println("plz enter value within limit");


			
			
			
	

}
}