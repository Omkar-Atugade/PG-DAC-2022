import java.lang.*;
import java.util.*;

class Complex{

	int real;
	int imaginary;
	int number;
	
	Complex(){
		real = 0;
		imaginary = 0;
	
		System.out.println("Given complex number is : "+real+" + "+imaginary+"i");
	}
	
	Complex(int real){
		this.real = real;
		imaginary = 0;
	
		System.out.println("Given complex number is : "+real+" + "+imaginary+"i");
	}
	
	Complex(int real, int imaginary){
		this.real = real;
		this.imaginary = imaginary;
	
		System.out.println("Given complex number is : "+real+" + ("+imaginary+")i");
	}
	
	public static Complex addition(){
		
		Complex res = new Complex();
		res.real = c5.real + c6.real;
		res.imaginary = c5.imaginary + c6.imaginary;
		
		return res;

	}
	
	/*public static Complex multiply(){
		
		Complex res1 = new Complex();
		res1.real = c7.real * c8.real;
		res1.imaginary = c7.imaginary * c8.imaginary;
		
		return res1;
	}*/
}

class ComplexNumber{

	public static void main(String args[]){
	
		Complex c1 = new Complex();
		Complex c2 = new Complex(3);
		Complex c3 = new Complex(3, +2);
		Complex c4 = new Complex(4, -2);
			
		
	}
}