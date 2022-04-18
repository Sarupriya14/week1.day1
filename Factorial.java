package week1.day1;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args)
{
	int n, i;
	Scanner sc = new Scanner(System.in); //read input from the user
	System.out.print("enter n value:");//ask for input from the user
	n=sc.nextInt();//store the user entered value
    //int n = 5, i;
    int factorial = 1;
	for(i=1;i<=n;i++)
	{
		factorial = factorial * i;
	}
	System.out.println("the answer is:" + factorial);
}
}
