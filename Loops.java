package week1.day1;

public class Loops {
	public static void main(String[] args) {
    int a=0, b=1, i,c, count=10;//0 and 1 default
    //i for iteration, c= storing a and b added value, count=10 print only 10 numbers
	System.out.print(a+" "+b); //print a and b
		for(i=2;i<count;++i)
	{
		c=a+b;
		System.out.print(" " +c+ " ");
		a=b;
		b=c;
	}
	}
}
