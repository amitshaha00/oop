package Assignment3;

import java.util.Scanner;

public class Inheritance{
	
	static int choice=0;
	
	public static void main(String[] args)
	{
		
		
		Scanner sc=new Scanner(System.in);
		
		
		
		
		do
		{
			
			
			System.out.println("\nEnter the name of the Employee\n");
			String Name=sc.nextLine();
			
			System.out.println("\nEnter the Employee Id");
			int Emp_id=sc.nextInt(); 
			
			//System.out.println("\nEnter the Basic salary\n");
			System.out.println("\nEnter the basic salary details");
			float basic=sc.nextFloat();
			
			
			
			
			System.out.println("\nEnter your choice\n");
			System.out.println("\n1.Pragreammer");
			System.out.println("\n2.TeamLead");
			System.out.println("\n3.Assistent Programming Manager");
			System.out.println("\n4.Programming Manager");
			
			System.out.println("\nEnter your choice\n");
			int choice=sc.nextInt();
			
			switch(choice)
			{
				case 1: Programmer p= new Programmer(Name,Emp_id,basic);
						p.salary();
					break;
					
				case 2:TeamLead tm= new TeamLead(Name,Emp_id,basic);
						tm.salary();
					break;
					
				case 3:APM apm= new APM(Name,Emp_id,basic);
						apm.salary();
				break;
			
				case 4:PM pm= new PM(Name,Emp_id,basic);
						pm.salary();
				break;
					
				case 0:
					System.out.println("\nThank You.");
					break;
					
			}
			
			
		}while(choice!=0);
		
		
		
		
	}

}
