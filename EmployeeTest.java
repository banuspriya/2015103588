package Employer;
import java.util.*;

public class EmployeeTest {
	
	 
	  public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
		
		Employee a = new Employee();
		Employee b = new Employee();
		
		System.out.println("Enter First name of Employee 1: ");
		String fname= input.next();
		System.out.println("Enter Last Name of Employee 1: ");
		String lname= input.next();
		System.out.println("Enter the Monthly Salary of Employee 1: ");
		double salary= input.nextDouble();
		a.setFirstName(fname);
		a.setLastName(lname);
		
		if(salary>0)
		a.setSalary(salary);
		
		else
		{
			System.out.println("Enter a positive value for Salary : ");
			salary= input.nextDouble();
			a.setSalary(salary);
		}
		
		System.out.println("Enter First Name of Employee 2: ");
		fname= input.next();
		System.out.println("Enter Last Name of Employee 2: ");
		lname= input.next();
		System.out.println("Enter the Monthly Salary of Employee 2: ");
		salary= input.nextDouble();
		b.setFirstName(fname);
		b.setLastName(lname);
		
		if(salary>0)
		b.setSalary(salary);
		
		else
		{
			System.out.println("Enter a positive value for Monthly Salary : ");
			salary= input.nextDouble();
			b.setSalary(salary);
		}
		input.close();
		
	
		System.out.println("Employee 1's First Name : "+ a.getFirstName());
		System.out.println("Employee 1's Last Name : "+ a.getLastName());
		System.out.println("Employee 1's Yearly Salary : "+ a.getSalary()*12);
		a.setSalary(a.getSalary()*1.1);
		System.out.println("Employee 1's Yearly Salary after 10% raise : "+ a.getSalary()*12);
		
		System.out.println("Employee 2's First Name : "+ b.getFirstName());
		System.out.println("Employee 2's Last Name : "+ b.getLastName());
		System.out.println("Employee 2's Yearly Salary : "+ b.getSalary()*12);
		b.setSalary(b.getSalary()*1.1);
		System.out.println("Employee 2's Yearly Salary after 10% raise : "+ b.getSalary()*12);
		
		
       }
		
}