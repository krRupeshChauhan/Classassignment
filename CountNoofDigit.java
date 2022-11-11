package basicprogram;
import java.util.Scanner;
public class CountNoofDigit {

	public static void main(String[] args) {
		int n,i,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		while(n>0)
			{
			n=n/10;
			count++;
		
			}
		System.out.println(count);
		}
	}


