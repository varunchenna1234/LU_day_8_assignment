//parents class-Employee
package day8;
import java.util.*;

public class Employee {
	Scanner in=new Scanner(System.in);
	String name;
	int age;
	double salary;
	String designation;
	public void getdetails() {
		System.out.println("Enter Employee name");
		name=in.next();
		System.out.println("Enter Employee age");
		age=in.nextInt();
		System.out.println("Enter Employee salary");
		salary=in.nextInt();
		in.nextLine();
		System.out.println("Enter Employee designation");
		designation=in.nextLine();
		
	}
	public void displaydetails() {
		System.out.println("the Details of employee are :"+name+","+age+","+salary+","+designation);
	}
}
