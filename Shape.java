package Dynamic;

import java.util.Scanner;

abstract class Shape {
	
	float val1,val2;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value");
		val1=sc.nextFloat();
		
		System.out.println("Enter Second value");
		val2=sc.nextFloat();
		
		
		
	}
	
	//abstract void compute_area();

	abstract void compute_area();
	

}
