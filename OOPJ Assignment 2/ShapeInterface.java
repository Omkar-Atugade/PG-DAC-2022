import java.lang.*;
import java.util.*;


interface Shape{

	void area();
	
	void draw();
	
	void rotate();
	
	void move(int a, int b);
	
	
}

class Circle implements Shape{
	
	int radius;
	double PI = 3.14;
	Scanner sc = new Scanner(System.in);
	
	
	public void area(){
		
		System.out.println("Enter the radius of the circle : ");
		radius = sc.nextInt();
		
		double area = PI * (radius * radius);
		System.out.println("Area of the circle is : "+area);
	
	}
	
	public void draw(){
		
		
	}
	
	public void rotate(){
		
		
	}
	
	
	public void move(int a , int b){
		System.out.println("Enter the value with which you want to move the circle :  ");
		int x = sc.nextInt();
		
		a = a + x;
		b = b + x;
		
		System.out.println("New cordinators of the circle are : "+a+" and "+b);
	
	}
	
	
}

class Rectangle implements Shape{
	
	int length;
	int breadth;
	int area;
	
	Scanner sc = new Scanner(System.in);

	
	public void area(){
		System.out.println("Enter the length of the rectangle : "+length);
		length = sc.nextInt();
		
		System.out.println("Enter the breadth of the rectangle : "+breadth);
		breadth = sc.nextInt();
		
		area = length * breadth;
		
		System.out.println("Area of the rectangle is : "+area);
	}
	
	public void draw(){
		
		
	}
	
	public void rotate(){
		
		
	}
	
	public void move(int a, int b){
		System.out.println("Enter the value with which you want to move the rectangle :  ");
		int x = sc.nextInt();
		
		a = a + x;
		b = b + x;
		
		System.out.println("New cordinators of the rectangle are : "+a+" and "+b);
	
	}
	
}

class ShapeInterface{

	public static void main(String args[]){
	
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		
		c1.area();
		c2.area();
		
		c1.move(2, 3);
		c2.move(3, 4);
		
		r1.area();
		r2.area();
		r3.area();
		
		r1.move(4,5);
		r2.move(6,2);
		r3.move(7,4);
		
		
	}
}