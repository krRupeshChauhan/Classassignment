import java.util.Scanner;

public class FindChar{
    public static void main(String[]args){
        String input;
        char ch=0;
        int count=0,i;
        System.out.println("Enter any Char to ");
        Scanner sc=new Scanner(System.in);
        input= sc.nextLine();
        for(i=0;i<input.length();i++)
        {
            if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u'){

            }
            System.out.println("no of vowel are"+count);
            count++;

        }
    }

}