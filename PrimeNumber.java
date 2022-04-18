package week1.day1;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int i,n, count=0;
		Scanner sc = new Scanner(System.in); //read input from the user
		System.out.print("enter n value:");//ask for input from the user
		n=sc.nextInt();//store the user entered value 
		
		if ((n==0)||(n==1))//0 and 1 are not prime numbers
		{
			System.out.println("not prime number");//print
		}
		else 
		{
		for(i=2;i<n;i++)//0 and 1 are not prime start iteration from 2
		{
			if(n%i==0)//example 6%2= 0
			{ 
				count ++; //count 0+1 it's not a prime number
				//break;
				
			}
			
		}
		if(count==0)//count 0 should be a prime number
		{
			System.out.println("prime number");
		}
		else 
		{
			System.out.println("Not prime number");
		}
		
	}
	}
}
