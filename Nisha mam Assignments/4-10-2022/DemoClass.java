import java.lang.*;
import java.util.*;

class DemoClass{

	int roll_no;
	String name;
	double marks;
	String school_name;
	String city_name;
	
	Scanner sc = new Scanner(System.in);
	//constructor
	public DemoClass(){
		
		roll_no = 234;
		name = "Omkar";
		marks = 80;
	
	}
	
	public void printDetails(){
		System.out.println("Your name is : "+name);
		System.out.println("Your roll no is : "+roll_no);
		System.out.println("Your marks are : "+marks);
			
	}
	public void changeMarks(){
		System.out.println("Please enter your changes marks : ");
		marks = sc.nextDouble();
		System.out.println("Your marks are : "+marks);
		
	}
	public void addDetails(){
		System.out.println("Enter your school name  : ");
		school_name = sc.nextLine();
		
		sc.nextLine();
		System.out.println("Enter your city name : ");
		city_name = sc.nextLine();
		
		System.out.println("Your school name is "+school_name);
		System.out.println("Your city name is "+city_name);
	}
	
	public static void main(String[] args){
		DemoClass c1 = new DemoClass();
		
		c1.printDetails();
		c1.changeMarks();
		c1.addDetails();
		
	}
}