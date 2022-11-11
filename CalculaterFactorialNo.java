package basicprogram;
import java.util.Scanner;
public class CalculaterFactorialNo {
	public static void main(String[] args) {
		long num,i,fact=1;
		Scanner sc=new Scanner(System.in);
		num=sc.nextLong();
		
		for(i=1;i<=num;i++) {
		fact=fact*i;
		}
		System.out.println(("factorial of "+num+ "is: " +fact));
		
			
	}
}