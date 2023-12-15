package Assignment3;

public class Employee {
	
	float da, hra, pf, cf, gross;
	
	String Emp_name;
	int Emp_id;
	String Address;
	String Mail_id;
	int Mobile_no;
	
	float basic = 0;
	
	

	void salary()
	{
		
		da =basic  * 97/100;
		hra=basic  * 10/100;
		pf= basic * 12/100;
		cf=basic * 0.1f/100;
		
		gross=basic + da + hra -pf -cf;
		
		System.out.println("Name:   " + Emp_name);
		System.out.println("Employee Id:   " + Emp_id);
		System.out.println("Basic Salary : " + basic);
		System.out.println("Basic Salary : " + gross);
		
		
	}
	
	
	

}
