package day8;
public class engineer extends Employee{
	String dept;
	void dept(){
		System.out.println("Hey engineer enter your department");
		dept=in.nextLine();
		System.out.println("Hey i am a Engineer in "+dept+" department");
	}
}
