public class Exception {
    public static void main(String[] args) {
        try{
            int arr[]=new int[5];
            arr[7]=34;
            System.out.println(arr[7]);}
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("not valid arry index"+ae);
        }



        try {
            int c = a / b;//Arithmetic Exception object will throw
            System.out.println(c);
        } catch (ArithmeticException ae) {
            System.out.println("divide by zero is not possible");//1st way to print
            System.out.println("exception occur in :" + ae);//2nd way to print
            System.out.println("exception occurred:");//3rd way to print
        ae.printStackTrace();//4t way to print
        }
        System.out.println("rest new line");
        System.out.println("=================Second type NullPointerException====================");
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("String is null");
        }
        System.out.println("rest new line of code");

        System.out.println("=================third type NumberFormatException====================");
        try {
            String s = "abc";
            int i = Integer.parseInt(s);
        }
        catch (NumberFormatException e){

            System.out.println("String cant be converts as int");
        }
        System.out.println("=================Fourth type ArrayIndexOutOfBoundsException====================");

        int arr[]=new int[5];

    try{
       arr[7]=34;
        System.out.println(arr[7]);
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Array index is out of bonds");
    }
        System.out.println("rest new line of code");
        System.out.println("=================Fifth type NullPointerException====================");
        try {
            String s = "abc";
            int i = Integer.parseInt(s);
        }
        catch (NumberFormatException ne){

            System.out.println(ne);
        }
        catch (NullPointerException np) {

            System.out.println(np);

        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index ids out of bounds");

            }
        catch(Exception e){
            System.out.println(e);
        }
        catch(NumberFormatException ne){
            System.out.println(ne);
        }
        catch(NullPointerException np){
            System.out.println(np);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index is out of bound");

    }








}
