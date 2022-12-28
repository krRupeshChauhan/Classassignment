
import java.util.Scanner;
public class CountVowel {
    public static void main(String []args)
    {
        String input;
        char ch;
        int i,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string to count no. of vowels:");
        input=sc.nextLine();

        for(i=0;i<input.length();i++)
        {
            ch=input.charAt(i);
            if((ch=='A'||ch=='a')||(ch=='E'||ch=='e')||(ch=='I'||ch=='i')
                    ||(ch=='O'||ch=='o')||(ch=='U'||ch=='u'))
            {
                count++;
            }
        }
        System.out.println("No. of vowels are:"+count);

    }
}