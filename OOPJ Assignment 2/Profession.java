import java.lang.*;
import java.util.*;

abstract class Person{

	int age;
	int weight;
	int height;
	String dateOfBirth;
	String address;
	
	
	abstract void printDetails();
	
	
}

class Employee extends Person{
	
	double salary;
	String dateOfJoining;
	int experience;
	
	Employee(){
		
		
	}
	
	Employee(int age, int weight, int height, String dateOfBirth, String address, double salary, String dateOfJoining, int experience){
		
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.experience = experience;
		
	}
	
	public void printDetails(){
		
		System.out.println("Age of the Employee is : "+age);
		System.out.println("Weight of the Employee is : "+weight);
		System.out.println("Height of the Employee is : "+height);
		System.out.println("Date of birth of the Employee is : "+dateOfBirth);
		System.out.println("Address of the Employee is : "+address);
		System.out.println("Salary of the Employee is : "+salary);
		System.out.println("Date of joining is : "+dateOfJoining);
		System.out.println("Year of experience of the Employee is : "+experience);
		
	}
}


class Student extends Person{
	
	int roll;
	int sum;
	String listOfSubjects[];
	int marks[];
	double avg;
	
	
	Student(){
		
	}
	
	Student(int age, int weight, int height, String dateOfBirth, String address, int roll){
		
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.roll = roll;
		
		
	}
	
	public double calGrade(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects you have : ");
		int n = sc.nextInt();
		
		listOfSubjects = new String[n];
		marks = new int[n];
		
		System.out.println("Enter the name of the subjects : ");
		for(int i = 0; i < n; i++){
			if(i == 2){
				sc.nextLine();
			}
			listOfSubjects[i] = sc.nextLine();
			
		}
	
		System.out.println("Enter the marks of subjects : ");
		for(int i = 0; i < n; i++){
		
			marks[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < n; i++){
			sum = sum + marks[i];
		}
		
		avg = sum / n ;
		return avg;
	}
	
	

	public void printDetails(){
		
		System.out.println("Age of the Student is : "+age);
		System.out.println("Weight of the Student is : "+weight);
		System.out.println("Height of the Student is : "+height);
		System.out.println("Date of birth of the Student is : "+dateOfBirth);
		System.out.println("Address of the Student is : "+address);
		System.out.println("Roll no is : "+roll);
		
		
	}
	
	void printGrade(String x){
		
		System.out.println("Grade of the student : "+x);
		
	}
	
}

class Technician extends Employee{
	
	Technician(){
		
		
	}
	
	Technician(int age, int weight, int height, String dateOfBirth, String address, double salary, String dateOfJoining, int experience){
		
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.experience = experience;
		
	}
		
	public void printDetails(){
		
		System.out.println("Age of the Technician is : "+age);
		System.out.println("Weight of the Technician is : "+weight);
		System.out.println("Height of the Technician is : "+height);
		System.out.println("Date of birth of the Technician is : "+dateOfBirth);
		System.out.println("Address of the Technician is : "+address);
		System.out.println("Salary of the Technician is : "+salary);
		System.out.println("Date of joining is : "+dateOfJoining);
		System.out.println("Year of experience of the Technician is : "+experience);
		
	}
}

class Professor extends Employee{
	
	String courses[];
	String listOfadvisee[];
	int n;
	
	Professor(){
		
		
	}
	
	Professor(int age, int weight, int height, String dateOfBirth, String address, double salary, String dateOfJoining, int experience){
		
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.experience = experience;
		
	}
	
	public void printDetails(){
		
		System.out.println("Age of the Professor is : "+age);
		System.out.println("Weight of the Professor is : "+weight);
		System.out.println("Height of the Professor is : "+height);
		System.out.println("Date of birth of the Professor is : "+dateOfBirth);
		System.out.println("Address of the Professor is : "+address);
		System.out.println("Salary of the Professor is : "+salary);
		System.out.println("Date of joining is : "+dateOfJoining);
		System.out.println("Year of experience of the Professor is : "+experience);
		
	}
	
	void getCourses(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of courses : ");
		n = sc.nextInt();
		
		courses = new String[n];
		
		System.out.println("Enter the names of the courses : ");
		for(int i = 0; i < n; i++){
			if(i == 2){
				sc.nextLine();
			}
			courses[i] = sc.nextLine();
		}
		
	}
	
	void printListOfadvisee(){
		Scanner sc = new Scanner(System.in);

		listOfadvisee = new String[n];
		
		System.out.println("Enter the names : ");
		for(int i = 0; i < n; i++){
			if(i == 2){
				sc.nextLine();
			}
			listOfadvisee[i] = sc.nextLine();
		}
	} 
} 
class Profession{
	
	public static void main(String args[]){
		
		Employee e1 = new Employee(21, 65, 160, "15/02/2000", "pune", 50000.0, "16/02/2022",5);
		Student s1 = new Student(22, 70, 165, "16/04/2000", "Delhi", 1);
		Technician t1 = new Technician(21, 65, 160, "15/02/2000", "pune", 50000.0, "16/02/2022",5);
		Professor pr1 = new Professor(21, 65, 160, "15/02/2000", "pune", 50000.0, "16/02/2022",5); 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("############ Information of Employee is : #############");
		System.out.println("=======================================================");
		e1.printDetails();
		
		
		
		System.out.println("=======================================================");
		System.out.println("############ Information of Student is : #############");
		System.out.println("=======================================================");
		
		s1.printDetails();
		
		String grade = "";
		double res = s1.calGrade();
		if(res >= 80){
			grade = "A grade";
		}
		
		else if(res < 80 && res >= 60){
			grade = "B grade";
		}
		
		else if(res < 60 && res >= 40){
			grade = "C grade";
		}
		
		else{
			grade = "Fail";
		} 
		
		s1.printGrade(grade);
		
		
		System.out.println("=======================================================");
		System.out.println("############ Information of Technician is : #############");
		System.out.println("=======================================================");
		t1.printDetails();
		
		System.out.println("=======================================================");
		System.out.println("############ Information of Professor is : #############");
		System.out.println("=======================================================");
		pr1.printDetails();
		pr1.getCourses();
		pr1.printListOfadvisee();
		
	
	}
}
