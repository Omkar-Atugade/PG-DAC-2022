import java.lang.*;
import java.util.*;

class Date{
	int day;
	int month;
	int year;
	
	Date(){
		day = 01;
		month = 01;
		year = 1970;
		System.out.println(+day+"/"+month+"/"+year);
	}
	
	Date(int day){
	
		this.day = day;
		month = 01;
		year = 1970;
		System.out.println(+day+"/"+month+"/"+year);
	}
	
	Date(int day, int month){
		this.day = day;
		this.month = month;
		year = 1970;
		System.out.println(+day+"/"+month+"/"+year);
	}
	
	Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
		System.out.println(+day+"/"+month+"/"+year);
	}
	
	public void previousDay(int d1, int m1, int y1){
		int day1 = 0;
		int month1 = 0;
		int year1 = 0;
		
		if( d1 == 1){
			if(m1 == 1){
				year1 = y1-1;
				day1 = 31;
				month1 = 12;
			}
			else if( m1 <= 7 && m1 % 2 == 0){
				day1 = 30;
				month1 = m1-1;
				year1 = y1;
			}
			else if( m1 > 7 && m1 % 2 == 0) {
				day1 = 30;
				month1 = m1-1;
				year1 = y1;
			}
			else{
				day1 = 31;
				month1 = m1-1;
				year1 = y1;
			}
		}
		else{
			day1 = d1 - 1;
			month1 = m1;
			year1 = y1;
		}
		
		System.out.println("Previous day is : "+day1+"/"+month1+"/"+year1);
		
	}
	
	public void nextDay(int d2, int m2, int y2){
		int day2 = 0;
		int month2 = 0;
		int year2 = 0;
		
		
		if( d2 == 31 || d2 == 30){
			if(m2 == 12){
				year2 = y2+1;
				day2 = 1;
				month2 = 1;
			}
			else if( m2 <= 7 && m2 % 2 == 0){
				day2 = 1;
				month2 = m2+1;
				year2 = y2;
			}
			else if( m2 > 7 && m2 % 2 == 0) {
				day2 = 1;
				month2 = m2+1;
				year2 = y2;
			}
			else{
				day2 = 1;
				month2 = m2+1;
				year2 = y2;
			}
		}
		else{
			day2 = d2 + 1;
			month2 = m2;
			year2 = y2;
		}
		System.out.println("Next day is : "+day2+"/"+month2+"/"+year2);
	}
}

class DateDemo{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the day : ");
		int d = sc.nextInt();
		
		System.out.println("Enter the month : ");
		int m = sc.nextInt();
		
		System.out.println("Enter the year : ");
		int y = sc.nextInt();
		
		Date x1 = new Date();
		Date x2 = new Date(d);
		Date x3 = new Date(d, m);
		Date x4 = new Date(d, m, y);
		
		x4.nextDay(d, m, y);
		x4.previousDay(d, m, y);
		
	}
}