package basicprogram;
import java.util.Scanner;
public class CalculateMarks {

	public static void main(String[] args) {
		int math,hindi,english,science,IT,sum,avg,percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("no of math");
		math=sc.nextInt();
		System.out.println("no of hindi");
		hindi=sc.nextInt();
		System.out.println("no of english");
		english=sc.nextInt();
		System.out.println("no of Science");
		science=sc.nextInt();
		System.out.println("no of IT");
		IT=sc.nextInt();
		sum=(math+hindi+english+science+IT);
		//calculate the total marks
		System.out.println("Total marks"+sum);
		avg=sum/5;
		System.out.println("avg narks"+avg);
		if (sum>=250)
	
		{
			System.out.println("pass");
			
		}
		else {	System.out.println("fail");
			
		}
	
		
		
				
		
	
		
		
		
		
		
	}

}
