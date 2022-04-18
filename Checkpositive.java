package week1.day1;

import java.util.Scanner;

public class Checkpositive {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in); //read input from the user
		System.out.print("enter n value:");//ask for input from the user
		n=sc.nextInt();//store the user entered value
		if(n>0)
		{
			System.out.println("the number is positive");
	
		}
		else
		{
			System.out.println("the number is negative");
		}
		
	}

}
