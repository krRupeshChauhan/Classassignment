import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Element");
        for (int i = 0; i < arr.length; i++) {
            // for (int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        //2nd way to print
        System.out.println("Enter 5 Element");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("printing element using foreach loop");
        for (int var : arr) {
            System.out.println(var);

        }

    }
}