package Com;

import java.util.Scanner;

public class Complex {
	
	int real;
	int imaginary;
	static int choice;
	
	Complex(){}  //Default Constructor
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		Complex num1=new Complex();
		Complex num2=new Complex();
		
		System.out.println("Enter fisrt Complex number: \nreal:  ");
		num1.real=sc.nextInt();
		
		System.out.println("\nimaginary");
		num1.imaginary=sc.nextInt();
		
		System.out.println("Enter Second Complex number: \nreal:  ");
		num2.real=sc.nextInt();
		
		System.out.println("\nimaginary");
		num2.imaginary=sc.nextInt();
		
		
		
		
		
		do {
			
			System.out.println("Enter Your Choice");
			System.out.println("1. Add");
			System.out.println("2. Sub");
			System.out.println("3. Multiplication");
			System.out.println("4. Substraction");
			int choice=sc.nextInt();
		switch(choice) {
		
		case 1:Complex add = sum(num1,num2);
		       System.out.println("The addition of two complex numbers is : "+add.real+" + "+add.imaginary+"i");
			
			  break;
			  
		case 2:Complex sub = sub(num1,num2);
	           System.out.println("The substraction of two complex numbers is : "+sub.real+" + "+sub.imaginary+"i");
			
			  break;
			  
		case 3:Complex mult = mult(num1,num2);
				System.out.println("The multiplication of two complex numbers is : "+ mult.real+" + "+mult.imaginary+"i");
		
		  break;
		  
		  case 4:Complex division = division(num1,num2);
			System.out.println("The division of two complex numbers is : "+ division.real+" + "+division.imaginary+"i");
				break;
			  
		case 0:System.out.println("Exit");
			  break;
			  
	   
		}
		
		}while(choice==0);

	}


	private static Complex division(Complex num1, Complex num2) {
		
		Complex ans = new Complex();
		int addresult = (num2.real*num2.real + num2.imaginary*num2.imaginary);
		ans.real = (num1.real*num2.real + num1.imaginary*num2.imaginary)/addresult; 
		ans.imaginary = (num2.real*num1.imaginary - num1.real*num2.imaginary)/addresult;
		
		return ans;
	}


	private static Complex mult(Complex num1, Complex num2) {
		Complex ans = new Complex();
        ans.real = (num1.real*num2.real - num1.imaginary * num2.imaginary );
        ans.imaginary = (num1.real * num2.imaginary + num2.real * num1.imaginary);
		
		return ans ;
	}


	public static Complex sum(Complex num1, Complex num2) {
		Complex ans = new Complex();
        ans.real = num1.real + num2.real;
        ans.imaginary = num1.imaginary + num2.imaginary;
        return ans;
		//return null;
	}
	
	public static Complex sub(Complex num1, Complex num2) {
		Complex ans = new Complex();
        ans.real = num1.real - num2.real;
        ans.imaginary = num1.imaginary - num2.imaginary;
        return ans;
		//return null;
	}
	

}
