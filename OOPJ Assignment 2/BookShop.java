import java.lang.*;
import java.util.*;

class BookShop{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
	

		String bookTitle[] = new String[5];
		int bookPages[] = new int[5];
		String bookAuthor[] = new String[5];
		double bookPrice[] = new double[5];
		String bookPublisher[] = new String[5];
		int bookStock[] = new int[5];
		
		
		bookTitle[0] = "AAAAAA";
		bookTitle[1] = "BBBBBB";
		bookTitle[2] = "CCCCCC";
		bookTitle[3] = "DDDDDD";
		bookTitle[4] = "EEEEEE";
		
		bookPages[0] = 100;
		bookPages[1] = 200;
		bookPages[2] = 300;
		bookPages[3] = 400;
		bookPages[4] = 500;
		
		
		bookAuthor[0] = "A1A1A1";
		bookAuthor[1] = "B2B2B2";
		bookAuthor[2] = "C3C3C3";
		bookAuthor[3] = "D4D4D4";
		bookAuthor[4] = "E5E5E5";
		
		bookPrice[0] = 100.0;
		bookPrice[1] = 200.0;
		bookPrice[2] = 300.0;
		bookPrice[3] = 400.0;
		bookPrice[4] = 500.0;
		
		
		bookPublisher[0] = "A11111";
		bookPublisher[1] = "B22222";
		bookPublisher[2] = "C33333";
		bookPublisher[3] = "D44444";
		bookPublisher[4] = "E55555";
		
		bookStock[0] = 10;
		bookStock[1] = 20;
		bookStock[2] = 30;
		bookStock[3] = 40;
		bookStock[4] = 50;
	
		System.out.println("Books in the shop are : ");
		for(int i = 0; i < 5; i++){
			
			System.out.print(bookTitle[i]+" ");
		}
		
		System.out.println();
		System.out.println("Enter the book you want to buy : ");
		String s1 = sc.nextLine();
		
		if(s1.equals(bookTitle[0])){
			
			System.out.println("No of pages in the book are : "+bookPages[0]);
			System.out.println("Author of the book is : "+bookAuthor[0]);
			System.out.println("Price of the book is : "+bookPrice[0]);
			System.out.println("Publisher of the book is : "+bookPublisher[0]);
			
			System.out.println("Enter how many copies you want : ");
			int n = sc.nextInt();
			
			if(n <= bookStock[0]){
				
				double totPrice;
				
				totPrice = n * bookPrice[0];
				
				System.out.println("Total cost of the books is : "+totPrice);
			}
			
			else{
				
				System.out.println("Required copies not in stock.");
			}
		}
		
		else if(s1.equals(bookTitle[1])){
			
			System.out.println("No of pages in the book are : "+bookPages[1]);
			System.out.println("Author of the book is : "+bookAuthor[1]);
			System.out.println("Price of the book is : "+bookPrice[1]);
			System.out.println("Publisher of the book is : "+bookPublisher[1]);
			
			System.out.println("Enter how many copies you want : ");
			int n = sc.nextInt();
			
			if(n <= bookStock[1]){
				
				double totPrice;
				
				totPrice = n * bookPrice[1];
				
				System.out.println("Total cost of the books is : "+totPrice);
			}
			
			else{
				
				System.out.println("Required copies not in stock.");
			}
				
		}

		else if(s1.equals(bookTitle[2])){
			
			System.out.println("No of pages in the book are : "+bookPages[2]);
			System.out.println("Author of the book is : "+bookAuthor[2]);
			System.out.println("Price of the book is : "+bookPrice[2]);
			System.out.println("Publisher of the book is : "+bookPublisher[2]);
			
			
			System.out.println("Enter how many copies you want : ");
			int n = sc.nextInt();
			
			if(n <= bookStock[2]){
				
				double totPrice;
				
				totPrice = n * bookPrice[2];
				
				System.out.println("Total cost of the books is : "+totPrice);
			}
			
			else{
				
				System.out.println("Required copies not in stock.");
			}
				
		}
		
		else if(s1.equals(bookTitle[3])){
			
			System.out.println("No of pages in the book are : "+bookPages[3]);
			System.out.println("Author of the book is : "+bookAuthor[3]);
			System.out.println("Price of the book is : "+bookPrice[3]);
			System.out.println("Publisher of the book is : "+bookPublisher[3]);
			
			System.out.println("Enter how many copies you want : ");
			int n = sc.nextInt();
			
			if(n <= bookStock[3]){
				
				double totPrice;
				
				totPrice = n * bookPrice[3];
				
				System.out.println("Total cost of the books is : "+totPrice);
			}
			
			else{
				
				System.out.println("Required copies not in stock.");
			}
			
		}
		
		else if(s1.equals(bookTitle[4])){
			
			System.out.println("No of pages in the book are : "+bookPages[4]);
			System.out.println("Author of the book is : "+bookAuthor[4]);
			System.out.println("Price of the book is : "+bookPrice[4]);
			System.out.println("Publisher of the book is : "+bookPublisher[4]);
			
			System.out.println("Enter how many copies you want : ");
			int n = sc.nextInt();
			
			if(n <= bookStock[4]){
				
				double totPrice;
				
				totPrice = n * bookPrice[4];
				
				System.out.println("Total cost of the books is : "+totPrice);
			}
			
			else{
				
				System.out.println("Required copies not in stock.");
			}
			
		}
		
		
	}
}