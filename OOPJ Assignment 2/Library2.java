import java.lang.*;
import java.util.*;

abstract class Publication{
	
	int no0fPages;
	double price;
	String publisherName;
	
	
	abstract void printDetails();
	
}

class Book extends Publication{
	
	Book(){
	
	}
	
	Book(int no0fPages, double price, String publisherName){
		
		this.no0fPages = no0fPages;
		this.price = price;
		this.publisherName = publisherName;
		
	}
	
	public void printDetails(){
		
		System.out.println("Number of pages in the book are : "+no0fPages);
		System.out.println("Price of the book is : "+price);
		System.out.println("Name of the publisher name : "+publisherName);
		
	}
}

class Journal extends Publication{
	
	Journal(){
	
	}
	
	Journal(int no0fPages, double price, String publisherName){
		
		this.no0fPages = no0fPages;
		this.price = price;
		this.publisherName = publisherName;
	}
	
	public void printDetails(){
	
		
		System.out.println("Number of pages in the book are : "+no0fPages);
		System.out.println("Price of the book is : "+price);
		System.out.println("Name of the publisher name : "+publisherName);
	}
}

class Library2{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);

		
		int bookPages[] = new int[3];
		double bookPrice[] = new double[3];
		String bookName[] = new String[3];
		
		int journalPages[] = new int[2];
		double journalPrice[] = new double[2];
		String journalName[] = new String[2];
		
	
		int i = 0;
		
		for(i = 0; i < 3; i++){
			System.out.println("Enter the no of pages in the book : "+(i+1));
				
				bookPages[i] = sc.nextInt();
		}
		
		for(i = 0; i < 3; i++){
			System.out.println("Enter the price of book : "+(i+1));
			
				bookPrice[i] = sc.nextDouble();
		}
		
		for(i = 0; i < 3; i++){
			System.out.println("Enter the name of book : "+(i+1));
			    if(i==0){
					sc.nextLine();
				}
				bookName[i] = sc.nextLine();
		}
		
		
		for(i = 0; i < 2; i++){
			System.out.println("Enter the no of pages in the journal : "+(i+1));
			
				journalPages[i] = sc.nextInt();
	
		}
		
		
		for(i = 0; i < 2; i++){
			System.out.println("Enter the price of journal : "+(i+1));
			
				journalPrice[i] = sc.nextDouble();
	
		}
		
		
		for(i = 0; i < 2; i++){
			System.out.println("Enter the name of journal : "+(i+1));
				if(i==0){
					sc.nextLine();
				}
				journalName[i] = sc.nextLine();
	
		}	
		
		
		Book b1 = new Book(bookPages[0], bookPrice[0], bookName[0]);
		Book b2 = new Book(bookPages[1], bookPrice[1], bookName[1]);
		Book b3 = new Book(bookPages[2], bookPrice[2], bookName[2]);
		
		Journal j1 = new Journal(journalPages[0], journalPrice[0], journalName[0]);
		Journal j2 = new Journal(journalPages[1], journalPrice[1], journalName[1]);
		
		b1.printDetails();
		b2.printDetails();
		b3.printDetails();
		
		j1.printDetails();
		j2.printDetails();
		
		
	}
}