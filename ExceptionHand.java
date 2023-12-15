package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHand {
	
	void arithmetic_Exception()
	{
		//method to check arthmaticException
				Scanner sc=new Scanner(System.in);//creating object of scanner class
	
				try
				{
					System.out.println("Enter Two Numbers ::");
					int num1=sc.nextInt();//taking first num as input from user
					int num2=sc.nextInt();//taking second num as input from user
					double c=num1/num2;//dividing num1 by num2
					System.out.println("Division is "+c);//printing result
				}
				catch(Exception e)
				{
					//catch block  after exception occur
					System.out.println("\t\tCannot Divide by Zero \n\t\tEnter Valid Denominator....\n");
					//printing sentence when denominator is 0
				}
	}
	
	void ArrayOutofBound()
	{
		Scanner sc=new Scanner(System.in);//creating object of scanner class
		int[] a= {1,4,5,2,3,8};
	
		try
		{
			System.out.print("\nEnter the Index No. of Element which you want to print ::");
			int i=sc.nextInt();//taking array index from user
			System.out.println( a[i]+" is present at given index");
			//if index is there in array printing value at that index
		}
		catch(Exception e)
		{
			//catch block  after exception occur
			System.out.println(" \t\tInvalid Index try again...\n");
			//printing invalid index when index out of bound
		}
	}
	
	void NumberFormat() {
		Scanner sc=new Scanner(System.in);//creating object of scanner class
		
		
		try {
			//try block
			System.out.print("Enter first number:: ");
			String num1=sc.next();//taking first string as input from user
			System.out.print("Enter Second number:: ");
			String num2=sc.next();//taking first string as input from user
			int a=Integer.parseInt(num1);//converting string to integer
			int b=Integer.parseInt(num2);//converting string to integer
			System.out.println("\nEntered Numbers are integers::"+a+" , "+b);//printing both integer to console
			
			
		}
		catch(Exception e){
			//catch block  after exception occur
			System.out.println("\t\tNumbers You have Enter are not Integers \n\t\tPlease try again...\n");
			//printing when string is not converting to integer
		}

}
}

