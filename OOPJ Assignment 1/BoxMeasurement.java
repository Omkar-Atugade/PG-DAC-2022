import java.lang.*;
import java.util.*;

class Box{
	float height;
	float width;
	float breadth;
	
	Box(){
	
		float height = 0.0f;
		float width = 0.0f;
		float breadth = 0.0f;
		
	}
	
	Box(float height, float width, float breadth){
	
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	
	public float getVolume(){
		float v = height * width * breadth;
		return v;
		
	}
	
	public float getArea(){
		float a = 2*(height * width + width * breadth + height * breadth);
		return a;
	}
}

class BoxMeasurement{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of the box b1  : ");
		float h = sc.nextFloat();
		System.out.println("Enter the width of the box b1 : ");
		float w = sc.nextFloat();
		System.out.println("Enter the breadth of the box b1 : ");
		float b = sc.nextFloat();
		
		Box b1 = new Box(h, w, b);
		
		float volume = b1.getVolume();
		System.out.println("Volume of a box b1 is : "+volume);
		
		float area = b1.getArea();
		System.out.println("Area of the box b1 is : "+area);
		
		System.out.println(----------------------------);
		
		System.out.println("Enter the height of the box b2  : ");
		float h1 = sc.nextFloat();
		System.out.println("Enter the width of the box b2: ");
		float w1 = sc.nextFloat();
		System.out.println("Enter the breadth of the box b2: ");
		float br = sc.nextFloat();
		
		Box b2 = new Box(h1, w1, br);
		
		float volume1 = b2.getVolume();
		System.out.println("Volume of a box b2 is : "+volume1);
		
		float area1 = b2.getArea();
		System.out.println("Area of the box b2 is : "+area1);
	}
}