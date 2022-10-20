import java.lang.*;
import java.util.*;

class Book{

	String title;
	String authors;
	int no_of_pages;
	float price;
	String publisher;
	
	Book(){
		String title;
		String authors;
		int no_of_pages = 0;
		float price = 0.0f;
		String publisher;
	}
	
	Book(String title, String authors, int no_of_pages, float price, String publisher){
		
		this.title = title;
		this.authors = authors;
		this.no_of_pages = no_of_pages;
		this.price = price;
		this.publisher = publisher;
	}
	
	public void printDetails(){
		
		System.out.println("Title of book is : "+title);
		System.out.println("Author of book is : "+authors);
		System.out.println("No of pages in book is : "+no_of_pages);
		System.out.println("Price of book is : "+price);
		System.out.println("Publisher of book is : "+publisher);
	}
		
}



public class LibraryManagement{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of books in library : ");
		int no_of_books = sc.nextInt();
		
		Book b1[] = new Book[no_of_books];
		String b2[] = new String[no_of_books];
		
		System.out.println("Enter the details of the books : ");
		
		sc.nextLine();
		for(int i = 0; i < no_of_books; i++){
			
			System.out.print("Enter the title of the book : ");
			String title_of_book = sc.nextLine();
			b2[i] = title_of_book; 
			
			sc.nextLine();
			System.out.print("Enter the authors of  :");
			String authors_of_book = sc.nextLine();
			
			System.out.print("Enter the no of pages of the  :");
			int pages = sc.nextInt();
			
			System.out.print("Enter the price of the  :");
			float price_of_book = sc.nextFloat();
			
			System.out.print("Enter the publisher of the  :");
			String name_of_publisher = sc.nextLine();
			sc.nextLine();
			
			b1[i] = new Book(title_of_book, authors_of_book, pages, price_of_book, name_of_publisher);
			System.out.println("---------------------------------------------------");
			
		}
		
		System.out.println();
		System.out.println("Entered details of book are : ");
		for(int i = 0; i < no_of_books; i ++){
			b1[i].printDetails();
			System.out.println();
		}
		
		System.out.println("Books in the library are : ");
		for(int j = 0; j < no_of_books; j++){
			System.out.print(b2[j]);
		}
		
		
	}
}