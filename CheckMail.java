import java.util.Scanner;

public class CheckMail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 ;

        str1 = sc.nextLine();
        if ((str1.endsWith("@yahoo.com"))||(str1.endsWith("@gmail.com"))) {



                System.out.println("logging");

            }

            else {
                System.out.println("Email id is not valid");
            }
        }

}