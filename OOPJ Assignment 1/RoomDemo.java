import java.lang.*;
import java.util.*;

class Room{

	float height;
	float width;
	float breadth;
	
	Room(){
	
		float height = 0.0f;
		float width = 0.0f;
		float breadth = 0.0f;
	}
	
	Room(float height, float width, float breadth){
	
		this.height = height;
		this.width = width;
		this.breadth = breadth;
		
	}
	
	public void volume(){
		
		float v = height * width * breadth;
		System.out.println("Volume of the room is : "+v);
	}
}

class RoomDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the heigth of the room : ");
		float h = sc.nextFloat();
		System.out.println("Enter the width of the room : ");
		float w = sc.nextFloat();
		System.out.println("Enter the breadth of the room : ");
		float b = sc.nextFloat();
		Room r1 = new Room(h, w, b);
		r1.volume();
	}
}