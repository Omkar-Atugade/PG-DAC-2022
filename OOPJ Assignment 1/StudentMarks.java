import java.lang.*;
import java.util.*;

class Student{
	
	String name;
	int marks[];
	double average;
	int total_marks;
	 
	Student(){
		String name = " ";
		int marks[];
		double average = 0.0;
		int total_marks = 0;
	}
	
	Student(String name, int marks[]){
		
		this.name = name;
		//this.marks[] = marks[];
		
		System.out.println("Name of the student is : "+name);
		
	}
	
	public int totalMarks(int m[], int n){
		for(int i = 0; i < n; i ++){
			total_marks = total_marks + m[i];

		}
		return total_marks;
		
	}
	public double averageMarks(int tm, int n){
		
		average = tm / n;
		return average;
	}
}

class StudentMarks{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of student : ");
		String x = sc.nextLine();
		
		System.out.println("Enter the no of subject : ");
		int n1 = sc.nextInt();
		
		int mark[] = new int[n1];
		System.out.println("Enter the marks : ");
		for(int i = 0; i < n1; i++){
			mark[i] = sc.nextInt();
		}
		
		Student s1 = new Student(x, mark);
		int tm = s1.totalMarks(mark, n1);
		System.out.println("Total marks obtained by student is : "+tm);
		
		double avg = s1.averageMarks(tm, n1);
		System.out.println("Average of marks of student is : "+avg);
	}
}