package ExceptionHandling;

import java.util.Scanner;

public class Main_handling {

	public static void main(String[] args) {
		//main method to start execution of program
				ExceptionHand e=new ExceptionHand();//creating object of exception class
				Scanner sc=new Scanner(System.in);//creating object of scanner class
				int ch;

				do {
					
					//menu driven
					System.out.println("\nEnter the Choice which you want to check type of error "
							          +"\n1. Arithmaticexception"
							          + "\n2. ArrayOutOfBound"
							          + "\n3. NumberFormat"
							          + "\n4. Exit");
					
					ch=sc.nextInt();//taking input from user
					//switch case
					switch(ch) {
					case 1:
						
						//when input is 1
						e.arithmetic_Exception();//calling arthmaticException method
						//System.out.println("==========================================================");
						break;
					case 2:
						//when input is 2
						
						e.ArrayOutofBound();//calling ArrayOutOfBound method
						
						break;
					case 3:
						//when input is 3
						e.NumberFormat();//calling NumberFormat method
						
						break;
					case 4:
						//when input is 4
						ch=0;//setting n->0
						
						break;
					default:
						//default when case is not found
						System.out.println("Invalid Input");//printing when input is invalid
						
					}
					
					
					
				}while(ch!=0);
				
			}

	}


