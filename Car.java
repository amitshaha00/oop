
	
	

	import java.util.*;

	interface vehicle {		//vehicle interface
		void gear_change(int a);		
		void speed_up();
		void apply_brakes();
		void display();

	}

	//BICYCLE CLASS
	class bicycle implements vehicle
	{
		int gear,speed;
		
		bicycle()			//default constructor for bicycle
		{
			System.out.println("\tBicycle started successfully\n ");
			gear=1;			//gear is 1 when Cycle starts
			speed=10;		//speed is 10 when Cycle Starts
		}
		
		public void gear_change(int gearex)
		{
			if(gearex<7 && gearex>0)		//maximum gear for vehicle is 6
			{
				gear=gearex;
				System.out.println("\tGear changed Successfully \n\t Current Gear Is "+gear);
			}
			else
				System.out.println("Gear is Out Of Range \n");
		}
		
		public void speed_up()			
		{
			if((speed+5)<50 ) {		//50 as maximum speed
				speed+=5;
				System.out.println("\n\tBicycles speed increased \n\t current speed is "+speed);
			}
			else
				System.out.println("Speed Cannot Be Increased Above 50 Kmhr\n");
		}
		
		public void apply_brakes()		//function to apply brakes
		{
			Scanner sc=new Scanner(System.in);
			int x;
			System.out.println("1. DECREASE SPEED\n2. STOP BICYCLE\n");
			x=sc.nextInt();
			
			if(x==1)
				if((speed-5)>0)			// speed never be negative
				{
					speed-=5;			//per apply brakes bicycles speed is reduced by 5
					System.out.println("Speed Reduced Successfull \n\tCurrent speed is "+speed+" Kmhr \n");
				}
				else {
					speed=0;
					gear=0;
					System.out.println("Bicycle stopped Successfully\n ");}
					
			if(x==2)			//to stop bicycle 
			{
				speed=0;
				gear=0;
				System.out.println("Bicycle stopped Successfully\n ");
			}
			
		}
		
		public void display()		//displays current status of bicycle
		{
			System.out.println("YOUR  BICYCLE'S SPEED IS "+speed +" Kmhr AND GEAR IS "+gear);
		}
	}





	class car implements vehicle		
	{
		int gear,speed;
		
		car()
		{
			System.out.println("\tCar started successfully\n ");
			gear=1;			//speed when car started
			speed=10;		//gear when car started
		}
		public void gear_change(int gearex)
		{
			if(gearex<7 && gearex >0)	//maximum gear is 6
			{
				this.gear=gearex;
				System.out.println("\tGear changed Successfully \n\t Current Gear is "+gear);
			}
			else
				System.out.print(" Gear Out Of Range \n");
		}
		
		public void speed_up()
		{
			
			if((speed+20)<150 )			//150 as maximum speed
			{
				speed+=20;
				System.out.println("Cars speed increased \n\t Current speed is "+speed+" Kmhr\n");
			}
			else
				System.out.println("Speed Cannot Be Increased Above 150 Kmhr\n");
				
		}
		
		public void apply_brakes()
		{
			Scanner sc=new Scanner(System.in);
			int x;
			System.out.println("1. TO DECREASE SPEED\n2. TO STOP CAR\n");
			x=sc.nextInt();
			if(x==1)
				if((speed-20)>0)		//checks speed is negative or positive if reduced by 20
				{
					speed-=20;			//per apply brakes vehicle speed is reduced by 20
					System.out.println("Speed Reduced Successfully \n\tCurrent Speed Is "+speed+" kmhr\n");
				}
				else {
					speed=0;
					gear=0;
					System.out.println("Car stopped Successfully\n ");}
			if(x==2)
			{
				speed=0;
				gear=0;
				System.out.println("Car stopped Successfully \n");
			}	
		}
		
		public void display()		//displays current status of car
		{
			System.out.println("YOUR  CAR'S SPEED IS "+speed +" Kmhr AND GEAR IS "+gear+"\n");
		}

	}


	//BIKE CLASS

	class bike implements vehicle
	{
		int gear,speed;		//data members of bike class
		
		bike()
		{
			System.out.println("\tBike started successfully \n");
			gear=1;		//initial gear when bike starts
			speed=10;	//initial speed of bike when starts
		}
		public void gear_change(int gearex)
		{
			if(gearex<6 && gearex>0)		//maximum gears is 5
			{
				gear=gearex;
				System.out.println("\tGear changed Successfully \n\t Current Gear IS "+gear);
			}
			else
				System.out.println("Gear out of range \n");
		}
		
		public void speed_up()
		{
			if((speed+20)<100 )		//maximum speed is 100 for bike
			{
				speed+=20;
				System.out.println("Bike's speed increased \n\t Current speed is "+speed+" Kmhr.\n");
			}
				else
					System.out.println("Speed Cannot Be Increased Above 100 Kmhr \n");
				
		}
		
		public void apply_brakes()			//method to reduce bike speed or stop bike
		{
			Scanner sc=new Scanner(System.in);
			int x;
			System.out.println("1. TO DECREASE SPEED\n2. TO STOP bike\n");
			x=sc.nextInt();
			if(x==1)
				if((speed-20)>0)	//checks speed is negative or positive if reduced by 20
				{
					speed-=20;			//per apply brakes vehicle speed is reduced by 20
					System.out.println("Speed Reduced Successfull   \n\tCurrent speed is "+speed+ "kmhr\n" );
				}
				else {
					speed=0;
					gear=0;
					System.out.println("Bike stopped Successfully \n");}
			if(x==2)
			{
				speed=0;
				gear=0;
				System.out.println("Bike stopped Successfully \n");
			}
			
		}
		
		public void display()		//displays current bike status
		{
			System.out.println("YOUR  BIKE'S SPEED IS "+speed +" Kmhr AND GEAR IS "+gear+"\n");
		}
	}

	



