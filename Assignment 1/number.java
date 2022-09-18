import java.lang.*;

class number{
	public static void main(String[] args){
		printnumber(1);
		
	}
	
	public static int printnumber(int i){
		if (i <= 10){
			System.out.println(i + " ");
			printnumber(i+1);
		}
	return i;		
	}
}