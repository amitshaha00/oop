import java.util.Scanner;

public class Main_interface {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);		
			
			vehicle v=null;			// vehicle interface reference created
			//System.out.println("======================================================================");
			int choice;
			//variable to choose vehicle
			
			int ch1=0;
			bb:		//label for do while loop
			do {
				System.out.print("  SELECT VEHICLE  "
						+ "\n\t1.BICYCLE \n\t2.CAR "
						+ " \n\t3.BIKE \n\t4.Exit \nChoice::");
				 choice=sc.nextInt();
				 
				 //System.out.println("======================================================================");
				 
				if(choice==1)		
					v=new bicycle();	//object of bicycle class
				else if(choice==2)
					v= new car();		//object of car class
				else if(choice==3)
					v=new bike();		//object of bike class
				else if(choice==4)
					break bb;			//label break
				else
					System.out.println("INVALID INPUT");
					System.out.println("======================================================================");
				
				if(0<choice&&choice<4) {
				aa:		//label for inner do while loop
					do {
						System.out.print(" \tPress 1. Speed Up \n\tPress "
								+ "2. Change gear \n\tPress 3. Apply Brakes  "
							+ "\n\tPress 4. Display Vehicle Status \n\tPress "
							+ "5. change Vehicle /Exit \nChoice::");
						int ch1=sc.nextInt();  		
					switch(ch1)	
					{
					case 1:
						v.speed_up();
						
						break;
					case 2:
						System.out.print("which gear you want?   ");
						int a=sc.nextInt();
						v.gear_change(a);
						
						break;
						
					case 3:
						v.apply_brakes();
						
						break;
					case 4:
						v.display();
						
						break;
					case 5:
						break aa;		//label break
					default:
							System.out.println("Invalid Input");
						
					}
					}while(true);
				}
					
				
				
			}while(ch1!=4); //loop break when input y=4
		}

	}

