package day8;

public class pilots extends Employee{
	String dept;
	void dept(){
		System.out.println("Hey pilot enter your department");
		dept=in.nextLine();
		
		System.out.println("Hey i am a "+dept);
	}

}
