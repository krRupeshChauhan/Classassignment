import java.util.Scanner;

public class BubbleSort {
    public static void main(String[]args){
int arr[]=new int[10],i,j,temp;
System.out.println("Enter 10 element");
Scanner sc=new Scanner(System.in);
for(i=0;i<10;i++){
arr[i]=sc.nextInt();
}
//sorting
for(i=0;i<10;i++){
//place currently selected element arr[i] to its current position
for(j=1;j<10;j++){
}
//swap if currently element is not current position
if(arr[i]<arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;


}
}