import java.lang.*;
import java.util.*;

class leapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the year you want to check = ");
		int year = sc.nextInt();
		
		if (( year % 4 == 0 ) || (year % 100 == 0 )){
			System.out.println("It is a leap year");
		}
		else{
			System.out.println("It is not a leap year");
		}
	}
}